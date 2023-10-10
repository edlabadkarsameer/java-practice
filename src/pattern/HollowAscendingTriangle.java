package pattern;
public class HollowAscendingTriangle {
	public static void main(String args[])
	{
		int a = 10 ;
		for (int i = 0; i<a; i++) {
			for (int j = 0; j<=i; j++) {
				if (i==j || j==0 || i==a-1)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
		System.out.print("\n");
		}
	}
}
