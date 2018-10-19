package RefrigeratorGraph;

public class Edge 
{	
		int val;
		Edge nextE;
		Vertex vr = null;
		
		public Edge ( int val )
		{
			this.val = val;
		}
		public String toString()
		{
			return "" + vr.val;
		}	
}
