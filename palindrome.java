import java.util.* ;
 
public class palindrome{

	public static void main(String[] args) {	
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a word: ");  
		String str= sc.nextLine();              
		boolean truepalindrome = palindrome(str) ;
		System.out.print("Is your word a palindrome ? : "+truepalindrome);   
	
	}

	public static boolean palindrome (String word){
		boolean truepalindrome = false ;
		int lng = word.length() ;
		int demi = (int) (lng / 2) ;
		int j = lng-1 ;
		int i =0 ;
		while (( demi <j )&&(i<demi)){
			char ch1 = word.toCharArray()[j];
			char ch2 = word.toCharArray()[i];
			if (Character.compare(ch1, ch2)==0){
				truepalindrome = true ;
				j-- ;
				i++ ;
			}
			else{
				return false ;
			}
		}
			return truepalindrome ;
	}
}