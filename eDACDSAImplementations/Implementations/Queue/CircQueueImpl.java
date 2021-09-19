package queuepack;

import java.util.Scanner;

public class CircQueueImpl {

	public static void main(String[] args) {
		int n, ch ,e;
		System.out.println("Enter Queue size:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		CircQueue ob = new CircQueue(n);
		do
		{
			System.out.println("Enter your choice \n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit");
			ch = sc.nextInt();
			
			switch (ch)
			{
				case 1://Enqueue
					if(ob.isFull()==false)
					{
						System.out.println("Enter element:");
						e = sc.nextInt();
						ob.enQueue(e);
					}
					else
						System.out.println("Queue is full");
					break;
					
				case 2://Dequeue
					if(ob.isEmpty()==false)
					{
						System.out.println("Dequeued element:"+ob.deQueue());
					}
					else
						System.out.println("Queue is empty");
					break;
					
				case 3://print
					System.out.println("Queue has:");
					ob.print();
					break;
					
				case 0://exit
					System.out.println("Exiting..");
					break;
					
				default:
					System.out.println("Enter valid input");
					break;				
			}
		}while(ch!=0);
	}

}
