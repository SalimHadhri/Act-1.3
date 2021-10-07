
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.* ;
 

public class epeesCollegues{
	public static void main(String[] args) {

		String[] prenoms = {"Jim", "Alban", "Bob", "Albatroz", "Jinto", "Bow", "Hijo", "Manu", "Seb", "Teilo", "Charles", "Xavier"};
	
		String[] sorted = changeMinTab(prenoms) ;
		
		for(int j =0; j< sorted.length ; j++) {

			System.out.println(sorted[j]);
		}
				
	}



	public static  String[] changeMinTab(String[] mots) {

		
		String motTrie = mots [0] ; 
		String reverse  ;	
		boolean done= false ;

		String[] tableauTrie = new String[mots.length] ;
		
		for (int i =0 ; i<mots.length ; i++){
				
		int j =0 ;
			do {


				if (mots[i].compareTo(motTrie)>0 ){	 
				motTrie = mots[i] ; 	
				done=true;
				
				}
				j++ ;
			}
		
			while (done == false && j<mots.length ) ;
		tableauTrie[i] = motTrie ;	
				}
			return tableauTrie ;
			}

}

		
			
	

	/*	
			for(int i = j ; i<mots.length ;i++ ){
		
				if (mots[i].compareTo(motTrie)==0 || mots[i].compareTo(motTrie)>0 ){
					done=true ; 
				}
				else if (mots[i].compareTo(motTrie)<0 && done==false){
						reverse  =motTrie  ;
						motTrie = mots[i] ; 
						mots[i]=reverse   ;
						done=false;
						}
				tableauTrie[i]=motTrie ;

			}*/

	

		
					








