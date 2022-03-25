package com.company;

public interface FileSystemNode {
    FileSystemNode getParentElement();
    String getElementName();
    String getPathOf();
}
