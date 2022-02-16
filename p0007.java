public class p0007 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        // int number = 1;

        System.out.println(thPrime(number));
    }

    public static int thPrime(int num) {

        int primecount = 0, prime = 0;

        loop1: for (int i = 2; primecount < num; i++) {

            loop2: for (int j = 2; j < i; j++) {

                if (i % j == 0) {

                    continue loop1;
                }
            }

            {
                prime = i; // Here 'i' can be returned directly too.
                primecount++;
                System.out.print(prime + " ");
            }
        }
        
        System.out.println();
        return prime;
    }
}