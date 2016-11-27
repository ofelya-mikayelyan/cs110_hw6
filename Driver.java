import Shapes.Rectangle;
import Shapes.Square;
import utils.Math;

public class Driver{
	public static void main(String[] args){

		Square aSquare = new Square(100);
		System.out.println("My Square!!!" + aSquare.getArea());

		Rectangle aRectangle = new Rectangle(50, 80);
		System.out.println("My Rectangle!!!" + aRectangle.getArea());

		double num = 15.6;
		System.out.println("Factorial!" + Math.fact((int)num));
		System.out.println("Loop!" + Math.factorialLoop((int)num));
	}
}