package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    public int top, left, width = 0, height = 0;
    Rectangle rectangle1 = new Rectangle();

    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = this.width;
    }

    public void initialize(Rectangle rectangle1){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
