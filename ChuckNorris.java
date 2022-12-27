// Chuck Norris Cipher Encoder 
//step 5
// adding a simple user interface. and merging all steps

import java.util.*; 
public class ChuckNorris {
   
   static String encode(String word){ 
        String block=strToBin(word); // convert the string into binary  // 7 bit block
		int pos=0;
		String temp="";
		for(int i=0;i<block.length();){
			char _bit=block.charAt(i);
			int count=series(pos,_bit,block);
			temp+=(_bit=='0')?("00 "+charSequence(count,'0')):("0 "+charSequence(count,'0'));
			if(i<block.length()-1) temp+=" ";
            i+=count;
			pos+=count;
		}
		return temp;
	}
	
   static String decode(String encStr){ 
         encStr=encStr.trim();
         String[] subStr=encStr.split(" ");
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
    static int series(int pos,char bit, String block){
		int count=0;
		for(int i=pos;i<block.length();i++){
			if(block.charAt(i)==bit){
			   count++;
			}
			else{
				break;
			}
		}
		return count;
	}
    static String strToBin(String word){
        String bin="";
        for(int i=0;i<word.length();i++){
            int chrint = word.charAt(i);
            bin+=String.format("%7s",Integer.toBinaryString(chrint)).replaceAll(" ","0");
        
        }
        return bin;
   }
   static boolean isValid(String encStr){
      if(encStr.matches(".*[^0\\s].*")){     //to check if a string contains any characters other than '0' or spaces.
            return false;
      }
      if((encStr.split(" ").length%2!=0)){
          return false;
      }
       String[] temp=encStr.split(" ");
       int count=0;
	   for( int i=0;i<temp.length;i+=2){
          if((temp[i].equals("0") || temp[i].equals("00"))){
			  count+=temp[i+1].length();
          }else{
			  return false;
		  }
       } 
       if(count%7!=0){
           return false;
       }
      return true;
   }
 	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Please input operation (encode/decode/exit):");
            String op= in.nextLine();
            switch(op){
                case "exit":
                        System.out.println("Bye");
                        System.exit(0);
                case "encode": 
                        System.out.print("Input string:\n> ");
                        String word =in.nextLine();
                        System.out.println("Encoded string:\n"+encode(word)); 
                        break;
                 case "decode": 
                        System.out.print("Input encoded string:\n");
                        String encStr =in.nextLine();
                        if(!isValid(encStr)){
                            System.out.println("Encoded string is not valid.");
                            break;
                        }
                        System.out.println("Decoded string:\n"+decode(encStr)); 
                        break;
                default:
                    System.out.println("There is no '"+op+"' operation");
            }
        }
		

		
 	}
}