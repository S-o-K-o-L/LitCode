import java.util.*;

/*You have a list arr of all integers in the range [1, n] sorted in a strictly increasing order.
 Apply the following algorithm on arr:

Starting from left to right, remove the first number and every other number afterward until you reach the end of the list.

Repeat the previous step again, but this time from right to left, remove the rightmost number
and every other number from the remaining numbers.

Keep repeating the steps again, alternating left to right and right to left, until a single number remains.
Given the integer n, return the last number that remains in arr.

Example 1:

Input: n = 9
Output: 6
Explanation:
arr = [1, 2, 3, 4, 5, 6, 7, 8, 9] step = 1
arr = [2, 4, 6, 8]
arr = [2, 6]
arr = [6]

arr = 2 4 6 8 10 12 14 16 18 20 22 24
arr = 2 6 10 14 18 22
arr = 6 14 22
Example 2:

Input: n = 1
Output: 1
*/
public class EliminationGame {
    private static int function(int startElem, int n, int step, boolean direction) {
        if (n / step < 2)
            return startElem;

        if (direction == true) {
            startElem += step;
            return function(startElem, n, step * 2, false);
        } else {
            if (n / step % 2 == 0) {
                startElem = startElem;
            } else {
                startElem += step;
            }
            return function(startElem, n, step * 2, true);
        }
    }

    public static int lastRemaining(int n) {
        /*List<Integer> arr = new ArrayList<>(n / 2);
        if (n == 1) {
            return 1;
        }
        if (n == 2 || n == 3 || n == 4) {
            return 2;
        }
        if (n / 2 % 2 == 0) {
            for (int i = 2; i <= n; i += 4) {
                arr.add(i);
            }
        } else {
            for (int i = 4; i <= n; i += 4) {
                arr.add(i);
            }
        }*/
        return function(1, n, 1, true);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(lastRemaining(n));
    }
}
