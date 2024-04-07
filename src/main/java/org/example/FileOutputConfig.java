package org.example;

public class FileOutputConfig implements OutputConfig {

    private final String fileName;

    public FileOutputConfig(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
