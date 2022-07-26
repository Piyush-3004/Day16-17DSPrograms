
public class Asg3InsertionSort {
	
	public static void main(String[] args){
		String[] arr ={"Maharashtra","Uttar Pradesh","Karnatak","Sikkim","Punjab"};

		String sortedArray[] = sort_sub(arr, arr.length); 
		for(int i=0;i<sortedArray.length;i++)
				System.out.print(sortedArray[i]+",  ");		
	}

	public static String[] sort_sub(String array[], int end){
			for(int i=0;i<end;i++){
			String key = array[i];
			int j =i-1;
			while(j>-1 && array[j].compareToIgnoreCase(key)>0) {
					array[j+1]=array[j];
					j--;
				}array[j+1]=key;
			}
		return array;
	}
}