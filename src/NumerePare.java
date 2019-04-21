public class NumerePare {

    public static void printPare(int[] numbers) {
        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println("Numerul par este" + numbers[i]);
            }
        }
    }


}
