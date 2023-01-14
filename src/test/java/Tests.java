import static org.example.Methods.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Tests {

    @ParameterizedTest
    @ValueSource(strings = {"128.45.100.0", "0.0.0.0", "0.1.2.3"})
    void trueTestForCheckIp(String line) {
        assertTrue(checkIp(line));
    }

    @ParameterizedTest
    @ValueSource(strings = {"256.0.0.0", "a.123.0.0", "abc.def.ghi.jkl", "0.12.134.5."})
    void falseTestForCheckIp(String line) {
        assertFalse(checkIp(line));
    }

    @ParameterizedTest
    @ValueSource(strings = {"e02fd0e4-00fd-090A-ca30-0d00a0038ba0",
            "00000000-1111-2222-3333-444444444444",
            "aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee"})
    void trueTestForCheckGuid(String line) {
        assertTrue(checkGuid(line));
    }

    @ParameterizedTest
    @ValueSource(strings = {"e02fd0e400fd090Aca300d00a0038ba0",
            "e02fd0e4.00fd.090A.ca30.0d00a0038ba0",
            "e02fd0e-400fd090Aca300d00a0038ba0",
            "e02fd0e400fd-090A-ca30-0d00-a0038ba0"})
    void falseTestForCheckGuid(String line) {
        assertFalse(checkGuid(line));
    }

    @ParameterizedTest
    @ValueSource(strings = {"http://www.example.com",
            "https://example.com",
            "so-me.com",
            "https://www.google.com/search?q=a2wd&sxsrf=ALiCzsZagi",
            "port.com:1",
            "www.sait.com/papka#yakor"})
    void trueTestForCheckUrl(String line) {
        assertTrue(checkUrl(line));
    }

    @ParameterizedTest
    @ValueSource(strings = {"http://a.com",
            "http://-aa.com",
            "www.sait.com/papka#",
            "www.sait"})
    void falseTestForCheckUrl(String line) {
        assertFalse(checkUrl(line));
    }

    @ParameterizedTest
    @ValueSource(strings = {"C00l_Pass",
            "Best_C00l_Pass",
            "SuperPas1"})
    void trueTestForCheckPassword(String line) {
        assertTrue(checkPassword(line));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Superpas",
            "superpas1",
            "SUPERPASS1",
            "Super1"})
    void falseTestForCheckPassword(String line) {
        assertFalse(checkPassword(line));
    }
}
