import com.sun.org.apache.xpath.internal.axes.ReverseAxesWalker;

public class Main {

	
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println(bakString("Daniel"));
		
		
		
	}
	
	public static int nummersumma(int... nummer){

		int res = 0;
		
		for(int x = 0; x<nummer.length; x++){
			
			res += nummer[x];
		}
		
		
		
		return res;
		
		
		
		
	}
	
    public static String bakString(String sak){
		
    	if(sak.length() == 1){
    		return sak;
    	} 
    		return bakString(sak.substring(1) + sak.charAt(0));

    	
    	
    
    	
    }
	
	
	
	
	
}
