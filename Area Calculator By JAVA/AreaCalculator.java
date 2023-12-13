import java.util.Scanner;



class Square{
	
	float length;
	float area;
	
	public void acceptInput() {
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the length of the square :");
		length = scan.nextFloat();
		
	}
	public void compute() {
		
		area  = length*length;
	}
	public void disp() {
		
		System.out.println("\nArea of Square = "+ area);
		
	}
	
}

class Rectangle{
	
	float length;
	float breadth;
	float area;
	
	public  void accetpInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the Rectangle : ");
		length = scan.nextFloat();
		System.out.println("Enter the breadth of the Rectangle : ");
		breadth = scan.nextFloat();
		
	}
	
	public void compute() {
		area = length*breadth;
	}
	
	public void disp() {
		System.out.println("Area of the Rectangle = "+area);
	}
}

class Circle{
	
	float radius ;
	float area;
	
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the Circle : ");
		radius = scan.nextFloat();
		
	}
	
	public void compute() {
		area = (3.14f * radius * radius) ;
	}
	
	public void disp() {
		
		System.out.println("Area of the Circle = "+area);
	}
	
	
}
public class AreaCalculator {
	
	public static void main(String [] args) {
	

		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		s.acceptInput();
		s.compute();
		s.disp();
	
		r.accetpInput();
		r.compute();
		r.disp();
	
		c.acceptInput();
		c.compute();
		c.disp();
	
	}

}