//21.09.29.5
import java.util.Arrays;
public class Main
{
  public static void main(String[] args) {
  int i, j;
    
    for (i=0; i<7; i++) {
      for (j=0; j<7; j++) {
        if ((i==j) || ((i+j)==6) System.out.println("*");
        else System.out.println(" ");
      }
        System.out.println();
    }
  }
}
