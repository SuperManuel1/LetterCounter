import java.util.Scanner;

public class letterCounter
{

	public static void main(String args[])
	{
		char[] vowels={'a','e','i','o','u'};
		char[] consenance={'b','c','d','f','g','h','j','k','l','m','n','p','q',
		'r','s','t','v','w','x','y','z'};
		System.out.println("Type in your name please : ");
		Scanner name= new Scanner(System.in);
		
		String word =name.nextLine();
		char[] data=word.toCharArray();
		
		char temp;
		char temp2;
		int cCounter=0;
		int cCounter2=0;
		
		
		for(int m=0;m<data.length;m++)
		{
			temp=data[m];
			temp2=data[m];
			for(int n=0;n<consenance.length;n++)
			{
				if(consenance[n]==temp)
				{
					cCounter++;
				}
			}
			for(int p=0;p<vowels.length;p++)
			{
				if(vowels[p]==temp2)
				{
					cCounter2++;
				}
			}
			
		}
		
		int totalm=cCounter+cCounter2;
		
		System.out.println("The Word you typed in is : "+word+" \n"+
		"It has a total of "+totalm+" letters\n"+
		"It also has " +cCounter+" concenance\n"+
		"It also has "+cCounter2+" Vowels");
		System.out.println("  "+cCounter);


	}



}