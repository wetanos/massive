public class Main {
    public static void main(String[] args) {
        CreateMassive createMassive = new CreateMassive();
        Counter counter = new Counter();
        System.out.print("Количество положительных нечетных чисел: " + counter.countOfPositiveAndEven(createMassive.createMassive(100)));
    }
}
