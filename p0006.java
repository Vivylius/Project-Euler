public class p0006 {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);

        // All three of these are interchangeable...
        // I wrote in different manners to show that they all work.
        // static
        int sum1 = squareSum(num); // this works
        System.out.println(sum1);

        // static
        int sum2 = p0006.sumSquare(num); // this also works
        System.out.println(sum2);

        // static
        System.out.println(difference(num)); // this also works
    }

    // static
    public static int squareSum(int num) {

        int i = 1, sum = 0;

        while (i <= num) {
            sum += i * i;
            i++;
        }
        return sum;
    }

    // static
    public static int sumSquare(int num) {

        int i = 1, sum = 0;

        while (i <= num) {
            sum += i;
            i++;
        }
        return sum * sum;
    }

    // static
    public static int difference(int x) {

        int diff = sumSquare(x) - squareSum(x);
        return diff;
    }
}
