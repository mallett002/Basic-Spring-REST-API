package hello;

// RESTFUL WEBSERVICE CONTROLLER
// Spring uses the "Jackson JSON" library to marshal instances of type "Greeting" into JSON
// @RestController identifies a controller
// handle get requests for /greeting, return a new instance of "Greeting" class

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting") // Ensures HTTP requests are mapped to Greeting class
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}

// @RequestParam binds value of query param "name" into "name" param of greeting() method
