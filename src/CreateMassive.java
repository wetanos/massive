import java.util.Random;

public class CreateMassive {
    public int[] createMassive(int n) {
        int[] massive = new int[n];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = new Random().nextInt(101) - 50;
        }
        return massive;
    }
}
