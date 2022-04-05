fun main(args: Array<String>) {
    //несколько файлов
    val file1Folder1 = File()
    file1Folder1.name = "file1_folder1"
    file1Folder1.extension = "exe"
    val file2Folder1 = File()
    file2Folder1.name = "file2_folder1"
    file2Folder1.extension = "txt"
    val file3Folder1 = File()
    file3Folder1.name = "file3_folder1"
    file3Folder1.extension = "bpm"
    val file1_folder2 = File()
    file1_folder2.name = "file1_folder2"
    file1_folder2.extension = "doc"
    val file2Folder2 = File()
    file2Folder2.name = "file2_folder2"
    file2Folder2.extension = "dll"
    val file3Folder2 = File()
    file3Folder2.name = "file3_folder2"
    file3Folder2.extension = "exe"
    val file4Folder2 = File()
    file4Folder2.name = "file4_folder2"
    file4Folder2.extension = "exe"
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