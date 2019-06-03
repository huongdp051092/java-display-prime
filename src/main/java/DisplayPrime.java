public class DisplayPrime {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isNotPrime = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isNotPrime = true;
                    break;
                }
            }
            if (!isNotPrime) {
                System.out.println("So nguyen to la: " + i);
            }
        }
    }
}