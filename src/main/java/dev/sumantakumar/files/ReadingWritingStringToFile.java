package dev.sumantakumar.files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static java.nio.file.Files.readString;
import static java.nio.file.Files.writeString;

public class ReadingWritingStringToFile {
    public static void main(String[] args) throws IOException {
        Path path = new File("src/main/resources/data.txt").toPath();
        Path helloWorld = writeString(path, "Hello World, How are you?", StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        String s = readString(path);
        System.out.println(s);

    }
}
