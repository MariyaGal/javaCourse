package home;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static home.StringHelper.string;
import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    @BeforeEach
    void setUp() {
         new StringHelper(string);
         System.out.println("test start");
    }

    @AfterEach
    void tearDown() {
    System.out.println("test complete");
    }

    @Test
    @Tag("проверка счетчика слов")
    @Tag("MyTag1")
    void getWordsCount() {
        string="a 4 ff";
        assertEquals(2, StringHelper.getWordsCount());
    }

    @Test
    @Tag("проверка обрезания строки")
    @Tag("MyTag1")
    void cut() {
        string="a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a";
         assertEquals("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ...", StringHelper.cut());
    }

    @Test
    @Tag("поиск подстроки")
    void find() {
        string="test this class please";
        assertEquals("is class please", StringHelper.find(5, "is"));
    }

    @Test
    @Tag("поиск числа")
    void getFirstNumber() {
        string="123 test this class please";
        assertEquals(123, StringHelper.getFirstNumber(), "нет чисел");

    }
}