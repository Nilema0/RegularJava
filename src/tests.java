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
}
