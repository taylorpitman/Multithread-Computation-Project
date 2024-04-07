
public class ComputeRequestImplTest implements ComputeRequest{

    //Instance Variables

    char delimiter;
    FileOutputConfig output;
    FileInputConfig input;

    public ComputeRequestImplTest(String input, char delimiter, String output) {

        this.input = new FileInputConfig(input);
        this.delimiter = delimiter;
        this.output = new FileOutputConfig(output);


    }

    @Override
    public InputConfig getInputConfig() {
        return input;
    }

    @Override
    public OutputConfig getOutputConfig() {
        // TODO Auto-generated method stub
        return output;
    }

    @Override
    public char getDelimeter() {
        // TODO Auto-generated method stub
        return delimiter;
    }
}