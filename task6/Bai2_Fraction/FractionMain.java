package task6.Bai2_Fraction;

public class FractionMain {
    public static void main(String[] args) {
        Fraction ps1 = new Fraction();
        Fraction ps2 = new Fraction();
        ps1.input();
        ps2.input();
        ps1.add(ps2);
        ps1.subtract(ps2);
        ps1.multiply(ps2);
        ps1.divide(ps2);
    }
}
