package com.company;

import java.util.*;

public class Folder extends AbstractFileSystemNode{
    public Folder(FileSystemNode ... fileSystemNodes){
        ArrayList<FileSystemNode> dauthers = new ArrayList<>();
        for(FileSystemNode fileSystemNode : fileSystemNodes){
            //
            dauthers.add(fileSystemNode);
        }
    }
}
