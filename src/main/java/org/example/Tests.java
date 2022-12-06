package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.example.Methods.*;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void correctTestIp1() { assertTrue(checkIp("128.45.100.0")); }
    @Test
    public void correctTestIp2() { assertTrue(checkIp("0.0.0.0")); }
    @Test
    public void correctTestIp3() { assertTrue(checkIp("0.1.2.3")); }
    @Test
    public void wrongTestIp1() { assertFalse(checkIp("256.0.0.0")); }
    @Test
    public void wrongTestIp2() { assertFalse(checkIp("a.123.0.0")); }
    @Test
    public void wrongTestIp3() { assertFalse(checkIp("0.12.134.5.")); }
    @Test
    public void wrongTestIp4() { assertFalse(checkIp("abc.def.ghi.jkl")); }
    @Test
    public void correctTestGuid1() { assertTrue(checkGuid("e02fd0e4-00fd-090A-ca30-0d00a0038ba0")); }
    @Test
    public void correctTestGuid2() { assertTrue(checkGuid("002fd0e4-00fd-090A-ca30-0d00a0038ba0")); }
    @Test
    public void correctTestGuid3() { assertTrue(checkGuid("00000000-1111-2222-3333-444444444444")); }
    @Test
    public void correctTestGuid4() { assertTrue(checkGuid("aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")); }
    @Test
    public void wrongTestGuid1() { assertFalse(checkGuid("e02fd0e400fd090Aca300d00a0038ba0")); }
    @Test
    public void wrongTestGuid2() { assertFalse(checkGuid("e02fd0e-400fd090Aca300d00a0038ba0")); }
    @Test
    public void wrongTestGuid3() { assertFalse(checkGuid("e02fd0e4.00fd.090A.ca30.0d00a0038ba0")); }
    @Test
    public void wrongTestGuid4() { assertFalse(checkGuid("e02fd0e400fd-090A-ca30-0d00-a0038ba0")); }
    @Test
    public void correctTestUrl1() { assertTrue(checkUrl("http://www.example.com")); }
    @Test
    public void correctTestUrl2() { assertTrue(checkUrl("https://example.com")); }
    @Test
    public void correctTestUrl3() { assertTrue(checkUrl("amanda.com")); }
    @Test
    public void correctTestUrl4() { assertTrue(checkUrl("so-me.com")); }
    @Test
    public void correctTestUrl5() { assertTrue(checkUrl("https://www.google.com/search?q=a2wd&sxsrf=ALiCzsZagi")); }
    @Test
    public void correctTestUrl6() { assertTrue(checkUrl("port.com:1")); }
    @Test
    public void correctTestUrl7() { assertTrue(checkUrl("www.sait.com/papka#yakor")); }
    @Test
    public void wrongTestUrl1() { assertFalse(checkUrl("Just Text, http://a.com")); }
    @Test
    public void wrongTestUrl2() { assertFalse(checkUrl("http://a.com")); }
    @Test
    public void wrongTestUrl3() { assertFalse(checkUrl("http://-aa.com")); }
    @Test
    public void wrongTestUrl4() { assertFalse(checkUrl("http://a.com:")); }
    @Test
    public void wrongTestUrl5() { assertFalse(checkUrl("www.sait.com/papka#")); }
    @Test
    public void wrongTestUrl6() { assertFalse(checkUrl("www.sait")); }
    @Test
    public void correctTestPassword1() { assertTrue(checkPassword("C00l_Pass")); }
    @Test
    public void correctTestPassword2() { assertTrue(checkPassword("Best_C00l_Pass")); }
    @Test
    public void correctTestPassword5() { assertTrue(checkPassword("SuperPas1")); }
    @Test
    public void wrongTestPassword1() { assertFalse(checkPassword("Superpas")); }
    @Test
    public void wrongTestPassword2() { assertFalse(checkPassword("superpas1")); }
    @Test
    public void wrongTestPassword3() { assertFalse(checkPassword("SUPERPASS1")); }
    @Test
    public void wrongTestPassword4() { assertFalse(checkPassword("Super1")); }

}
