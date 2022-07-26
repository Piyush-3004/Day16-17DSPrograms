
public class Asg1StringPermutations {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "str";
		int len = str.length();
		
		
		getPermutations(str,0,len);

	}
	
	static void getPermutations(String str ,int start, int end) {
		
		if(start==end-1)
			System.out.println(str);
		else {
			for(int i=start ; i<end ; i++) {
				
				str = swapString(str ,start,i);

				getPermutations(str,start+1,end);
				
			}
		}
	}
	
	
	static String swapString(String str,int i,int j) {
	
		char A[]=str.toCharArray();
		char temp = A[i];
		A[i]=A[j];
		A[j]=temp;
		
		return String.valueOf(A);
	}
	

}
