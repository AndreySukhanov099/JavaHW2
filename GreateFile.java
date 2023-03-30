//Создать файл file.txt. Если файл уже создан, ничего делать не надо. Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...
package org.example;
import java.io.File;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.lang.StringBuilder;


public class GreateFile {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("file.txt");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 101; i++) {
            builder.append("TEXT");
        }
        Files.writeString(path, builder);
        
    }
}