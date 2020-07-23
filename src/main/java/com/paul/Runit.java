package main.java.com.paul;

import org.springframework.scheduling.annotation.Async;

public class Runit {
    @Async("taskExecutor")
    public void DoSomething() throws InterruptedException {
        System.out.printf("Doing Something\n");
        Thread.sleep(10000);
        System.out.printf("Done Something\n");
    }

}
