package SingleDimensional;

import java.util.Scanner;

public class BubbleSort {
	
	public int array[];
	
	public void insertdisplay()
	{
		Scanner sc=new Scanner(System.in);
		array=new int[10];
		System.out.println("Please Enter the "+array.length+ " elements into the array");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Entered values are");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}

	public void Sort()
	{
		int temp;
		
		for(int i=0;i<array.length;i++)
		{
			int j=0;
			while(j<array.length-1)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
				j++;
			}
			
		}
		System.out.println("Sorted values are");
		for( int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bs=new BubbleSort();
		bs.insertdisplay();
		bs.Sort();
	}

}
