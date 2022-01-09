package pl.jerzy.jasonek;

public class ArmstrongNumbers {
    public static int getSum(int number, int n) {
        int sum = 0;
        int temp = number;
        int digit;
        while (temp > 0) {
            digit = temp % 10;
            sum += Math.pow(digit, n);
            temp /= 10;
        }
        return sum;
    }

    public static boolean amrstrong(int number) {
        int n = String.valueOf(number).length();
        int sum = getSum(number, n);
        return number == sum;
    }

    public static void armstrong10(int number) {
        int n = String.valueOf(number).length();
        int temp = number / 10;

        int sum = getSum(temp, n);

        for (int i = 0; i < 10; i++) {
            int result = sum + (int) Math.pow(i, n);
            if (result == number + i) System.out.println(result);
        }
    }

    public static void main(String[] args) {
        int start = 0;
        int stop = 100_000_000;
        long startTime = System.nanoTime();

//        for (int i = start; i <= stop ; i++) {
//            if (amrstrong(i)) System.out.println(i);
//        }

        for (int i = start; i <= stop; i += 10) {
            armstrong10(i);
        }

        long stopTime = System.nanoTime();
        System.out.println("Elapsed Time in seconds: " + (double) (stopTime - startTime) / 1_000_000_000);
    }
}
