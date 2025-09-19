package model;

import java.util.Scanner;

public class CardAcceptor {
    private CoinAcceptor amount;

    public CardAcceptor(CoinAcceptor amount) {
        this.amount = amount;
    }

    public void RequireCard() {
        System.out.print("Напишите ваш номер карты: ");
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        if (str == 1234) {
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
            if (payment >= 0 && payment <= 1000) {
                amount.setAmount(amount.getAmount() + payment);
                System.out.println("Вы пополнили баланс на " + amount.getAmount());
            } else {
                System.out.println("Сумма должна быть от 1 до 1000");
            }
        } else {
            System.out.println("Пароль неверный");
        }
    }
}
