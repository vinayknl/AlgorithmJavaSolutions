package com.vinay.linkedlist;


public class LLFindMiddleElementOnePass 
{
	public static LinkedListNode getMiddleElement(LinkedListNode head)
	{
		
		LinkedListNode slowNode = head;
		LinkedListNode fastNode = head;
		
		if(head == null)
		{
			// invalid element
			throw new IllegalArgumentException("No elements in the linked list");
		}
		else if (head.next() == null)
		{
			// only one element
			throw new IllegalArgumentException("Only one element in the linked list");
		}
		else
		{
			while(fastNode.next() != null)
			{
				fastNode = fastNode.next();
				
				if(fastNode.equals(slowNode))
				{
					throw new IllegalArgumentException("Looped linked list");
				}
				
				if(fastNode.next() != null)
				{
					//lengthOfLinkedList++;
					fastNode = fastNode.next();
					slowNode = slowNode.next();
				}
				else
				{
					//reached end
					break;
				}
				
			}
			
			
		}
		
		return slowNode;
	}
	
	public static LinkedListNode getLastButOneElement(LinkedListNode head)
	{
		
		LinkedListNode slowNode = head;
		LinkedListNode fastNode = head;
		
		if(head == null)
		{
			// invalid element
			throw new IllegalArgumentException("No elements in the linked list");
		}
		else if (head.next() == null)
		{
			// only one element
			throw new IllegalArgumentException("Only one element in the linked list");
		}
		else
		{
			fastNode = fastNode.next();
			
			while(fastNode.next() != null)
			{
				fastNode = fastNode.next();
				
				if(fastNode.equals(slowNode))
				{
					throw new IllegalArgumentException("Looped linked list");
				}
				
				slowNode = slowNode.next();
				
						
			}
			
			
		}
		
		return slowNode;
	}
	
	
	public static void main(String args[])
	{
		LinkedListNode headNode = new LinkedListNode("0");
		LinkedListNode node1 = new LinkedListNode("1");
		headNode.setNext(node1);
		
		LinkedListNode node2 = new LinkedListNode("2");
		node1.setNext(node2);
		
		LinkedListNode node3 = new LinkedListNode("3");
		node2.setNext(node3);
		
		LinkedListNode node4 = new LinkedListNode("4");
		node3.setNext(node4);
		
		LinkedListNode node5 = new LinkedListNode("5");
		node4.setNext(node5);
		
		LinkedListNode node6 = new LinkedListNode("6");
		node5.setNext(node6);
		
		System.out.println(getMiddleElement(headNode));
		
		try
		{
			node6.setNext(node4);
			System.out.println(getMiddleElement(headNode));
			
		}
		catch(IllegalArgumentException ex)
		{
			//expected
		}
		
		node6.setNext(null);
		
		System.out.println(getLastButOneElement(headNode));
		
	}
	
}
