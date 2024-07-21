package basics;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    @BeforeAll
    static void globalSetup(){
        System.out.println("Before all");
    }
    @BeforeEach
    void localSetup(){
        System.out.println("Before each");
    }
    @AfterEach
    void localTearDown(){
        System.out.println("After each");
    }
    @AfterAll
    static void globalTearDown(){
        System.out.println("After all");
    }
}
