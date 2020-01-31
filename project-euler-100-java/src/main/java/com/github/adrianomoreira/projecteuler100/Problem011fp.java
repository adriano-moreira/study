package com.github.adrianomoreira.projecteuler100;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class GridCell {
    int x;
    int y;
    int xLen;
    int yLen;

    public GridCell(int x, int y, int xLen, int yLen) {
        this.x = x;
        this.y = y;
        this.xLen = xLen;
        this.yLen = yLen;
    }

}

class Strategy {
    Predicate<GridCell> filter;
    BiFunction<GridCell, Integer, Integer> extractor;

    private Strategy() {
    }

    public static Strategy withFilter(Predicate<GridCell> filter) {
        var strategy = new Strategy();
        strategy.filter = filter;
        return strategy;
    }

    public Strategy withExtractor(BiFunction<GridCell, Integer, Integer> extractor) {
        this.extractor = extractor;
        return this;
    }

}

/**
 * my functional version of problem 11
 */
public class Problem011fp {

    public static int largestGridProduct(int[][] grid) {
        var xLen = grid.length;
        var yLen = grid[0].length;
        var groupLen = 4;

        IntBinaryOperator toProduct = (a, b) -> a * b;

        var strategies = new ArrayList<Strategy>();

        // up down
        strategies.add(Strategy
                .withFilter(c -> c.y < c.yLen - groupLen + 1)
                .withExtractor((c, l) -> grid[c.x][c.y + l]));

        // left right
        strategies.add(Strategy
                .withFilter(c -> c.x < c.xLen - groupLen + 1)
                .withExtractor((c, l) -> grid[c.x + l][c.y]));

        // diagonal right down
        strategies.add(Strategy
                .withFilter(c -> c.x < c.xLen - groupLen + 1 && c.y < c.yLen - groupLen + 1)
                .withExtractor((c, l) -> grid[c.x + l][c.y + l]));

        // diagonal left down
        strategies.add(Strategy
                .withFilter(c -> c.x > groupLen - 1 && c.y < c.yLen - groupLen + 1)
                .withExtractor((c, l) -> grid[c.x - l][c.y + l]));

        return strategies.stream().mapToInt(strategy ->
                IntStream.range(0, xLen)
                        .mapToObj(x -> IntStream
                                .range(0, yLen)
                                .mapToObj(y -> new GridCell(x, y, xLen, yLen)))
                        .flatMap(stream -> stream)
                        .filter(strategy.filter)
                        .mapToInt(c -> IntStream.range(0, groupLen)
                                .mapToObj(l -> strategy.extractor.apply(c, l))
                                .mapToInt(Integer::intValue)
                                .reduce(toProduct).orElse(0)
                        )
                        .max().orElse(0)
        ).max().orElse(0);
    }
}
