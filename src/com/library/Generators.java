package com.library;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author kadhush
 */
public class Generators {

    private static final String path = System.getProperty("user.home");
    private SimpleDateFormat frmat;
    private String tdDate;
    private final Date dte = new Date();
    //SETTING THE PAYMENT METHOD
    private final String[] paymentMethod = {"--Select Payment Method--", "Cash", "Cheque", "Mpesa", "Paypal",};
    //SETTING THE TITLE
    private final String[] title = {"- Select Title -", "Miss.", "Mrs.", "Mr."};

    //SETTING THE NATIONALITY
    private final String[] nationality = {"- Select Nationality -", "Kenyan",
        "Non Kenyan"};
    private final String[] pipeline = {"- Select Pipeline -", "Baguo", "Mshongoleni", "Kakuyuni-Arabuko"};
    private final String[] metersize = {"- Select Meter Size -", "15 mm"};
    private final String[] location = {"- Select Location -", "Arabuko Sokoke"};
    private final String[] connectiontype = {"- Select Connection Type -", "Domestic", "Community"};
    private final String[] membershiptype = {"- Select Membership Type -", "Member", "Non Member"};

    //SYSTEM SETTINGS
    private final String[] systemSettings = {"Initial Setup", "Start up Settings"};
    //SETTING THE FRIENDSHIP TYPE
    private final String[] friendshipType = {"- Select Friendship -",
        "Close Friend", "Friend", "Girl Friend", "Boy Friend"};

    //SETTING MARRIAGE STATUS
    private final String[] marriageStatus = {"- Select Status -", "Single",
        "Married", "Divorced"};

    //SETTING TYPE OF RELIGION
    private final String[] typeOfReligion = {"- Select Religion -",
        "Christian", "Musilm", "Hindu", "Budhisim"};

    //SETTING EMPLOYMENT LEVEL
    private final String[] employmentLevel = {"- Select Level -", "Casual",
        "Contract", "Permanent"};

    //SETTING PRIMARY SCHOOL HIGH LEVEL
    private final String priHighlevel[] = {"Certificate"};

    //SETTING SEARCH BY
    private final String searchBy[] = {"-Select Search Category-", "Passport",
        "Kenyan I.D", "Alien Card", "KRA Pin", "Meter Number", "Name"};

    //SETTING UNIVERSITY LEVEL
    private final String[] universityLevel = {"-Select Level-", "Degree",
        "Diploma", "Certificate"};

    //SETTING COLLEGE LEVEL
    private final String[] collegeLevel = {"-Select Level-", "Diploma",
        "Certificate"};

    //SETTING POLYTECHNIQUE LEVEL
    private final String[] polytechniqueLevel = {"-Select Level-", "Degree",
        "Diploma", "Certificate"};

    //SETTING KENYAN SCHOOL GRADES
    private final String[] kenyanSchoolGrade = {"-Select Grade-", "A", "A-",
        "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E"};
    //SETTING SECONDARY SCHOOL FORM
    private final String[] sec_form = {"-Select Form-"};

    //SETTING SECONDARY SCHOOL STREAM
    private final String[] stream = {"-Select Stream-"};

    //SETTING DORMETORY
    private final String[] dorm = {"-Select Stream-"};

