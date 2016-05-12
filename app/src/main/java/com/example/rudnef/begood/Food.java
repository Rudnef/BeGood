package com.example.rudnef.begood;


public class Food {
    private int value;
    private int count;
    private int sum = 0;

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public Food(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Food(int value, int count) {
        this.value = value;
        this.count = count;
    }
}
