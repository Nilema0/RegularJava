package org.example;
import lombok.val;
import java.util.Scanner;
import static org.example.Methods.*;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Выберите действие: \n" +
                "1. Проверить IP.\n" +
                "2. Проверить GUID. \n" +
                "3. Проверить URL. \n" +
                "4. Проверить пароль. ");

        Scanner in = new Scanner(System.in);
        val choice = in.nextLine();

        if ((choice.matches("[1-4]"))) {

            System.out.print("Введите строку: ");
            val line = in.nextLine();

            System.out.println(generateMessage(choice, line));

        }
        else System.out.println("Необходимо ввести целое число в диапазоне от 1 до 4. ");
    }

    public static String generateMessage(final String choice, final String line){
        switch (choice) {
            case "1":
                if (checkIp(line)) {
                    return("Строка IP подходит под шаблон!");
                } else {
                    return("Строка IP не подходит под шаблон!");
                }
            case "2":
                if (checkGuid(line)) {
                    return("Строка GUID подходит под шаблон!");
                } else {
                    return("Строка GUID не подходит под шаблон!");
                }
            case "3":
                if (checkUrl(line)) {
                    return("Строка URL подходит под шаблон!");
                } else {
                    return("Строка URL не подходит под шаблон!");
                }
            case "4":
                if (checkPassword(line)) {
                    return("Пароль подходит под шаблон!");
                } else {
                    return("Пароль не подходит под шаблон!");
                }
            default:
                return("something");
        }
    }
}
