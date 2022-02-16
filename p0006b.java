public class p0006b {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);

        // non-static mechanism-1
        p0006b ob1 = new p0006b();
        int sum1 = ob1.squareSum(num);
        System.out.println(sum1);

        // non-static mechanism-2
        int sum2 = new p0006b().sumSquare(num);
        System.out.println(sum2);

        // non-static mechanism-3
        System.out.println(new p0006b().difference(num));
    }

    // In the code below, I can use any variable in place of all the 'num's

    public int squareSum(int num) { // non-static

        int i = 1, sum = 0;

        while (i <= num) {
            sum += i * i;
            i++;
        }
        return sum;
    }

    // Again, I can use any variable in place of all the 'num's

    public int sumSquare(int num) { // non-static

        int i = 1, sum = 0;

        while (i <= num) {
            sum += i;
            i++;
        }
        return sum * sum;
    }

    /*
     * I will use variable 'x' in the 'difference()' method. The variable 'x' won't
     * have any relation outside of the 'difference()' method even if there happens
     * to be another 'x' variable out of 'difference()'
     */

    public int difference(int x) { // non-static

        int diff = new p0006b().sumSquare(x) - new p0006b().squareSum(x);
        return diff;
    }
}
