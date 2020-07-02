package com.hanabi.prime;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    private int num;

    public Prime(int num) {
        this.num = num;
    }

    private boolean checkPrimeNumber(int checkNum) {

        boolean isPrime = true;

        for (int i = 2; i < checkNum; i++) {
            if (checkNum % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public void listPrimeNumbers() {

        List<Integer> lists = new ArrayList<>();

        for (int i = 2; i < num; i++) {
            if (checkPrimeNumber(i)) {
                lists.add(i);
            }
        }

        System.out.println("Các số nguyên tố bé hơn " + num + " là: " + lists);
    }

}
