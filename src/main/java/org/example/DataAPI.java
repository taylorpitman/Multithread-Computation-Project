package org.example;

public interface DataAPI {

    Iterable<Integer> read(InputConfig input);
    DataWriteResult appendSingleResult(OutputConfig output, String result, char delimiter);
}
