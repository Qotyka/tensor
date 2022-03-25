package com.company;

import java.util.*;

public class Folder extends AbstractFileSystemNode{

    ArrayList<FileSystemNode> dauthers = new ArrayList<>();
    //конструктор, принимающий список дочерних элементов
    public Folder(FileSystemNode ... fileSystemNodes){
        for(FileSystemNode fileSystemNode : fileSystemNodes){
            dauthers.add(fileSystemNode);
            if(fileSystemNode instanceof AbstractFileSystemNode){
                ((AbstractFileSystemNode) fileSystemNode).parent = this;
            }
        }
    }
    //возвращаем список дочерних элементов
    public ArrayList<FileSystemNode> dauthersOf(){
        return dauthers;
    }
}
