package RefrigeratorGraph;

import java.util.ArrayList;

public class Fridge implements Cloneable
{
	boolean[][] fr = new boolean[4][4];
	ArrayList<Integer> hist = new ArrayList<Integer>();
	
	public  Fridge()
	{
		
	}
	
	public Fridge ( boolean[][]ini )
	{
		init(ini);
	}
	
	public void init(boolean[][] ini) 
	{
		for ( int i = 0; i < 16; i++ )
		{
			fr[i/4][i%4] = ini[i/4][i%4];
		}
	}
	
	public void turn ( int x )
	{
		for ( int i = 0; i < 16; i++ )
		{
			if ( i/4 == x/4 || i%4 == x%4 )
			{
				fr[i/4][i%4] = !fr [i/4][i%4];
			}
		}
		hist.add(x);
	}
	
	boolean cheak()
	{
		for (int i = 0; i < 16; i ++ )
		{
			if ( fr[i/4][i%4] == false )
				return false;
		}
		return true;
	}
	
	public String toString()
	{
		String str = "";
		for ( int i = 0; i < 16; i++ )
		{
			str += ""  + fr[i/4][i%4] + " ";
			if ( i % 4 == 3  )
				str += "\n";
		}
		return str;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		Fridge clone = new Fridge();
		boolean[][] tmp = new boolean[4][4];
		for ( int i = 0; i < 16; i++ )
		{
			tmp[i/4][i%4] = fr[i/4][i%4];;
		}
		clone.init(tmp);
		
		  for(int i = 0; i < hist.size(); i++)
		  {
			  clone.hist.add(hist.get(i));
		  }
		return clone;
	}
	
	public void open()
	{
		new UnlockFridge().unlock(this);
	}
}
