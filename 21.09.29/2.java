//21.09.29.2
import java.util.Arrays;
public class Main
{
  public static void main(String[] args) {
  int RD = (int) (Math.random()*100)+1;
  int CT = 0;
  
  while(true){
    System.out.println("숫자를 입력하시오: ");
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    if (i==RD) break;
    else{
      if (i<RD) System.out.println("더 큰 숫자를 입력하시오: ");
      if (i>RD) System.out.println("더 작은 숫자를 입력하시오: ");
      CT++;
     }
   }
  }
}
