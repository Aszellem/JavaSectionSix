public class NestedLoops {
    public static void main(String[] args) {
        int [][] grades = {
            {72,74,78,76},
            {62,64,68,66},
            {92,94,98,100}
        };

        for (int i = 0; i < grades[0].length; i++) {
            System.out.print(grades[0][i] + "  ");
        }
        System.out.println("\n");
        for (int i = 0; i < grades[1].length; i++) {
            System.out.print(grades[1][i] + "  ");
        }
        System.out.println("\n");
        for (int i = 0; i < grades[2].length; i++) {
            System.out.print(grades[2][i] + "  ");
        }

    }
}
