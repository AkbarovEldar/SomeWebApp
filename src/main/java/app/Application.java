package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
@ConfigurationPropertiesScan("com.baeldung.configurationproperties")
public class Application {
    public  static  void main(String[] args){
    try {
        SpringApplication.run(Application.class, args);
    } catch (Exception e) {
        e.printStackTrace();
    }
//        SpringApplication.run(Application.class, args);
    }

}
