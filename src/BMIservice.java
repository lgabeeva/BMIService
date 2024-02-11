public class BMIservice {
    public int calculate(int weightKg, double heightM) {
        double BMI = weightKg / heightM / heightM;
        return (int) BMI;
    }
}
