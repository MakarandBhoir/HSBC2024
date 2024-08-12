import com.hsbc.service.ProjectService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProjectService2 {
    ProjectService obj = null;
    @Before
    public void setUp(){
        obj = new ProjectService();
    }
    @After
    public void tearDown(){
        obj = null;
    }
    @Test
    public void testSumReturnsSumOfTwoNumbers(){
        int result = obj.sum(1001, 100);
        Assert.assertEquals(1101, result);
        Assert.assertEquals(3, obj.sum(1, 2));
        Assert.assertEquals(0, obj.sum(0, 0));
    }
    @Test
    public void testSumWhichReturnsSumOfNaturalNumbers(){
        int result = obj.sum(10);
        Assert.assertEquals(55, result);
        Assert.assertEquals(15, obj.sum(5));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSumShouldThrowIllegalArgumentException(){
        int result = obj.sum(1, -2);
    }
}
