package org.example;
import java.util.List;


public interface EngineAPI {

    //public EngineComputeResult compute(EngineComputeRequest request);
    //public void setDecInputs(List<Integer> decInputs);
    String compute(int value);
    int getGCD(List<Integer> decInputs);
}
