package pl.jerzy.jasonek.sort;

public class BubbleSort_structural {

    public static void main(String[] args) {
        int[] numbers = {10, 34, 48, 26, 2, 44, 13, 24, 17, 37, 36, 29, 19, 37, 34, 32, 1, 31, 8, 38};
        int temp;
        int counter = 0;
        boolean swapped;

        for (int j=0; j<numbers.length-1;j++){
            swapped = false;
            for(int i=0; i<numbers.length-1-j; i++){
                counter++;
                if(numbers[i] > numbers[i+1]){
                    temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }

        for (int number:numbers) {
            System.out.print(number + ", ");
        }

        System.out.println("Licznik: " + counter);
    }

}
