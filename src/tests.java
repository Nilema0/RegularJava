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
}
