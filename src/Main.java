
public class Main {

	
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println(nummersumma(1,4,5));
	}
	
	public static int nummersumma(int... nummer){

		int res = 0;
		
		for(int x = 0; x<nummer.length; x++){
			
			res +=nummer[x];
		}
		
		
		
		return res;
		
		
		
		
	}
	
	
	
	
	
	
	
}
