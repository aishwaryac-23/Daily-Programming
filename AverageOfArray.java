public class AverageOfArray {
    public static void main(String[] args) {

        int[] array = {5, 10, 15, 20, 25};

        int sum = 0;

        for (int num : array) {

            sum += num;

        }

        double average = (double) sum / array.length;

        System.out.println("Average of numbers in the array: " + average);

    }

}
