package BigO;

public class PrintUnorderedPairs {

    static void printUnorderedPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }

    public static void main(String[] args) {
        int[] customArray = { 1, 3, 4, 5 };
        printUnorderedPairs(customArray);
    }
}
