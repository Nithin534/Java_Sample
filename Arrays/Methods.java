package arraysPrograms;

import java.util.Arrays;


public class Methods {
	
	public int[] display(int a[] ) {
		System.out.println(Arrays.toString(a));
		return a;
	}
	public int[] sort(int a[]) {
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		return a;
	}
	public int[] max(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("Max value is:"+max);
		 return a;
	}
	public static int min(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Min value is"+min);
		return min;
	}
	public static int add(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of elements:"+sum);
		return sum;
	}
	public static double avg(int a[]) {
		double sum=0;double avg=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println("Avg of elements:"+avg);
		return avg;
	}
	public int firstOccur(int a[],int ele) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]== ele)
				return i;
			
		}
		return -1;
	}
	public int[] lastOccur(int a[],int ele) {
		int f=-1,l=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				if(f==-1) {
					f=i;
				}
				l=i;
			}
		}
		System.out.println(l+1);
		return a;
	}
	public boolean isEmpty(int a[]) {
		if(a.length==0) {
			return true;
		}
		return false;
	}
	public int[] merge(int a[],int b[]) {
		
		int c[]=new int[a.length+b.length];
		int index=0;
		for(int i=0;i<a.length;i++) {
			c[index++]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[index++]=b[i];
		}
		
		return c;
	}
	public int[] reverse(int a[]) {
		int f=0,l=a.length-1;
		while(f<l) {
			int temp=a[f];
			a[f]=a[l];
			a[l]=temp;
			f++;
			l--;
		}
		System.out.println(Arrays.toString(a));
		return a;
	}
	public  int[] insertion(int a[],int ele,int pos) {
		
		int b[]=new int[a.length+1];
		if(pos>a.length+1 || pos<1) {
			System.out.println("Insertion is not possible");
		}
		else {
		for(int i=0,j=0;i<b.length;i++) {
			
			if(i==pos-1) {
				b[i]=ele;
			}
			else {
				b[i]=a[j++];
			}
			
		}
		}
		System.out.println(Arrays.toString(b));
		return b;
	}
	public int[] delete(int a[],int ele) {
		int ind=firstOccur(a,ele);
		if(a.length==0) {
			System.out.println("Array is empty");
		}
		else if(ind == -1){
			System.out.println("Deleting element is not found");
		}
		
		else {
			int b[]=new int[a.length-1];
		for(int i=0,j=0;i<a.length;i++) {
			if(ind!=i) {
				b[j++]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
		}
		
		return a;
	
	}
	public int[] deleteAll(int a[],int ele) {
		int n=occur(a,ele);
		if(a.length==0) {
			System.out.println("Array is empty");
		}
		else if(n == 0){
			System.out.println("Deleting element is not found");
		}
		else {
			int b[]=new int[a.length-n];
		for(int i=0,j=0;i<a.length;i++) {
			if(ele!=a[i]) {
				b[j++]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
		}
		return a;
	}
	public int[] update(int a[],int o_ele,int n_ele) {
		int ind=firstOccur(a,o_ele);
		if(a.length==0) {
			System.out.println("Array is empty");
		}
		else if(ind == -1){
			System.out.println("element is not found");
		}
		else {
			a[ind]=n_ele;
			System.out.println(Arrays.toString(a));
		}
		return a;
	}
	public int[] updateAll(int a[],int o_ele,int n_ele) {
		int ind=firstOccur(a,o_ele);
		if(a.length==0) {
			System.out.println("Array is empty");
		}
		else if(ind == -1){
			System.out.println("element is not found");
		}
		else {
			for(int i=0;i<a.length;i++) {
				if(a[i]==o_ele) {
					a[i]=n_ele;
				}
			}
			System.out.println(Arrays.toString(a));
		}
		return a;
	}
	public int[] clear() {
		return new int[0];
	}
	public int occur(int a[],int ele) {
		int c=0;
		for(int i:a) {
			if(i==ele) {
				c++;
			}
		}
		System.out.println(c);
		return c;
	}
	public boolean exit() {
		return false;
	}
}
