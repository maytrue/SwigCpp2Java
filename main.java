/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class main {
	static {
		String path = System.getProperty("user.dir");
		String jniPath = path + "/example.so";
		try {
			System.load(jniPath);
		} catch (UnsatisfiedLinkError e) {
			System.out.println("UnsatisfiedLinkError: " + e.getMessage());
		}
		
	}

	public static void main(String argv[]) {
		Circle circle = new Circle(10);
		double area = circle.area();
		double perimeter = circle.perimeter();
		System.out.println("area = " + area + ", perimeter = " + perimeter);
		System.out.println("shapes = " + Shape.getNshapes());

		Square square = new Square(2);
		area = square.area();
		perimeter = square.perimeter();
		System.out.println("area = " + area + ", perimeter = " + perimeter);
		System.out.println("shapes = " + Shape.getNshapes());
	} 
}
