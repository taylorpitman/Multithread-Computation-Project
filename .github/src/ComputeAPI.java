/**
 * API 1: A network API between the user and the compute engine
 *
 * This design uses a single request wrapper to handle the various pieces of
 * information the user
 * needs to provide.
 *
 * Other options include specifying all pieces as parameters (likely using
 * method
 * overloading to handle the default delimiter), or building up a
 * 'ComputationJobSpec' by having the
 * user provide each piece with a separate method (this is similar to the
 * Builder pattern we talked about
 * for immutable objects).
 */

/*
 * Acts as a task list that "ComputeEngine" must be able to handle
 *
 * User / website will use the methods in this list by referencing the name of
 * this class and calling the method
 *
 *
 */

//ComputeAPI == sample ComputationCoordinator

public interface ComputeAPI {
    ComputeResult compute(ComputeRequest request);
}
