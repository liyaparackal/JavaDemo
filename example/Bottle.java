package com.example;

public class Bottle {
private int capacity;
private int waterlevel;

public Bottle(int capacity)
{this.capacity=capacity;
//maximum capacity of bottle
this.waterlevel=0;
}
public void fill(int amount) {
    if (amount <= 0) {
        System.out.println("Amount must be positive.");
        return;
    }
    if (waterlevel + amount > capacity) {
        waterlevel = capacity;
        System.out.println("Flask is full. Excess water spilled.");
    } else {
        waterlevel += amount;
        System.out.println("Added " + amount + " units of water.");
    }
}
public void drink(int amount) {
    if (amount <= 0) {
        System.out.println("Amount must be positive.");
        return;
    }
    if (amount > waterlevel) {
        System.out.println("Not enough water to drink. Bottle is empty.");
        waterlevel = 0;
    } else {
        waterlevel -= amount;
        System.out.println("Drank " + amount + " units of water.");
    }
}
public int getLevel() {
    return waterlevel;
}

}