    private final String[] staff = {"-Select Staff-", "CDW Staff", "BCM Staff", "CYT Staff", "EE Staff"};
    //SETTING KENYAN CONSTITUENCY
    private final String[] constituency = {"- Select Constituency-",
        "Baringo East", "Baringo West", "Baringo Central", "Mochongoi",
        "Mogotio", "Eldama Ravine", "Sotik", "Chepalungu", "Bomet East",
        "Bomet Central", "Konoin", "Mt. Elgon", "Sirisia", "Kabuchia",
        "Bumula", "Kandunyi", "Webuye", "Bokoli", "Kimilili",
        "TongarenTeso North", "Teso South", "Nambale", "Matayos", "Butula",
        "Funyula", "BudalangiMarakwet East", "Marakwet West", "Keiyo East",
        "Keiyo SouthManyatta", "Runyenjes", "Gachoka", "SiakagoTaveDujis",
        "Balambala", "Lagdera", "Dadaab", "Fafi", "Ijara", "Kasipul",
        "Kabondo", "Karachuonyo", "Rangwe", "Homabay Town", "Ndhiwa",
        "Mbita", "Gwassi", "Isiolo North", "Isiolo South",
        "Kajiado Central", "Kajiado North", "Kajiado South", " Lugari",
        "Likuyani", "Malava", "Lurambi", "Makholo", "Mumias",
        "Mumias East", "Matungu", "Butere", "Khwisero", "Shinyalu",
        "ikolomani", "Ainamoi", "Belgut", "Kipkelion", "Gatundu South",
        "Gatundu North", "Juja", "Thika Town", "Ruiru Githunguri",
        "Kiambu, Kiambaa", "Kabete", "Kikuyu", "Limuru", "Lari",
        "Kilifi North", "Kilifi South", "Kaloleni", "Rabai", "Ganze",
        "Malindi", "Magarini", "Mwea", "Gichugu", "Ndia",
        "Kirinyaga Central", "Bonchari", "South Mugirango", "Bomachoge",
        "Bobasi", "Gucha", "Nyaribari Masaba", "Nyaribari Chache",
        "Matrani", "Mosocho", "Kisumu East", "Kisumu West",
        "Kisumu Central", "Seme", "Nyando", "Muhoroni", "Nyakach",
        "Mwingi North", "Mwingi Central", "Mwingi South", "Kitui West",
        "Kitui Rural", "Kitui Town", "Mutitu", "Kitui South", "Msambweni",
        "Lunga Lunga", "Matuga", "Kinango", "Laikipia West",
        "Laikipia West", "Laikipia North", "Lamu East", "Lamu West",
        "Masinga", "Yatta", "Kangundo", "Matungulu", "Kathiani", "Mavoko",
        "Machakos Town", "Mwala", "Mbooni", "Kilome", "Kaiti", "Makueni",
        "Kibwezi West", "Kibwezi East", "Mandera West", "Banisa",
        "Mandera North", "Mandera East", "Lafey", "Moyale", "North Horr",
        "Saku", "Laisamis", "Igembe South", "Igembe Central",
        "Igembe North", "Tigania West", "Tigania East", "North Imenti",
        "Buuri", "Central Imenti", "South Imenti", "Rongo", "Awendo",
        "Migori East", "Migori West", "Uriri", "Nyatike", "Kuria East",
        "Kuria West", "Changamwe", "Jomvu", "Kisauni", "Nyali", "likoni",
        "Mvita", "Kwale", "Kangema", "Mathioya", "Kiharu", "Kigumo",
        "Maragwa", "Kandara", "Gatanga", "Westlands", "Parklands",
        "Dagoretti", "Karen / Langata", "Kibira", "Roysambu", "Kasarani",
        "Ruaraka", "Kariobangi", "kayole", "Embakasi", "Mihang'o",
        "Nairobi West", "Makadara", "Kamukunii", "Starehe", "Mathare",
        "Molo", "Njoro", "Naivasha", "Gilgil", "Kuresoi South",
        "Kuresoi North", "Subukia", "Rongai", "Bahati", "Nakuru Town West",
        "Nakuru Town East", "Tinderet", "Aldai", "Nandi Hills",
        "Emgwen North", "Emgwen South", "Mosop", "Kilgoris",
        "Emurua Dikirr", "Narok North", "Kajiado East", "Kajiado West",
        "Kitutu Masaba", "North Mugirango", "West Mugirango", "Kinangop",
        "Kipipiri", "Ol-Kalou", "Ol-Jorok", "Ndaragwa", "Tetu", "Kieni",
        "Mathira", "Othaya", "Mukuwe-ini", "Nyeri Town", "Samburu West",
        "Samburu North", "Samburu East", "Ugenya", "Ugunja",
        "Alego Usonga", "Gem", "Bondo", "Rarieda", "Taveta", "Wundanyi",
        "Mwatate", "Voi", "Garsen", "Galole", "Bura", "Nithi", "Maara",
        "Tharaka", "Kwanza", "Endebess", "Saboti", "Kiminini",
        "Cherenganyi", " Turkana North", "Turkana West", "Turkana Central",
        "Loima", "Turkana South", "Turkana East.", "Eldoret East",
        "Eldoret North", "Eldoret South.", "Vihiga", "Sabatia", "Hamisi",
        "Emuhaya", "Luanda", "Wajir North", "Wajir East", "Tarbaj",
        "Wajir West", "Eldas", "Wajir South", "Kapenguri", "Sigor",
        "Kacheliba", "Pokot South"};

