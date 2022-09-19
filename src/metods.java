public class metods {
    public static boolean Task1(String sentence){
        String regular = "^([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])\\.([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])\\.([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])\\.([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])$";
        return sentence.matches(regular);
    }
    public static boolean Task2(String sentence){
        String regular = "^([0-9A-Fa-f]{8})-([0-9A-Fa-f]{4})-([0-9A-Fa-f]{4})-([0-9A-Fa-f]{4})-([0-9A-Fa-f]{12})$";
        return sentence.matches(regular);
    }
    public static boolean Task3(String sentence){
        String regular = "^((https?)?:\\/\\/)?([0-9a-zA-Z][0-9a-zA-Z-]{0,63}[0-9a-zA-Z]\\.)+(ru|com|net)(:\\d+)?((\\/[0-9a-zA-Z][0-9a-zA-Z-]{0,63}[0-9a-zA-Z])+)?(\\/[a-zA-Z]+\\?(\\w+=\\w+)(&\\w+=\\w+)*)?(#\\w+)?$";
        return  sentence.matches(regular);
    }
}
