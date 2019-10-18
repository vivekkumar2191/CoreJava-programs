//find missing number inside array where a[]={1,3,4,5,6} and n=5

package com.java.ImpornatInterviewPrograms;

public class MissingNumberDemo {
	
	 static int  getMissingNum1(int a[],int n){
		int i, total;
		total=(n+1)*(n+2)/2;
		for(i=0;i<n;i++){
			total-=a[i];
		}
		return total;
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]={1,4,5,6};
        int miss=getMissingNum1(a,5);
        System.out.println(miss);
        
	}



	

}
