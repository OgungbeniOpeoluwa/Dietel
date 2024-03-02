package chapter15;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileCreationTest {
    @Test
    public void testCreateFile(){
        String fileName ="sample.txt";
        String location ="C:\\Users\\Dell\\Desktop\\Dietel\\files";
        FileCreation.createFile(location,fileName);
        Path path = Paths.get(location,fileName);
        assertTrue(Files.exists(path));
    }
    @Test
    public void testCreateDirectory(){
        String location = "C:\\Users\\Dell\\Desktop\\Dietel\\femi";
        FileCreation.createDirctory(location);
        Path path = Paths.get(location);

        assertTrue(Files.exists(path));
    }
    @Test
    public void testThatFileDirectoryCanBeDeleted(){
        String location = "C:\\Users\\Dell\\Desktop\\Dietel\\femi";
        FileCreation.delete(location);
        Path path = Path.of(location);
        assertFalse(Files.exists(path));
    }
    @ Test

    public void testThatFileCanBeDeleted(){
        String location ="C:\\Users\\Dell\\Desktop\\Dietel\\files\\sample.txt";
        FileCreation.deleteFile(location);
        Path path = Path.of(location);
        System.out.println(path);
        assertFalse(Files.exists(path));
    }

}