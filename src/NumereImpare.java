public class NumereImpare {
    public static void printImpare(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println("Numarul impar este: " + numbers[i]);
            }
        }
    }
}
