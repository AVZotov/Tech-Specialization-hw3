package ru.geekbrains;


public class Program {
    public static void main(String[] args) {
        Worker[] workers = new Worker[] {
                new Staff(200),
                new Freelancer(50, 20.8, 4),
                new Staff(250),
                new Freelancer(80)
        };


    }
}
