package lecture35;

public class Car implements Comparable<Car> {
	
	
	int speed;
	int price;
	String color;
	
	
	public Car(int s,int p,String c)
	{
		this.speed = s;
		price = p;
		color = c;
	}
	
	@Override
	public String toString()
	{
		return "S: "+speed+" P: "+price+" C: "+color+"\n";
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
//		return this.speed-o.speed;
//		return o.price-this.price;
		return this.color.compareTo(o.color)
	}

}
