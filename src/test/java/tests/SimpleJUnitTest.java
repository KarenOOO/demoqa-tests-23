package tests;

import org.junit.jupiter.api.*;

public class SimpleJUnitTest {

    @BeforeAll
        static void beforeAll() {
        System.out.println("\nBefore All\n");
    }

    int result;
    @BeforeEach
    void beforeEach() {
        System.out.println("Before each");
        result = getResult();
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each\n");
        result = getResult();
    }

    @AfterAll
    static void afterAll() {
        System.out.println("\nAfter All\n");
    }

    @Test
    void firstTest() {
        System.out.println("First Test");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void secondTest() {
        int resultt = getResult();
        System.out.println("Second Test");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void thirdTest() {
        int resultt = getResult();
        System.out.println("Third Test");
        Assertions.assertTrue(result > 2);
    }

    private int getResult() {
        return 3;
    }
}
