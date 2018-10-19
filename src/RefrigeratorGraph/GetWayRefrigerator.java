package RefrigeratorGraph;

import java.util.ArrayList;

public class GetWayRefrigerator 
{
	ArrayList<Graph> ways = new ArrayList<Graph>();
	ArrayList<Integer> eq = new ArrayList<Integer>();
	int limit = 3;
	int dist = 0;
	int start;
	int finish;

//	public void way ( Vertex start, int finish )
//	{
//		this.finish = finish;
//		this.start = start.val;
//		Graph way = new Graph();
//		way.addVertex(start.val);
//		getWay(way,start,0);
//	}
//
//	private void getWay(Graph way, Vertex from, int lvl) 
//	{
//		if(lvl == limit || from.rootE == null || from.val == start && lvl != 0)
//		{
//			System.out.println(from.val + ","  + lvl + "");
//			return;
//		}
//
//		Edge eg = from.rootE;
//		Graph ww = null;
//
//		while(eg != null)
//		{
//			if(eg.vr.val == finish)
//			{
//				way.addEdge(from.val, eg.vr.val, eg.val);
//				way.dellVertex(eg.vr.val);
//				ways.add(way);
//				dist += eg.val;
//				eq.add(dist);
//				dist-=eg.val;
//				return;
//			}
//			way.addEdge(from.val, eg.vr.val, eg.val);
//			dist += eg.val;
//			try
//			{  
//				ww = (Graph) way.clone();    
//			}
//			catch (CloneNotSupportedException e)
//			{
//				e.printStackTrace();
//			}
//			getWay(ww,eg.vr,lvl+1);
//			dist -= eg.val;	
//			way.delEdge(from.val, eg.vr.val);
//			way.dellVertex(eg.vr.val);
//			eg = eg.nextE;
//		}
//	}
//	public void paintAllWayR()
//	{
//		String str = "\n" + "From " + start + " to " + finish + " there are ways:";
//		for(int i = 0; i < ways.size(); i++)
//		{
//			str += "\n\n"+"Way "+ (i + 1)  + " ( total length " + eq.get(i)+" )";
//			str +="\n" + ways.get(i).toString();
//		}	
//		System.out.println(str);
//	}
//	public void paintMinWay()
//	{
//		String str = "From " + start + " to " + finish + " shortest way:";
//		int tmp = 0;
//		int index = 0;
//		for(int i = 0; i < eq.size(); i++)
//		{
//			if(tmp == 0)
//			{
//				tmp = eq.get(i);
//			}
//			else if(eq.get(i) < tmp)
//			{
//				
//				tmp = eq.get(i);
//				index = i;
//			}
//		}
//		System.out.println( str +="\n" + ways.get(index).toString()  + "(total length " + tmp+ ")");	
//	}
}