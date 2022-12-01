package org.example;

/**
 * Методы, проверяющие подходит ли введённая строка под шаблоны IP, GUID, URL
 * или удовлетвряет сложности для пароля.
 */
public class Methods {

    /**
     * проверяет введённую строку на соответствие шаблону IP
     * @param sentence строка
     * @return возвращает true, если входная строка соответсвует шаблону IP, иначе возвращает false
     */
    public static boolean checkIp(String sentence){
        final String part = "([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])";
        return sentence.matches(part+"\\."+part+"\\."+part+"\\."+part+"$");
    }

    /**
     * проверяет введённую строку на соответствие шаблону GUID
     * @param sentence строка
     * @return возвращает true, если входная строка соответсвует шаблону GUID, иначе возвращает false
     */
    public static boolean checkGuid(String sentence){
        return sentence.matches("^([0-9A-Fa-f]{8})-([0-9A-Fa-f]{4}-){3}([0-9A-Fa-f]{12})$");
    }

    /**
     * проверяет введённую строку на соответствие шаблону URL
     * @param sentence строка
     * @return возвращает true, если входная строка соответсвует шаблону URL, иначе возвращает false
     */
    public static boolean checkUrl(String sentence){
        String regular = "^((https?)?:\\/\\/)?" +
                "([0-9a-zA-Z][0-9a-zA-Z-]{0,63}" +
                "[0-9a-zA-Z]\\.)+" +
                "(ru|com|net)" +
                "(:\\d+)?" +
                "((\\/[0-9a-zA-Z][0-9a-zA-Z-]{0,63}[0-9a-zA-Z])+)?" +
                "(\\/[a-zA-Z]+\\?(\\w+=\\w+)(&\\w+=\\w+)*)?" +
                "(#\\w+)?$";
        return  sentence.matches(regular);
    }

    /**
     * проверяет введённую строку на соответствие сложности пароля
     * @param sentence строка
     * @return возвращает true, если входная строка соответсвует сложности пароля, иначе возвращает false
     */
    public static boolean checkPassword(String sentence){
        return sentence.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[\\w]{8,}$");
    }
}
