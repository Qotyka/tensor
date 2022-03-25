package com.company;

public class Main {

    public static void main(String[] args) {
        //несколько файлов
        File file1_folder1 = new File();
        file1_folder1.name = "file1_folder1";
        file1_folder1.extention = "exe";
        File file2_folder1 = new File();
        file2_folder1.name = "file2_folder1";
        file2_folder1.extention = "txt";
        File file3_folder1 = new File();
        file3_folder1.name = "file3_folder1";
        file3_folder1.extention = "bpm";
        File file1_folder2 = new File();
        file1_folder2.name = "file1_folder2";
        file1_folder2.extention = "doc";
        File file2_folder2 = new File();
        file2_folder2.name = "file2_folder2";
        file2_folder2.extention = "dll";
        File file3_folder2 = new File();
        file3_folder2.name = "file3_folder2";
        file3_folder2.extention = "exe";
        File file4_folder2 = new File();
        file4_folder2.name = "file4_folder2";
        file4_folder2.extention = "exe";
        //папки с файлами
        Folder folder1 = new Folder(file1_folder1, file2_folder1, file3_folder1);
        folder1.name = "folder1";
        Folder folder2 = new Folder(file1_folder2, file2_folder2, file3_folder2, file4_folder2);
        folder2.name = "folder2";
        //корневая папка
        Folder root = new Folder(folder1, folder2);
        root.name = "root";
        //отображаем путь до третьего файла второй папки
        System.out.println(file3_folder2.getPathOf());
        //отображаем расширение второго файла первой папки
        System.out.println(file2_folder1.getExtention());
    }
}
