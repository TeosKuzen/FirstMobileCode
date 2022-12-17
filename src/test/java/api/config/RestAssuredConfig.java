package api.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties", //чтение env
        "file:src/test/resources/configs/restAssured.properties", //чтение из файла
})
public interface RestAssuredConfig extends Config{
    @Key("baseURL")
    String baseURL();
}
