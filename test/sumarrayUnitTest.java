import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sumarray.Sumarray;
/**
 *
 * @author Adison
 */
public class sumarrayUnitTest {
    
    public sumarrayUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("After class");
    }
    
    @Before
    public void setUp() {
        System.out.println("Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("After");
    }

    @Test
    public void testMatch() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int targetSum = 5;

        int actualSum = Sumarray.sumMatch(inputArray, targetSum);
        assertEquals(5, actualSum);
    }

    @Test
    public void testMultiMatch() {
        int[] inputArray = {1, 5, 5, 2, 3};
        int targetSum = 5;

        int actualSum = Sumarray.sumMatch(inputArray, targetSum);
        assertEquals(10, actualSum);
    }

    @Test
    public void testNoMatch() {
        int[] inputArray = {1, 2, 3, 4, 6};
        int targetSum = 5;

        int actualSum = Sumarray.sumMatch(inputArray, targetSum);
        assertEquals(0, actualSum);
    }

    @Test
    public void testEmpArray() {
        int[] inputArray = {};
        int targetSum = 5;

        int actualSum = Sumarray.sumMatch(inputArray, targetSum);
        assertEquals(0, actualSum);
    }
}
