package cs3500.pa01;

import static cs3500.pa01.Main.main;

import java.io.IOException;
import org.junit.jupiter.api.Test;

/**
 * represents tests for the Main class
 */
class MainTest {

  /**
   * tests the main class
   */
  @Test
  public void testArguments()  {
    String[] args = new String[3];
    args[0] = "sample";
    args[1] = "filename";
    args[2] = "result/studyguide.md";

    try {
      main(args);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}