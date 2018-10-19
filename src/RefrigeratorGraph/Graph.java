package RefrigeratorGraph;

public class Graph implements Cloneable
{	
	private Vertex root = null;
	
//	class Vertex
//	{
//		String val = "";
//		Vertex nextV = null;
//		Edge rootE = null;
//		
//		public Vertex ( String val )
//		{
//			this.val = val;
//		} 
//		/////////////////////////////////////////////////////////////////////////////////
//		public String toString()
//		{
//			String str = "from " + val;
//			Edge e = rootE;
//			
//			if(e == null)
//			{
//				return "No way out of " + val;
//			}
//			str += "\n" + e.toString();
//			while(e.nextE != null)
//			{
//				e = e.nextE;
//				str += "\n" + e.toString();
//			}
//			return str;
//		}
//	}
//	class Edge
//	{
//		int val;
//		Edge nextE;
//		Vertex vr = null;
//		
//		public Edge ( int val )
//		{
//			this.val = val;
//		}
//		public String toString()
//		{
//			return val + " to " + vr.val;
//		}
//		
//	}
//	add, dell ( vertex and Edge )
	
//	public void initVer ( String[] ini )
//	{
//		clearVer();
//		if ( ini == null )
//			ini = new String[0];
//		for ( int i = 0; i < ini.length; i++ )
//		{
//			addVertex(ini[i]);
//		}
//	}
	
	public void addVertex ( int val ) 
	{
		if ( root == null )
			root = new Vertex(val);
		else
		{
			Vertex ver = root;
			while (ver.nextV != null )
			{
				ver = ver.nextV;
			}
			ver.nextV = new Vertex(val);
		}
	}
//	public void dellVertex ( String val )
//	{
//		if(searchVertex(val) == root)
//			root = root.nextV;
//		else
//		{
//			Vertex ver = root;
//			Vertex verPos = null;
//			
//			while (ver.nextV != null ) 
//			{
//				verPos = ver;
//				ver = ver.nextV;
//				if ( ver.val == val )
//				{
//					verPos.nextV = ver.nextV;
//					return;
//				}
//			}
//		}
//		checkEdge();
//	}
//	private void checkEdge() 
//	{
//		if(root == null)
//			return;
//
//		Vertex tmp = root;
//		while(tmp != null)
//		{
//			Edge tmpE = tmp.rootE;
//			while(tmpE != null)
//			{
//				if(tmpE.vr == null)
//				{
//					Edge forDelete = tmpE;
//					tmpE = tmpE.nextE;
//					delEdge(forDelete, tmp);
//				}
//				else 
//					tmpE = tmpE.nextE;
//			}
//			tmp = tmp.nextV;
//		}
//	}
//	public String[] toArrayVer()
//	{
//		int i = 0;
//		String[] temp = new String[sizeVer()];
//		Vertex ver = root;
//		while ( ver != null )
//		{
//			temp[i++] = ver.val;
//			ver = ver.nextV;
//		}
//		return temp;
//	}
	public int sizeVer()
	{
		Vertex ver = root;
		int count = 0;
		while (ver != null ) 
		{
			ver = ver.nextV;
			count++;
		}
		return count;
	}
//	public void clearVer()
//	{
//		root = null;
//	}
//	public String toStringVer()
//	{
//		if ( root == null )
//			return "";
//		String str = "";
//		String[] st = new String[sizeVer()];
//		Vertex ver = root;
//		int i = 0;
//		while (ver != null ) 
//		{
//			if ( i > 0 )
//				str += ",";
//			st[i] = ver.val;
//			ver = ver.nextV;
//			str += st[i];
//			i++;
//		}
//		return str;
//	}
	
//	public void addEdge ( int[] pos, String[] val )
//	{
//		
//	}
//	public void initEdge ( int[] ini )
//	{
//		if ( ini == null )
//			ini = new int[0];
//		for ( int i = 0; i < ini.length; i++ )
//		{
//			addEdge( ini[i] );
//		}
//	}
	public void addEdge ( int start, int end, int val )
	{
		Vertex st = null;
		Vertex en = null;
		Edge e = new Edge(val);
		Vertex tmp = root;
		if ( root.val == start )
		{
			st = root;
		}
		if ( root.val == end )
		{
			en = root;
		}
		while(tmp.nextV != null )
		{
			tmp = tmp.nextV;
			if ( tmp.val == start )
			{
				st = tmp;
			}
			if ( tmp.val == end )
			{
				en = tmp;
			}
		}
			if ( st == null )
			{
				addVertex(start);
				addEdge(start, end, val);
				return;
			}
			if ( en == null )
			{
				addVertex(end);
				addEdge(start, end, val);
				return;
			}
			e.vr = en;
			if ( st.rootE == null )
			{
				st.rootE = e;
			}
			else 
			{
				Edge tmp2 = st.rootE;
				while(tmp2.nextE != null )
				{
					tmp2 = tmp2.nextE;
				}
				tmp2.nextE = e;
			}		
	}
	void delEdge(int from, int to)
	{
		Vertex From = searchVertex(from);
		Vertex To = searchVertex(to);
		Edge tmp = From.rootE;

		while(tmp != null)
		{
			if(tmp.vr == To)
			{
				delEdge(tmp, From);
				return;
			}
			tmp = tmp.nextE;
		}

		throw new IllegalArgumentException();
	}
	
	void delEdge(Edge del, Vertex from)
	{
		if(del == from.rootE)
			from.rootE = from.rootE.nextE;
		else
		{
			Edge tmp = from.rootE;

			while(tmp.nextE != null)
			{
				Edge prew = tmp;
				tmp = tmp.nextE;
				if(tmp == del)
				{
					prew.nextE = tmp.nextE;
					return;
				}
			}
		}
	}
	
	Vertex searchVertex ( int val )
	{
		Vertex tmp = root;
		Vertex ret = null;

		while(tmp != null)
		{
			if(tmp.val == val)
				ret = tmp;
			tmp = tmp.nextV;
		}
		if(ret == null)
			throw new IllegalArgumentException();
		else 
			return ret;
	}
	
	public String toString()
	{
		String str = "";
		Vertex v = root;

		if(v == null)
		{
			return"Cities are not listed";
		}

		str += v.toString()+"\n";
		while(v.nextV != null)
		{
			v = v.nextV;
			str += 	v.toString() +"\n";
		}
		return str;
	}
	
//	public void findWay(String a, String b)
//	{
//		Vertex start = null;
//		Vertex finish = null;
//		Vertex vtmp = root;
//		String res = "No way";
//
//		while(vtmp.nextV != null)
//		{
//			if(vtmp.val == a)
//			{
//				start = vtmp;
//			}
//
//			if(vtmp.val == b)
//			{
//				finish = vtmp;
//			}
//			vtmp = vtmp.nextV;
//		}
//		if(start == null || finish == null || start.rootE == null)
//		{
//			System.out.println(res);
//			return;
//		}
//		else
//		{
//			GetWayRefrigerator gw = new GetWayRefrigerator();
//			gw.way(start, finish.val);
//			gw.paintAllWayR();
//			gw.paintMinWay();
//		}
//	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		Vertex ver = root;
		Edge ed = root.rootE;
		Graph ghCopy = new Graph();
		
		while (ver.nextV != null ) 
		{
			ghCopy.addVertex(ver.val);
			ed = ver.rootE;
			while (ed != null )
			{
				ghCopy.addEdge( ver.val, ed.vr.val, ed.val);
				ed = ed.nextE;
			}
			ver = ver.nextV;
		}
		return ghCopy;
	}
	
}