    //SETTING KENYAN COUNTY
    private final String county[] = {"- Select County -", "Baringo", "Bomet",
        "Bungoma", "Busia", "Elgeyo/Marakwet", "Embu", "Garissa",
        "Homa Bay", "Isiolo", "Kajiado", "Kakamega", "Kericho", "Kiambu",
        "Kilifi", "Kirinyaga", "Kisii", "Kisumu", "Kitui", "Kwale",
        "Laikipia", "Lamu", "Machakos", "Makueni", "Mandera", "Marsabit",
        "Meru", "Migori", "Mombasa", "Murang'a", "Nairobi", "Nakuru",
        "Nandi", "Narok", "Nyamira", "Nyandarua", "Nyeri", "Samburu",
        "Siaya", "Taita Taveta", "Tana River", "Tharaka Nithi",
        "Trans Nzoia", "Turkana", "Uasin Gishu", "Vihiga", "Wajir",
        "West Pokot"};

    //SETTING KENYAN DISTRICTS
    private final String districts[] = {"- Select Districts -"};

    //SETTING KENYAN PROVINCE
    private final String province[] = {"-Select Province -", "Central",
        "Coast", "Eastern", "Nairobi", "North Eastern", "Nyanza",
        "Rift Valley", "Western"};

    //SETTING GENDER
    private final String gender[] = {"-Select Gender-", "Female", "Male"};

    //SETTING SEXUALITY
    private final String sexuality[] = {"- Select Sexuality -", "Straight",
        "Gay", "Lesibian"};

