import java.util.Scanner;
public class Character_1and2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	
	
	System.out.println("Please enter any word");
			String word=scanner.nextLine();
		String text=word;
		
System.out.println(string(text));
}
public static String string(String text){
			int count=text.length();
			char c1=text.charAt(count-2);
			return text.charAt(0)+" "+c1;
					
	}
}
