// Chuck Norris Cipher Encoder 
//step1
import java.util.*; 
class SpaceWord{
 	public static void main(String[] args){
		  String temp="";
        Scanner in = new Scanner(System.in);
        System.out.print("Input string:\n> ");
        String word=in.nextLine();
		 if(word.length()>0){
			 for( int i=0;i<word.length();i++){
				 temp+=word.charAt(i)+" ";
			 }
		 }
		 System.out.println("\n\n"+temp);
	 } 
}
