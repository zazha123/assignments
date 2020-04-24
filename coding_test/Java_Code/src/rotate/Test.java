package rotate;
import java.util.Arrays;


public class Test {
    public static void main(String [] args) throws Exception {
        System.out.println("---test---");
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("input: " + Arrays.toString(input) + " k = 3");
        int[] output = RotateArray.solve(input, input.length, 3);
        System.out.println("output: " + Arrays.toString(output));

        System.out.println("---test2---");
        int[] input2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("input: " + Arrays.toString(input2) + " k = 0");
        output = RotateArray.solve(input2, input2.length, 0);
        System.out.println("output: " + Arrays.toString(output));

        System.out.println("---test3---");
        int[] input3 = {};
        System.out.println("input: " + Arrays.toString(input3) + " k = 3");
        output = RotateArray.solve(input3, input3.length, 3);
        System.out.println("output: " + Arrays.toString(output));

    }
}

