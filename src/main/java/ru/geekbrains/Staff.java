package ru.geekbrains;

public class Staff extends Worker implements Comparable<Worker>{
    public Staff(int salary) {
        super(salary);
    }

    @Override
    public Double getMonthlySalary() {
        return salary;
    }

    @Override
    public int compareTo(Worker o) {
        return this.id.compareTo(o.id);
    }
}
