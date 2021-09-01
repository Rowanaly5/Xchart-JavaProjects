package org.example.jupai6;

public class JobDetails {
    String title;
    String company;
    String type;
    String level;
    String YearsExp;
    String country;
    String skills;
    String Location;

    public JobDetails(String title, String company, String type, String level , String Location, String YearsExp , String country, String skills) {
        title = ArrayString[0];
        company = ArrayString[1];
        Location = ArrayString[2];
        type = ArrayString[3];
        level = ArrayString[4];
        YearsExp = ArrayString[5];
        country = ArrayString[6];
        skills = ArrayString[7];

    }

    public String getTitle() { return title; }

    public String getCompany() { return title; }

    public String getType() { return type; }

    public String getLocation() {
        return Location;
    }

    public String getLevel() { return level; }

    public String getYearsExp() { return YearsExp; }

    public String getCountry() { return country ; }

    public String getSkills() { return skills; }

}
