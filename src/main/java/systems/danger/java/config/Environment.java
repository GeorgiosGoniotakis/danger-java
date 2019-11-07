package systems.danger.java.config;


public class Environment {
    public static String retrieveEnvVariable(String key){
        return System.getenv(key);
    }
}
