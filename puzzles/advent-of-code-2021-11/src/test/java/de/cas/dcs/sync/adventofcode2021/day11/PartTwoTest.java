package de.cas.dcs.sync.adventofcode2021.day11;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartTwoTest {

  @Test
  public void resultTest() throws IOException, URISyntaxException {
    // ARRANGE
    long expectedResult = 195;
    Path path = Paths.get(this.getClass().getResource("/day11.file").toURI());
    Stream<String> lines = Files.lines(path);

    // ACT
    long actualResult = new PartTwo().execute(lines);

    // ASSERT
    assertEquals(expectedResult, actualResult);
  }
}