/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.models;

import com.config.Config;
import com.library.BaseModel;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kadhush
 */
public class BootStrapModel extends BaseModel {

    private static final Config dbConfig = new Config();

    /**
     *
     */
    public void getTheDatabase() {
        File f = new File(Config.getDatabasePAth());
        if (!f.exists()) {
            System.out.println(Config.getDatabasePAth());
            init();
            createTables();
        }

    }

    private void createTables() {
        try {

            String sqlChildBio = "CREATE TABLE IF NOT EXISTS `child_bio` ( "
                    + "`chld_no` varchar(255) NOT NULL, "
                    + "`chld_name` varchar(255) NOT NULL, "
                    + "`chld_att_schl` varchar(255) NOT NULL, "
                    + "`chld_schl` varchar(255) NOT NULL, "
                    + "`chld_course` varchar(255) NOT NULL, "
                    + "`under_supervision` varchar(255) NOT NULL, "
                    + "`parents_together` varchar(255) NOT NULL, "
                    + "`parents_marital` varchar(255) NOT NULL, "
                    + "`coordinator_project` longtext NOT NULL, "
                    + "`chld_residence` varchar(255) NOT NULL, "
                    + "`chld_photo` varchar(255) NOT NULL, "
                    + " PRIMARY KEY (`chld_no`));";

            excQuery("update", sqlChildBio);

            //" FOREIGN KEY (chld_no) REFERENCES child_bio(chld_no));";
            String sqlChildFather = "CREATE TABLE IF NOT EXISTS `child_father` ("
                    + "`id_f` varchar(255) NOT NULL ,"
                    + "`chld_no_f` varchar(255) NOT NULL,"
                    + "`alive_f` varchar(255) NOT NULL,"
                    + "`live_chld_f` varchar(255) NOT NULL,"
                    + " `finance_chld_f` varchar(255) NOT NULL,"
                    + " `handicapped_f` varchar(255) NOT NULL,"
                    + "`how_handicapped_f` longtext NOT NULL,"
                    + " `chronically_ill_f` varchar(255) NOT NULL,"
                    + " `how_chronically_f` longtext NOT NULL,"
                    + " `mentally_ill_f` varchar(255) NOT NULL,"
                    + " `in_prison_f` varchar(255) NOT NULL,"
                    + "`employment_f` varchar(255) NOT NULL,"
                    + "`description_f` longtext NOT NULL,"
                    + "PRIMARY KEY (`id_f`),"
                    + "FOREIGN KEY (chld_no_f) REFERENCES child_bio(chld_no));";

            excQuery("update", sqlChildFather);

            String sqlChildMother = "CREATE TABLE IF NOT EXISTS `child_mother`("
                    + "`id_m` varchar(255) NOT NULL ,"
                    + "`chld_no_m` varchar(255) NOT NULL,"
                    + "`alive_m` varchar(255) NOT NULL,"
                    + "`live_chld_m` varchar(255) NOT NULL,"
                    + "`finance_chld_m` varchar(255) NOT NULL,"
                    + "`handicapped_m` varchar(255) NOT NULL,"
                    + "`how_handicapped_m` longtext NOT NULL,"
                    + "`chronically_ill_m` varchar(255) NOT NULL,"
                    + "`how_chronically_m` longtext NOT NULL,"
                    + "`mentally_ill_m` varchar(255) NOT NULL,"
                    + "`in_prison_m` varchar(255) NOT NULL,"
                    + "`employment_m` varchar(255) NOT NULL,"
                    + "`description_m` longtext NOT NULL,"
                    + " PRIMARY KEY (`id_m`),"
                    + "FOREIGN KEY (chld_no_m) REFERENCES child_bio(chld_no));";
            excQuery("update", sqlChildMother);

            String sqlStaffCdw = "CREATE TABLE IF NOT EXISTS `cdw_staff` ("
                    + "`cdw_id` varchar(255) NOT NULL ,"
                    + "`cdw_fullname` varchar(255) NOT NULL,"
                    + "`cdw_sex` varchar(255) NOT NULL,"
                    + "`cdw_hire_date` varchar(255) NOT NULL,"
                    + "`cdw_designation` varchar(255) NOT NULL,"
                    + "`cdw_education_level` varchar(255) NOT NULL,"
                    + " `cdw_basic_salary` varchar(255) NOT NULL,"
                    + " `cdw_house_allowance` varchar(255) NOT NULL,"
                    + "`cdw_transport_allowance` longtext NOT NULL,"
                    + " `cdw_medical_allowance` varchar(255) NOT NULL,"
                    + " `cdw_paye` varchar(255) NOT NULL,"
                    + " `cdw_nssf` varchar(255) NOT NULL,"
                    + "`cdw_photo` varchar(255) NOT NULL,"
                    + "PRIMARY KEY (`cdw_id`));";

            excQuery("update", sqlStaffCdw);

            String sqlStaffCommitee = "CREATE TABLE IF NOT EXISTS `staff_commitee` ("
                    + "`commitee_id` varchar(255) NOT NULL ,"
                    + "`commitee_chairman` varchar(255) NOT NULL ,"
                    + "`commitee_secretary` varchar(255) NOT NULL,"
                    + "`commitee_others` longtext NOT NULL,"
                    + "PRIMARY KEY (`commitee_id`));";

            excQuery("update", sqlStaffCommitee);

            String sqlStaffCyt = "CREATE TABLE IF NOT EXISTS `cyt_staff` ("
                    + "`cyt_id` varchar(255) NOT NULL ,"
                    + "`cyt_fullname` varchar(255) NOT NULL,"
                    + "`cyt_sex` varchar(255) NOT NULL,"
                    + "`cyt_hire_date` varchar(255) NOT NULL,"
                    + " `cyt_designation` varchar(255) NOT NULL,"
                    + "`cyt_education_level` varchar(255) NOT NULL,"
                    + " `cyt_salary` varchar(255) NOT NULL,"
                    + "`cyt_photo` longblob NOT NULL,"
                    + "PRIMARY KEY (`cyt_id`));";

            excQuery("update", sqlStaffCyt);

            String sqlEsterEncounter = "CREATE TABLE IF NOT EXISTS `staff_ester` ("
                    + "`ester_id` varchar(255) NOT NULL ,"
                    + "`ester_chairman` varchar(255) NOT NULL ,"
                    + "`ester_secretary` varchar(255) NOT NULL,"
                    + "`ester_others` longtext NOT NULL,"
                    + "PRIMARY KEY (`ester_id`));";

            excQuery("update", sqlEsterEncounter);

            String sqlUser = "CREATE TABLE IF NOT EXISTS `user_acc` ("
                    + " `username` varchar(255) NOT NULL,"
                    + " `password` varchar(255) NOT NULL,"
                    + " `level` varchar(255) NOT NULL,"
                    + "  `reg_date` varchar(255) NOT NULL,"
                    + " `exp_date` varchar(255) NOT NULL,"
                    + " `status` varchar(255) NOT NULL,"
                    + "  PRIMARY KEY (`username`));";

            excQuery("update", sqlUser);

            String sqlSys = "CREATE TABLE IF NOT EXISTS `sys_security` ("
                    + "`sys_name` varchar(255) NOT NULL,"
                    + "`user` varchar(255) NOT NULL,"
                    + "`day_1` varchar(255) NOT NULL,"
                    + "`code` varchar(255) NOT NULL,"
                    + "`day_register` varchar(255) NOT NULL,"
                    + "`register_code` varchar(255) NOT NULL,"
                    + "`state` varchar(255) NOT NULL,"
                    + "PRIMARY KEY (`sys_name`));";

            excQuery("update", sqlSys);

            String sqlAdmin = "INSERT INTO `user_acc` (`username`, `password`, `level`, `reg_date`, `exp_date`, `status`) VALUES('ADMIN', 'adminuser', 'Administrator', '', '', 'active');";
            try {
                excQuery("insert", sqlAdmin);
            } catch (ClassNotFoundException | SQLException ex) {

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BootStrapModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
