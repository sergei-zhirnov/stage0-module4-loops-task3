package school.mjc.stage0.loops.task3;
import java.lang.Math;

public class DigitsSum {
    public void printDigitsSum(int t){
        String inputString = Math.abs(t) + "";
        int sum = 0;
        for (int i = 0; i < inputString.length(); i++) {
            String digit = inputString.charAt(i) + "";
            sum += Integer.parseInt(digit);
        }
        System.out.println(sum);

    }
}
