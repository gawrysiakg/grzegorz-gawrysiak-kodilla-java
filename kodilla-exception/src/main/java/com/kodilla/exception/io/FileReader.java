package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile(final String fileName) throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();

        try (Stream<String> fileLines = Files.lines(Path.of(classLoader.getResource(fileName).toURI()))) {
            fileLines.forEach(System.out::println);
        } catch (Exception e) {
            throw new FileReaderException();
        } finally {
            System.out.println("I am gonna be here... always! ");
        }
    }



    public void readFile() throws FileReaderException{
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            throw new FileReaderException();
        } finally {
            System.out.println("I am gonna be here... always!");
        }

        System.out.println(file.getPath());


        //    public void readFile() {
//        ClassLoader classLoader = getClass().getClassLoader();
//        File file = new File(classLoader.getResource("names.txt").getFile());
//        Path path = Paths.get(file.getPath());
//
//        try {
//            Stream<String> fileLines = Files.lines(path);
//            fileLines.forEach(System.out::println);
//        } catch (IOException e) {
//            System.out.println("Błąd odczytu pliku"+e);
//        }
//
//        System.out.println(file.getPath());
//    }
    }
}