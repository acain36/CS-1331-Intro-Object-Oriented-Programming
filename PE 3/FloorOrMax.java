public class FloorOrMax {
  public static void main(String[] args) {

  	float myRand = (float)((Math.random() * 50.0) + 4.0);

  	String formatRand = String.format("%.02f", myRand);
  	
  	System.out.println("The value is: " + formatRand);

  	if((Math.floor(myRand) >= 15) && (Math.floor(myRand)  % 2 == 0)){
  		System.out.println((int)(Math.floor(myRand)));
  	}

  	else if((Math.floor(myRand) % 2 == 1)){
  		if(Math.floor(myRand) > 32){
  			System.out.println(myRand);
  		}
  		else if(Math.floor(myRand) < 32){
  			System.out.println(32);
  		}
  	}
  	else{
  		System.out.println(myRand);
  	}
  }
}