package de.cas.dcs.sync.adventofcode2021.day13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Day13Test {

  @ParameterizedTest
  @CsvSource({"day13.file,false,0", "day13.file,true,0"})
  public void resulTest(String resourceName, boolean partTwo, int expectedResult)
      throws IOException, URISyntaxException {
    // ARRANGE
    Path path = Paths.get(this.getClass().getResource("/" + resourceName).toURI());
    List<String> lines = Files.lines(path).collect(Collectors.toList());

    // ACT
    long actualResult = new Day13().execute(lines, partTwo);

    // ASSERT
    assertEquals(expectedResult, actualResult);
  }
}