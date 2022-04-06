//21.09.29.1
import java.util.Arrays;
public class Main
{
  public static void main(String[] args) {
  int[] Array = {1, 20, 30, 100, 150, 80, 5, 8};
  Arrays.stream(Array);
  System.out.println("가장 큰 값: "+Arrays.stream(Array).max().getAsInt());
  }
}
