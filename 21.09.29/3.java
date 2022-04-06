//21.09.29.3
import java.util.Arrays;
public class Main
{
  public static void main(String[] args) {
  int i, j;
    
    for (i=2; i<10; i++) {
      System.out.println("["+i+"단]");
      for (j=1; j<10; j++) {
        System.out.println(i+" x "+j+" = "+(i*j));
      }
    }
  }
}
