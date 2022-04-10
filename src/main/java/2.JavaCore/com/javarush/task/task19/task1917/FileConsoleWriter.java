package com.javarush.task.task19.task1917;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

/* 
Свой FileWriter
*/

public class FileConsoleWriter {
    private FileWriter fileWriter;

    public FileConsoleWriter(FileWriter fileWriter){
        this.fileWriter = fileWriter;
    }
    public void write(char[] cbuf, int off, int len) throws IOException{
        fileWriter.write(cbuf, off, len);
        System.out.println(fileWriter);
    }
    public void write(int c) throws IOException{
        fileWriter.write(c);
        System.out.println(fileWriter);
    }
    public void write(String str) throws IOException{
        fileWriter.write(str);
        System.out.println(fileWriter);
    }
    public void write(String str, int off, int len) throws IOException{
        fileWriter.write(str, off, len);
        System.out.println(fileWriter);
    }
    public void write(char[] cbuf) throws IOException{
        fileWriter.write(cbuf);
        System.out.println(fileWriter);
    }
    public void close() throws IOException{
        fileWriter.close();
    }

    public static void main(String[] args) {

    }

}
