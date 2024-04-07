

public interface ComputeResult {

    static ComputeResult SUCCESS = () -> ComputeResultStatus.SUCCESS;
    static ComputeResult FAILURE = () -> ComputeResultStatus.FAILURE;

    ComputeResultStatus getStatus();

    public static enum ComputeResultStatus {
        SUCCESS,
        FAILURE,
        NOT_AN_INTEGER;
    }

}