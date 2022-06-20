
public class Counter {
    public int countOfPositiveAndEven(int[] massive) {
        int counter = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0 && massive[i] > 0) {
                counter++;
            }
        }
        return counter;
    }
}
