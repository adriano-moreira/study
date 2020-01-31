package com.github.adrianomoreira.projecteuler100;

public class Problem011 {
    public static int largestGridProduct(int[][] grid) {
        int largest = 0;
        int len = 4;

        int yLength = grid.length;
        int xLength = grid[0].length;

        for (int x = 0; x < xLength - len + 1; x++) {
            for (int y = 0; y < yLength; y++) {
                int product = grid[x][y] * grid[x + 1][y] * grid[x + 2][y] * grid[x + 3][y];
                if (product > largest) {
                    largest = product;
                }
            }
        }

        for (int x = 0; x < xLength; x++) {
            for (int y = 0; y < yLength - len + 1; y++) {
                int product = grid[x][y] * grid[x][y + 1] * grid[x][y + 2] * grid[x][y + 3];
                if (product > largest) {
                    largest = product;
                }
            }
        }

        for (int x = 0; x < xLength - len + 1; x++) {
            for (int y = 0; y < yLength - len + 1; y++) {
                int product = grid[x][y] * grid[x + 1][y + 1] * grid[x + 2][y + 2] * grid[x + 3][y + 3];
                if (product > largest) {
                    largest = product;
                }
            }
        }

        for (int x = 0; x < xLength - len + 1; x++) {
            for (int y = 0 + len - 1; y < yLength; y++) {
                int product = grid[x][y] * grid[x + 1][y - 1] * grid[x + 2][y - 2] * grid[x + 3][y - 3];
                if (product > largest) {
                    largest = product;
                }
            }
        }

        return largest;
    }
}
