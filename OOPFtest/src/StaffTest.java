/**
 *
 * @author marcos
 */

public class StaffTest {

    private static void separator() {
        for (int i = 0; i < 125; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Test Test02.FullTime with full constructor
        separator();
        System.out.println("Full-Time Test02.Staff 1:");
        FullTime ft1 = new FullTime("FT001", "Alice Wan", -2756.50, -10, -250.50);
        System.out.println("Expected output: ID: FT001 | Name: Alice Wan | Base pay: $2756.5 | Years experience: 10 | Bonus: $250.5 | Final pay: $30070.0");
        System.out.println(">>> Your output: " + ft1);
        ft1.setBasePay(3000); ft1.setYears(-11); ft1.setBonus(-555.55);
        System.out.println("Expected output: Updating the base pay to $3000.0 , the years to 11 and bonus to $555.55 | Updated Salary: $39111.05");
        System.out.println(">>> Your output: Updating the base pay to $" + ft1.getBasePay() + " , the years to " +
                ft1.getYears() + " and bonus to $" + ft1.getBonus() + " | Updated Salary: $" + ft1.calculateSalary());

        // Test Test02.FullTime with simplified constructor
        separator();
        FullTime ft2 = new FullTime("FT002", "Bruce Lee", -888.88);
        System.out.println("Full-Time Test02.Staff 2:");
        System.out.println("Expected output: ID: FT002 | Name: Bruce Lee | Base pay: $888.88 | Years experience: 1 | Bonus: $200.88 | Final pay: $1089.76");
        System.out.println(">>> Your output: " + ft2);
        ft2.setBasePay(1234.56); ft2.setYears(-6); ft2.setBonus(-1200.25);
        System.out.println("Expected output: Updating the base pay to $1234.56 , the years to 6 and bonus to $1200.25 | Updated Salary: $14608.86");
        System.out.println(">>> Your output: Updating the base pay to $" + ft2.getBasePay() + " , the years to " +
                ft2.getYears() + " and bonus to $" + ft2.getBonus() + " | Updated Salary: $" + ft2.calculateSalary());

        // Test Test02.PartTime with full constructor
        separator();
        PartTime pt1 = new PartTime("PT001", "Grace Noh", -10.50, -28.88);
        System.out.println("Part-Time Test02.Staff 1:");
        System.out.println("Expected output: ID: PT001 | Name: Grace Noh | Hours worked: 10.5 | Rate: $28.88 | Final pay: $303.24");
        System.out.println(">>> Your output: " + pt1);
        pt1.setHours(-24.0); pt1.setRate(-46.0);
        System.out.println("Expected output: Updating hours to 24.0 and rate to $46.0 | Updated Salary: $1104.0");
        System.out.println(">>> Your output: Updating hours to " + pt1.getHours() + " and rate to $" + pt1.getRate() + " | Updated Salary: $" + pt1.calculateSalary());

        // Test Test02.PartTime with simplified constructor
        separator();
        PartTime pt2 = new PartTime("PT002", "David Banner", -14.5);
        System.out.println("Part-Time Test02.Staff 2:");
        System.out.println("Expected output: ID: PT002 | Name: David Banner | Hours worked: 14.5 | Rate: $37.5 | Final pay: $543.75");
        System.out.println(">>> Your output: " + pt2);
        pt2.setHours(-15); pt2.setRate(-38.88);
        System.out.println("Expected output: Updating hours to 15.0 and rate to $38.88 | Updated Salary: $583.2");
        System.out.println(">>> Your output: Updating hours to " + pt2.getHours() + " and rate to $" + pt2.getRate() + " | Updated Salary: $" + pt2.calculateSalary());
        separator();

    }
}

