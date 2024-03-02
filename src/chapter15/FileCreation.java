package chapter15;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreation {

    public static void createFile(String location, String fileName) {
        Path path = Path.of(location,fileName );
        try{
            Files.createFile(path);
        } catch (IOException e) {

        }
    }

    public static void createDirctory(String location) {
        Path path = Path.of(location);
        try{
            Files.createDirectories(path);
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    public static void delete(String location) {
        Path path = Path.of(location);
        try{
            Files.delete(path);
        } catch (IOException e){
            System.err.println(e.getMessage());

        }
    }

    public static void deleteFile(String location) {
        Path path = Path.of(location);
        try{
            Files.delete(path);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
