abstract class AbstractFileSystemNode : FileSystemNode {
    var parent: FileSystemNode? = null
    var name: String = ""

    //нельзя переопределить
    final override fun getParentElement(): FileSystemNode? {
        return parent
    }

    override fun getElementName(): String {
        return name
    }

    //нельзя переопределить
    final override fun getPathOf(): String {
        var parent = getParentElement()
        var result = getElementName()
        while (parent != null) {
            result = parent.getElementName() + "/" + result
            parent = parent.getParentElement()
        }
        return result
    }
}