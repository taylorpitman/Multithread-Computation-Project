package org.example;

public class FileInputConfig implements InputConfig{

    private final String fileName;

    public FileInputConfig(String fileName){
        this.fileName  = fileName;
    }

    public String getFileName(){
        return fileName;
    }
}
