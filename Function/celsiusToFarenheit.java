public class celsiusToFarenheit {

    public static double convert(float cels) {
        return cels * 9.0 / 5.0 + 32;
    }

    public static void main(String[] args) {
        System.out.println(convert(83.40f));
    }
}