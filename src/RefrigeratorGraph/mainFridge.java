package RefrigeratorGraph;

public class mainFridge 
{
//	static boolean [][] init =  { {false,false,false,false}, {false,false,false,false}, {false,false,false,false}, {false,false,false,false} };
//	static boolean [][] init =  { {true, true,  false,  false},{false,  true, false, true},{true,  true, true, false},{false,  false,  true,  false}};
//	static boolean [][] init =  { {false,false,false,true}, {false,true,true,false}, {false,true,true,false}, {true,false,false,false} };
	static boolean[][] init = {{true,false,true,false},
	        {false,true,true,false},
	        {false,false, false, false},
	        {false,false, true, true}};
	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Fridge fridge = new Fridge();
		fridge.init(init);
//		fridge.open();
		
		UnlockFridge unl = new UnlockFridge();
		unl.unlock(fridge);
	}

}
