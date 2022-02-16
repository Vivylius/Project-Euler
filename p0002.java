public class p0002 {
    public static void main(String[] args) {
        int first = 1, second = 2, sum = 0, temp = 0;

        while (first < 4000000) {

            if(first%2==0)
            sum += first;

            temp = first + second;
            first = second;
            second = temp;
        }
        System.out.println(sum);
    }
}
