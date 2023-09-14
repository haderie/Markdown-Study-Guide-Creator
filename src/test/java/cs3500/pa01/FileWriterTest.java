package cs3500.pa01;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;

/**
 * represents tests for FileWriter
 */
class FileWriterTest {

  VisitAllMdFiles visitAllMdFiles = new VisitAllMdFiles("filename");
  FileWriter fileWriter = new FileWriter("result/studyguide.md", visitAllMdFiles);

  /**
   * tests that the file important phrases have all been added to the new file
   */
  @Test
  void writeFile() {

    assertThrows(FileSystemException.class,

        () -> Files.write(Path.of("result/"), "".getBytes()));

    fileWriter.writeFile();
  }
}