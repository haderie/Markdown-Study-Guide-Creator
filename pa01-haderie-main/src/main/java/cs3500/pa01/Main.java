package cs3500.pa01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * This is the main driver of this project.
 */
public class Main {

  /**
   * Project entry point
   *
   * @param args - accepts 3 command line arguments
   * @throws IOException if there are invalid arguments
   */
  public static void main(String[] args) throws IOException {

    String pathInp = args[0];
    String orderInp = args[1];
    String outputPath = args[2];

    Path p = Path.of(pathInp);

    //example of VisitAllMdFiles
    VisitAllMdFiles visMdFiles = new VisitAllMdFiles(orderInp);

    //walks through each file
    Files.walkFileTree(p, visMdFiles);

    FileWriter fileWriter = new FileWriter(outputPath, visMdFiles);
    fileWriter.writeFile();

  }
}