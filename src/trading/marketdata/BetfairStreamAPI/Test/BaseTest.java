package trading.marketdata.BetfairStreamAPI.Test;

//import org.junit.Test;

public class BaseTest {
    private static String appKey;
    private static String userName;
    private static String password;
    
    @BeforeClass
    public static void beforeClass(){
        appKey = getSystemProperty("AppKey");
        userName = getSystemProperty("UserName");
        password = getSystemProperty("Password");
    }
}
