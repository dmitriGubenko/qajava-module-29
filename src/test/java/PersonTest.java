import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PersonTest {

    @DataProvider(name = "isTeenagerDataProvider")
    Object[][] isTeenagerDataProvider() {
        return new Object[][] {
                {-1,false},
                {0,false},
                {1,false},
                {12,false},
                {13,true},
                {14,true},
                {18,true},
                {19,true},
                {20,false},
                {21, false}
        };
    }

    @Test(
            description = "new test",
            timeOut = 200,
            dataProvider = "isTeenagerDataProvider"
    )
    public void isTeenTest(int age, boolean expectedResult) {
        boolean actualResult = Person.isTeenager(age);
        assert actualResult == expectedResult;
    }
}
