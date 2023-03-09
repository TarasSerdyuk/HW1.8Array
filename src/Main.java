import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] number = {1.57, 7.654, 9.986};
        int[] weight2 = {1, 2, 3, 1};
    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(Arrays.toString(weight));
        double[] number = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.print(number[i] + ", ");
        }
        System.out.println();
        int[] weight2 = {1, 2, 3, 1};
        System.out.println(Arrays.toString(weight2));
    }

    public static void task3() {
        System.out.println("Задача 3");

        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 2; i >= 0; i--) {
            System.out.print(weight[i] + ", ");
            }
        System.out.println();
            double[] number = {1.57, 7.654, 9.986};
            for (int ii = 2; ii >= 0; ii--) {
                System.out.print(number[ii] + ", ");
            }
            System.out.println();
            int[] weight2 = {1, 2, 3, 1};
        for (int a = 3; a >= 0; a--) {
            System.out.print(weight2[a] + ", ");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");

        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(Arrays.toString(weight));
        double[] number = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.print(number[i] + ", ");
        }
        System.out.println();
        int[] weight2 = {1, 2, 3, 1};
        System.out.println(Arrays.toString(weight2));
    }
}


