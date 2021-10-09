
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.* ;
 

public class epeesCollegues{
	public static void main(String[] args) {

		String[] prenoms = {"Jim", "Alban", "Bob", "Albatroz", "Jinto", "Bow", "Hijo", "Manu", "Seb", "Teilo", "Charles", "Bavier"};
	
		String[] sorted = sortedTable(prenoms) ;
		
		for(int j =0; j< sorted.length ; j++) {

			System.out.println(sorted[j]);
		}
				
	}

	public static String minPos (String[] tabString) {

		int x = tabString.length ;
		String min = tabString[0] ;
		for (int i =1 ; i< x ; i++) {

			if (min.compareTo(tabString[i]) >= 0 ){
				min = tabString[i] ;

			}
		}

		return min ;
	}



	public static  String[] sortedTable(String[] mots) {

		int ln = mots.length ;

		String[] tabSorted = new String[mots.length] ;
		String min = minPos(mots) ;
		for (int i = 0 ; i< mots.length ;i++) {
		
			for (int j =1  ; j<mots.length ; j++){
				if (mots[j].equals(min)){
					tabSorted[i]= min;
					mots[j]=mots[i] ;

				}
				}

		String[] copy = Arrays.copyOfRange(mots, i, mots.length);
		min = minPos(copy) ;
					
				}
		return tabSorted ;
		}

	}

		
			
	



	

		
					