    //SETTING COUNTRY
    private final String[] countries = {"-Select Country -", "Afghanistan",
        "Åland Islands", "Albania", "Algeria", "American Samoa",
        "Andorra", "Angola", "Anguilla", "Anonymous Proxy", "Antarctica",
        "Antigua And Barbuda", "Argentina", "Armenia", "Aruba",
        "Asia/Pacific Region", "Australia", "Austria", "Azerbaijan",
        "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus",
        "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia",
        "Bonaire\\, Sint Eustatius And Saba", "Bosnia And Herzegovina",
        "Botswana", "Bouvet Island", "Brazil",
        "British Crown Dependencies", "British Indian Ocean Territory",
        "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi",
        "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands",
        "Central African Republic", "Chad", "Chile", "China",
        "Christmas Island", "Cocos (Keeling) Islands", "Colombia",
        "Comoros", "Congo", "Congo (The Democratic Republic Of The)",
        "Cook Islands", "Costa Rica", "Cote D'ivoire", "Croatia", "Cuba",
        "Curaçao", "Cyprus", "Czech Republic", "Denmark", "Djibouti",
        "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt",
        "El Salvador", "England", "Equatorial Guinea", "Eritrea",
        "Estonia", "Ethiopia", "Europe", "Falkland Islands (Malvinas)",
        "Faroe Islands", "Fiji", "Finland", "France",
        "France (Metropolitan)", "French Guiana", "French Polynesia",
        "French Southern Territories", "Gabon", "Gambia", "Georgia",
        "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada",
        "Guadeloupe", "Guam", "Guatemala", "Guernsey", "Guinea-Bissau",
        "Guyana", "Haiti", "Heard Island And Mcdonald Islands",
        "Holy See (Vatican City State)", "Honduras", "Hong Kong",
        "Hungary", "Iceland", "India", "Indonesia",
        "Iran (Islamic Republic Of)", "Iraq", "Ireland", "Isle Of Man",
        "Israel", "Italy", "Jamaica", "Japan", "Jersey", "Jordan",
        "Kazakstan", "Kenya", "Kiribati",
        "Korea (Democratic People's Republic Of)", "Korea (Republic Of)",
        "Kuwait", "Kyrgyzstan", "Lao People's Democratic Republic",
        "Latvia", "Lebanon", "Lesotho", "Liberia",
        "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania",
        "Lithuania", "Luxembourg", "Macau", "Macedonia, The Republic Of",
        "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta",
        "Marshall Islands", "Martinique", "Mauritania", "Mauritius",
        "Mayotte", "Mexico", "Micronesia (Federated States Of)",
        "Moldova (Republic Of)", "Monaco", "Mongolia", "Montenegro",
        "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia",
        "Nauru", "Nepal", "Netherlands", "Netherlands Antilles",
        "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria",
        "Niue", "Norfolk Island", "Northern Ireland",
        "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau",
        "Palestinian Territory (Occupied)", "Panama", "Papua New Guinea",
        "Paraguay", "Peru", "Philippines", "Pitcairn", "Poland",
        "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania",
        "Russian Federation", "Rwanda", "Saint Barthélemy",
        "Saint Helena", "Saint Kitts And Nevis", "Saint Lucia",
        "Saint Martin (French Part)", "Saint Vincent And The Grenadines",
        "Samoa", "San Marino", "Sao Tome And Principe",
        "Satellite Provider", "Saudi Arabia", "Scotland", "Senegal",
        "Serbia", "Serbia And Montenegro", "Seychelles", "Sierra Leone",
        "Singapore", "Sint Maarten (Dutch Part)", "Slovakia", "Slovenia",
        "Solomon Islands", "Somalia", "South Africa",
        "South Georgia And The South Sandwich Islands", "Spain",
        "Sri Lanka", "Sudan", "Suriname", "Svalbard And Jan Mayen",
        "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic",
        "Taiwan", "Tajikistan", "Tanzania (United Republic Of)",
        "Thailand", "Timor-Leste", "Togo", "Tokelau", "Tonga",
        "Trinidad And Tobago", "Tunisia", "Turkey", "Turkmenistan",
        "Turks And Caicos Islands", "Tuvalu", "Uganda", "Ukraine",
        "United Arab Emirates", "United Kingdom", "United States",
        "United States Minor Outlying Islands", "Uruguay", "Uzbekistan",
        "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (British)",
        "Virgin Islands (U.S.)", "Wales", "Wallis And Futuna",
        "Western Sahara", "Yemen", "Yugoslavia", "Zaire", "Zambia",
        "Zimbabwe"};

    private final String teachersEmployers[] = {"- Select Employer -", "T.S.C", "B.O.G", "P.T.A"};

    //COMPASSION
    private final String[] comp_School = {"- Select School -", "Pre-School", "Kindergarten", "Primary School", "Middle School", "High School", "Vocational school ", "Apprenticeship level", "Collage/University level", "Other school level"};
    private final String[] comp_Guardians = {"- Select Guardian -", "Father", "Mother", "Uncle", "Aunt", "Brother", "Sister", "Grandfather", "Grandmother", "Stepfather", "Stepmother", "Godfather", "Godmother", "friends", "Institutional workers", "Foster parents", "Other relatives"};
    private final String[] comp_MaritalStatus = {"- Select Marital Status -", "Now married", "Were married, now separeted by death", "Were married, now divorced or permanently separeted", "Were never married", "Unknown"};
    private final String[] comp_EmploymentFather = {"- Select father or male guardian employment", "The father or male guardian is regularly employed", "The father or male guardian is sometimes employed", "The father or male guardian is not employed", "There is no father or male guardian"};
    private final String[] comp_EmploymentMother = {"- Select mother or female guardian employment", "The mother or female guardian is regularly employed", "The mother or female guardian is sometimes employed", "The mother or female guardian is not employed", "There is no mother or female guardian"};
    private final String[] comp_Level = {"- Select User Level -", "User", "Administrator"};
    private final String[] comp_Search = {"Child Number", "Child Name"};

