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

        System.out.print(firstArray[0]);
        System.out.print("," +  firstArray[1] + ",");
        System.out.print(firstArray[2]);
        System.out.println();
        System.out.print(secondArray[0]);
        System.out.print("," +  secondArray[1] + ",");
        System.out.print(secondArray[2]);
        System.out.println();
        System.out.print(freeArray[0]);
        System.out.print("," +  freeArray[1] + ",");
        System.out.print(freeArray[2] + ",");
        System.out.print(freeArray[3]);
        System.out.println();


        // Задание 3


        System.out.print(firstArray[2]);
        System.out.print("," +  firstArray[1] + ",");
        System.out.print(firstArray[0]);
        System.out.println();
        System.out.print(secondArray[2]);
        System.out.print("," +  secondArray[1] + ",");
        System.out.print(secondArray[0]);
        System.out.println();
        System.out.print(freeArray[3]);
        System.out.print("," +  freeArray[2] + ",");
        System.out.print(freeArray[1] + ",");
        System.out.print(freeArray[0]);
        System.out.println();


        // Задание 4

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0){

                firstArray[i] +=  1;
            }

            System.out.print(firstArray[i] + " ");

        }
    }
}