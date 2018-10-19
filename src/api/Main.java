package api;

public class Main {

	public static void main(String[] args) 
	{
		game g = new game();
		System.out.println("Refrigerator" + "\n" + "Исходный холодильник:" );
		g.StartMatrixmatrixGameRandom();
		
//		g.r
		System.out.println("Для того что бы решить задачу нужно: ");
		g.printAllGame();
	}

}
