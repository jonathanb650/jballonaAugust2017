/*Jonathan Ballona
 * September 6, 2017
 * This is the runner for the calculate library. It is used to test the method in ___
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(-7));
		System.out.println(Calculate.cube(-3));
		System.out.println(Calculate.average(6,5));
		System.out.println(Calculate.average(4, 6, 9));
		System.out.println(Calculate.toDegrees(-3));
		System.out.println(Calculate.toRadians(79));
		System.out.println(Calculate.discriminant(4, 6, 9));
		System.out.println(Calculate.toImproperFrac(9, 6, 2));
	}

}
