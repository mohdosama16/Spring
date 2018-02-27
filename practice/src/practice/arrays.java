package practice;

public class arrays {
	
	public static void main(String[] args){
	
		int best[] = {10,20,30};
		change(best);
		for(int x: best)
		System.out.println(x);
		
		
	}
		
		public static void change(int y[])
		{
			for (int m=0;m<y.length;m++){
				y[m]+=5;
				
			}
			
			
		}
		
	}
	

	
	
	
	
	

