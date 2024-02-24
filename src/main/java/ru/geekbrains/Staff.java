package ru.geekbrains;

public class Staff extends Worker{
    public Staff(int salary) {
        super(salary);
    }

    @Override
    public void getMonthlySalary() {
        System.out.println(salary);
    }
}
