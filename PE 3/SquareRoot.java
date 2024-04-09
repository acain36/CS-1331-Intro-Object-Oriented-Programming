import java.util.Random;
public class SquareRoot {
  public static void main(String[] args) {

  	Random rand = new Random();

  	long bigRandNum = (int)(rand.nextDouble() * 301) + 1000000000000000l;

  	System.out.println(bigRandNum);
  	
  	int count = 0;

  	System.out.println("The value is: " + bigRandNum);

  	while(bigRandNum > 1){
  		bigRandNum = (long)(Math.sqrt(bigRandNum));
  		System.out.println(bigRandNum);
  		count++;
  	}
  	
  	System.out.println("Count: " + count);
  }
}