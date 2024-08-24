package arraysPrograms;

import java.util.Scanner;

public class ProjectArray {
	static Methods obj=new Methods();
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the array size>=0");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter element:"+(i+1));
			a[i]=sc.nextInt();
		}
		while(true) {
			boolean temp=false;
			System.out.println("1.Insert 2.InsertAll\n3.Delete 4.DeleteAll\n"+
					"5.Update 6.UpdateAll\n7.Occurrences 8.FirstOccur\n"+
					"9.LastOccur 10.Sort\n11.Reverse 12.Min\n13.Max 14.Sum 15.Avg"
					+ "\n16.Display 17.Clear\n18.isEmpty 19.Exit");
			int opt=sc.nextInt();
			switch(opt) {
			case 1:{
				System.out.println("Enter new element to insert");
				int ele=sc.nextInt();
				System.out.println("Enter position");
				int pos=sc.nextInt();
				a=obj.insertion(a,ele,pos);
				break;
			}
			case 2:{
				System.out.println("Enter no of elements to insert");
				int s=sc.nextInt();
				int b[]=new int[s];
				for(int i=0;i<s;i++) {
					System.out.println("Enter element:"+(i+1));
					b[i]=sc.nextInt();
				}
				a=obj.merge(a,b);
				obj.display(a);
				break;
			}
			case 3:{
				System.out.println("Enter the element to be deleted");
				int ele=sc.nextInt();
				a=obj.delete(a, ele);
				break;
			}
			case 4:{
				System.out.println("Enter the element to be deleted");
				int ele=sc.nextInt();
				a=obj.deleteAll(a, ele);
				break;
			}
			case 5:{
				System.out.println("Enter the element to be Updated");
				int o_ele=sc.nextInt();
				System.out.println("Enter the new element");
				int n_ele=sc.nextInt();
				a=obj.update(a, o_ele, n_ele);
				break;
			}
			case 6:{
				System.out.println("Enter the element to be Updated");
				int o_ele=sc.nextInt();
				System.out.println("Enter the new element");
				int n_ele=sc.nextInt();
				a=obj.updateAll(a, o_ele, n_ele);
				break;
			}
			case 7:{
				System.out.println("Enter the element");
				int ele=sc.nextInt();
				ele=obj.occur(a, ele);
				break;
			}
			case 8:{
				System.out.println("Enter the element");
				int ele=sc.nextInt();
				System.out.println(obj.firstOccur(a, ele)+1);
				break;
			}
			case 9:{
				System.out.println("Enter the element");
				int ele=sc.nextInt();
				a=obj.lastOccur(a, ele);
				break;
			}
			case 10:{
				a=obj.sort(a);
				break;
			}
			case 11:{
				a=obj.reverse(a);
				break;
			}
			case 12:{
				Methods.min(a);
				break;
			}
			case 13:{
				a=obj.max(a);
				break;
			}
			case 14:{
				Methods.add(a);
				break;
			}
			case 15:{
				Methods.avg(a);
				break;
			}
			case 16:{
				a=obj.display(a);
				break;
			}
			case 17:{
				a=obj.clear();
				break;
			}
			case 18:{
				System.out.println(obj.isEmpty(a));
				break;
			}
			case 19:{
				temp=true;
				break;
			}
			default:{
				System.out.println("Please enter correct option.....");
			}
			
		}
			if(temp) {
				System.out.println("Thank you...");
				break;
			}
	}
  }				

}
