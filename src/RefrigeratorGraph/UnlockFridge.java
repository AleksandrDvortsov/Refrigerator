package RefrigeratorGraph;

import java.util.ArrayList;

public class UnlockFridge 
{
	ArrayList<ArrayList<Integer>> ways = new ArrayList<ArrayList<Integer>>();
	int limit = 6;
	
	public void unlock ( Fridge fr )
	{
		action(fr, limit);
		print();
	}
	
	private void action ( Fridge fr, int lvl )
	{
		if ( fr.cheak() )
		{
			ways.add(fr.hist);
			return;
		}
		
		if ( lvl == 0 ) return;
		
		for ( int i = 0; i < 16; i++ )
		{
			if ( fr.hist.contains(i)) continue;
			try 
			{
				Fridge clone = (Fridge) fr.clone();
				clone.turn(i);
				action(clone, lvl-1);
			}
			catch (CloneNotSupportedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public void print( )
	{
		if(ways.size() == 0) 
		{
			System.out.println("No solutions were found for the problem !!!");
			return;
		}
		for( int i = 0; i < ways.size(); i++)
		{
			System.out.println("For solutions refrigerator way №" + ( i + 1 ) + ", you need to turn these knobs: " + ways.get(i));
		}	
	}
}





















//	private boolean equalsHistory(ArrayList<Integer> history)
//	{
//		for(int i = 0; i < ways.size(); i++)
//		{
//			if(ways.get(i).size() != history.size())
//			{
//				continue;
//			}
//			for(int j = 0; j < history.size(); j++ )
//			{
//				if(ways.get(i).get(j) != history.get(j))
//				{
//					continue;
//				}
//				if(ways.get(i).get(j) == history.get(j) && j == history.size() - 1)
//				{
//					return false;
//				}
//			}
//		}
//		return true;
//	}
//}
