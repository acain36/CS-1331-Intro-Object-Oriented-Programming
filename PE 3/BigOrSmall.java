public class BigOrSmall {
  public static void main(String[] args) {

  	int smallRandNum;
  	int newInt = 0;

  	smallRandNum = (int)(Math.random() * 4 + 2);
  	System.out.println("We will run " + smallRandNum + " times!");

  	for(int i = 0; i < smallRandNum; i++){
  		newInt = (int)(Math.random() * 19 + 2);
  		System.out.println("The value is: " + newInt);
  		if(newInt > 10){
  			System.out.println("Yay!");
  		}
  		else{
  			System.out.println("Nay!");
  		}
  	}
  }
}