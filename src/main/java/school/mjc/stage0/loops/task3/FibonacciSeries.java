package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void printFibonacci(int lastFibonacci) {
        int firstFibonacci = 0;
        int secondFibonacci = 1;
        int currentFibonacci = 0;
        for (int i = 1; i <= lastFibonacci; i++) {
            if (i == 1) {
                currentFibonacci += firstFibonacci;
            } else if (i == 2) {
                currentFibonacci += secondFibonacci;
            } else {

                currentFibonacci += firstFibonacci;
                firstFibonacci = secondFibonacci;
            }
            System.out.println(currentFibonacci);

        }
    }

    public static void main(String[] args) {
        printFibonacci(5);
    }
}
