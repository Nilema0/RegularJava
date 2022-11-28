package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void correctTestIp1() {
        Assert.assertTrue(Methods.checkIp("128.45.100.0"));
    }

    @Test
    public void correctTestIp2() {
        Assert.assertTrue(Methods.checkIp("0.0.0.0"));
    }

    @Test
    public void correctTestIp3() {
        Assert.assertTrue(Methods.checkIp("0.13.15.200"));
    }

    @Test
    public void correctTestIp4() {
        Assert.assertTrue(Methods.checkIp("240.239.238.237"));
    }

    @Test
    public void CorrectTestIp5() {
        Assert.assertTrue(Methods.checkIp("100.101.102.103"));
    }

    @Test
    public void correctTestIp6() {
        Assert.assertTrue(Methods.checkIp("0.1.2.3"));
    }

    @Test
    public void wrongTestIp1() {
        Assert.assertFalse(Methods.checkIp("256.0.0.0"));
    }

    @Test
    public void wrongTestIp2() {
        Assert.assertFalse(Methods.checkIp("a.123.0.0"));
    }

    @Test
    public void wrongTestIp3() {
        Assert.assertFalse(Methods.checkIp("0.12.134.5."));
    }

    @Test
    public void wrongTestIp4() {

        Assert.assertFalse(Methods.checkIp("abc.def.ghi.jkl"));
    }

    @Test
    public void wrongTestIp5() {

        Assert.assertFalse(Methods.checkIp("256.255.254.253"));
    }

    @Test
    public void wrongTestIp6() {
        Assert.assertFalse(Methods.checkIp("12.13.14"));
    }

    @Test
    public void correctTestGuid1() {
        Assert.assertTrue(Methods.checkGuid("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
    }

    @Test
    public void correctTestGuid2() {
        Assert.assertTrue(Methods.checkGuid("002fd0e4-00fd-090A-ca30-0d00a0038ba0"));
    }

    @Test
    public void correctTestGuid3() {
        Assert.assertTrue(Methods.checkGuid("e02fd0e4-00fd-AA0A-ca30-0d00a0038ba0"));
    }

    @Test
    public void correctTestGuid4() {
        Assert.assertTrue(Methods.checkGuid("00000000-1111-2222-3333-444444444444"));
    }

    @Test
    public void correctTestGuid5() {
        Assert.assertTrue(Methods.checkGuid("AAAAAAAA-BBBB-CCCC-DDDD-EEEEEEEEEEEE"));
    }

    @Test
    public void correctTestGuid6() {
        Assert.assertTrue(Methods.checkGuid("aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee"));
    }

    @Test
    public void wrongTestGuid1() {
        Assert.assertFalse(Methods.checkGuid("e02fd0e400fd090Aca300d00a0038ba0"));
    }

    @Test
    public void wrongTestGuid2() {
        Assert.assertFalse(Methods.checkGuid("e02fd0e-400fd090Aca300d00a0038ba0"));
    }

    @Test
    public void wrongTestGuid3() {
        Assert.assertFalse(Methods.checkGuid("e02fd0e4-00fo-090A-ca30-0d00a0038ba0"));
    }

    @Test
    public void wrongTestGuid4() {
        Assert.assertFalse(Methods.checkGuid("e02fd0e4.00fd.090A.ca30.0d00a0038ba0"));
    }

    @Test
    public void wrongTestGuid5() {
        Assert.assertFalse(Methods.checkGuid("0d00a0038ba0"));
    }

    @Test
    public void wrongTestGuid6() {
        Assert.assertFalse(Methods.checkGuid("e02fd0e400fd-090A-ca30-0d00-a0038ba0"));
    }

    @Test
    public void correctTestUrl1() {
        Assert.assertTrue(Methods.checkUrl("http://www.example.com"));
    }

    @Test
    public void correctTestUrl2() {
        Assert.assertTrue(Methods.checkUrl("https://example.com"));
    }

    @Test
    public void correctTestUrl3() {
        Assert.assertTrue(Methods.checkUrl("amanda.com"));
    }

    @Test
    public void correctTestUrl4() {
        Assert.assertTrue(Methods.checkUrl("so-me.com"));
    }

    @Test
    public void correctTestUrl5() {
        Assert.assertTrue(Methods.checkUrl("https://www.google.com/search?q=a2wd&sxsrf=ALiCzsZagi"));
    }

    @Test
    public void correctTestUrl6() {
        Assert.assertTrue(Methods.checkUrl("port.com:1"));
    }

    @Test
    public void correctTestUrl7() {
        Assert.assertTrue(Methods.checkUrl("www.sait.com/papka#yakor"));
    }

    @Test
    public void wrongTestUrl1() {
        Assert.assertFalse(Methods.checkUrl("Just Text, http://a.com"));
    }

    @Test
    public void wrongTestUrl2() {
        Assert.assertFalse(Methods.checkUrl("http://a.com"));
    }

    @Test
    public void wrongTestUrl3() {
        Assert.assertFalse(Methods.checkUrl("http://-aa.com"));
    }

    @Test
    public void wrongTestUrl4() {
        Assert.assertFalse(Methods.checkUrl("http://a.com:"));
    }

    @Test
    public void wrongTestUrl5() {
        Assert.assertFalse(Methods.checkUrl("www.sait.com/papka#"));
    }

    @Test
    public void wrongTestUrl6() {
        Assert.assertFalse(Methods.checkUrl("www.sait.com/papka?"));
    }

    @Test
    public void wrongTestUrl7() {
        Assert.assertFalse(Methods.checkUrl("www.sait"));
    }

    @Test
    public void correctTestPassword1() {
        Assert.assertTrue(Methods.checkPassword("C00l_Pass"));
    }

    @Test
    public void correctTestPassword2() {
        Assert.assertTrue(Methods.checkPassword("C00l_Pass23"));
    }

    @Test
    public void correctTestPassword3() {
        Assert.assertTrue(Methods.checkPassword("new_C00l_Pass"));
    }

    @Test
    public void correctTestPassword4() {
        Assert.assertTrue(Methods.checkPassword("Best_C00l_Pass"));
    }

    @Test
    public void correctTestPassword5() {
        Assert.assertTrue(Methods.checkPassword("SuperPas1"));
    }

    @Test
    public void correctTestPassword6() {
        Assert.assertTrue(Methods.checkPassword("SuperPas1_forever"));
    }

    @Test
    public void wrongTestPassword1() {
        Assert.assertFalse(Methods.checkPassword("Superpas"));
    }

    @Test
    public void wrongTestPassword2() {
        Assert.assertFalse(Methods.checkPassword("superpas1"));
    }

    @Test
    public void wrongTestPassword3() {
        Assert.assertFalse(Methods.checkPassword("SUPERPASS1"));
    }

    @Test
    public void wrongTestPassword4() {
        Assert.assertFalse(Methods.checkPassword("Super1"));
    }

    @Test
    public void wrongTestPassword5() {
        Assert.assertFalse(Methods.checkPassword("COO1"));
    }

    @Test
    public void wrongTestPassword6() {
        Assert.assertFalse(Methods.checkPassword("Coll-password"));
    }
}
