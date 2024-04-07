/*in-memory implementation of DataStore API that accepts input
 * and output from our in memory inputConfigTest and outputConfigTest
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataAPITestImp implements DataAPI {

    //private List<Integer> userInputData = new ArrayList<>();;


    /*ASK PROFESSOR ABOUT THIS METHOD LOLOLOL*/
    @Override
    public Iterable<Integer> read(InputConfig input) {
        //since this is test code, we can assume its getting the right type of data.
        //for our production code we want some better input validation

        /*try{
            //reader passes new FileReader(String), where the string is the name of the file gotten from the InputConfig variable
            BufferedReader reader = new BufferedReader(new FileReader(((FileInputConfig) input).getFileName()));

            //data allows for detecting lines of data
            String data;
            while((data = reader.readLine())!=null){

                //This reads each line in the input file Location, and splits the string at delimiter locations, into a string array
                //Then, the for loop will execute for the duration of the array length, and add the integers to the List<Integer> userInputData
                //by parsing the Strings to an int
                String[] temp = reader.readLine().split(",");
                for(int j = 0;j < temp.length;j++){
                    userInputData.add(Integer.parseInt(temp[j]));
                }
                //resets the string array
                temp=null;

                reader.close(); // probably can change this logic to get next line and then close after whole files is done
            }
        }
        catch(IOException e){

            e.printStackTrace();
        }

        return userInputData;*/
        //im not sure how we would return this as she does in her test sample because we
        // are using a wrapper class.
        return ((InputConfigTestImpl)input).getInputs();

        //assuming the data transfer is successful
        //return () -> DataReadResult.ReadResult.SUCCESS;
    }

    @Override
    public DataWriteResult appendSingleResult(OutputConfig output, String result,char delimiter) {

        ((OutputConfigTestImpl)output).getOutputMutable().add(result);

        return () -> DataWriteResult.WriteResultStatus.SUCCESS;

    }

}
