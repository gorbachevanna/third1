//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 51.2;
        double heightM = 1.59;
        double index = service.calculate(weightKg, heightM);
        System.out.println(index);
    }
}