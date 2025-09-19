package model;

import java.util.Scanner;

public class CoinAcceptor implements Access {
    private int amount;

    public CoinAcceptor(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    @Override
    public void Add() {
        setAmount(getAmount() + 10);
    }

    @Override
    public int BalanceOnMachine() {
        return getAmount();
    }

    @Override
    public void DegreePay() {
        amount -= amount;
    }
}
