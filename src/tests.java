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

}
