package com.javarush.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream component;

    public QuestionFileOutputStream (AmigoOutputStream component){
        this.component = component;
    }

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String answer = "";

    public void flush() throws IOException {
        component.flush();
    }
    public void write(int b) throws IOException {
        component.write(b);
    }
    public void write(byte[] b) throws IOException{
        component.write(b);
    }
    public void write(byte[] b, int off, int len) throws IOException{
        component.write(b, off, len);
    }
    public void close() throws IOException{
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        answer = reader.readLine();
        if (answer.equals("Д")){
           component.close();
        }
    }
}

