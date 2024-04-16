import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
 
public class MyMathUtilsTest {
 
    @Test
    public void testAddition() {
        MyMathUtils mathUtils = new MyMathUtils();
        int result = mathUtils.add(2, 3);
        assertEquals(5, result);
    }
}
