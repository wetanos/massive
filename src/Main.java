import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 100;
        int[] massive = new int[n];
        int counter = 0;
        for (int i = 0; i < massive.length; i++) {
            massive[i] = new Random().nextInt(101) - 50;
            System.out.print(massive[i] +" ");
            if (massive[i] % 2 == 0 && massive[i] > 0) {
                counter++;
            }
        }
        System.out.println();
        System.out.print("Количество положительных нечетных чисел: " + counter);
    }
}
