package org.example;

public interface ComputeRequest {
    InputConfig getInputConfig();
    OutputConfig getOutputConfig();
    char getDelimeter();
}