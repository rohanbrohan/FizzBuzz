public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int stepsTaken = 0;

        while (n > 0){
            if (n % 2 == 0){
                n = n / 2;
                stepsTaken += 1;
            }
            else {
                n = n - 1;
                stepsTaken += 1;
            }
        }

        System.out.println(stepsTaken);
    }
}
