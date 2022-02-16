public class p0004 {
    public static void main(String[] args) {
        
        int biggestpal = 0;

        for (int i=999; i>0; i--) {
            for (int j=999; j>0; j--) {

                int product = i * j;
                int original = product;
                int reverse = 0;

                while(product > 0) {
                    reverse = reverse * 10 + product % 10;
                    product = product / 10;
                }

                if (reverse == original) {
                    if (original > biggestpal)
                    biggestpal = original;
                    
                }
            }
        }
        System.out.println(biggestpal);
    }
}