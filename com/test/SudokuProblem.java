package com.test;

class SudokuProblem {

	public boolean checkValidity(int sudoku[][], int row, int column, int digit) {

		boolean result = false;
		if(row > 8 || column >8 || digit > 9 )
			return result;
		
		result = (checkRow(sudoku, row, digit) && checkRow(sudoku, row, digit) && checkColumn(sudoku, column, digit)) ? true :false;
		 return result;
	}

	// check digit in row is present or not
	public static boolean checkRow(int sudoku[][], int row, int digit) {

		for (int i = 0; i < 9; i++)
			if (sudoku[row][i] == digit)
				return false;

		return true;
	}

	// check digit in column is present or not
	public static boolean checkColumn(int sudoku[][], int column, int digit) {
		
		for (int i = 0; i < 9; i++)
			if (sudoku[i][column] == digit)
				return false;

		return true;
	}

	// check digit in 3x3 dimensional is present or not
	public static boolean subMatrix(int sudoku[][], int row, int column, int digit) {
		int r = row - row % 3;
		int c = column - column % 3;

		for (int i = r; i < r + 3; i++)
			for (int j = c; j < c + 3; j++)
				if (sudoku[i][j] == digit)
					return false;

		return true;

	}

	public static void main(String... args) {

		int[][] arr = { 
				{ 5, 3, 0, 0, 7, 0, 0, 0, 0 }, 
				{ 6, 0, 0, 1, 9, 5, 0, 0, 0 }, 
				{ 0, 9, 8, 0, 0, 0, 0, 6, 0 },
				{ 8, 0, 0, 0, 0, 0, 0, 0, 3 }, 
				{ 4, 0, 0, 8, 0, 3, 0, 0, 1 }, 
				{ 7, 0, 0, 0, 2, 0, 0, 0, 6 },
				{ 0, 6, 0, 0, 0, 0, 2, 8, 0 }, 
				{ 0, 0, 0, 4, 1, 9, 0, 0, 5 }, 
				{ 0, 0, 0, 0, 8, 0, 0, 7, 9 } };

		SudokuProblem sudoku = new SudokuProblem();

		boolean result = sudoku.checkValidity(arr, 0, 1, 7);
		System.out.println(result);
	}

}
