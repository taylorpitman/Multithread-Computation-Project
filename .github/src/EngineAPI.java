import java.util.List;

/**
 * API 3: Conceptual API within the compute engine process
 *
 * Lots of options for this!
 * Right now, because it's a conceptual boundary, we don't have to worry
 * about things like wire compatibility, so the return type can be more concrete (depending on
 * exactly what you're computing, yours might be a long, Set<Integer>, byte[], etc)
 *
 * However, there's no harm in adding a wrapper around the result (ex: SingleComputationResult);
 * you'll notice that by leaving it concrete, we're relying on the fact that this API is within
 * a single process, and therefore can have Exceptions propagate across it. There are tradeoffs here -
 * on the one hand, using a simple type simplifies both the use and implementation of the interface;
 * on the other hand, by building the 'in the same process' behavior into the design, we'll have to
 * change the return value if this component ever moves to a different process or server (foreshadowing...).
 *
 * For the input, there's also nothing wrong with using a wrapper around the int, but since we're given
 * from the system specification that it will always be an int, it's fine to just use that as well.
 */

/* Connects comp1 and comp2
 * comp1 will method request for data from the DataStorage and manages where the data will go
 * comp2 will perform the functional computations that are required to be handled by the "ComputationCoordinator" API
 * comp1 will have instance objects of the "DataStore" API that the "StorageSystem" is required to handle methods from
 */




//interface between component 1 (EngineManager) & component 2 (EngineCompute)

//EngineAPI == her ComputeEngine.java

public interface EngineAPI {

    //public EngineComputeResult compute(EngineComputeRequest request);
    //public void setDecInputs(List<Integer> decInputs);
    String compute(int value);
    int getGCD(List<Integer> decInputs);
}
// fixed