
/**
 * API 2: Process-level API between the compute engine and the layer that knows how to read/write
 * user data.
 *
 * Here, I've left the read interface fairly specific - it's returning a stream of integers (you could also
 * use the Stream<Integer> type). However, especially if you aren't sure how you'll end up wanting to model
 * the arbitrarily-large number of integer inputs, this is a great place to use an interface; DataStoreReadResult
 * lets you decide how to handle that later (and there are lots of options! Pagination is a common way to deal with
 * very large inputs).
 *
 * For writing the output, this design accepts one result at a time, and gradually builds up the output.
 * Other options are to again use pagination, provide a stream/iterable of results, or delay that design
 * decision by using a generic interface (WritableComputationValue or similar).
 *
 * The WriteResult at the moment just returns an error code - because this is a process
 * boundary, we can't rely on Java Exceptions to propagate across it, so the error values must
 * be handled with the return type
 */

/*	StorageSystem will be required to handle the methods that are
 * contained in this interface
 *
 *
 */


public interface DataAPI {

    Iterable<Integer> read(InputConfig input);
    DataWriteResult appendSingleResult(OutputConfig output, String result, char delimiter);
}