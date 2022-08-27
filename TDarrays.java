import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        /**
         * Two brackets
         * first: number of rows
         * second: number of elements per row
         */
        int [][] grades = new int [3][4];

        //update
        grades[0][0] = 72;
        grades[0][1] = 74;
        grades[0][2] = 78;
        grades[0][3] = 76;

        grades[1][0] = 62;
        grades[1][1] = 64;
        grades[1][2] = 68;
        grades[1][3] = 66;

        grades[2][0] = 92;
        grades[2][1] = 94;
        grades[2][2] = 98;
        grades[2][3] = 100;

        //update another mode
        int [][] grades2 = {
            {72,74,78,76},
            {62,64,68,66},
            {92,94,98,100}
        };

        System.out.println("\tHarry " + Arrays.toString(grades[0]));
        System.out.println("\tRon " + Arrays.toString(grades[1]));
        System.out.println("\tHermióne " + Arrays.toString(grades[2])+ "\n");

        System.out.println("\tHarry " + Arrays.toString(grades2[0]));
        System.out.println("\tRon " + Arrays.toString(grades2[1]));
        System.out.println("\tHermióne " + Arrays.toString(grades2[2]));
    }
}
