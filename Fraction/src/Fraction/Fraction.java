package Fraction;

import java.util.Scanner;

public class Fraction {

    int num;
    int demon;

    public Fraction() { } // im not really sure why this is relevant, but it's just an empty constructor

    public Fraction(int num, int demon) {
        this.num = num; // this object's num attribute is num
        this.demon = demon; // this object's demon attribute is demon
        this.simplificate(); // why does this need to be here?: it doesn't; depends on what the user wants: ti simplify or not to simplify?
    }

    // today i made a getter. these are important
    // this purpose of getters is to like, allow for other classes to have access to these vars
    // here specifically we're just returning the pre-set num, which we established in the Fraction constructor
    public int getNum() {
        return num;
    }

    // the same idea applies to setters
    // in this case, since it's a pre-defined sort of fraction that we don't want to change,
    // we're keeping this.num = num.
    public void setNum(int num) {
        this.num = num;
        this.simplificate();
    }

    public int getDemon() {
        return demon;
    }

    public void setDemon(int demon) {
        if (demon != 0) {
            this.demon = demon;
            this.simplificate();
        }
    }

    public String toString() {
        return num + "/" + demon;
    }

    // the purpose of this is just.. entering nums and demons
    public void enter() {
        Scanner val = new Scanner(System.in);
        System.out.println("enter ur frac: ");
        String fracn = val.nextLine();
        fracn = fracn.replace("/", " ");

        // parser for extracting the integers:
        Scanner parse = new Scanner(fracn);
        num = parse.nextInt();
        demon = parse.nextInt();
        this.simplificate();
    }

    // recursive way!
    // that's a bit ironic if u think abt it too much..
    private static int geeceedeez(int q, int r) {
        if (q == 0) {
            return r;
        }
        return geeceedeez(r % q, q);
    }

    public void simplificate() {
        int geeceedeez = geeceedeez(num, demon);
        num = num / geeceedeez;
        demon = demon / geeceedeez;
    }

    public void add(Fraction one, Fraction two) {
        int q = one.num * two.demon;
        int r = one.demon + two.num;
        this.num = q + r;
        this.demon = one.demon * two.demon;
        this.simplificate();
    }

    public Fraction add(Fraction two) {
        int q = this.num * two.demon;
        int r = this.demon * two.num;
        return new Fraction(q + r, this.demon * two.demon);
    }

    public double toDecimal() {
        return (double) num / demon;
    }

    public boolean equals(Fraction two) {
        return this.toDecimal() == two.toDecimal();
    }
}
