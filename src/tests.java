import org.junit.Assert;
import org.junit.Test;

public class tests {

    @Test
    public void CorrectTestIp1(){
        Assert.assertTrue(metods.CheckIp("128.45.100.0"));
    }

    @Test
    public void CorrectTestIp2(){
        Assert.assertTrue(metods.CheckIp("0.0.0.0"));
    }
    @Test
    public void CorrectTestIp3(){
        Assert.assertTrue(metods.CheckIp("0.13.15.200"));
    }
    @Test
    public void CorrectTestIp4(){
        Assert.assertTrue(metods.CheckIp("240.239.238.237"));
    }
    @Test
    public void CorrectTestIp5(){
        Assert.assertTrue(metods.CheckIp("100.101.102.103"));
    }
    @Test
    public void CorrectTestIp6(){
        Assert.assertTrue(metods.CheckIp("0.1.2.3"));
    }

    @Test
    public void WrongTestIp1(){
        Assert.assertFalse(metods.CheckIp("256.0.0.0"));
    }
    @Test
    public void WrongTestIp2(){
        Assert.assertFalse(metods.CheckIp("a.123.0.0"));
    }
    @Test
    public void WrongTestIp3(){
        Assert.assertFalse(metods.CheckIp("0.12.134.5."));
    }
    @Test
    public void WrongTestIp4(){

        Assert.assertFalse(metods.CheckIp("abc.def.ghi.jkl"));
    }
    @Test
    public void WrongTestIp5(){

        Assert.assertFalse(metods.CheckIp("256.255.254.253"));
    }
    @Test
    public void WrongTestIp6(){
        Assert.assertFalse(metods.CheckIp("12.13.14"));
    }
    @Test
    public void CorrectTestGUID1(){
        Assert.assertTrue(metods.CheckGuid("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
    }
    @Test
    public void CorrectTestGUID2(){
        Assert.assertTrue(metods.CheckGuid("002fd0e4-00fd-090A-ca30-0d00a0038ba0"));
    }
    @Test
    public void CorrectTestGUID3(){
        Assert.assertTrue(metods.CheckGuid("e02fd0e4-00fd-AA0A-ca30-0d00a0038ba0"));
    }
    @Test
    public void CorrectTestGUID4(){
        Assert.assertTrue(metods.CheckGuid("00000000-1111-2222-3333-444444444444"));
    }
    @Test
    public void CorrectTestGUID5(){
        Assert.assertTrue(metods.CheckGuid("AAAAAAAA-BBBB-CCCC-DDDD-EEEEEEEEEEEE"));
    }
    @Test
    public void CorrectTestGUID6(){
        Assert.assertTrue(metods.CheckGuid("aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee"));
    }
    @Test
    public void WrongTestGUID1(){
        Assert.assertFalse(metods.CheckGuid("e02fd0e400fd090Aca300d00a0038ba0"));
    }
    @Test
    public void WrongTestGUID2(){
        Assert.assertFalse(metods.CheckGuid("e02fd0e-400fd090Aca300d00a0038ba0"));
    }
    @Test
    public void WrongTestGUID3(){
        Assert.assertFalse(metods.CheckGuid("e02fd0e4-00fo-090A-ca30-0d00a0038ba0"));
    }
    @Test
    public void WrongTestGUID4(){
        Assert.assertFalse(metods.CheckGuid("e02fd0e4.00fd.090A.ca30.0d00a0038ba0"));
    }
    @Test
    public void WrongTestGUID5(){
        Assert.assertFalse(metods.CheckGuid("0d00a0038ba0"));
    }
    @Test
    public void WrongTestGUID6(){
        Assert.assertFalse(metods.CheckGuid("e02fd0e400fd-090A-ca30-0d00-a0038ba0"));
    }
    @Test
    public void CorrectTestURL1(){
        Assert.assertTrue(metods.CheckUrl("http://www.example.com"));
    }
    @Test
    public void CorrectTestURL2(){
        Assert.assertTrue(metods.CheckUrl("https://example.com"));
    }
    @Test
    public void CorrectTestURL3(){
        Assert.assertTrue(metods.CheckUrl("amanda.com"));
    }
    @Test
    public void CorrectTestURL4(){
        Assert.assertTrue(metods.CheckUrl("so-me.com"));
    }
    @Test
    public void CorrectTestURL5(){
        Assert.assertTrue(metods.CheckUrl("https://www.google.com/search?q=a2wd&sxsrf=ALiCzsZagi"));
    }
    @Test
    public void CorrectTestURL6(){
        Assert.assertTrue(metods.CheckUrl("port.com:1"));
    }
    @Test
    public void CorrectTestURL7(){
        Assert.assertTrue(metods.CheckUrl("www.sait.com/papka#yakor"));
    }
    @Test
    public void WrongTestURL1(){
        Assert.assertFalse(metods.CheckUrl("Just Text, http://a.com"));
    }
    @Test
    public void WrongTestURL2(){
        Assert.assertFalse(metods.CheckUrl("http://a.com"));
    }
    @Test
    public void WrongTestURL3(){
        Assert.assertFalse(metods.CheckUrl("http://-aa.com"));
    }
    @Test
    public void WrongTestURL4(){
        Assert.assertFalse(metods.CheckUrl("http://a.com:"));
    }
    @Test
    public void WrongTestURL5(){
        Assert.assertFalse(metods.CheckUrl("www.sait.com/papka#"));
    }
    @Test
    public void WrongTestURL6(){
        Assert.assertFalse(metods.CheckUrl("www.sait.com/papka?"));
    }
    @Test
    public void WrongTestURL7(){
        Assert.assertFalse(metods.CheckUrl("www.sait"));
    }
    @Test
    public void CorrectTestPassword1(){
        Assert.assertTrue(metods.CheckPassword("C00l_Pass"));
    }
    @Test
    public void CorrectTestPassword2(){
        Assert.assertTrue(metods.CheckPassword("C00l_Pass23"));
    }
    @Test
    public void CorrectTestPassword3(){
        Assert.assertTrue(metods.CheckPassword("new_C00l_Pass"));
    }
    @Test
    public void CorrectTestPassword4(){
        Assert.assertTrue(metods.CheckPassword("Best_C00l_Pass"));
    }
    @Test
    public void CorrectTestPassword5(){
        Assert.assertTrue(metods.CheckPassword("SuperPas1"));
    }
    @Test
    public void CorrectTestPassword6(){
        Assert.assertTrue(metods.CheckPassword("SuperPas1_forever"));
    }
    @Test
    public void WrongTestPassword1(){
        Assert.assertFalse(metods.CheckPassword("Superpas"));
    }
    @Test
    public void WrongTestPassword2(){
        Assert.assertFalse(metods.CheckPassword("superpas1"));
    }
    @Test
    public void WrongTestPassword3(){
        Assert.assertFalse(metods.CheckPassword("SUPERPASS1"));
    }
    @Test
    public void WrongTestPassword4(){
        Assert.assertFalse(metods.CheckPassword("Super1"));
    }
    @Test
    public void WrongTestPassword5(){
        Assert.assertFalse(metods.CheckPassword("COO1"));
    }
    @Test
    public void WrongTestPassword6(){
        Assert.assertFalse(metods.CheckPassword("Coll-password"));
    }
}
