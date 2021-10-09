import java.util.* ;

public class ageApprentis
{
	public static void main(String[] args) {
		
		int[] ageArray = {45, 54, 23, 32, 64, 46, 28, 82} ;		
		int[] arraySorted = trieDecroissant(ageArray ) ;
		
		for (int i =0 ; i <ageArray.length ; i++){
		System.out.println(arraySorted [i]);
		}		
	}

	public static int maxInt ( int[] array ) {

		int max = array [0];
		for( int i=1 ; i<array.length ; i++){
			if (array[i]>max){
				max=array[i] ;
			}
		}		
	return max; 		
	}

	public static  int[] trieDecroissant(int[] table) {

		int ln = table.length ;
		int[] tabSorted = new int[table.length] ;

		for (int i = 0 ; i< table.length ;i++) {
			int[] copy = Arrays.copyOfRange(table, i , table.length);
			int max = maxInt(copy) ;

			for (int j =1  ; j<table.length ; j++){
				if (table[j]==max){
					tabSorted[i]= max;
					table[j]=table[i] ;
				}
			}
				
		}
		return tabSorted ;
	}	
}
