## practice-example

# Introduction

Sudoku puzzle solve using the backtracking algorithm.

# Algorithm

- Iterate through each cell of the grid .
- For each empty cell (0), try all numbers from 1 to 9.
- For each number, check if it is valid to place the number in the cell using the isValidDataDisplay method.
- If valid, place the number in the cell and recursively call sudokuPuzzleDecode to solve the rest of the grid.
- If the recursive call returns true, the puzzle is solved.
- If the recursive call returns false, reset the cell (backtrack) and try the next number.
- If no number is valid, return false, indicating no solution exists from the current state.
	
# Validation

- The number should not present in the current row.
- The number should not present in the current column.
- The number should not present in the current 3x3 subgrid.

# Prerequisite

- JDK install 21.0.1
- Editor (Notepad++, Eclipse, etc)

# How to run
cd Sudoku
javac SudokuPuzzleSolve.java
java SudokuPuzzleSolve
![Optional Text](../asset/sudoku-puzzle-solve-console-output.png)