package practice;

public class CallMe {
	
	private String first;
	private String last;
	private  static int mem=0;
	
	CallMe(String fn,String ln){
		first=fn;
		last=ln;
		mem++;
		System.out.printf("members are %s  %s with club mem are %d\n ",first,last,mem );
		
	}
	
	public static int getmem(){
		
	return mem;
		
		
	}
	
	
  
   
	
	
	
	}



