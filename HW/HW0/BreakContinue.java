/** Given array
 * Write a function windowPosSum(int[] a, int n) that replaces each element a[i] with the sum of a[i] through a[i + n], but only if a[i] is positive   
 * valued. If there are not enough values because we reach the end of the array, we sum only as many values as we have.
 * Author: WFAN
 * Date: Sep 14, 2022
*/
public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
        int i = 0;
        while (i < a.length) {
            int sum = 0;
            if (a[i] >= 0) {
                int j = i;
                while (j <= i+n) {
                    sum += a[j];
                    if (j >= a.length-1) {
                        break;
                    }
                    j += 1;
                }
                a[i] = sum;
            }
            i += 1;
        }
    }
    public static void main(String[] args) {
        int[] a = {1, -1, -1, 10, 5, -1};
        int n = 2;
