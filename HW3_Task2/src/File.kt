class File(val extension: String) : AbstractFileSystemNode() {

    //переопределям метод возвращения имени файла
    override fun getElementName(): String {
        return "$name.$extension"
    }
}