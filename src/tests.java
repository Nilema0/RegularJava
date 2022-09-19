import org.junit.Assert;
import org.junit.Test;

public class tests {

    @Test
    public void firstTest(){
        Assert.assertTrue(metods.Task1("128.45.100.0"));
    }

    @Test
    public void Test2(){
        Assert.assertTrue(metods.Task1("0.0.0.0"));
    }
    @Test
    public void Test3(){
        Assert.assertTrue(metods.Task1("0.13.15.200"));
    }
    @Test
    public void Test4(){
        Assert.assertTrue(metods.Task1("240.239.238.237"));
    }
    @Test
    public void Test5(){
        Assert.assertTrue(metods.Task1("100.101.102.103"));
    }
    @Test
    public void Test6(){
        Assert.assertTrue(metods.Task1("0.1.2.3"));
    }

    @Test
    public void Test7(){
        Assert.assertFalse(metods.Task1("256.0.0.0"));
    }
    @Test
    public void Test8(){
        Assert.assertFalse(metods.Task1("a.123.0.0"));
    }
    @Test
    public void Test9(){
        Assert.assertFalse(metods.Task1("0.12.134.5."));
    }
    @Test
    public void Test10(){
        Assert.assertFalse(metods.Task1("abc.def.ghi.jkl"));
    }
    @Test
    public void Test11(){
        Assert.assertFalse(metods.Task1("256.255.254.253"));
    }
    @Test
    public void Test12(){
        Assert.assertFalse(metods.Task1("12.13.14"));
    }
    @Test
    public void Test13(){
        Assert.assertTrue(metods.Task2("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
    }
    @Test
    public void Test14(){
        Assert.assertTrue(metods.Task2("002fd0e4-00fd-090A-ca30-0d00a0038ba0"));
    }
    @Test
    public void Test15(){
        Assert.assertTrue(metods.Task2("e02fd0e4-00fd-AA0A-ca30-0d00a0038ba0"));
    }
    @Test
    public void Test16(){
        Assert.assertTrue(metods.Task2("00000000-1111-2222-3333-444444444444"));
    }
    @Test
    public void Test17(){
        Assert.assertTrue(metods.Task2("AAAAAAAA-BBBB-CCCC-DDDD-EEEEEEEEEEEE"));
    }
    @Test
    public void Test18(){
        Assert.assertTrue(metods.Task2("aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee"));
    }
    @Test
    public void Test19(){
        Assert.assertFalse(metods.Task2("e02fd0e400fd090Aca300d00a0038ba0"));
    }
    @Test
    public void Test20(){
        Assert.assertFalse(metods.Task2("e02fd0e-400fd090Aca300d00a0038ba0"));
    }
    @Test
    public void Test21(){
        Assert.assertFalse(metods.Task2("e02fd0e4-00fo-090A-ca30-0d00a0038ba0"));
    }
    @Test
    public void Test22(){
        Assert.assertFalse(metods.Task2("e02fd0e4.00fd.090A.ca30.0d00a0038ba0"));
    }
    @Test
    public void Test23(){
        Assert.assertFalse(metods.Task2("0d00a0038ba0"));
    }
    @Test
    public void Test24(){
        Assert.assertFalse(metods.Task2("e02fd0e400fd-090A-ca30-0d00-a0038ba0"));
    }
    @Test
    public void Test25(){
        Assert.assertTrue(metods.Task3("http://www.example.com"));
    }
    @Test
    public void Test26(){
        Assert.assertTrue(metods.Task3("https://example.com"));
    }
    @Test
    public void Test27(){
        Assert.assertTrue(metods.Task3("amanda.com"));
    }
    @Test
    public void Test28(){
        Assert.assertTrue(metods.Task3("so-me.com"));
    }
    @Test
    public void Test29(){
        Assert.assertTrue(metods.Task3("https://www.google.com/search?q=a2wd&sxsrf=ALiCzsZagi"));
    }
    @Test
    public void Test30(){
        Assert.assertTrue(metods.Task3("port.com:1"));
    }
    @Test
    public void Test31(){
        Assert.assertTrue(metods.Task3("www.sait.com/papka#yakor"));
    }
    @Test
    public void Test32(){
        Assert.assertFalse(metods.Task3("Just Text, http://a.com"));
    }
    @Test
    public void Test33(){
        Assert.assertFalse(metods.Task3("http://a.com"));
    }
    @Test
    public void Test34(){
        Assert.assertFalse(metods.Task3("http://-aa.com"));
    }
    @Test
    public void Test35(){
        Assert.assertFalse(metods.Task3("http://a.com:"));
    }
    @Test
    public void Test36(){
        Assert.assertFalse(metods.Task3("www.sait.com/papka#"));
    }
    @Test
    public void Test37(){
        Assert.assertFalse(metods.Task3("www.sait.com/papka?"));
    }
    @Test
    public void Test38(){
        Assert.assertFalse(metods.Task3("www.sait"));
    }
    @Test
    public void Test39(){
        Assert.assertTrue(metods.Task4("C00l_Pass"));
    }
    @Test
    public void Test40(){
        Assert.assertTrue(metods.Task4("C00l_Pass23"));
    }
    @Test
    public void Test41(){
        Assert.assertTrue(metods.Task4("new_C00l_Pass"));
    }
    @Test
    public void Test42(){
        Assert.assertTrue(metods.Task4("Best_C00l_Pass"));
    }
    @Test
    public void Test43(){
        Assert.assertTrue(metods.Task4("SuperPas1"));
    }
    @Test
    public void Test44(){
        Assert.assertTrue(metods.Task4("SuperPas1_forever"));
    }
    @Test
    public void Test45(){
        Assert.assertFalse(metods.Task4("Superpas"));
    }
    @Test
    public void Test46(){
        Assert.assertFalse(metods.Task4("superpas1"));
    }
    @Test
    public void Test47(){
        Assert.assertFalse(metods.Task4("SUPERPASS1"));
    }
    @Test
    public void Test48(){
        Assert.assertFalse(metods.Task4("Super1"));
    }
    @Test
    public void Test49(){
        Assert.assertFalse(metods.Task4("COO1"));
    }
    @Test
    public void Test50(){
        Assert.assertFalse(metods.Task4("Coll-password"));
    }
}
