package RefrigeratorGraph;

public class Vertex 
{
		int val = 0;
		Vertex nextV = null;
		Edge rootE = null;
		
		public Vertex ( int val )
		{
			this.val = val;
		} 
		public String toString()
		{
			int[][]matr = new int [3][3];
			String str = "Vertex " + val;
			Edge e = rootE;
			
			if(e == null)
			{
				return "No way out of " + val;
			}
			str += " to " + e.toString();
			while(e.nextE != null)
			{
				e = e.nextE;
				str += "," + e.toString();
			}
//			for ( int i = 0; i < matr.length; i++ )
//			{
//				matr[i][0] = val;
//				for ( int j = 0; j < matr[i].length; j++ )
//				{
////					if ( val == j )
//					matr[0][j] = val;
//					System.out.print(matr[i][j]);
//				}
//				System.out.println();
//			}
//			System.out.println();		
			return str;
		}
}
