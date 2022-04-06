package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // task1
        int[] one = new int[]{1, 2, 3};
        double[] two = {1.57, 7.654, 9.986};
        char[] three = {'A', 'B', 'C'};

        // task2
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i]);
            if (i < one.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println('\n');
        for (int i = 0; i < two.length; i++) {
            System.out.print(two[i]);
            if (i < two.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println('\n');
        for (int i = 0; i < three.length; i++) {
            System.out.print(three[i]);
            if (i < three.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println('\n');

        // task3
        for (int i = 2; i >= 0; i--) {
            System.out.print(one[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println('\n');
        for (int i = 2; i >= 0; i--) {
            System.out.print(two[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println('\n');
        for (int i = 2; i >= 0; i--) {
            System.out.print(three[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println('\n');

        // task4
        for (int i = 0; i < one.length; i++) {
            int count = one[i];
            if (count % 2 != 0) {
                count++;

            }
            one[i] = count;
            System.out.println(one[i]);
        }


    }
}
