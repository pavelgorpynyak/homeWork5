import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задание 1

        int[] firstArray = new int[3];

        firstArray[0] = 23;
        firstArray[1] = 42;
        firstArray[2] = - 27;


        double[] secondArray = {1.57, 7.654, 9.986};

        byte[] freeArray = new byte[]{2, 4, 21, 17};


        // Задание 2

        for (int i = 0; i < firstArray.length; i++) {
            if (i < firstArray.length - 1)
            System.out.print(firstArray[i] + ",");
            else
                System.out.println(firstArray[i]);
        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            if (i < secondArray.length - 1)
                System.out.print(secondArray[i] + ",");
            else
                System.out.println(secondArray[i]);
        }
        System.out.println();
        for (int i = 0; i < freeArray.length; i++) {
            if (i < freeArray.length - 1)
                System.out.print(freeArray[i] + ",");
            else
                System.out.println(freeArray[i]);
        }

        // Задание 3
        System.out.println();
        for (int i = firstArray.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(firstArray[i] + ",");
            else if (i == 0)
                System.out.println(firstArray[i]);
        }
        System.out.println();
        for (int i = secondArray.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(secondArray[i] + ",");
            else if (i == 0)
                System.out.println(secondArray[i]);
        }
        System.out.println();
        for (int i = freeArray.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(freeArray[i] + ",");
            else if (i == 0)
                System.out.println(freeArray[i]);
        }


        // Задание 4
        System.out.println();
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0){

                firstArray[i] ++;
            }

            System.out.print(firstArray[i] + " ");

        }

        // Задание 5

        System.out.println();

        int[][] additionalArray = { {1, 1, 1},{1, 1, 1} };
        for (int[] row : additionalArray) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        // Задание 6

        int [] additionalArrays2 = { 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(additionalArrays2));

        for (int i = additionalArrays2.length - 1; i >= 0; i --) {
            System.out.print(additionalArrays2[i] + " ");
        }
    }
}