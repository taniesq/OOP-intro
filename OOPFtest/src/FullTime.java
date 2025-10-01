public class FullTime extends Staff {

    private int years;
    private double basePay;
    private double bonus;

    public FullTime(String id, String name, double basePay) {
        super(id, name);
        this.basePay = Math.abs(basePay);
        this.years = 1;
        this.bonus = 200.88;
    }

    public FullTime(String id, String name, double basePay, int years, double bonus) {
        super(id, name);
        this.basePay = Math.abs(basePay);
        this.years = Math.abs(years);
        this.bonus = Math.abs(bonus);
    }

    public double getBasePay() {
        return this.basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = Math.abs(basePay);
    }

    public int getYears() {
        return this.years;
    }

    public void setYears(int years) {
        this.years = Math.abs(years);
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = Math.abs(bonus);
    }

    public double calculateSalary() {
        return (this.basePay + this.bonus) * this.years;
    }

    public String toString() {
        return super.toString()
                + " | Base pay: $" + this.basePay
                + " | Years experience: " + this.years
                + " | Bonus: $" + this.bonus
                + " | Final pay: $" + this.calculateSalary();
    }

}
