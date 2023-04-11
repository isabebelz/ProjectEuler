public class EvenFibonacciNumbers {
    public static void main(String[] args) {

        int n1, n2, f, sum;
        n1 = 0;
        n2 = 1;
        sum = 0;

        do {
            f = n1 + n2;
            if(f % 2 == 0) {
                sum += f;
            }
            n1 = n2;
            n2 = f;
        } while (f < 4000000);


        System.out.println(sum);
    }

}
