public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        // int weight = 90;
        // double height = 1.82;
        int bmi = service.calculate(90, 1.82);
        System.out.println(bmi);
    }
}