    //END OF VARIABLE DECLARATIONS
    /**
     *
     */
    public Generators() {
    }
//COMPASSION GETTERS

    public String[] getCompStaff() {
        return staff;
    }

    /**
     *
     * @return
     */
    public String[] getCompUserLevel() {
        return comp_Level;
    }

    /**
     *
     * @return
     */
    public String[] getCompSearch() {
        return comp_Search;
    }

    /**
     *
     * @return
     */
    public String[] getCompSchool() {
        return comp_School;
    }

    /**
     *
     * @return
     */
    public String[] getCompGuardian() {
        return comp_Guardians;
    }

    /**
     *
     * @return
     */
    public String[] getCompMaritalStatus() {
        return comp_MaritalStatus;
    }

    /**
     *
     * @return
     */
    public String[] getCompFatherEmployment() {
        return comp_EmploymentFather;
    }

    /**
     *
     * @return
     */
    public String[] getCompMotherEmployment() {
        return comp_EmploymentMother;
    }

    // GETTER METHODS
    /**
     *
     * @return
     */
    public String[] getKenyanProvince() {

        return this.province;

    }

    /**
     *
     * @return
     */
    public String[] getConstiuencies() {

        return this.constituency;
    }

    /**
     *
     * @return
     */
    public String[] getSexuality() {

        return this.sexuality;
    }

    /**
     *
     * @return
     */
    public String[] getGender() {

        return this.gender;

    }

    /**
     *
     * @return
     */
    public String[] getCountries() {

        return this.countries;
    }

    /**
     *
     * @return
     */
    public String[] getYear() {

        return yearGenerator();
    }

    /**
     *
     * @return
     */
    public String[] getMonth() {

        return monthGenerator();
    }

    /**
     *
     * @return
     */
    public String[] getDay() {

        return dayGenerator();
    }

    /**
     *
     * @return
     */
    public String[] getKenyanCounty() {
        return this.county;
    }

    /**
     *
     * @return
     */
    public String[] getKenyanDistricts() {
        return this.districts;
    }

    /**
     *
     * @return
     */
    public String[] getSearchBy() {

        return this.searchBy;
    }

    /**
     *
     * @return
     */
    public String[] getUniversityLevel() {

        return this.universityLevel;
    }

    /**
     *
     * @return
     */
    public String[] getCollegeLevel() {
        return this.collegeLevel;
    }

    /**
     *
     * @return
     */
    public String[] getPolytechniqueLevel() {

        return this.polytechniqueLevel;

    }

    /**
     *
     * @return
     */
    public String[] getGrade() {
        return this.kenyanSchoolGrade;
    }

    /**
     *
     * @return
     */
    public String[] getPriHighLevel() {
        return priHighlevel;
    }

    /**
     *
     * @return
     */
    public String[] getEmploymentLevel() {
        return employmentLevel;
    }

    /**
     *
     * @return
     */
    public String[] getReligion() {
        return this.typeOfReligion;
    }

    /**
     *
     * @return
     */
    public String[] getMarriageStatus() {
        return this.marriageStatus;
    }

    /**
     *
     * @return
     */
    public String[] getFriendship() {
        return this.friendshipType;
    }

    /**
     *
     * @return
     */
    public String[] getNationality() {
        return this.nationality;
    }

    /**
     *
     * @return
     */
    public String[] getTitle() {
        return this.title;
    }

    /**
     *
     * @return
     */
    public String[] getLocation() {
        return this.location;
    }

    /**
     *
     * @return
     */
    public String[] getMeterSize() {
        return this.metersize;
    }

    /**
     *
     * @return
     */
    public String[] getMembershipType() {
        return this.membershiptype;
    }

    /**
     *
     * @return
     */
    public String[] getConnectionType() {
        return this.connectiontype;
    }

