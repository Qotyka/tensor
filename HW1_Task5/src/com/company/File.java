package com.company;

public class File extends AbstractFileSystemNode{
    String extention = "";
    //переопределям метод возвращения имени файла
    public String getElementName(){
        return name+"."+extention;
    }
    public String getExtention(){
        return extention;
    }
}
