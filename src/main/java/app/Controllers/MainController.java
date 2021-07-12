package app.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

//@RestController
@Controller
public class MainController {

//    @RequestMapping("/")
    @GetMapping(value = "/")
    public String mainPage(){

        return "mainPage";
    }


//Добавить сразу переменные в запросе

//    @GetMapping("/")
//    public String mainPage(@RequestParam("toLog") String toLog) throws IOException {
//
//        FileWriter fw = new FileWriter("log.log", true);
//        BufferedWriter bw = new BufferedWriter(fw);
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
//        LocalDateTime currentTime = LocalDateTime.now();
//        String logLine = dtf.format(currentTime) + " " + toLog + "\n";
//
//        bw.write(logLine);
//        bw.close();
//
//        return "mainPage";
//    }



//    @GetMapping("/greet")
//    public String greeting(){
//
//        return "greeting";
//    }
}
