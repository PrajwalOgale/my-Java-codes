package com.practicejava;

public class Practice {

	public static void main(String[] args) {
		ArrayProblems obj1 = new ArrayProblems();
		int[] arr= {2,3,5,4,5,2,4,3,5,2,4,4,2};

//		obj1.getTheNumberOccurringOddNumberOfTimes(arr);
//		obj1.ReplaceEveryElementWithGreatestElementOnRightSide(arr);
//		obj1.spiralMatrix(new int[][] {{1,2,3},{4,5,6},{7,8,9}}, 3, 3);
		obj1.zigZagMatrix(new int[][] {{1,2,3},{4,5,6},{7,8,9}}, 3, 3);
	}

}

class ArrayProblems{
	
	public void getTheNumberOccurringOddNumberOfTimes(int[] arr) {
		//Best Method
		int res=0;
		for(int i=0; i<arr.length;i++) {
			res= res ^ arr[i];
		}
		System.out.println(res);
	}
	
	public void ReplaceEveryElementWithGreatestElementOnRightSide(int[] arr) {
			// Method-1*******
//			for(int i=0; i<arr.length;i++) {
//			int max=0;
//			for(int j=i+1;j<arr.length;j++) {
//				if(max<arr[j]) max=arr[j];
//			}
//			if(i==arr.length-1) {
//				arr[i]=-1;
//				break;
//			}
//			arr[i]=max;
//		}
		
		// Method-2*******
		//Best method*****
		int max=arr[arr.length-1];
		arr[arr.length-1]=-1;
		for(int i=arr.length-2; i>=0; i-- ) {
			if(arr[i]>max) {
				max=arr[i];
			}
			arr[i]=max;
		}

		for(int i=0; i<arr.length;i++)
		System.out.println(arr[i]);
	}

	public void spiralMatrix(int[][] arr, int row, int col) {
		
		int top=0;
		int bottom=row-1;
		int left=0;
		int right=col-1;
		
		for(int i=0;i<row*col;i++) {
			for(int j=left; j<=right;j++) {
				System.out.println(arr[top][j]);
			}
			top++;
			for(int j=top; j<=bottom;j++) {
				System.out.println(arr[j][right]);
			}
			right--;
			for(int j=right;j>=left;j--) {
				System.out.println(arr[bottom][j]);
			}
			bottom--;
			for(int j=bottom;j>=top;j--) {
				System.out.println(arr[j][left]);
			}
			left++;

		}
	}
	
	public void zigZagMatrix(int[][] arr, int row, int col) {
		int i=0;
		int r=0;
		int c=0;
		int count=1;
//		System.out.println(((arr[r][c])));

		while(i<row*col) {
			if(r==0 && c!=(col-1)) {
				System.out.println(arr[r][c]);
				c++;
				System.out.println(arr[r][c]);
				r++;
				c++;
				continue;
			}
			if(c==0 && r!=row-1) {
				System.out.println(arr[r][c]);
				r++;
				System.out.println(arr[r][c]);
				c++;
				r--;
				continue;
			}
			if(r==0 && c==(col-1)) {
				r++;
				System.out.println(arr[r][c]);
				continue;
			}
			if(c==0 && r==(row-1)) {
				c++;
				System.out.println(arr[r][c]);
				continue;
			}
			System.out.println(arr[r][c]);
			if(count%2!=0) {
				r--;
				c++;
			}else {
				c--;
				r++;
			}
			i++;
			
		}
	}
}
