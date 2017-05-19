import java.util.Scanner;

public class WordsCount {
	
	int count=0;
	String s="";

	public void Words()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Please Enter the String");
		s=in.nextLine();
		System.out.println("Entered String is: "+s);
		
		char ch[]=new char[(s.length())];
		//ch[0]=s.charAt(0);
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
			if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))||((ch[0]!=' ')&&(i==0)) )
			{
				count++;
			}
		}
		System.out.println("Total no.of words are: " +count);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordsCount wc=new WordsCount();
		wc.Words();
	}

}
