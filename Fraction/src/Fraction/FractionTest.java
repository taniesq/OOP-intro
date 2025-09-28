package Fraction;

public class FractionTest {
    public static void main(String[] args) {
        Fraction frac = new Fraction(3, 4);
        System.out.println(frac);
        // frac.print(); this confuses me
        frac.setNum(2);
        frac.setDemon(4);

        System.out.println(frac.getNum() + " " + frac.getDemon());

        Fraction frac2 = new Fraction();
        frac2.enter();
        System.out.println(frac2);

        frac2.simplificate();

        System.out.println("let's add!");
        frac.enter();
        frac2.enter();
        System.out.println(frac + " + " + frac2 + " = " + frac.add(frac2));

        Fraction summification = new Fraction();
        summification.add(frac, frac2);
        System.out.println(summification);
    }
}
