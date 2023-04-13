import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        NumberFormat nFormat = NumberFormat.getNumberInstance(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        try {
            n = sc.nextInt();
        }
        catch (InputMismatchException err) {
            n = nFormat.parse(sc.nextLine()).intValue();
        }

        for(int i = 2; n != 1; i++) {
            if(((i == 2 || i == 3 || i == 5) || (i % 2 != 0 && i % 3 != 0 && i % 5 != 0)) && n % i == 0) {
                n /= i;
                System.out.println(i);
            }
        }

        sc.close();
    }
}
