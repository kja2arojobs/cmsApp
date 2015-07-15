package com.library;

import com.application.models.SystemSecurityModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kadhush
 */
public class SystemSecurity {
    private static final Logger LOG = Logger.getLogger(SystemSecurity.class.getName());

    private static String getMotherboardSN() {
        String result = "";
        try {
            File file = File.createTempFile("realhowto", ".vbs");
            file.deleteOnExit();
            try (FileWriter fw = new java.io.FileWriter(file)) {
                String vbs = "Set objWMIService = GetObject(\"winmgmts:\\\\.\\root\\cimv2\")\n"
                        + "Set colItems = objWMIService.ExecQuery _ \n"
                        + " (\"Select * from Win32_BaseBoard\") \n"
                        + "For Each objItem in colItems \n"
                        + " Wscript.Echo objItem.SerialNumber \n"
                        + " exit for ' do the first cpu only! \n" + "Next \n";

                fw.write(vbs);
            }

            Process p = Runtime.getRuntime().exec(
                    "cscript //NoLogo " + file.getPath());
            try (BufferedReader input = new BufferedReader(new InputStreamReader(
                    p.getInputStream()))) {
                String line;
                while ((line = input.readLine()) != null) {
                    result += line;
                }
            }
        } catch (IOException e) {
        }
        return result.trim();
    }

    /**
     *
     */
    public static void getGarbageCollector() {
        try {
            Runtime.getRuntime().freeMemory();
            System.gc();
            Thread.sleep(100);
            System.runFinalization();
            Thread.sleep(100);
            System.gc();
            Thread.sleep(100);
            System.runFinalization();
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(SystemSecurity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private final SystemSecurityModel sys = new SystemSecurityModel();
    private Vector<?> aTtableData = new Vector<>();
    private final Generators gen = new Generators();
    private final Map<String, String> sysData = new LinkedHashMap<>();
    private Object[] objSysSec;
    private String[] strSysSec;

    /**
     *
     * @return
     */
    public String securityLockingCode() {

        String tDate = gen.getTodayDate("none");
        String syetemSerial = getMotherboardSN();

        String strSerialLen0, strSerialLen1, strSerialLen2 = "";
        //  String strSalt = "KxdYMnPZyq3568KD3BG";
        String strCode = tDate.substring(0, 2) + syetemSerial + tDate.substring(2, tDate.length());

        return strCode;
    }

    /**
     *
     * @return
     */
    public String getSecurityUnlockCode() {
        aTtableData = sys.getAllDetails().get("tableData");
        String strSysName, strUser, strDay1, strCode, strDayRegister, strRegisterCode, strStatus;

        objSysSec = aTtableData.toArray();
        strSysSec = objSysSec[0].toString().split(",\\s*");

        strSysName = strSysSec[0].substring(1);
        strUser = strSysSec[1];
        strDay1 = strSysSec[2];
        strCode = strSysSec[3];
        strDayRegister = strSysSec[4];
        strRegisterCode = strSysSec[5];
        strStatus = strSysSec[6].substring(0, strSysSec[6].length() - 1);
        //GENERATE THE UNLOCK CODE
        String strCd0 = strCode.substring(0, 4);
        String strCd1 = strCode.substring(3, 5);
        String strCd2 = strCode.substring(4);

        String strSalt = "XxBDJTFFJHgtgyhj3BG";

        String strSal0 = strSalt.substring(0, 4);
        String strSal1 = strSalt.substring(3, 6);
        String strSal2 = strSalt.substring(4);

        String strUnlockCode = strCd1 + strSal2 + strCd0 + strSal0 + strCd2 + strSal1;

        System.out.println(strUnlockCode);
        return strUnlockCode;
    }


}
