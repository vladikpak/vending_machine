package model;

import java.util.Scanner;

public class CardAcceptor implements Access {
    private int amount;

    public void RequireCard() {
        System.out.print("Напишите ваш номер карты: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.equalsIgnoreCase("1234 6578 6783 3455")) {
            Requirepassword();
        } else {
            System.out.println("Номер карты неверный");
        }
    }

    public void Requirepassword() {
        System.out.print("Введите ваш пароль от карты: ");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        if (str1.equalsIgnoreCase("234")) {
            System.out.print("Какую сумму хочешь закинуть: ");
            int payment = scanner.nextInt();
            if (payment <= 0 || payment >= 1000) {
                amount = amount + payment;
            } else {
                System.out.println("Сумма должна быть от 1 до 1000");
            }
        } else {
            System.out.println("Пароль неверный");
        }
    }

    @Override
    public void Add() {
        RequireCard();
    }

    @Override
    public int BalanceOnMachine() {
        return amount;
    }

    @Override
    public void DegreePay() {
    amount -= amount;
    }
}
