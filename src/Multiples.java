public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int multiplesCount = 0;
        while (i<1000){
            if (i % 3 == 0){
                multiplesCount += 1;
            }
            else if (i % 5 == 0) {
                multiplesCount += 1;
            }
            i++;
        }
        System.out.println(multiplesCount);
    }
}
