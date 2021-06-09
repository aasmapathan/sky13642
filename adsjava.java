package ExceptionHandlingProg;

public class ads {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4,5,6,7};
	for(int k=1;k<=3;k++){
	int count=arr[0];// storing first elemnet of array in count //
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
			
		}
		arr[arr.length-1]=count;
	
	}
		for(int j:arr) {
			System.out.print(j+" ");
		}
		
		}
}
