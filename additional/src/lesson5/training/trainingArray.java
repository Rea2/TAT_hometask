package lesson5.training;

/**
 * Created by Raik Yauheni on 23.10.2018.
 */
public class trainingArray {
    public static void main(String[] args) {
//        exercise1();
//        exercise2();
        math();
    }
    /** exercise 1 */
    public static void exercise1() {
        int[][] array2D = {
                {1, 1, 1, 1},
                {2, 2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3},
                {4, 4, 4, 4, 4}
        };
        for (int[] array : array2D) {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }


    /** exercise 1 */
    public static void exercise2() {
        int[][][] array3D = new int[3][4][5];
        array3D[0][0][1] = 1;
        array3D[1][2][0] = 2;
        array3D[2][0][0] = 3;


        for(int[][]array2Dt : array3D) {
            for (int[]array : array2Dt) {
                for (int i : array) {
                System.out.print(i+" ");
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("--------");
            System.out.println("");
        }
    }

    public static void math() {
        System.out.println(Math.round(12.49));
        System.out.println(Math.pow(2,31));
    }
}
