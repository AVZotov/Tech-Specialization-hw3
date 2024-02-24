package ru.geekbrains;

public class Freelancer extends Worker implements Comparable<Worker>{
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
    public Double getMonthlySalary() {
        return salary * averageDays * workingHours;
    }

    @Override
    public int compareTo(Worker o) {
        return this.id.compareTo(o.id);
    }
}
