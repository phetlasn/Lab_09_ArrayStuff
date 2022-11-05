import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int[] dataPoints = new int[100];
        int val = random.nextInt(100) + 1;
        int index = random.nextInt(dataPoints.length);
        int sum = 0;
        double average = 0;
        int targetCount = 0;
        int targetValue;
        boolean Point = false;

        for (int e = 0; e < dataPoints.length; e++) {
            dataPoints[e] = random.nextInt(100) + 1;
        }

        for (int e:dataPoints) {
            System.out.printf("%3d |", e);
        }

        for (int e:dataPoints) {
            sum += e;
        }

        average = (double) sum / dataPoints.length;
        System.out.println("\n Sum of the data set is " + sum + "\n Average of the data set is " + average);
        targetValue = SafeInputs.getRangedInt(in, "Enter the number to find in the data set: ", 1, 100);
        for (int e = 0; e < dataPoints.length; e++) {
            if (dataPoints[e] == targetValue) {
                targetCount++;
                Point = true;
            }
        }
        System.out.println("The value appears " + targetCount + " time in the array");

        for (int e = 0; e < dataPoints.length; e++) {
            if (dataPoints[e] == targetValue) {
                System.out.println("\n The value is at position " + e + " in the array");
                Point = true;
                break;
            }
        }

        int max = dataPoints[0];
        int min = dataPoints[99];
        for (int e:dataPoints) {
            if (e > max) {
                max = e;
            }
            if (e < min) {
                min = e;
            }
        }

        System.out.printf("\n The min max is %4d %4d", min, max);
        System.out.println("\n The average of the dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int values[]){
        int sum = 0;
        double average = 0;
        for (int i:values) {
            sum += i;
        }

        average = (double) sum / values.length;
        return average;
    }
}
