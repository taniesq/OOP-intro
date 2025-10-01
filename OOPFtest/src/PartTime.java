public class PartTime extends Staff {

    private double rate;
    private double hours;

    public PartTime(String id, String name, double hours) {
        super(id, name);
        this.hours = Math.abs(hours);
        this.rate = 37.50;
    }

    public PartTime(String id, String name, double hours, double rate) {
        super(id, name);
        this.hours = Math.abs(hours);
        this.rate = Math.abs(rate);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = Math.abs(rate);
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = Math.abs(hours);
    }

    public double calculateSalary() {
        return this.hours * this.rate;
    }

    public String toString() {
        return super.toString()
                + " | Hours worked: " + this.hours
                + " | Rate: $" + this.rate
                + " | Final pay: $" + this.calculateSalary();
    }
}
