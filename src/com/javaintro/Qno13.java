package com.javaintro;

class Worker {
    String name;
    double salaryRate;

    Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    double pay(int hours) {
        return 0.0;
    }
}

class DailyWorker extends Worker {
    DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    double pay(int hours) {
        return hours * salaryRate;
    }
}

class SalariedWorker extends Worker {
    SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    double pay(int hours) {
        return 40 * salaryRate;
    }
}

public class Qno13 {
    public static void main(String[] args) {
        DailyWorker dWorker = new DailyWorker("Ravi", 100.0);
        SalariedWorker sWorker = new SalariedWorker("Priya", 150.0);

        System.out.println("Daily Worker Pay (for 30 hours): ₹" + dWorker.pay(30));
        System.out.println("Salaried Worker Pay (for 30 hours): ₹" + sWorker.pay(30));
    }
}
/*
 Daily Worker Pay (for 30 hours): ₹3000.0
Salaried Worker Pay (for 30 hours): ₹6000.0
 */
	
		



