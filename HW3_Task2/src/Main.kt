fun main(args: Array<String>) {
    //несколько файлов
    val file1Folder1 = File("exe")
    file1Folder1.name = "file1_folder1"
    val file2Folder1 = File("txt")
    file2Folder1.name = "file2_folder1"
    val file3Folder1 = File("bpm")
    file3Folder1.name = "file3_folder1"
    val file1_folder2 = File("doc")
    file1_folder2.name = "file1_folder2"
    val file2Folder2 = File("dll")
    file2Folder2.name = "file2_folder2"
    val file3Folder2 = File("exe")
    file3Folder2.name = "file3_folder2"
    val file4Folder2 = File("exe")
    file4Folder2.name = "file4_folder2"
    //папки с файлами
    val folder1 = Folder(file1Folder1, file2Folder1, file3Folder1)
    folder1.name = "folder1"
    val folder2 = Folder(file1_folder2, file2Folder2, file3Folder2, file4Folder2)
    folder2.name = "folder2"
    //корневая папка
    val root = Folder(folder1, folder2)
    root.name = "root"
    //отображаем путь до третьего файла второй папки
    println(file3Folder2.getPathOf())
    //отображаем расширение второго файла первой папки
    println(file2Folder1.extension)
}