package org.example;

import lombok.val;

import java.util.HashMap;
import java.util.Scanner;

import static org.example.Methods.*;

import java.util.function.Function;

public class Main {

    private static final HashMap<String, Function<String, Boolean>> answer = new HashMap<>();
    private static final HashMap<String, String> addingToAnswer = new HashMap<>();

    static {
        answer.put("1", Methods::checkIp);
        answer.put("2", Methods::checkGuid);
        answer.put("3", Methods::checkUrl);
        answer.put("4", Methods::checkPassword);

        addingToAnswer.put("1", "Ip.");
        addingToAnswer.put("2", "Guid.");
        addingToAnswer.put("3", "Url.");
        addingToAnswer.put("4", "пароля.");
    }

    public static void main(String[] args) {
        System.out.println("Выберите действие:\n" +
                "1. Проверить IP.\n" +
                "2. Проверить GUID.\n" +
                "3. Проверить URL.\n" +
                "4. Проверить пароль.");
        val in = new Scanner(System.in);
        val choice = in.nextLine();

        if (!(choice.matches("[1-4]"))) {
            System.out.println("Необходимо ввести целое число в диапазоне от 1 до 4. ");
            return;
        }

        System.out.print("Введите строку: ");
        System.out.println(generateMessage(choice, in.nextLine()));
    }

    public static String generateMessage(final String choice, final String line) {
        if (answer.get(choice).apply(line)) return "Строка подходит под шаблон " + addingToAnswer.get(choice);
        return "Строка не подходит под шаблон " + addingToAnswer.get(choice);
    }
}
