package chapter3;

public class HeartRate {
    private String firstName;
    private String surname;
    private int dateOfBirth;
    private String monthOfBirth;
    private int yearOfBirth;

    private int ageInYears;

    private int maxHeartRate;

    private double targetRate;

    public HeartRate(String firstname, String surname, int dateOfBirth, String monthOfBirth,int yearOfBirth) {
    this.firstName = firstname;
    this.surname = surname;
    this.dateOfBirth = dateOfBirth;
    this.monthOfBirth = monthOfBirth;
    this.yearOfBirth = yearOfBirth;
    }

    public void setName(String firstname) {
        this.firstName = firstname;
    }

    public void setSurnam(String surname) {

        this.surname = surname;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstname() {
        return firstName;
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


   public void caculateAgeInyears(int currentYear) {
       int year = currentYear - yearOfBirth;
        this.ageInYears = year;
    }
    public int caculatedAgeInYears(){
        return ageInYears;
    }
    public void maximumHeartRate(){
        int number = 220;
           int maxHearRate = number - ageInYears ;
           this.maxHeartRate = maxHearRate;
    }

    public void targetHeartRate(double number){
        if(number >= 50){
           double rate = number / 100;
           double targetValue = maxHeartRate * rate;
            this.targetRate = targetValue;
        }

        }



        public int caculatedHearRate(){
        return maxHeartRate;
    }



    public double targetHeartRateRange(){
        return targetRate;


    }



}
