import java.util.Scanner;
public class ElevatorPitch{
	public static void main(String[] args) {
	 String myPitch;
	 String name;
	 double gpa;
	 int graduationYear;
	 String hobby;
	 String major;
	 Scanner myScanner = new Scanner(System.in);

	 System.out.println("Enter your full name:");
	 name = myScanner.nextLine();

	 System.out.println("Enter your gpa:");
	 gpa = myScanner.nextDouble();

	 System.out.println("Enter the year you will graduate:");
	 graduationYear = myScanner.nextInt();

	 System.out.println("Enter your favorite hobby:");
	 myScanner.nextLine();
	 hobby = myScanner.nextLine();

	 System.out.println("Enter your major:");
	 major = myScanner.nextLine();

	 System.out.println("Hello, my name is " + name 
	 	+ ". I'm a " + major + " major with a gpa of " + gpa
	 	+ " graduating in " + graduationYear
	 	+ " in my free time I like " + hobby + ".");	
	}
}



