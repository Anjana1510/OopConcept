package oopconcept;

public class ExecutionClass {

    public static void main(String[] args) {

        Employee emp = new Employee();
        Programmer p = new Programmer();
        Tester t = new Tester();
        Architect a = new Architect();

        emp.getHolidays();
        p.doProgramming();
        p.doWork();
        t.doTesting();
        a.getSalary();

        Organization o = new Organization();
        o.doMeeting();

        emp.doMeeting();
        a.hireEmployee();

    }
}
