package permutation;

import rotate.RotateArray;

import java.util.Arrays;

public class Test {
    public static void main(String [] args) throws Exception {
        int[] input1 = {1, 2, 3, 4};
        int[] input2 = {1, 3, 2, 4};
        int[] input3 = {1, 3, 2};
        int[] input4 = {5, 2, 3, 1};

        //test1
        System.out.println("---test1---");
        System.out.println("input: " + Arrays.toString(input1) + " n = 4 ");
        int output = Permutation.solve(input1, 4);
        System.out.println("output: " + output);

        //test2
        System.out.println("---test2---");
        System.out.println("input: " + Arrays.toString(input2) + " n = 4 ");
        output = Permutation.solve(input2, 4);
        System.out.println("output: " + output);

        //test3
        System.out.println("---test3---");
        System.out.println("input: " + Arrays.toString(input3) + " n = 4 ");
        output = Permutation.solve(input3, 4);
        System.out.println("output: " + output);

        //test4
        System.out.println("---test4---");
        System.out.println("input: " + Arrays.toString(input4) + " n = 4 ");
        output = Permutation.solve(input4, 4);
        System.out.println("output: " + output);
    }
}
