package com.company;

public abstract class AbstractFileSystemNode implements FileSystemNode{
    FileSystemNode parent;
    public final FileSystemNode getParentElement(){
        return parent;
    }
    public String getElementName(){
        return null;
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
