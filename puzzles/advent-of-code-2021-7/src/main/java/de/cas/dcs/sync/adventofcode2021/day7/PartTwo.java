package de.cas.dcs.sync.adventofcode2021.day7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartTwo {
  private static final Path PUZZLE_RESOURCE = Paths.get("puzzle_resources/day7/day7.file");

  public static void main(String[] args) throws IOException {
    List<Integer> values =
        Files.lines(PUZZLE_RESOURCE)
            .flatMap(s -> Arrays.stream(s.split(",")))
            .map(Integer::parseInt)
            .sorted()
            .collect(Collectors.toList());

    int minPosition = values.get(0);
    int maxPosition = values.get(values.size() - 1);

    int minFuelCost = Integer.MAX_VALUE;
    int minFuelCostMeetingPosition = Integer.MAX_VALUE;

    for (int meetingPosition = minPosition; meetingPosition <= maxPosition; meetingPosition++) {
      int fuelCost = 0;
      for (Integer crabPosition : values) {
        int pointsToMove = Math.abs(meetingPosition - crabPosition);
        int fuelRate = 1;
        for (int i = 0; i < pointsToMove; i++) {
          fuelCost += fuelRate;
          fuelRate++;
        }
      }
      if (fuelCost < minFuelCost) {
        minFuelCost = fuelCost;
        minFuelCostMeetingPosition = meetingPosition;
      }
    }

    System.out.println(minFuelCostMeetingPosition + " " + minFuelCost);
  }

  public static String execute(List<String> values) {
    return "";
  }
}
