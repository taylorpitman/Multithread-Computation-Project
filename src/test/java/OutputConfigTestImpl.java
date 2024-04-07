import org.example.*;

import java.util.ArrayList;
import java.util.List;

public class OutputConfigTestImpl implements OutputConfig {

    private final List<String> output = new ArrayList<>();
    //private List<String> output = new ArrayList<>();

    //this is sketchy (we're allowing another class to mutate internal state)
    //aka why we put MUTABLE in this method name to let other people reading our code know
    public List<String> getOutputMutable() {
        return output;
    }




}
