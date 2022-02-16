public class p0005 {
    public static void main(String[] args) {

        int max = 6;
        long product = 1;

        for (int i=1; i<=max; i++) {
            
            product = product * i;

            for (int j=2; j<i; j++) {

                int temp = i;

                while (temp%j==0 && temp/j>1) {

                    temp /= j;
                    product /= j;
                    System.out.println(product +" ");
                }
                
                if (temp/j == 1) {
                    j++;
                }
            }
        }
        System.out.println(product);
    }
}
