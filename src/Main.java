public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.85; // рост, м.
        double weight = 94; // вес, кг.
        double index = service.calculate(height, weight);
        System.out.println(index);
    }
}
