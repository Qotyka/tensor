class Folder(vararg fileSystemNodes: FileSystemNode) : AbstractFileSystemNode() {
    var children = ArrayList<FileSystemNode>()
    init {
        for (fileSystemNode in fileSystemNodes) {
            children.add(fileSystemNode)
            if (fileSystemNode is AbstractFileSystemNode) {
                fileSystemNode.parent = this
            }
        }
    }

    //возвращаем список дочерних элементов
    fun childrenOf(): ArrayList<FileSystemNode> {
        return children
    }
}
