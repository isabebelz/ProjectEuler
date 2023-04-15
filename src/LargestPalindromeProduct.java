public class LargestPalindromeProduct {
    public static void main(String[] args) {

        int largest = 0, p;

        for(int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                p = i * j;
                if (palindromic(String.valueOf(p))) {
                    largest = p;
                }
            }
        }

        System.out.println(largest);

    }
    private static boolean palindromic(String p) {
        for(int i = 0; i < p.length(); i++) {
            for(int j = p.length() - 1; j > 0; j--) {
                if(p.charAt(i) == p.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
