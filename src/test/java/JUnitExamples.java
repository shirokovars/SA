import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Just beforeAll");
        }
    @Test


    void firstTest() {
        System.out.println("First Examples");
    }
}
