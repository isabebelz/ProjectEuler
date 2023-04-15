public class LargestPalindromeProduct {
    public static void main(String[] args) {

        int largest = 0, p;

        for(int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
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
            int j = p.length();
            if(p.charAt(i) == p.charAt(j - 1)) {
                j--;
            }
        }
        return true;
    }
}
