package rotate;
import java.util.Arrays;


public class Test {
    public static void main(String [] args) throws Exception {
        System.out.println("---test---");
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("input: " + Arrays.toString(input));
        int[] output = RotateArray.solve(input, input.length, 3);
        System.out.println("output: " + Arrays.toString(output));
    }
}

