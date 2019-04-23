public class NumereImpare {

    public static void printImpare(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int numarCurent = numbers[i];
            boolean esteImpar = numarCurent % 2 != 0;
            if (esteImpar) {
                System.out.println("Numarul impar este: " + numarCurent);
            }
        }
    }
}
