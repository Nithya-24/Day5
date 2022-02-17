package flipCoin;


public class Distance {

	public static void main(String[] args) {
		int x1, y1, x2=0, y2=0;
		double dist = 0;
		x1 = Integer.parseInt(args[0]);
		y1 = Integer.parseInt(args[1]);
		System.out.println("The value of x1 is " +x1+ "and y1 is " +y1);
		
		double x = Math.pow(x2 - x1, 2);
		double y = Math.pow(y2 - y1, 2);
		dist = Math.sqrt(x + y);
		System.out.println("Distance is " +dist);
	}
	

}
