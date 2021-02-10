package array_multidimensionais;

public class Main {

	public static void main(String[] args) {
		int[][] array = new int[3][5];

		array[2][3] = 10;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.println(array[i][j] + " ");
			}
		}

		int[][][] array2 = new int[3][5][2];

		array2[2][3][0] = 10;

		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[0].length; j++) {
				for (int k = 0; k < array2[0][0].length; k++) {
					System.out.print(array2[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
