package Zoo;

import java.util.Date;

public class Animal {
    private String name;
    private int birthYear;
    private boolean isDangerous;

    public Animal () { }

    public Animal(String name, int birthYear, boolean isDangerous) {
        this.name = name;
        this.birthYear = birthYear;
        this.isDangerous = isDangerous;
    }

    public Animal (String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.isDangerous = false; // setting the default danger to false
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    // now we shall create our very own getters and setters!!!!!! get hype
    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getDangerous() {
        if(isDangerous) { // if == true is implied
            return "yessir!!!";
        } else {
            return "nosiree!!!";
        }
    }

    // those r our getters,
    // and now, we have our setters!!!!

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setDangerous (boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    // and that concludes our getters and setters!!! amazing

    // now, we're going to calculate the age of our animal.
    // this requires the Date class, which is kinda like a library
    public int calcAge() {
        Date currentDate = new Date();
        int currentYear = currentDate.getYear() + 1900;
        return currentYear - birthYear;
    }

    // since we can't really 'print' objects, we need to convert them to Strings
    // there does exist a toString method, but this one is like customized? for our class!
    public String toString() {
        return "name: " + name
                + "\n birth year: " + birthYear
                + "\n dangerous?: " + isDangerous;
    }

    public void talk() {
        System.out.println(this.name + " has sworn a vow of silence.");
    }

    public void eat() {
        System.out.println(name + " does not require sustenance to flourish.");
    }
}