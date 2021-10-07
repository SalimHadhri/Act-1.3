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
		
	public static int[] trieDecroissant(int[]array){

		int max = maxInt(array) ;
		arraySorted[0] = max ;
		int k =0 ;

	for(int j = 1;j<array.length ; j++){
	
		if (maxInt(array)!=array[j]){
	
		arraySorted[j]= maxInt(array)
		}
		
		for (int i=1; i<array.length ; i++ ){
	
		if (max!= array[i] && max == maxInt ){
			
						
			}
			
			}	
		
	
		arraySorted[j] = maxInt(arr);
		}
	return arraySorted  ;
	}
	
	
}
