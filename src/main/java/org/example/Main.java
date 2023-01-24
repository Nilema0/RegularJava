package org.example;

import lombok.val;
import org.apache.commons.lang3.tuple.ImmutableTriple;
import org.apache.commons.lang3.tuple.Triple;

import java.util.*;
import java.util.function.Function;

public class Main {
    private static final List<Triple<String, Function<String, Boolean>, String>> ANSWER = Collections.unmodifiableList(
            Arrays.asList(
                    ImmutableTriple.of("1", Methods::checkIp, "Ip"),
                    ImmutableTriple.of("2", Methods::checkGuid, "Guid"),
                    ImmutableTriple.of("3", Methods::checkUrl, "Url"),
                    ImmutableTriple.of("2", Methods::checkPassword, "пароля")
            )
    );

    public static void main(String[] args) {
        String choice;
        String lineToCheck;

        if (args.length < 2) {
            System.out.print("""
                    Выберите действие:
                    1. Проверить IP.
                    2. Проверить GUID.
                    3. Проверить URL.
                    4. Проверить пароль.
                    Ввод:\040""");
            val in = new Scanner(System.in);
            choice = in.nextLine();

            System.out.print("Введите строку: ");
            lineToCheck = in.nextLine();
        } else{
            choice = args[0];
            lineToCheck = args[1];
        }

        if (!checker(choice)) {
            System.out.println("Необходимо ввести целое число в диапазоне от 1 до 4.");
            return;
        }

        System.out.println(generateMessage(Integer.parseInt(choice) - 1, lineToCheck));
    }

    private static String generateMessage(final int choice, final String line) {
        return String.format("Строка %sподходит под шаблон %s.",
                ANSWER.get(choice).getMiddle().apply(line) ? "" : "не ",
                ANSWER.get(choice).getRight());
    }

    private static Boolean checker(final String choice) {
        for (val triple : ANSWER) {
            if (triple.getLeft().equals(choice)) {
                return true;
            }
        }
        return false;
    }
}
