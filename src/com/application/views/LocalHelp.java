package com.application.views;

import java.io.IOException;
import java.net.URL;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author kadhush
 */
public class LocalHelp implements HyperlinkListener, TreeSelectionListener {
    private static final boolean DEBUG = false;
    //Optionally play with line styles.  Possible values are
    //"Angled" (the default), "Horizontal", and "None".
    private static final boolean playWithLineStyle = false;
    private static final String lineStyle = "Horizontal";
    // Variables declaration - do not modify
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration

    private javax.swing.JPanel lHelpPane;


    //TREE HELP
    private JEditorPane htmlPane;
    private JTree tree;
    private URL helpURL;

    /**
     *
     * @return
     */
    public javax.swing.JPanel init() {
        lHelpPane = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        splitPane = new javax.swing.JSplitPane();

        splitPane.setDividerLocation(350);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1.setBorder(null);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(lHelpPane);
        lHelpPane.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        setHelpView();
        return lHelpPane;
    }

    /**
     *
     */
    public void setHelpView() {

        initializeHelp();

    }
    
    
    @Override
    public void hyperlinkUpdate(HyperlinkEvent e) {

    }

    /**
     *
     */
    public void initializeHelp() {
        try {
            //Create the nodes.
            DefaultMutableTreeNode top = new DefaultMutableTreeNode("INFORMATION MANAGEMENT SYSTEM HELP");
            createNodes(top);

            //Create a tree that allows one selection at a time.
            tree = new JTree(top);
            tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

            //Listen for when the selection changes.
            tree.addTreeSelectionListener(this);

            if (playWithLineStyle) {
                System.out.println("line style = " + lineStyle);
                tree.putClientProperty("JTree.lineStyle", lineStyle);
            }

            //Create the scroll pane and add the tree to it.
            JScrollPane treeView = new JScrollPane(tree);

            //Create the HTML viewing pane.
            htmlPane = new JEditorPane();
            htmlPane.setEditable(false);
            initHelp();
            JScrollPane htmlView = new JScrollPane(htmlPane);

            splitPane.setLeftComponent(treeView);
            splitPane.setRightComponent(htmlView);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    /**
     * Required by TreeSelectionListener interface.
     */
    @Override
    public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();

        if (node == null) {
            return;
        }

        Object nodeInfo = node.getUserObject();
        if (node.isLeaf()) {
            Info book = (Info) nodeInfo;
            displayURL(book.bookURL);
            if (DEBUG) {
                System.out.print(book.bookURL + ":  \n    ");
            }
        } else {
            displayURL(helpURL);
        }
        if (DEBUG) {
            System.out.println(nodeInfo.toString());
        }
    }

    private void initHelp() {
        String s = "/com/publik/help/index.html";
        helpURL = getClass().getResource(s);
        if (helpURL == null) {
            System.err.println("Couldn't open help file: " + s);
        } else if (DEBUG) {
            System.out.println("Help URL is " + helpURL);
        }

        displayURL(helpURL);
    }

    private void displayURL(URL url) {
        try {
            if (url != null) {
                htmlPane.setPage(url);
            } else { //null url
                htmlPane.setText("File Not Found");
                if (DEBUG) {
                    System.out.println("Attempted to display a null URL.");
                }
            }
        } catch (IOException e) {
            System.err.println("Attempted to read a bad URL: " + url);
        }
    }

    private void createNodes(DefaultMutableTreeNode top) {
        DefaultMutableTreeNode category = null;
        DefaultMutableTreeNode ims = null;

        category = new DefaultMutableTreeNode("INFORMATION MANAGEMENT SYSTEM");
        top.add(category);

        //Add Child
        ims = new DefaultMutableTreeNode(new Info("Add Child",
                "/com/publik/help/add_child.html"));
        category.add(ims);

        //Add Staff
        ims = new DefaultMutableTreeNode(new Info("Add Staff",
                "/com/publik/help/add_staff.html"));
        category.add(ims);

        //Update Details
        ims = new DefaultMutableTreeNode(new Info("Update Details",
                "/com/publik/help/update_details.html"));
        category.add(ims);
        //Reports
        ims = new DefaultMutableTreeNode(new Info("Reports",
                "/com/publik/help/reports.html"));
        category.add(ims);
        
        //User Accounts
        ims = new DefaultMutableTreeNode(new Info("User Accounts",
                "/com/publik/help/user_accounts.html"));
        category.add(ims);
        
        //System Configuration
        ims = new DefaultMutableTreeNode(new Info("System Configuration",
                "/com/publik/help/system_configuration.html"));
        
        category.add(ims);
        
        //About Us
        ims = new DefaultMutableTreeNode(new Info("About Us",
                "/com/publik/help/about_us.html"));
        category.add(ims);

        category = new DefaultMutableTreeNode("PRO VERSION");
        top.add(category);
        //Pro Version
        ims = new DefaultMutableTreeNode(new Info("Pro Version",
                "/com/publik/help/proversion.html"));
        category.add(ims);

        category = new DefaultMutableTreeNode("END USER LISENCE AGREEMENT");
        top.add(category);
        //End User licence
        ims = new DefaultMutableTreeNode(new Info("End user Licence",
                "/com/publik/help/enduserlicence.html"));
        category.add(ims);
        
        
    }

    private class Info {
        
        public String bookName;
        public URL bookURL;
        
        public Info(String book, String filename) {
            bookName = book;
            bookURL = getClass().getResource(filename);
            if (bookURL == null) {
                System.err.println("Couldn't find file: "
                        + filename);
            }
        }

        @Override
        public String toString() {
            return bookName;
        }
    }
}
