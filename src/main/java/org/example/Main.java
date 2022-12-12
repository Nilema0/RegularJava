package org.example;
import lombok.val;
import java.util.Scanner;
import static org.example.Methods.*;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Выберите действие: \n" +
                "1. Проверить IP.\n" +
                "2. Проверить GUID. \n" +
                "3. Проверить URL. \n" +
                "4. Проверить пароль. ");

        Scanner in = new Scanner(System.in);
        val choice = in.nextLine();

        if (!(choice.matches("[1-4]"))) {
            System.out.println("Необходимо ввести целое число в диапазоне от 1 до 4. ");
            return;
        }

        System.out.print("Введите строку: ");
        val line = in.nextLine();
        System.out.println(generateMessage(choice, line));
    }

    final static String correctAnswer = "Строка подходит под заданный шаблон. ";
    final static String wrongAnswer = "Строка не подходит под заданный шаблон. ";

    public static String generateMessage(final String choice, final String line){
        switch (choice) {
            case "1"-> {
                if (checkIp(line)) { return correctAnswer; }
                else { return wrongAnswer; }
            }
            case "2"-> {
                if (checkGuid(line)) { return correctAnswer; }
                else { return wrongAnswer; }
            }
            case "3"-> {
                if (checkUrl(line)) { return correctAnswer; }
                else { return wrongAnswer;}
            }
            case "4"-> {
                if (checkPassword(line)) { return correctAnswer; }
                else { return wrongAnswer; }
            }
            default-> { return("something"); }
        }
    }
}
