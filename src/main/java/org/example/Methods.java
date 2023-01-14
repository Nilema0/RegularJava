package org.example;

import lombok.extern.log4j.Log4j2;

/**
 * Методы, проверяющие подходит ли введённая строка под шаблоны IP, GUID, URL
 * или удовлетворяет сложности для пароля.
 */
@Log4j2
public class Methods {

    /**
     * проверяет введённую строку на соответствие шаблону IP
     *
     * @param sentence строка
     * @return возвращает true, если входная строка соответствует шаблону IP, иначе возвращает false
     */
    public static boolean checkIp(final String sentence) {
        if (log.isInfoEnabled()) {
            log.info("Начался метод проверки IP. Входная строка: " + sentence);
        }

        return sentence.matches("(([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])\\.){3}([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])$");
    }

    /**
     * проверяет введённую строку на соответствие шаблону GUID
     *
     * @param sentence строка
     * @return возвращает true, если входная строка соответствует шаблону GUID, иначе возвращает false
     */
    public static boolean checkGuid(final String sentence) {
        if (log.isInfoEnabled()) {
            log.info("Начался метод проверки GUID. Входная строка: " + sentence);
        }

        return sentence.matches("^([0-9A-Fa-f]{8})-([0-9A-Fa-f]{4}-){3}([0-9A-Fa-f]{12})$");
    }

    /**
     * проверяет введённую строку на соответствие шаблону URL
     *
     * @param sentence строка
     * @return возвращает true, если входная строка соответствует шаблону URL, иначе возвращает false
     */
    public static boolean checkUrl(final String sentence) {
        if (log.isInfoEnabled()) {
            log.info("Начался метод проверки URL. Входная строка: " + sentence);
        }
        return sentence.matches(
                "^((https?)?:\\/\\/)?" +
                        "([0-9a-zA-Z][0-9a-zA-Z-]{0,63}" +
                        "[0-9a-zA-Z]\\.)+" +
                        "(ru|com|net)" +
                        "(:\\d+)?" +
                        "((\\/[0-9a-zA-Z][0-9a-zA-Z-]{0,63}[0-9a-zA-Z])+)?" +
                        "(\\/[a-zA-Z]+\\?(\\w+=\\w+)(&\\w+=\\w+)*)?" +
                        "(#\\w+)?$");
    }

    /**
     * проверяет введённую строку на соответствие сложности пароля
     *
     * @param sentence строка
     * @return возвращает true, если входная строка соответствует сложности пароля, иначе возвращает false
     */
    public static boolean checkPassword(final String sentence) {
        if (log.isInfoEnabled()) {
            log.info("Начался метод проверки пароля. Входная строка: " + sentence);
        }
        return sentence.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[\\w]{8,}$");
    }
}
