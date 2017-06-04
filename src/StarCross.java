
public class StarCross {
	public static void main(String args[]){
		int i, j, N=3; 
		int count;
		count = N * 2 - 1; //
		for(i=1; i<=count; i++)
		{
			for(j=1; j<=count; j++)
			{
				if(j==i || (j==count - i + 1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("_");
				}
			}
		System.out.println("\n");
		}
	}
}
