package oopconcept;

public class Employee extends Organization{

    public void getSalary(){
        System.out.println("Employee --- All employee gets salary.");
    }
    public void getHolidays(){
        System.out.println("Employee --- All employee gets holidays");
    }
    public void doWork(){
        System.out.println("Employee --- All employee do their work");
    }

    @Override
    public void doMeeting() {
        System.out.println("Employee ---- All employee arrange meeting");
    }
}
