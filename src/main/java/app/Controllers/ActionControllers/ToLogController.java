package app.Controllers.ActionControllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class ToLogController {


    @GetMapping("/writeNewLogLine")
    public String writeNewLogLine(@RequestParam("toLog") String toLog) throws IOException {
        FileWriter fw = new FileWriter("log.log", true);
        BufferedWriter bw = new BufferedWriter(fw);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        LocalDateTime currentTime = LocalDateTime.now();
        String logLine = dtf.format(currentTime) + " " + toLog + "\n";

        bw.write(logLine);
        bw.close();
        System.out.println(logLine);
        return logLine;
    }

    @GetMapping(value="/", params="toLog")
    public String writeNewLogLineParam(@RequestParam("toLog") String toLog) throws IOException {
        FileWriter fw = new FileWriter("log.log", true);
        BufferedWriter bw = new BufferedWriter(fw);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        LocalDateTime currentTime = LocalDateTime.now();
        String logLine = dtf.format(currentTime) + " " + toLog + "\n";

        bw.write(logLine);
        bw.close();
        System.out.println(logLine);
        return logLine;
    }

}
