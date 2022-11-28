package org.example;

/**
 * Методы, проверяющие подходит ли введённая строка под шаблоны Ip, Guid, Url
 * или удовлетвряет сложности для пароля.
 */
public class Methods {

    /**
     * проверяет введённую строку на соответствие шаблону Ip
     * @param sentence строка
     * @return возвращает true если входная трока соответсвует шаблону Ip, иначе возвращает false
     */
    public static boolean checkIp(String sentence){
        String regular = "^([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])\\." +
                "([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])\\." +
                "([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])\\." +
                "([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])$";
        return sentence.matches(regular);
    }

    /**
     * проверяет введённую строку на соответствие шаблону Guid
     * @param sentence строка
     * @return возвращает true если входная трока соответсвует шаблону Guid, иначе возвращает false
     */
    public static boolean checkGuid(String sentence){
        String regular = "^([0-9A-Fa-f]{8})-([0-9A-Fa-f]{4})-" +
                "([0-9A-Fa-f]{4})-([0-9A-Fa-f]{4})-([0-9A-Fa-f]{12})$";
        return sentence.matches(regular);
    }

    /**
     * проверяет введённую строку на соответствие шаблону Url
     * @param sentence строка
     * @return возвращает true если входная трока соответсвует шаблону Url, иначе возвращает false
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
     * @return возвращает true если входная трока соответсвует сложности пароля, иначе возвращает false
     */
    public static final boolean checkPassword(String sentence){
        String regular = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[\\w]{8,}$";
        return sentence.matches(regular);
    }
}
