package com.hanabi.quadratic;

public class Quadratic {

    private double a;
    private double b;
    private double c;

    public Quadratic() {
    }

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    private double delta() {
        return b * b - (4 * a * c);
    }

    public void solve() {

        String message = "";

        if (a == 0) {

            if (b == 0 && c == 0) {
                message = "Phuong trinh vo so nghiem";
            } else if (b == 0) {
                message = "Phuong trinh vo nghiem";
            } else {
                double x = -c / b;
                message = "Phuong trinh co 1 nghiem la: " + x;
            }

        } else {

            double delta = delta();

            if (delta > 0) {

                double x1 = (-b + Math.sqrt(delta())) / 2 * a;
                double x2 = (-b - Math.sqrt(delta())) / 2 * a;

                message = "Phuong trinh co 2 nghiem la: " + x1 + ", " + x2;

            } else if (delta == 0) {

                double x = -b / 2 * a;

                message = "Phuong trinh co 1 nghiem la: " + x;

            } else {

                message = "Phuong trinh vo nghiem";

            }
        }

        System.out.println(message);

    }
}
