package de.cas.dcs.sync.adventofcode2021.day12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class PartTwoTest {

  @Test
  public void smallTest() throws IOException, URISyntaxException {
    // ARRANGE
    int expectedResult = 36;
    Path path = Paths.get(this.getClass().getResource("/day12-small.file").toURI());
    Stream<String> lines = Files.lines(path);

    // ACT
    long actualResult = new PartTwo().execute(lines);

    // ASSERT
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void largeTest() throws IOException, URISyntaxException {
    // ARRANGE
    int expectedResult = 3509;
    Path path = Paths.get(this.getClass().getResource("/day12-large.file").toURI());
    Stream<String> lines = Files.lines(path);

    // ACT
    long actualResult = new PartTwo().execute(lines);

    // ASSERT
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void mediumTest() throws IOException, URISyntaxException {
    // ARRANGE
    int expectedResult = 103;
    Path path = Paths.get(this.getClass().getResource("/day12-medium.file").toURI());
    Stream<String> lines = Files.lines(path);

    // ACT
    long actualResult = new PartTwo().execute(lines);

    // ASSERT
    assertEquals(expectedResult, actualResult);
  }
}
