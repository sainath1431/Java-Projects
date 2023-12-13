import java.util.Scanner;


abstract class Shape{
	
	float area;
	
	abstract public void acceptInput();
	
	abstract public void compute();
	
	public void disp() {
		System.out.println("Area : "+area);
	}
	
	
	
}
class Square extends Shape{
	private float length;
	
	@Override
	public void acceptInput() {
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the length of the square :");
		length = scan.nextFloat();
		
	}
	
	@Override
	public void compute() { 
		
		area  = length*length;
	}
	
	
}

class Rectangle extends Shape{
	
	private float length;
	private float breadth;
	
	
	@Override
	public  void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the Rectangle : ");
		length = scan.nextFloat();
		System.out.println("Enter the breadth of the Rectangle : ");
		breadth = scan.nextFloat();
		
	}
	
	@Override
	public void compute() {
		area = length*breadth;
	}
	
}

class Circle extends Shape{
	
	private float radius ;
	
	
	@Override
	public void acceptInput() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the Circle : ");
		radius = scan.nextFloat();
		
		
	}
	
	
	@Override
	public void compute() {
		area = (3.14f * radius * radius) ;
	}
	

}

class Geometry {
	
	public void permit( Shape ref)
	{
		ref.acceptInput();
		ref.compute();
		ref.disp();
		
		
	}
}

public class AreaCalculatorOOP {
	
	public static void main(String [] args) {
		
		Shape a = new Square();
		Shape b = new Rectangle();
		Shape c = new Circle();
		
		
		Geometry g = new Geometry();
		
		g.permit(a);
		g.permit(b);
		g.permit(c);
		
	}
	
}
