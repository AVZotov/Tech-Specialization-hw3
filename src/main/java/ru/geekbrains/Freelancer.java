package ru.geekbrains;

public class Freelancer extends Worker{
    private double averageDays = 20.8;
    private double workingHours = 8;


    public Freelancer(int salary) {
        super(salary);
    }
    public Freelancer(int salary, double averageDays, double workingHours) {
        super(salary);
        this.averageDays = averageDays;
        this.workingHours = workingHours;
    }

    @Override
    public void getMonthlySalary() {
        System.out.println(salary * averageDays * workingHours);
    }
}
