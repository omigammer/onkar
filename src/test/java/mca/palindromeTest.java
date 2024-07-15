package mca;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class palindromeTest {
    @Test
    public void testApp() {
    test1 t=new test1();
        String expected = "madam";
        String actual =t.palindrome(expected);

        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void testApp1() {
    test1 t=new test1();
        String expected = "summus";
        String actual =t.palindrome(expected);

        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void testApp2() {
    test1 t=new test1();
        String expected = "mgm";
        String actual =t.palindrome(expected);

        Assertions.assertEquals(expected, actual);
    }
   
}
