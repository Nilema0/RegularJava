import org.junit.Assert;
import org.junit.Test;

public class tests {

    @Test
    public void firstTest(){
        Assert.assertTrue(metods.Task1("128.45.100.0"));
    }
    @Test
    public void 2Test(){
        Assert.assertTrue(metods.Task1("0.0.0.0"));
    }
    @Test
    public void 3Test(){
        Assert.assertTrue(metods.Task1("0.13.15.200"));
    }
    @Test
    public void 4Test(){
        Assert.assertTrue(metods.Task1("240.239.238.237"));
    }
    @Test
    public void 5Test(){
        Assert.assertTrue(metods.Task1("100.101.102.103"));
    }
    @Test
    public void 6Test(){
        Assert.assertTrue(metods.Task1("0.1.2.3"));
    }
    
}
