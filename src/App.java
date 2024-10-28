import java.util.Date;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.*;
import java.text.NumberFormat;

public class App {
    public static void main(String[] args) throws Exception {
final byte MonthsInYear=12;
final byte Percent =100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualRate=scanner.nextFloat();
        float MonthsAnnualRate = annualRate/Percent/MonthsInYear;

        System.out.print("Period (Years): ");
        float period=scanner.nextFloat();
        float numberOfPayments=period*MonthsInYear;

       
        
        double mortage=principal*(MonthsAnnualRate*Math.pow((1+MonthsAnnualRate),numberOfPayments))/(Math.pow((1+MonthsAnnualRate),numberOfPayments)-1);

        String mortageFormat=NumberFormat.getCurrencyInstance().format(mortage);
 

        System.out.print("mortgage: "+mortageFormat);


    }

}
