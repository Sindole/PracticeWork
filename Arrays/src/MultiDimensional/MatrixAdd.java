package MultiDimensional;

import java.util.Scanner;

public class MatrixAdd {
	
	int i,j,k;
	public int array1[],array2[],arrayres[];
	
	public void Matrix()
	{
		Scanner in=new Scanner(System.in);
	System.out.println("Please Enter the no.of columns for Matrix1");
	int columns=in.nextInt();
	int array1[]=new int [columns];
	
	System.out.println("Please enter elements into the Matrix1");
	for(int i=0;i<columns;i++)
	{
		array1[i]=in.nextInt();
	}
	System.out.println("Matrix1 Elements are");
	for(int i=0;i<array1.length;i++)
	{
		System.out.print(array1[i]+"");
	}
	System.out.println();
	System.out.println("Please Enter the no.of columns for Matrix2");
	columns=in.nextInt();
	int array2[]=new int [columns];
	
	System.out.println("Please enter elements into the Matrix2");
	for(int i=0;i<columns;i++)
	{
		array2[i]=in.nextInt();
	}
	System.out.println("Matrix2 Elements are");
	for(int i=0;i<array2.length;i++)
	{
		System.out.print(array2[i]+"");
	}
	System.out.println();
	arrayres=new int[columns];
	if(array1.length==array2.length)
	{
		for(int i=0;i<columns;i++)
		{
			arrayres[i]=array1[i]+array2[i];
		}
	}
	else
			System.out.println("Matrixes can'be added as both are in equal");
	
	System.out.println("Addition of the given Matrix are: ");
	for(int j=0;j<columns;j++)
	{
		System.out.print(arrayres[j]+"");
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixAdd ma=new MatrixAdd();
		ma.Matrix();
	}

}
