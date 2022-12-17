package api.config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigReader {
    public static final RestAssuredConfig restAssuredConfig = ConfigFactory.create(RestAssuredConfig.class, System.getProperties());
}
