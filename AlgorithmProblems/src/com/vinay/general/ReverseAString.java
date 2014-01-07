package com.vinay.general;

public class ReverseAString 
{
	public static String getReversedString(String str)
	{
		char[] chars = str.toCharArray();
		
		for(int i = 0 ; i < chars.length/2; i ++)
		{
			char temp1 = chars[i];
						
			chars[i]= chars[chars.length-i-1];
			chars[chars.length-i-1]= temp1;
			
		}
		
		return new String(chars);
	}
	
	public static void main(String args[])
	{
		System.out.println(getReversedString("abcdef"));
	}
}
