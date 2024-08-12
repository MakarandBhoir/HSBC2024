import com.hsbc.service.ProjectService;
import org.junit.Assert;
import org.junit.Test;

public class TestProjectService {
    @Test
    public void testSumReturnsSumOfTwoNumbers(){
        ProjectService obj = new ProjectService();
        int result = obj.sum(1001, 100);
        Assert.assertEquals(1101, result);
        Assert.assertEquals(3, obj.sum(1, 2));
        Assert.assertEquals(0, obj.sum(0, 0));
    }
    @Test
    public void testSumWhichReturnsSumOfNaturalNumbers(){
        ProjectService obj = new ProjectService();
        int result = obj.sum(10);
        Assert.assertEquals(55, result);
        Assert.assertEquals(15, obj.sum(5));
    }

}
