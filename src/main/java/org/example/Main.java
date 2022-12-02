package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Выберите действие: \n" +
                "1. Проверить IP.\n" +
                "2. Проверить GUID. \n" +
                "3. Проверить URL. \n" +
                "4. Проверить пароль. ");

        Scanner in = new Scanner(System.in);
        int choice = Integer.parseInt(in.nextLine());
        System.out.print("Введите строку: ");
        String line = in.nextLine();

        switch (choice) {
            case 1:
                if (Methods.checkIp(line)) {
                    System.out.println("Строка IP подходит под шаблон!");
                }
                else {
                    System.out.println("Строка IP не подходит под шаблон!");
                }
                break;
            case 2:
                if (Methods.checkGuid(line)){
                    System.out.println("Строка GUID подходит под шаблон!");
                }
                else {
                    System.out.println("Строка GUID не подходит под шаблон!");
                }
                break;
            case 3:
                if (Methods.checkUrl(line)){
                    System.out.println("Строка URL подходит под шаблон!");
                }
                else {
                    System.out.println("Строка URL не подходит под шаблон!");
                }
                break;
            case 4:
                if (Methods.checkPassword(line)){
                    System.out.println("Пароль подходит под шаблон!");
                }
                else {
                    System.out.println("Пароль не подходит под шаблон!");
                }
                break;
        }
    }
}
