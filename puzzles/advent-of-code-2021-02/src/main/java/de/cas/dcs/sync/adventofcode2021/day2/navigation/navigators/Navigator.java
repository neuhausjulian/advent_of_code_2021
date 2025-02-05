package de.cas.dcs.sync.adventofcode2021.day2.navigation.navigators;

import de.cas.dcs.sync.adventofcode2021.day2.navigation.commands.NavigationCommand;
import de.cas.dcs.sync.adventofcode2021.day2.navigation.positions.Position;

public interface Navigator<T extends Position> {
  void addNavigationToPosition(NavigationCommand command, T currentPosition);

  T getPositionOf(int x, int y);
}
