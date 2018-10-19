package api;

import java.util.Random;

public class game 
{
	int[][] matrixGame= new int [4][4];
	
	public int[][] StartMatrixmatrixGameRandom()
	{
//		int[][] matrixGame = new int[4][4];
		for ( int i = 0; i < matrixGame.length; i++ )
		{
			for ( int j = 0; j < matrixGame[i].length; j++ )
			{
				matrixGame[i][j] = PosRandom();
				System.out.print( matrixGame[i][j] );
//				System.out.println();
//				System.out.println(matrixGame[i][j] + " - matrixGame ");
//				System.out.println(matrixGame[j][i] + "matrixGame [j]");
			}
			System.out.println();
		}
		System.out.println();
		return matrixGame;
	}
	private int PosRandom()
	{
		int ret = 0;
		Random r = new Random();
		ret = r.nextInt(2);
		return ret;
	}
	
	int rev ( int x )
	{
		int res;
		if ( x == 0 )
			res = 1;
		else
			res = 0;
		return res;
	}
	
	public void reverseMatrix ( int i, int j )
	{
		matrixGame[i][j] = rev(matrixGame[i][j]);
		for ( int t = 0; t < matrixGame.length; t++ )
		{
			matrixGame[i][t] = rev(matrixGame[i][t]);
			matrixGame[t][j] = rev(matrixGame[t][j]);
		}
	}
	
	public void toPrint()
	{		
		System.out.println();
		for (int i = 0; i < matrixGame.length; i++)
		{
			for (int j = 0; j < matrixGame[i].length; j++)
			{
				System.out.print(matrixGame[i][j] + "");
			}	
			System.out.println();
		}
	}
	
	public int[][] getCopyMatrix()
	{
		int[][] temp = new int[matrixGame.length][matrixGame[0].length];
		for (int i = 0; i < temp.length; i++)
		{
			for (int j = 0; j < temp[i].length; j++)
			{
				temp[i][j] = matrixGame[i][j];
			}
		}
		return temp;
	}
	
	void printAllGame()
	{
		int x = 0;
//		int temp[][] = getCopyMatrix();
		while ( finRes() != true )
		{
			int temp[][] = getCopyMatrix();
		
		for ( int i = 0; i < temp.length; i++ )
		{
			for ( int j = 0; j < temp[i].length; j++ )
			{
//					x++;
					if ( temp[i][j] == 0 )
					{
						if ( finRes() != true )
						{
							x++;
							reverseMatrix(i, j);
							String count = ("\n" + "Шаг: " + x + ". Для решения задачи.");
							System.out.println(count);
							toPrint();
						}
				}
				
			}
		}
		}
	}
	
	boolean finRes()
	{
		boolean ret = true;
		for ( int i = 0; i < matrixGame.length; i++ )
		{
			for ( int j = 0; j < matrixGame[i].length; j++ )
			{
				if ( matrixGame[i][j] == 0 )
				{
					ret = false;
					return ret;
				}
			}
		}
		return ret;
	}
}
