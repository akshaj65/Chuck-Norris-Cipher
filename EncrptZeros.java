// Chuck Norris Cipher Encoder 
//step3
// Binary with 0 and 1 is good, but binary with only 0 is even better! This encoding has a name — the Chuck Norris Unary Code.

// Let's convert our text into a sequence of zeros and spaces!

import java.util.*; 
class EncrptZeros{
	static String enc_w_zero(String block){ //pass 7 bit block
		int pos=0;
		String temp="";
		for(int i=0;i<block.length();){
			char _bit=block.charAt(i);
			int count=series(pos,_bit,block);
			System.out.println(count);
			temp+=(_bit=='0')?("00 "+charSequence(count)):("0 "+charSequence(count));
			if(i<block.length()-1) temp+=" ";
			// if(count>0){
				i+=count;
			// }else{
			// 	i++;
			// }
			pos+=count;
			
			}
		
		return temp;
	}
	static int series(int pos,char bit, String block){
		int count=0;
		for(int i=pos;i<block.length();i++){
			//System.out.println(block.charAt(i));
			if(block.charAt(i)==bit){
				//System.out.println("Series count"+count+" bit"+bit);
			   count++;
			}
			else{
				break;
			}

			// System.out.println(block.charAt(i)+"ff"+bit);
		}
		return count;
	}
	static String charSequence(int num){
		String temp="";
		while(num-->0){
			temp+='0';
		}
		return temp;
	}
 	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		 System.out.print("Input string:\n> ");
		 String word =in.nextLine();
		 System.out.println("\n\nThe result:");
		//  String result="";
		//  for(int i=0;i<word.length();i++){
		// 	 int chrint = word.charAt(i);
		// 	 String bin=String.format("%7s",Integer.toBinaryString(chrint)).replaceAll(" ","0");
		// 	 System.out.println(bin);
		// 	 result+=enc_w_zero(bin);
		//  }
		//  System.out.println(result);
		String bin="";
		 for(int i=0;i<word.length();i++){
			 int chrint = word.charAt(i);
			  bin+=String.format("%7s",Integer.toBinaryString(chrint)).replaceAll(" ","0");
			
		 }
		 System.out.println(enc_w_zero(bin));
 	} 
}
