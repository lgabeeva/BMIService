public class Main {
    public static void main(String[] args) {
        BMIservice service = new BMIservice();
        // int weight = 90;
        // double height = 1.82;
        int BMI = service.calculate(90, 1.82);
        System.out.println(BMI);
    }
}
