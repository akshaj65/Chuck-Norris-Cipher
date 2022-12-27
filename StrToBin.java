// Chuck Norris Cipher Encoder 
//step2
import java.util.*; 
class StrToBin{
 	public static void main(String[] args){
		 Scanner in = new Scanner(System.in);
		 System.out.print("Input string:\n> ");
		 String word =in.nextLine();
		 System.out.println("\n\nThe result:");
		 for(int i=0;i<word.length();i++){
			 int chrint = word.charAt(i);
			 String bin=String.format("%7s",Integer.toBinaryString(chrint)).replaceAll(" ","0");
			 System.out.println(word.charAt(i)+" = "+bin);
		 }
 	} 
}
