package ie.gmit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class StudentTest {
    Student myStudent;

    @BeforeAll
    static void startingTests() {
        System.out.println("Starting Tests");
    }

    @BeforeEach
    void printDisplayNames(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry(testInfo.getDisplayName());
    }

    @AfterAll
    static void testingComplete() {
        System.out.println("Testing Complete");
    }

    @DisplayName("Checking Constructor Initialisation Success")
    @Test
    void testConstructorSuccess() {
        myStudent = new Student("ruairi", "abc@gmail.com");
        assertEquals("ruairi", myStudent.getName());
        assertEquals("abc@gmail.com", myStudent.getEmail());
    }

    @DisplayName("Checking Constructor Initialisation Failure")
    @Test
    void testConstructorFailure() {
        assertThrows(NullPointerException.class, () -> {
            myStudent = new Student("aa", "");
        });
    }
}
