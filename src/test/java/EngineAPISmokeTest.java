import org.example.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class EngineAPISmokeTest {

    @Test
    public void smokeTest() {

        EngineAPI engine = new EngineCompute();

        //"0x" represents the tag for hexidecimal notation so you
        // know what kind of number you are looking at
        Assert.assertEquals("0xA", engine.compute(10));

    }

}
