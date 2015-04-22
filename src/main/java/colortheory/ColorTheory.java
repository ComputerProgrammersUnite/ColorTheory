package colortheory;


public class ColorTheory {
	public static double calculateSize(int initialRadius, int radiusOfCollision) {
		// adds the values to determine size when collision happens
		double finalRadius = Math.sqrt(Math.pow(initialRadius, 2)
				+ Math.pow(radiusOfCollision, 2));
		return finalRadius;
	}

	public static String calculateColor(int initialR, int initialG,
			int initialB, int blobR, int blobG, int blobB) {
		int finalR = 0;
		int finalG = 0;
		int finalB = 0;

		// adds the values to determine color when collision happens
		finalR = initialR + blobR;
		finalG = initialG + blobG;
		finalB = initialB = blobB;

		// in the case that maximum value is reached
		if (finalR > 256) {
			finalR = 256;
		}

		if (finalG > 256) {
			finalG = 256;
		}

		if (finalB > 256) {
			finalB = 256;
		}

		return (finalR + " ," + finalG + " ," + finalB);
	}

}
