import java.util.Scanner;
import java.text.NumberFormat;

public class mortageCalculater {
    static void calculate(){
        final byte MonthsInYear = 12;
        final byte Percent = 100;
        int principal;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
        } while (principal < 1000 || principal > 1_000_000);

        float annualRate;
        do {
            System.out.print("Annual Interest Rate greater than 0 and less than or equal 30: ");
            annualRate = scanner.nextFloat();
        } while (annualRate <= 0 || annualRate > 30);

        float MonthsAnnualRate = annualRate / Percent / MonthsInYear;
        float period;
        do {
            System.out.print("Period (Years) between 1 - 30 : ");
            period = scanner.nextFloat();
        } while (period < 1 && period > 30);

        float numberOfPayments = period * MonthsInYear;
        double mortage = principal * (MonthsAnnualRate * Math.pow((1 + MonthsAnnualRate), numberOfPayments))
                / (Math.pow((1 + MonthsAnnualRate), numberOfPayments) - 1);

        String mortageFormat = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.print("mortgage: " + mortageFormat);

        scanner.close();
    }
    public static void main(String[] args) throws Exception {

       calculate();

    }

}
