package BigO;

public class SumAndProduct {

    static void spOfArray(int[] array) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        for (int i = 0; i < array.length; i++) {
            product = product * array[i];
        }
        System.out.println("Sum : " + sum);
        System.out.println("Product : " + product);
    }

    public static void main(String[] args) {
        int[] customArray = { 1, 3, 4, 5 };
        spOfArray(customArray);
    }
}
