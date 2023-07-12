package timeToEquity;

import java.util.Scanner;

public class TimeToEquity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size = scanner.nextInt();
        System.out.println("Enter Elements into the Array");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        TimeToEquity timetoequity = new TimeToEquity();
        timetoequity.equal(array);
    }

    public void equal(int array[]) {
        int max = Integer.MIN_VALUE;
        int minTime = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] != max) {
                minTime += (max - array[j]);
            }
        }
        System.out.println(minTime);
    }
}
