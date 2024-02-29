public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        double weight = 98;
        int Bmi = service.calculate(98, 1.87);
        System.out.println(" Индекс массы тела = " + Bmi);
    }
}