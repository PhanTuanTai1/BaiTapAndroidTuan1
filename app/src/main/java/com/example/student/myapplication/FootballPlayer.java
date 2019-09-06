package com.example.student.myapplication;

public class FootballPlayer {

    public String Name;
    public int Year;
    public String Nation;
    public int IDFace;
    public int IDNATION;

    public int getIDFace() {
        return IDFace;
    }

    public void setIDFace(int IDFace) {
        this.IDFace = IDFace;
    }

    public int getIDNATION() {
        return IDNATION;
    }

    public void setIDNATION(int IDNATION) {
        this.IDNATION = IDNATION;
    }

    public String getNation(){return Nation;}
    public void setNation(String value) {this.Nation = value;}
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }



    @Override
    public String toString() {
        return this.getName() + "\n" + this.getYear();
    }
}
