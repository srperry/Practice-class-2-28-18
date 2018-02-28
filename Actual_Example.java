import java.util.Scanner;
public class Actual_Example {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter a Word");
			String word=scanner.nextLine();
	String text=word;
		int count=text.length();
			char c1=text.charAt(count-1);
				System.out.println(c1);
	}

}
