interface FileSystemNode {
    fun getParentElement(): FileSystemNode?
    fun getElementName(): String
    fun getPathOf(): String
}
