/** Given a N length int Array, return the Max int in this array
 * Author: WFAN
 * Date: Sep 14, 2022
*/
public class MaxInArray {
    public static int max(int[] m) {
        int i = 0;
        int max = m[0];
        while (i <= m.length - 1) {
            if (m[i]>=max) {
                max = m[i];
            }
            i += 1;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}
