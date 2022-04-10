package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
import java.util.Map;
import java.util.TreeMap;

/*
Проход по дереву файлов
*/

public class Solution {
    public static void main(String[] args) {
        String path = args[0]; //создаем переменную и добавляем туда "путь к директории"
        String resultFileAbsolutePath = args[1]; //создаем переменную и добавляем туда
        // "имя (полный путь) существующего файла, который будет содержать результат."
        try {
            File resultFile = new File(resultFileAbsolutePath); //Создаем экземпляр класса File и передаем ему путь
            // "имя (полный путь) существующего файла, который будет содержать результат."
            File dest = new File(resultFile.getParentFile() + "/allFilesContent.txt"); //создаем экземпляр класса File
            // с добавлением /allFilesContent.txt, чтобы использовать его для переименования по задаче.
            if (FileUtils.isExist(dest)) { // Если такой файл dest уже существует по указанному пути - удаляем
                FileUtils.deleteFile(dest);
            }
            FileUtils.renameFile(resultFile, dest); //Переименовываем путь

            Map<String, byte[]> fileTree = getFileTree(path); // Создаем мапу с с файлами и их данными,
            //которые соответствуют условию. Создали для этого отдельную функцию.
            try (FileOutputStream fileOutputStream = new FileOutputStream(dest)) { //создаем поток на запись в файл dest
                for (byte[] bytes : fileTree.values()) { // проходим по списку значений дереве
                    fileOutputStream.write(bytes);
                    fileOutputStream.write("\n".getBytes());
                }
            }
        } catch (IOException ignored) {
        }
    }

    public static Map<String, byte[]> getFileTree(String root) throws IOException { //в этой функции мы получил мапу с файлами и их данными,
        //которые соответствуют условию
        Map<String, byte[]> result = new TreeMap<>(); // Создаем Treemap для корректного отображения папок

        EnumSet<FileVisitOption> options = EnumSet.of(FileVisitOption.FOLLOW_LINKS); // Для использования функции walkFileTree
        // нужен параметр Set<FileVisitOption> options. Т.к. FileVisitOption имеет тип enum, то создаем EnumSet
        Files.walkFileTree(Paths.get(root), options, 20, new GetFiles(result));
        //Files.walkFileTree имеет параметры 1. Начало пути. 2. Set для записи ссылок на директории, 3. Максимальную глубину.
        // 4. экземпляр класса, который проходит по всем файлам дерева. Класс должен имплементировать интерфейс FileVisitor

        return result; // Возвращаем мапу
    }

    private static class GetFiles extends SimpleFileVisitor<Path> {
        //Здесь использовали такой класс и наследование, чтобы не имплементировать все функции интерфейса FileVisitor
        // Создали класс для создания мапы с файлами и их данными, которые соответствуют условию.
        // Мы можем либо имплементировать интерфейс FileVisitor,
        // либо наследоваться от класса SimpleFileVisitor, который имплементирует интерфейс FileVisitor
        private Map<String, byte[]> result;

        public GetFiles(Map<String, byte[]> result) {
            this.result = result;
        }

        @Override
        public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
            //используем функцию visitFile из интерфейса FileVisitor
            File file = path.toFile(); //Получаем в объект file файл по пути path
            if (file.isFile()) { //Делаем проверку, что это действительно файл
                if (file.length() <= 50) { //Если длина файла на больше 50 байт
                    result.put(path.getFileName().toString(), Files.readAllBytes(path)); //кладем в Map (Имя файла, массив байт из файла)
                }
            }
            return super.visitFile(path, basicFileAttributes); //возвращаемся к той же функции visitFile, пока в директории есть подходящие файлы
        }
    }
}
