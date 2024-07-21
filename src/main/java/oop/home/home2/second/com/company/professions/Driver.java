package oop.home.home2.second.com.company.professions;

public class Driver extends Person {

    int experience;



    public String toString(String fullName) {
        return super.toString() +fullName;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
