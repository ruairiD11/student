package ie.gmit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class StudentListTest {
    StudentList studentList;

    @BeforeAll
    static void startingTests() { System.out.println("Starting Tests"); }

    @BeforeEach
    void printDisplayNames(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry(testInfo.getDisplayName());
    }

    @AfterAll
    static void testingComplete()
    {
        System.out.println("Testing Complete");
    }

    @DisplayName("Testing search for student name")
    @Test
    void TestSearchStudent() {
        studentList = new StudentList();
        Student s1 = new Student("bob", "bob@gmail.com");
        Student s2 = new Student("john", "john@gmail.com");
        studentList.addStudent(s1);
        studentList.addStudent(s2);

        assertEquals(s2, studentList.searchStudent(s2));
    }

}
