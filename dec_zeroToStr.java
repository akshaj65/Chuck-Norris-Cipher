// Chuck Norris Cipher Encoder 
//step 4
import java.util.*; 
class dec_zeroToStr{
 	static String decode(String[] subStr){ 
		 String bin="";
		for(int i=0;i<subStr.length;i+=2){
			// System.out.println(subStr[i].equals("0"));
			bin+=(subStr[i].equals("0"))?(charSequence(subStr[i+1].length(),'1')):(charSequence(subStr[i+1].length(),'0'));
		 }
		 String decStr="";
		 for(int i=0;i<bin.length();i+=7)
	     	 decStr+=(char)Integer.parseInt(bin.substring(i,i+7),2);
		return decStr;
	}
	
	static String charSequence(int num,char bit){
		String temp="";
		while(num-->0){
			temp+=bit;
		}
		return temp;
	}
 	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		 System.out.print("Input encoded string:\n");
		 String encStr =in.nextLine();
		 encStr=encStr.trim();
		 String[] subStr=encStr.split(" ");
		 System.out.println("\n\nThe result:");
		 System.out.println(decode(subStr));
		
 	} 
}
