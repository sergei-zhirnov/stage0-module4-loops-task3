package school.mjc.stage0.loops.task3;
import java.lang.Math;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        double lastNumber = 0;
        double sum = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            lastNumber += 9 * Math.pow(10,i);
            sum += lastNumber;
        }

        System.out.println((int) sum);

    }
}
