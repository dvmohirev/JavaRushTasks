package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/Games/result.txt";
    private FileOutputStream file;

    public AmigoOutputStream (FileOutputStream file) throws FileNotFoundException {
        super(fileName);
        this.file = file;
    }

    public void flush() throws IOException {
        file.flush();
    }

    public void write(int b) throws IOException {
        file.write(b);
    }

    public void write(byte[] b) throws IOException {
        file.write(b);
    }

    public void write(byte[] b, int off, int len) throws IOException {
        file.write(b, off, len);
    }

    public void close() throws IOException {
        flush();
        write("JavaRush © All rights reserved.".getBytes());
        file.close();
    }



    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));

    }

}
