package ForLoop;

public class DisplayPerfectNo {
	
	
	
	public void PerfectNos()
	{
		int sum;
		int limit=100;
			
		System.out.println("Displaying all the perfect no.s from 1 to 100");
		
		for(int i=1;i<limit;i++)
		{
			sum=0;
		for (int j=1;j<i;j++)
			{
			if(i%j==0)
			{
				sum=sum+j;
			}
		}
		
			if (sum == i) {
				System.out.println(i + " ");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayPerfectNo dp=new DisplayPerfectNo();
		dp.PerfectNos();
	}

}
