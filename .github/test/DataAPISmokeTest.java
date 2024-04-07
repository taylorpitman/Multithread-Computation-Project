import java.io.File;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DataAPISmokeTest {

    @Test
    public void readSmokeTest() throws Exception {

        //from sample
        File file = new File("dataStoreTest.smokeTestRead.txt.temp");
        file.createNewFile();
        file.deleteOnExit();

        //InputConfig inputConfig = Mockito.mock(InputConfig.class);

        //Professor's sample
        InputConfig inputConfig = new FileInputConfig(file.getCanonicalPath());
        DataAPI dataAPI = new DataAPIImpl();

        Assert.assertEquals(false, dataAPI.read(inputConfig).iterator().hasNext());

        //Assert.assertEquals(readResult.getStatus(),DataReadResult.ReadResult.SUCCESS);

    }

    @Test
    public void writeSmokeTest() throws Exception{

        File file = new File("dataStoreTest.smokeTestWrite.txt.temp");
        file.deleteOnExit();
        OutputConfig outputConfig = new FileOutputConfig(file.getCanonicalPath());

        DataAPI dataStore = new DataAPIImpl();

        Assert.assertEquals(DataWriteResult.WriteResultStatus.SUCCESS, dataStore.appendSingleResult(outputConfig, "result", ';').getStatus());


        /*OutputConfig output = Mockito.mock(OutputConfig.class);
        String result = "";

        DataAPI dataAPI = new DataAPIImpl();

        DataWriteResult writeResult = dataAPI.appendSingleResult(output,result,' ');

        Assert.assertEquals(writeResult.getStatus(),DataWriteResult.WriteResultStatus.SUCCESS);
        */

    }
}
