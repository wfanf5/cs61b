/** Given N-number array, return the Max int using for loop
 * Author: WFAN
 * Date: Sep 14, 2022
*/
public class ForMaxInArray {
    public static int forMax(int[] m) {
        int max = m[0];
        for (int i = 0; i < m.length; i += 1) {
            if (m[i] >= max) {
                max = m[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(forMax(numbers));
    }
}
