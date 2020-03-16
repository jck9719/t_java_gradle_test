package t_java_gradle_test;

import org.junit.jupiter.api.*;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class StringOperationsTest{

    public StringOperations sOp;
    static Logger log = Logger.getLogger(StringOperationsTest.class.getName());

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        log.info("Before all");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        log.info("AfterAll");
    }

    @BeforeEach
    void setUp() throws Exception {
        log.info("BeforeEach");
        sOp = new StringOperations();
    }

    @AfterEach
    void tearDown() throws Exception {
        log.info("AfterEach");
        sOp = null;
    }

    @Test
    @DisplayName("Check reverse metod - null input, exception")
    void testReserveNullInput() {
        assertThrows(NullPointerException.class, () -> sOp.reverse(null));
    }

    @Test
    @DisplayName("Check reverse metod - not null input, exception")
    void testReserveNotNullInput() {
        assertTrue(true, sOp.reverse("Not null"));
    }

    @Test
    @DisplayName("Check reverse method - correct answer")
    void testReserveCorrectAlpha(){
        assertEquals("mubreV tare sueD te mueD dupa tare mubreV te mubreV tare oipicnirp ni",
                sOp.reverse("in principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum"));
    }

    @Test
    @DisplayName("Concat method, null input")
    void testConcatNullInputAlpha(){
        assertNull(sOp.concat(null, null));
    }

    @Test
    @DisplayName("Concat method, not null input a")
    void testConcatNotNullInputAlpha(){
        assertEquals("not null", sOp.concat("not null", null));
    }

    @Test
    @DisplayName("Concat method, not null input b")
    void testConcatNotNullInputBeta(){
        assertEquals("not null", sOp.concat(null, "not null"));
    }

    @Test
    @DisplayName("Concat method, not null input a and b")
    void testConcatNotNullInputGamma(){
        assertNotEquals(null, sOp.concat("not null", "not null"));
    }

    @Test
    @DisplayName("Concat method - correct")
    void testConcatCorrectAlpha(){
        assertEquals("Unum Deum Patrem Omnipotentem",  sOp.concat("Unum Deum ", "Patrem Omnipotentem"));
    }

    @Test
    @DisplayName("Palindrome method - input null")
    void testPalindromeNullInput(){
        assertThrows(NullPointerException.class, () -> sOp.isPalindrome(null));
    }

    @Test
    @DisplayName("Palindrome method - input not null")
    void testPalindromeNotNullInputAlpha(){
        assertTrue(sOp.isPalindrome("a"));
    }

    @Test
    @DisplayName("Palindrome method - correct, I")
    void testPalindromeCorrectAlpha(){
        assertTrue(sOp.isPalindrome("malajalam"));
    }

    @Test
    @DisplayName("Palindrome method - correct, II")
    void testPalindromeCorrectBeta(){
        assertTrue(sOp.isPalindrome("Able was i ere i saw elba"));
    }

    @Test
    @DisplayName("Palindrome method - incorrect, I")
    void testPalindromeInCorrectAlpha(){
        assertFalse(sOp.isPalindrome("Not a palindrome"));
    }

    @Test
    @DisplayName("Palindrome method - incorrect, II")
    void testPalindromeInCorrectBeta(){
        assertFalse(sOp.isPalindrome("Able was i ere i saw elbad"));
    }






}