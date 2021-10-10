import java.util.* ;
 
public class orientationEtoile{

	public static void main(String[] args) {

		String[] prenoms = {"Alban", "Jim", "Bob", "Albatroz", "Jinto", "Bow", "Hijo", "Manu", "Seb", "Teilo", "Charles", "Xavier"};
		String[] sorted = sortedTable(prenoms) ;
		
		for(int j =0; j< sorted.length ; j++) {
			System.out.println(sorted[j]);
		}	

		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a name: ");  
		String name= sc.nextLine(); 
		String[] plusDePrenoms = new String [sorted.length+1] ;

		for(int j =0; j< sorted.length ; j++) {
			plusDePrenoms[j]=sorted[j] ;
		}	
		plusDePrenoms[sorted.length] = name ; 
		String[] newSorted = new String[plusDePrenoms.length]  ;
		newSorted = sortedTable(plusDePrenoms) ;

		for(int j =0; j< newSorted.length ; j++) {
			System.out.println(newSorted[j]);
		}	

		Scanner sc1= new Scanner(System.in); 
		System.out.print("Enter a name to search: ");  
		String nameToSearch= sc1.nextLine(); 

		String[] listToSearch = new String[newSorted.length+1] ;
		for(int j =0; j< newSorted.length ; j++) {
			listToSearch[j]=newSorted[j] ;
		}	
		listToSearch[newSorted.length] = nameToSearch ; 

		int pos = binarySearch(newSorted,0,newSorted.length-1,nameToSearch) ;
	

		System.out.println("L'elment se trouve à l'index: " + pos);
		
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
		tabSorted[0]= minPos(mots) ;

		for (int i = 1 ; i< mots.length ;i++) {
			String[] copy = Arrays.copyOfRange(mots, i, mots.length);
			String min = minPos(copy) ;

			for (int j =1  ; j<mots.length ; j++){
				if (mots[j].equals(min)){
					tabSorted[i]= min;
					mots[j]=mots[i] ;

				}
			}
				
		}
		return tabSorted ;
	}

	// Recherche par dichotomie
	 /*
  tab[] : le tableau dans lequel on va chercher la valeur
  l : dernier élément
  f : premier élément
  val : valeur à trouver
  */
	public static int binarySearch(String tab[], int f, int l, String val){
    int mid = (int)(f + l)/2;
    int pos=-1 ;
    while(f <= l){
      if (tab[mid].compareTo(val)<0){
        f = mid + 1;   
      }else if(tab[mid].compareTo(val)==0){
      	return mid ;
       // break;
      }else{
         l = mid - 1;
      }
      mid = (f + l)/2;
  		}

	return pos ;
   }
   

}