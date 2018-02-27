package practice;

public class Multarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Farray [][]={{1,2,3},{12,45,11}};
		int Sarray [][]={{1,2,2,3},{15},{11,12}};
	    System.out.println("the first array is ");
		display(Farray);
		System.out.println("this is second array");
		display(Sarray);
	    
		
		
		

	}

	public static void display(int x[][]){
		
		for(int row=0;row<x.length;row++){
			for(int clm=0;clm<x[row].length;clm++){
				System.out.print(x[row][clm]+",");
			}
			
			System.out.println();
		}
		
		
		
	}
	
	
}
