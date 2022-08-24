public class Two {
     
    public static boolean isPrime(int n) {

        int factors = 0;

        if (n == 0 || n == 1) {
            return false;
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }

        return factors == 2;

    }

    

}
