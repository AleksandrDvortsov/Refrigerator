package RefrigeratorGraph;

public class GetWayRefrTest 
{

	public static void main(String[] args) 
	{
		Graph gr = new Graph();
		int[] count = {1,2,3,4,5,6,7,8,9};
		for ( int i = 0; i < count.length; i++ )
		{
			gr.addVertex(count[i]);
//			System.out.println(gr);
		}
		
		gr.addEdge(1, 2, 0);
		gr.addEdge(1, 3, 0);
		gr.addEdge(1, 4, 0);
		gr.addEdge(1, 7, 0);
		gr.addEdge(2, 1, 0);
		gr.addEdge(2, 3, 0);
		gr.addEdge(2, 5, 0);
		gr.addEdge(2, 8, 0);
		gr.addEdge(3, 2, 0);
		gr.addEdge(3, 6, 0);
		gr.addEdge(3, 1, 0);
		gr.addEdge(3, 9, 0);
		gr.addEdge(4, 1, 0);
		gr.addEdge(4, 5, 0);
		gr.addEdge(4, 6, 0);
		gr.addEdge(4, 7, 0);
		gr.addEdge(5, 4, 0);
		gr.addEdge(5, 2, 0);
		gr.addEdge(5, 6, 0);
		gr.addEdge(5, 8, 0);
		gr.addEdge(6, 3, 0);
		gr.addEdge(6, 9, 0);
		gr.addEdge(6, 5, 0);
		gr.addEdge(6, 4, 0);
		gr.addEdge(7, 4, 0);
		gr.addEdge(7, 1, 0);
		gr.addEdge(7, 8, 0);
		gr.addEdge(7, 9, 0);
		gr.addEdge(8, 7, 0);
		gr.addEdge(8, 9, 0);
		gr.addEdge(8, 5, 0);
		gr.addEdge(8, 2, 0);
		gr.addEdge(9, 6, 0);
		gr.addEdge(9, 3, 0);
		gr.addEdge(9, 8, 0);
		gr.addEdge(9, 7, 0);
				
		System.out.println(gr);
	
	}

}
