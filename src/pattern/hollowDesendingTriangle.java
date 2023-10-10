package pattern;

public class hollowDesendingTriangle {
	public static void main(String args[]) {
		int a = 10;
		for(int i = a; i>=0; i--)
		{
			for(int j = 0; j <= i; j++)
			{
				if (i==a  || j == 0 || i == j) {
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
