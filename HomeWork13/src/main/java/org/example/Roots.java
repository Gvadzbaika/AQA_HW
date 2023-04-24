package org.example;

public class Roots {
    private double x1;
    private double x2;
    private final int numOfRoots;

    public Roots() {
        numOfRoots = 0;
    }

    public Roots(double x) {
        this.x1 = x;
        numOfRoots = 1;
    }

    public Roots(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
        numOfRoots = 2;
    }

    public Roots(int numOfRoots) {
        this.numOfRoots = numOfRoots;
    }

    public double getRoot1() {
        return x1;
    }

    public double getRoot2() {
        return x2;
    }

    public int getNumOfRoots() {
        return numOfRoots;
    }
}

