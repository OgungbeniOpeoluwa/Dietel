package chapter15;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class DirctoryStramSample {
    public static void main(String[] args) {
        IntConsumer consumer = (x)-> System.out.println(x);
        IntStream.rangeClosed(1,10).forEach(consumer);


//        String location = "C:\\Users\\Dell\\Documents";
//        Path path = Path.of(location);
//        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
//            directoryStream.forEach(System.out::println);
//        }
//        catch (IOException exception){
//            exception.printStackTrace();
//
//        }
    }
}
