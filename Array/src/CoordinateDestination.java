
public class CoordinateDestination {
	static boolean isReachable(int sx, int sy, int dx, int dy) {
		System.out.println(sx + "   " + sy);
		// base case
		if (sx > dx || sy > dy)
			return false;

		// current point is equal to destination
		if (sx == dx && sy == dy)
			return true;
		
		// check for other 2 possibilities
		return (isReachable(sx + sy, sy, dx, dy) || isReachable(sx, sy + sx, dx, dy));
	}

	// driver code
	public static void main(String arg[]) {
		int source_x = 1, source_y = 3;
		int dest_x = 9, dest_y = 4;
		if (isReachable(source_x, source_y, dest_x, dest_y))
			System.out.print("True\n");
		else
			System.out.print("False\n");
	}
	
	
}
