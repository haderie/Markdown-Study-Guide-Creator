package cs3500.pa01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * represents the FileWriter
 */
public class FileWriter {
  private final String outputPath;
  private final VisitAllMdFiles visitAllMdFiles;


  FileWriter(String outputPath, VisitAllMdFiles visitAllMdFiles) {
    this.outputPath = outputPath;
    this.visitAllMdFiles = visitAllMdFiles;
    writeFile();
  }

  /**
   * Concat the file content of each file in the arrayList and writes it to a new file
   */
  public void writeFile() {

    StringBuilder concat = new StringBuilder();
    for (MdFile f : visitAllMdFiles.getList()) {
      concat.append(f.currFileContent());
    }
    String allContent = concat.toString();
    Path path = Path.of(outputPath);

    // Convert String to data for writing ("raw" byte data)
    byte[] data = allContent.getBytes();

    // The path may not exist, or we may not have permissions to write to it,
    // in which case we need to handle that error (hence try-catch)

    // Built-in convenience method for writing data to a file.
    try {
      Files.write(path, data);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }
}
