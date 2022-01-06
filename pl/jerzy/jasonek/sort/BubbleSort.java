package pl.jerzy.jasonek.sort;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        boolean swapped;
        int counter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                counter++;
                if (array[ j ] > array[ j + 1] ) {
                    swapKeys( array , j );
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        System.out.println(counter);
    }

    public static void swapKeys(int[] array, int j) {
        int temp;
        temp = array[ j ];
        array[ j ] = array[ j +1 ];
        array[ j + 1 ] = temp;
    }

    public static void displayArray(int[] array){
        for (int number:array) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {10, 34, 48, 26, 2, 44, 13, 24, 17, 37, 36, 29, 19, 37, 34, 32, 1, 31, 8, 38};

        displayArray(numbers);

        bubbleSort(numbers);

        displayArray(numbers);

    }
}
