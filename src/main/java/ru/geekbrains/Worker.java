package ru.geekbrains;

import java.util.UUID;

public abstract class Worker implements Comparable<Worker>{
    protected final double salary;
    protected final String id;

    public Worker(int salary) {
        this.salary = salary;
        id = UUID.randomUUID().toString().substring(0, 6);
    }
    public abstract void getMonthlySalary();
}
