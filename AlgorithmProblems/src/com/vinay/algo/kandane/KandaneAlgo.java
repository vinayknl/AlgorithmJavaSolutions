package com.vinay.algo.kandane;


public class KandaneAlgo 
{
	public static void printSmallestSubsequenceArray(int a[])
	{
		if(a != null && a.length > 0)
		{
			if(a.length == 1)
			{
				System.out.println("Smallest subsequence sum = " + a[0]);
			}
			else
			{
				int min_sum_so_far = a[0];
				int min_sum_ends_here = a[0];
				int temp_start_index=0;
				int start_index = 0;
				int end_index = 0;
				
				for(int i = 1; i < a.length; i++)
				{
					if(min_sum_ends_here > 0)
					{
						min_sum_ends_here = a[i];
						temp_start_index = i;
					}
					else
					{
						min_sum_ends_here+= a[i];
					}
					
					if(min_sum_ends_here < min_sum_so_far)
					{
						min_sum_so_far = min_sum_ends_here;
						start_index = temp_start_index;
						end_index = i;
						
					}
				}
				
				System.out.println("Min Sum = " + min_sum_so_far);
				System.out.println("Starts at index " + start_index+ " and Ends at index " + end_index);

				
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
		
	public static void printLongestSubsequenceArray(int a[])
	{
		if(a != null && a.length > 0)
		{
			if(a.length == 1)
			{
				System.out.println("Longest subsequence sum = " + a[0]);
			}
			else
			{
				// Algorithm
				// Initially, max sum so far and max sum ends here will be first element
				// When max_sum_ends_here becomes negetive, we start a new subsequence, by setting 
				// max_sum_ends_here to ith element.
				// Else, we add ith element to max_sum_ends_here
				// A check will be made to see if the max_sum_so_far is lesser than max_sum_ends_here
				// Then in this case, max_sum_so_far is set as max_sum_ends_here
				
				
				int maximum_sum_so_far = a[0];
				int maximum_sum_ends_here = a[0];
				int temp_start_index=0;
				int start_index = 0;
				int end_index = 0;
				
				for(int i = 1; i < a.length; i ++)
				{
					if(maximum_sum_ends_here < 0)
					{
						maximum_sum_ends_here = a[i];
						temp_start_index = i;
					}
					else
					{
						maximum_sum_ends_here+= a[i];
					}
					
					if(maximum_sum_ends_here > maximum_sum_so_far)
					{
						maximum_sum_so_far = maximum_sum_ends_here;
						start_index = temp_start_index;
						end_index = i;
					}
					
				}
				
				System.out.println("Max Sum = " + maximum_sum_so_far);
				System.out.println("Starts at index " + start_index+ " and Ends at index " + end_index);
				
				
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
		
		
	}
	
	public static void main (String args[])
	{
		printLongestSubsequenceArray(new int[]{-2, -9,-4,-11,-1});
		
		printLongestSubsequenceArray(new int[]{-2});
		
		printLongestSubsequenceArray(null);
		
		printSmallestSubsequenceArray(new int[]{-2, -9,-4,-11,-1});
		
		printSmallestSubsequenceArray(new int[]{-2});
		
		printSmallestSubsequenceArray(null);
		
		printSmallestSubsequenceArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, -4,-2,9,0,-11});
	}
	
	
}
