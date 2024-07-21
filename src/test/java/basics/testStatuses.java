package basics;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class testStatuses extends BaseTest{
@Test
    void success(){
    assertTrue(true);
}
@Test
    void failed(){
    assertTrue(false);
}
@Test
    void skipped(){
    AssertionsTest.throwException();
    assertTrue(true);

}
@Test
@Disabled
    void disabled(){
    assertTrue(true);

}

}
