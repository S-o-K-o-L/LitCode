import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.stream(plusOne(new int[]{1, 2, 3})).forEach(System.out::print);
        Arrays.stream(plusOne(new int[]{9, 9, 9})).forEach(System.out::print);
        Arrays.stream(plusOne(new int[]{8, 9, 9, 9})).forEach(System.out::print);
    }

    public static int[] plusOne(int[] digits) {
        int countNines = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                if (countNines != 0) {
                    for (int k = digits.length - 1, j = 0; j < countNines; k--, j++) {
                        digits[k] = 0;
                    }
                }
                return digits;
            } else {
                countNines++;
            }
        }

        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        for (int i = 1; i < newArray.length; i++) {
            newArray[i] = 0;
        }
        return newArray;
    }
}

