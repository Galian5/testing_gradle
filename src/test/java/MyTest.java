import com.example.helloworld.HelloWorld;
import org.junit.Assert;
import org.junit.Test;
/**import sun.jvm.hotspot.HelloWorld; */

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MyTest {
    @Test
    public void name () throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        HelloWorld.print(new PrintStream(out));
        String s = out.toString();
        Assert.assertEquals( "Hello, World", s);
    }


}
