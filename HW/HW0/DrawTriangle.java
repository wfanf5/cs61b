/** Given integer N, and computer draws a triangle with N lines of stars.
 * Author: WFAN
 * Date: Sep 14, 2022
*/
public class DrawTriangle {
   
   public static void DrawTriangleMethod(int N) {
      int i = 0;
      String s = "*";
      while (i <= N-1){
         System.out.println(s);
         s += "*";
         i += 1;
            
      }
          
   }
   
   public static void main(String[] args) {
      int N = 10;
      DrawTriangleMethod(N);
      
   }
   
}