    /**
     *
     * @return
     */
    public String[] getPipeline() {
        return this.pipeline;
    }

    /**
     *
     * @return
     */
    public String[] getForm() {
        return sec_form;
    }

    /**
     *
     * @return
     */
    public String[] getStream() {
        return stream;
    }

    /**
     *
     * @return
     */
    public String[] getDorm() {
        return dorm;
    }

    /**
     *
     * @return
     */
    public String[] getPaymentmethods() {
        return this.paymentMethod;
    }

    /**
     *
     * @return
     */
    public String[] getTchrEmployer() {
        return teachersEmployers;
    }

    // VARIABLE DECLARATION
    private String[] monthGenerator() {
        String[] strMonth = new String[13];
        strMonth[0] = "- Month -";
        for (int i = 1; i <= 12; i++) {
            strMonth[i] = ("" + i).trim();
        }

        return strMonth;
    }

    private String[] dayGenerator() {
        String[] strDay = new String[32];
        strDay[0] = "- Day -";

        for (int i = 1; i <= 31; i++) {
            strDay[i] = ("" + i).trim();
        }

        return strDay;
    }

    private String[] yearGenerator() {
        String[] strYear = new String[1000];
        strYear[0] = "- Year -";
        for (int i = 1; i < 1000; i++) {
            int yr = 1914 + i;
            strYear[i] = ("" + yr).trim();
        }
        return strYear;
    }

    /**
     *
     * @return
     */
    public String[] getSystemsettings() {
        return systemSettings;
    }

    /**
     *
     * @param str
     * @return
     */
    public String getTodayDate(String str) {

        switch (str) {
            case "dash":
                frmat = new SimpleDateFormat("dd-MM-yyyy");
                break;

            case "underscore":
                frmat = new SimpleDateFormat("dd_MM_yyyy");
                break;

            case "forwardslash":
                frmat = new SimpleDateFormat("dd/MM/yyyy");
                break;
            case "none":
                frmat = new SimpleDateFormat("yyyyMMdd");
                break;
            case "comma":
                frmat = new SimpleDateFormat("dd,MM,yyyy");
                break;
        }

        return frmat.format(dte);

    }

    /**
     *
     * @return
     */
    public long getMillTime() {
        Calendar cal = Calendar.getInstance();
        return cal.getTimeInMillis();

    }

    /*
     Create Directory to be used by the system
     */
    public static void createDirs() {

        //Create cmsApp Directory
        System.out.println("  1)Creating UninetApps and cmsApp directories");
        File dir = new File(path + "\\UninetApps\\cmsApp");
        if (dir.exists()) {

        } else {
            dir.mkdirs();

        }

        //Create Image Directory
        System.out.println("  2)Creating img directory");
        File imageDir = new File(path + "\\UninetApps\\cmsApp\\img");
        if (imageDir.exists()) {
        } else {
            imageDir.mkdirs();
        }

        //Create PDF Directory
        System.out.println("  3)Creating pdf directory");
        File PDFDir = new File(path + "\\UninetApps\\cmsApp\\pdf");
        if (PDFDir.exists()) {
        } else {
            PDFDir.mkdirs();
        }

        //Create Database Directory
        //System.out.println("  4)Creating db directory");
        File DBDir = new File(path + "\\UninetApps\\cmsApp\\db");
        if (DBDir.exists()) {
        } else {
            DBDir.mkdirs();
        }

        //Create Database Directory
        System.out.println("  5)Creating logs directory");
        File LogsDir = new File(path + "\\UninetApps\\cmsApp\\logs");
        if (LogsDir.exists()) {
        } else {
            LogsDir.mkdirs();
        }
    }

    public String getDatabaseURL() {
        System.out.println("Getting the database path");
        return path + "\\UninetApps\\cmsApp\\db";
    }

    public String getImageURL() {
        System.out.println("Getting the image path");
        return path + "\\UninetApps\\cmsApp\\img";
    }

    public String getPDFURL() {
        System.out.println("Getting the pdf path");
        return path + "\\UninetApps\\cmsApp\\pdf";
    }
}
