class File: AbstractFileSystemNode() {
    var extension: String = ""

    //переопределям метод возвращения имени файла
    override fun getElementName(): String {
        return "$name.$extension"
    }
}