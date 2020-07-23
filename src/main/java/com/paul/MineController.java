package main.java.com.paul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/greeting")
public class MineController {

    @Autowired
    Runit runit;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String getGreeting(@PathVariable String name) throws InterruptedException {

        // 10 second delay!!!!
//        Runit runit = new Runit();
//        runit.DoSomething();
        runit.DoSomething();
        System.out.println("The async thing returned");

        return "Hello " + name;
    }
}