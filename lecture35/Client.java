package lecture35;

import java.util.Comparator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer[] arr = {1,2,3,4,5,6,7};
//		displayGen(arr);
//		
//		String[] ar = {"abs","ghf","hello"};
//		displayGen(ar);
		
		Car cars[] = new Car[5];
		
		cars[0] = new Car(100,2000,"Black");
		cars[1] = new Car(120,3000,"Green");
		cars[2] = new Car(110,20300,"Blue");
		cars[3] = new Car(80,2020,"Red");
		cars[4] = new Car(200,10000,"White");
		
		displayGen(cars);
		bubbleSort(cars,new SpeedComparator());
		displayGen(cars);
	}
	
	
	public static void display(Integer[] arr)
	{
		for(Integer val:arr)
		{
			System.out.print(val+" ");
		}
		System.out.println();
	}
	
	public static void display(String[] arr)
	{
		for(String val:arr)
		{
			System.out.print(val+" ");
		}
		System.out.println();
	}
	
	public static <T> void displayGen(T[] arr)
	{
		for(T val:arr)
		{
			System.out.print(val+" ");
		}
		System.out.println();
	}
	
	
	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		
		for(int i = 0; i < arr.length; i++)
		{
			int count = 0;
			for(int j = 0; j < arr.length-1-i; j++)
			{
				if(arr[j].compareTo(arr[j+1]) > 0)
				{
					T t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					count += 1;
				}
			}
			if(count == 0)
				break;
		}
	}
	
public static <T> void bubbleSort(T[] arr,Comparator<T> comp) {
		
		for(int i = 0; i < arr.length; i++)
		{
			int count = 0;
			for(int j = 0; j < arr.length-1-i; j++)
			{
				if(comp.compare(arr[j],arr[j+1]) > 0)
				{
					T t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					count += 1;
				}
			}
			if(count == 0)
				break;
		}
	}
}
