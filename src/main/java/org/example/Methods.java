package org.example;

/**
 * methods to check Ip, Guid, Url, password.
 */
public class Methods {

    /**
     * method to check string matches Ip
     * @param sentence Ip
     * @return true if string matches Ip else return false
     */
    public static boolean checkIp(String sentence){
        String regular = "^([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])\\." +
                "([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])\\." +
                "([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])\\." +
                "([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])$";
        return sentence.matches(regular);
    }

    /**
     * method to check string matches Guid
     * @param sentence Guid
     * @return true if string matches Guid else return false
     */
    public static boolean checkGuid(String sentence){
        String regular = "^([0-9A-Fa-f]{8})-([0-9A-Fa-f]{4})-" +
                "([0-9A-Fa-f]{4})-([0-9A-Fa-f]{4})-([0-9A-Fa-f]{12})$";
        return sentence.matches(regular);
    }

    /**
     * method to check string matches Url
     * @param sentence Url
     * @return true if string matches Url else return false
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
     * method to check string matches password
     * @param sentence password
     * @return true if string matches password else return false
     */
    public static boolean checkPassword(String sentence){
        String regular = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[\\w]{8,}$";
        return sentence.matches(regular);
    }
}
