import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import static org.example.Methods.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Tests {

    @Test
    @Parameters({
            "128.45.100.0, true",
            "0.0.0.0, true",
            "0.1.2.3, true",
            "256.0.0.0, false",
            "a.123.0.0, false",
            "abc.def.ghi.jkl, false",
            "0.12.134.5., false"
    })
    public void testForCheckIp(String line, boolean flag){ assertEquals(checkIp(line), flag); }

    @Test
    @Parameters({
            "e02fd0e4-00fd-090A-ca30-0d00a0038ba0, true",
            "00000000-1111-2222-3333-444444444444, true",
            "aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee, true",
            "e02fd0e400fd090Aca300d00a0038ba0, false",
            "e02fd0e4.00fd.090A.ca30.0d00a0038ba0, false",
            "e02fd0e-400fd090Aca300d00a0038ba0, false",
            "e02fd0e400fd-090A-ca30-0d00-a0038ba0, false"
    })
    public void testForCheckGuid(String line, boolean flag){ assertEquals(checkGuid(line), flag); }

    @Test
    @Parameters({
            "http://www.example.com, true",
            "https://example.com, true",
            "so-me.com, true",
            "https://www.google.com/search?q=a2wd&sxsrf=ALiCzsZagi, true",
            "port.com:1, true",
            "www.sait.com/papka#yakor, true",
            "http://a.com, false",
            "http://-aa.com, false",
            "www.sait.com/papka#, false",
            "www.sait, false"
    })
    public void testForCheckUrl(String line, boolean flag){ assertEquals(checkUrl(line), flag); }

    @Test
    @Parameters({
            "C00l_Pass, true",
            "Best_C00l_Pass, true",
            "SuperPas1, true",
            "Superpas, false",
            "superpas1, false",
            "SUPERPASS1, false",
            "Super1, false"
    })
    public void testForCheckPassword(String line, boolean flag){ assertEquals(checkPassword(line), flag); }

}
