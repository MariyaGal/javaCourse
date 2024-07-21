package basics;
import oop.work2.Pistol;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AssertionsTest {


    @Test
    void simpleTest() {
        boolean f = false;
        String s = "test";
        assertTrue(true, "ожидал true");
        assertFalse(f, "ожидал false");
        assertEquals("test", s ,  "ожидал test");
    }
    @Test
    void testException()   {
        assertThrows(RuntimeException.class, AssertionsTest::throwException);
        }
@Test
void stringAssertion()    {
        String s = "test";
        String s1  =  "Test";

        assertEquals("test", s,  "ожидал test");
    assertTrue(s.indexOf("es")!=1);//возвращает 1, если в строке есть "es"
int index= s.indexOf("es");
assertTrue(index!=-1);
assertEquals(2,s.indexOf("es"));//строка с нужного индекса
    assertEquals("test",  s1.toLowerCase());
}
//@Test
//void pistolIsBlockedException()    {
//        Pistol pistol = new Pistol();
//        p.setLoced(true);
//        assertTrue(RuntimeException.class p::shot());
//}


    public static void throwException()    {
        throw new RuntimeException("test exception");
    }
}
