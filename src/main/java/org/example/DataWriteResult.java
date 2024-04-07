package org.example;

public interface DataWriteResult {

    static DataWriteResult SUCCESS = () -> WriteResultStatus.SUCCESS;
    static DataWriteResult FAILURE = () -> WriteResultStatus.FAILURE;

    WriteResultStatus getStatus();

    public static enum WriteResultStatus {
        SUCCESS,
        FAILURE;
    }
}
