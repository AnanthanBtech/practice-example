public class SudokuPuzzleSolve {

	private static final int GIRDSIZE = 9; // Size

	private static void showFinalOutput(int[][] dataDisplay) {
		for (int row = 0; row < GIRDSIZE; row++) {
			for (int col = 0; col < GIRDSIZE; col++) {
				System.out.print(dataDisplay[row][col] + " ");
			}
			System.out.println();
		}
	}

	private static boolean isValidDataDisplay(int[][] dataDisplay, int row, int col, int n) {
		for (int p = 0; p < GIRDSIZE; p++) {
			if (dataDisplay[row][p] == n || dataDisplay[p][col] == n
					|| dataDisplay[row - row % 3 + p / 3][col - col % 3 + p % 3] == n) {
				return false;
			}
		}
		return true;
	}

	private static boolean sudokuPuzzleDecode(int[][] dataDisplay) {
		for (int row = 0; row < GIRDSIZE; row++) {
			for (int col = 0; col < GIRDSIZE; col++) {
				if (dataDisplay[row][col] == 0) {
					for (int n = 1; n <= GIRDSIZE; n++) {
						if (isValidDataDisplay(dataDisplay, row, col, n)) {
							dataDisplay[row][col] = n;
							if (sudokuPuzzleDecode(dataDisplay)) {
								return true;
							}
							dataDisplay[row][col] = 0;
						}
					}
					return false;
				}

			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] dataDisplayPrbl1 = { 
				{ 0, 1, 3, 8, 0, 0, 4, 0, 5 }, 
				{ 0, 2, 4, 6, 0, 5, 0, 0, 0 },
				{ 0, 8, 7, 0, 0, 0, 9, 3, 0 }, 
				{ 4, 9, 0, 3, 0, 6, 0, 0, 0 }, 
				{ 0, 0, 1, 0, 0, 0, 5, 0, 0 },
				{ 0, 0, 0, 7, 0, 1, 0, 9, 3 }, 
				{ 0, 6, 9, 0, 0, 0, 7, 4, 0 }, 
				{ 0, 0, 0, 2, 0, 7, 6, 8, 0 },
				{ 1, 0, 2, 0, 0, 8, 3, 5, 0 } 
			};

		int[][] dataDisplayPrbl2 = { 
				{ 0, 0, 2, 0, 0, 0, 0, 4, 1 }, 
				{ 0, 0, 0, 0, 8, 2, 0, 7, 0 },
				{ 0, 0, 0, 0, 4, 0, 0, 0, 9 }, 
				{ 2, 0, 0, 0, 7, 9, 3, 0, 0 }, 
				{ 0, 1, 0, 0, 0, 0, 0, 8, 0 },
				{ 0, 0, 6, 8, 1, 0, 0, 0, 4 }, 
				{ 1, 0, 0, 0, 9, 0, 0, 0, 0 }, 
				{ 0, 6, 0, 4, 3, 0, 0, 0, 0 },
				{ 8, 5, 0, 0, 0, 0, 4, 0, 0 }
			};
		
		System.out.println("First Problem Statement\n");
		if (sudokuPuzzleDecode(dataDisplayPrbl1)) {
			showFinalOutput(dataDisplayPrbl1);
		} else {
			System.out.println("Unable find Solutions");
		}

		System.out.println("\nSecond Problem Statement\n");
		if (sudokuPuzzleDecode(dataDisplayPrbl2)) {
			showFinalOutput(dataDisplayPrbl2);
		} else {
			System.out.println("Unable find Solutions");
		}
	}
}