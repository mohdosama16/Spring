package practice;

public class Foodlist {
    private hello[] fdl= new hello[5];
    private int i=0;
    public void List(hello x){
    	
    	if(i<fdl.length){
    	fdl[i]=x;
    	System.out.println("add this to"+i);
    		i++;
    		
    		
    	}
    	
    	
    	
    }
	
}
