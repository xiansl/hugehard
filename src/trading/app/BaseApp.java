package trading.app;

import trading.utils.betfair.auth.AppKeyAndSessionProvider;

public class BaseApp {
    private static String appKey;
    private static String userName;
    private static String password;
    
    private static String getSystemProperty(String key) {
        String value = System.getProperty(key);
        if(value == null){
            throw new IllegalArgumentException(String.format("System property %s must be set for tests to run", key));
        }
        return value;
    }
    
    public static String getAppKey() {
        return appKey;
    }

    public static String getUserName() {
        return userName;
    }

    public static String getPassword() {
        return password;
    }
    
    public AppKeyAndSessionProvider getValidSessionProvider(){
        return new AppKeyAndSessionProvider(
                AppKeyAndSessionProvider.SSO_HOST_COM,
                appKey,
                userName,
                password);
    }
    

    public AppKeyAndSessionProvider getInvalidHostSessionProvider(){
        return new AppKeyAndSessionProvider(
                "www.betfair.com",
                "a",
                "b",
                "c");
    }
    

    public AppKeyAndSessionProvider getInvalidLoginSessionProvider(){
        return new AppKeyAndSessionProvider(
                AppKeyAndSessionProvider.SSO_HOST_COM,
                "a",
                "b",
                "c");
    }
    
    public void test() {}
}
