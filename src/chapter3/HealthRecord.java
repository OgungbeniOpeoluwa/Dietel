package chapter3;

public class HealthRecord {

    private String firstname;
    private String surname;
    private String gender;
    private int dateOfBirth;
    private String monthOfBirth;
    private int yearOfBirth;
    private int weight;
    private int height;

    public HealthRecord(String firstname, String surname, String gender, int dateOfBirth, String monthOfBirth, int yearOfBirth, int weight, int height) {
        this.firstname = firstname;
        this.surname = surname;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
        this.height = height;
    }

    public void setName(String firstname) {
        this.firstname = firstname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String gender() {
        return gender;
    }

    int age = 0;

    public int ageCaculator(int currentYear) {
        age = currentYear - yearOfBirth;
        return age;
    }
    int bmi = 0;
    public int bodyMassIndex() {
        bmi = (weight * 703) / (height * height);
        return bmi;
    }

    double maximumHeartRate = 0;

    public double maximumHeartRate() {
        int value = 220;
        maximumHeartRate = value - age;
        return maximumHeartRate;
    }

    public double targetHeart(double number) {
        double rate = 0;
        if (number >= 50) {
            rate = number / 100;
        }
        return maximumHeartRate * rate;
    }
}






