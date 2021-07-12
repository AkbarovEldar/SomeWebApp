package app.Controllers.ActionControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class RandValueController {

    @GetMapping("/getRandValue")
    public long getRandValue(@RequestParam("randValue") String rand_Value){

        String values[] = rand_Value.split("_");

        long min = Long.parseLong(values[0]);
        long max = Long.parseLong(values[1]);

        long randVal = ThreadLocalRandom.current().nextLong(min,max+1);

        System.out.println("Got random value: " + randVal);
        return randVal;
    }


    @GetMapping(value = "/", params = "randValue")
    public String getRandValueParam(@RequestParam("randValue") String rand_Value){

        String values[] = rand_Value.split("_");

        long min = Long.parseLong(values[0]);
        long max = Long.parseLong(values[1]);

        long randVal = ThreadLocalRandom.current().nextLong(min,max+1);

        String result = "Got random value: " + randVal;
        System.out.println(result);
        return result;
    }

}


