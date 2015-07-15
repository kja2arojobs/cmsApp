package com.library;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;
import javax.swing.text.View;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author kadhush
 */
public class DocumentRendererPrinter implements Printable {

    /**
     *
     */
    protected int currentPage = -1;

    /**
     *
     */
    protected JEditorPane jeditorPane;

    /**
     *
     */
    protected double pageEndY = 0;

    /**
     *
     */
    protected double pageStartY = 0;

    /**
     *
     */
    protected boolean scaleWidthToFit = true;

    /**
     *
     */
    protected PageFormat pFormat;

    /**
     *
     */
    protected PrinterJob pJob;

    /**
     *
     */
    public DocumentRendererPrinter() {

        pFormat = new PageFormat();
        pJob = PrinterJob.getPrinterJob();

    }

    /**
     *
     * @return
     */
    public Document getDocument() {
        if (jeditorPane != null) {
            return jeditorPane.getDocument();
        } else {
            return null;
        }
    }

    /**
     *
     * @return
     */
    public boolean getScaleWidthToFit() {
        return scaleWidthToFit;
    }

    /**
     *
     */
    public void pageDialog() {
        pFormat = pJob.pageDialog(pFormat);
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) {
        double scale = 1.0;
        Graphics2D graphics2D;
        View rootView;

        graphics2D = (Graphics2D) graphics;
        jeditorPane.setSize((int) pageFormat.getImageableWidth(), Integer.MAX_VALUE);
        jeditorPane.validate();

        rootView = jeditorPane.getUI().getRootView(jeditorPane);

        if ((scaleWidthToFit) && jeditorPane.getMinimumSize().getWidth() > pageFormat.getImageableWidth()) {
            scale = pageFormat.getImageableWidth() / jeditorPane.getMinimumSize().getWidth();
            graphics2D.scale(scale, scale);

        }

        graphics2D.setClip((int) (pageFormat.getImageableX() / scale),
                (int) (pageFormat.getImageableY() / scale),
                (int) (pageFormat.getImageableWidth() / scale),
                (int) (pageFormat.getImageableHeight() / scale));

        if (pageIndex > currentPage) {
            currentPage = pageIndex;
            pageStartY += pageEndY;
            pageEndY = graphics2D.getClipBounds().getHeight();
        }

        graphics2D.translate(graphics2D.getClipBounds().getX(), graphics2D.getClipBounds().getY());

        Rectangle allocation = new Rectangle(0,
                (int) -pageStartY,
                (int) (jeditorPane.getMinimumSize().getWidth()),
                (int) (jeditorPane.getPreferredSize().getHeight())
        );

        if (printView(graphics2D, allocation, rootView)) {
            return Printable.PAGE_EXISTS;
        } else {
            pageStartY = 0;
            pageEndY = 0;
            currentPage = -1;
            return Printable.NO_SUCH_PAGE;
        }
    }

    /**
     *
     * @param htmlDocument
     */
    public void print(HTMLDocument htmlDocument) {
        setDocument(htmlDocument);
        printDialog();
    }

    /**
     *
     * @param jedPane
     */
    public void print(JEditorPane jedPane) {
        setDocument(jedPane);
        printDialog();
    }

    /**
     *
     * @param plainDocument
     */
    public void print(PlainDocument plainDocument) {
        setDocument(plainDocument);
        printDialog();
    }

    /**
     *
     */
    protected void printDialog() {

        if (pJob.printDialog()) {
            pJob.setPrintable(this, pFormat);

            try {
                pJob.print();
            } catch (PrinterException e) {
                pageStartY = 0;
                pageEndY = 0;
                currentPage = -1;

                JOptionPane.showMessageDialog(null, "Printing Cancelled.\n May be deu to Bad printer configurations, or cancelling the printing process");
            }

        }

    }

    /**
     *
     * @param graphics2D
     * @param allocation
     * @param view
     * @return
     */
    protected boolean printView(Graphics2D graphics2D, Shape allocation, View view) {
        boolean pageExists = false;
        Rectangle clipRectangle = graphics2D.getClipBounds();
        Shape childAllocation;
        View childView;

        if (view.getViewCount() > 0 && !view.getElement().getName().equalsIgnoreCase("td")) {

            for (int i = 0; i < view.getViewCount(); i++) {
                childAllocation = view.getChildAllocation(i, allocation);
                if (childAllocation != null) {
                    childView = view.getView(i);
                    if (printView(graphics2D, childAllocation, childView)) {
                        pageExists = true;
                    }

                }
            }
        } else {
            if (allocation.getBounds().getMaxY() >= clipRectangle.getY()) {
                pageExists = true;
            }

            if ((allocation.getBounds().getHeight() > clipRectangle.getHeight()) && (allocation.intersects(clipRectangle))) {
                view.paint(graphics2D, allocation);
            } else {
                if (allocation.getBounds().getY() >= clipRectangle.getY()) {
                    if (allocation.getBounds().getMaxY() <= clipRectangle.getMaxY()) {
                        view.paint(graphics2D, allocation);
                    } else {
                        if (allocation.getBounds().getY() < pageEndY) {
                            pageEndY = allocation.getBounds().getY();

                        }
                    }

                }
            }
        }
        return pageExists;
    }

    /**
     *
     * @param type
     */
    protected void setContentType(String type) {
        jeditorPane.setContentType(type);

    }

    /**
     *
     * @param htmlDocument
     */
    public void setDocument(HTMLDocument htmlDocument) {
        jeditorPane = new JEditorPane();
        setDocument("text/html", htmlDocument);

    }

    /**
     *
     * @param jedPane
     */
    public void setDocument(JEditorPane jedPane) {
        jeditorPane = new JEditorPane();
        setDocument(jedPane.getContentType(), jedPane.getDocument());
    }

    /**
     *
     * @param plainDocument
     */
    public void setDocument(PlainDocument plainDocument) {
        jeditorPane = new JEditorPane();
        setDocument("text/plain", plainDocument);
    }

    /**
     *
     * @param type
     * @param document
     */
    protected void setDocument(String type, Document document) {
        setContentType(type);
        jeditorPane.setDocument(document);
    }

    /**
     *
     * @param scaleWidth
     */
    public void setScaleWidthToFit(boolean scaleWidth) {
        scaleWidthToFit = scaleWidth;
    }

}
