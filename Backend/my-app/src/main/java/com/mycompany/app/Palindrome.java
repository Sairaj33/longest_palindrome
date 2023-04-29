package com.mycompany.app;


public class Palindrome 
	{
	
	public int pali(String x)
	{	int i, len;
		len=x.length();
		for(i=0; i<=(len/2); i++)
		{
			if (x.charAt(0+i)!=x.charAt(len-1-i))	
				return 0;		
		}
		return 1;
			//System.out.println("Palindrome!\n");	
	}
	
	public String answer(String text) 
	{
		int i,j,x,len;

			
		len=text.length();
		
		String[] arr= new String[(len*(len+1))/2];

		int count=0;
		//Appending each substring into the array
		for(i=0; i<=len; i++)
			for(j=i+1; j<=len; j++)
			{
				arr[count]=text.substring(i,j);
				count+=1;
			}


		String longest_pal=arr[0];
		for(i=0; i<arr.length; i++) 
		{
			if((pali(arr[i])==1) && arr[i].length()>longest_pal.length())
				longest_pal=arr[i];
		}
				
		return longest_pal;			
	}
}
