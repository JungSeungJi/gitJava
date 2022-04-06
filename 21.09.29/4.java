//21.09.29.4
import java.util.Arrays;
public class Main
{
  public static void main(String[] args) {
  int[] coin = {500, 100, 50, 10};
  int money = 2680;
  int ohbaek=0, beak=0, ohsip=0, sip=0;
    
  ohbaek = money / 500;
  money = money - 500*ohbaek;
    
  beak = money / 100;
  money = money - 100*beak;
    
  ohsip = money / 50;
  money = money - 50*ohsip;
    
  sip = money / 10;
    
  System.out.println("money="+money);
  System.out.println("500원: "+ohbaek);
  System.out.println("100원: "+beak);
  System.out.println("50원: "+ohsip);
  System.out.println("10원: "+sip);
    
  }
}
