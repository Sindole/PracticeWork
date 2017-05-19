package MultiDimensional;

import java.util.Scanner;

public class MatrixAddition2 {
	
	int i,j,k;
	int array[],array1[],arrayresult[];
	
	public void MatrixAdd()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the no.of rows");
		int rows=sc.nextInt();
		System.out.println("Please enter the no.of columns");
		int columns=sc.nextInt();
		
		int array[][]=new int[rows][columns];
		int array2[][]=new int[rows][columns];
		
		System.out.println("Please enter the elements into Matrix1");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Please enter the elements into Matrix2");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				array2[i][j]=sc.nextInt();
			}
		}
		int arrayresult[][]=new int[rows][columns];
		for(i=0;i<rows;i++)
		{
			for(j=0;j<columns;j++)
			{
				arrayresult[i][j]=array[i][j]+array2[i][j];
			}
		}
		
		System.out.println("After the addition of both matrixes");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(arrayresult[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixAddition2 ma=new MatrixAddition2();
		ma.MatrixAdd();
	}

}
