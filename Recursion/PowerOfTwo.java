package Recursion;

public class PowerOfTwo {

    static int powerOfTwo(int n) {
        if (n == 0) {
            return 1;
        } else {
            int power = 2 * powerOfTwo(n - 1);
            return power;
        }
    }

    static int powerOfTwoIT(int n) {
        int i = 0;
        int power = 1;
        while (i < n) {
            power = power * 2;
            i = i + 1;
        }
        return power;
    }

    public static void main(String[] args) {
        System.out.println(powerOfTwo(5));
        System.out.println(powerOfTwoIT(5));
    }
}
