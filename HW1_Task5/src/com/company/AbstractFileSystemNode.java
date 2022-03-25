package com.company;

public abstract class AbstractFileSystemNode implements FileSystemNode{
    FileSystemNode parent;
    String name;
    public final FileSystemNode getParentElement(){
        return this.parent;
    }
    public String getElementName(){
        return name;
    }
    public final String getPathOf(){
        FileSystemNode parent = this.getParentElement();
        String result = this.getElementName();
        while(parent != null){
            result = parent.getElementName()+"/"+result;
            parent = parent.getParentElement();
        }
        return result;
    }
}
