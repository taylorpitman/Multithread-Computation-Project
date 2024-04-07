import org.example.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.mockito.Mockito;


public class ComputeAPISmokeTest {

    @Test
    public void smokeTest() {
        DataAPIImpl dataAPI = Mockito.mock(DataAPIImpl.class);

        ComputeRequestImplTest request = Mockito.mock(ComputeRequestImplTest.class);
        EngineCompute engineAPI = Mockito.mock(EngineCompute.class);

        ComputeAPI computeAPI = new EngineManager(dataAPI, engineAPI);
        ComputeResult result =  computeAPI.compute(request);
        Assert.assertEquals(result.getStatus(), ComputeResult.ComputeResultStatus.SUCCESS);


    }

}
//done