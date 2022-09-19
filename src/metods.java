public class metods {
    public static boolean Task1(String sentence){
        String regular = "^([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])\\.([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])\\.([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])\\.([1-9]\\d|[0-9]|25[0-5]|1[0-9][0-9]|2[0-4][0-9])$";
        return sentence.matches(regular);
    }
}
