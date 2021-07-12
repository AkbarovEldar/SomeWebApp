package app.Controllers.ActionControllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class CounterController {

    private long counter = 0;

    private long oldCounter = 0;

    @GetMapping("/increaseCounter")
    public long[] increaseCounter(@RequestParam("counterValue") long counterValue){

        long oldCounter = getCounter();
        setOldCounter(oldCounter);
        long newCounter = counter+counterValue;
        long[] valList = new long[]{oldCounter,newCounter};

        setCounter(newCounter);

        return valList;
    }

    @GetMapping("/getCurrentCounter")
    public long[] getCurrentCounter(){

        long oldCounter = getOldCounter();
        long counter = getCounter();
        long[] valList = new long[]{oldCounter,counter};

        return valList;
    }

    @GetMapping(value = "/", params = "counterValue")
    public String increaseCounterParam(@RequestParam("counterValue") long counterValue){

        long oldCounter = getCounter();
        setOldCounter(oldCounter);
        long newCounter = counter+counterValue;
        long[] valList = new long[]{oldCounter,newCounter};

        setCounter(newCounter);
        String result = "Old counter value: " + oldCounter + ", new counter value: " + newCounter;
        System.out.println(result);
        return result;
    }


    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter){
        this.counter = counter;
    }

    public long getOldCounter() {
        return oldCounter;
    }

    public void setOldCounter(long oldCounter){
        this.oldCounter = oldCounter;
    }
}
