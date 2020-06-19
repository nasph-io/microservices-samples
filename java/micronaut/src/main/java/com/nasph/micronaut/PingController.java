package com.nasph.micronaut;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/micronaut")
public class PingController {

    private static final Logger LOG = LoggerFactory.getLogger(PingController.class);

    @Get("/ping") 
    public String ping() {

        LOG.info("/ping - micronaut called ");
        
        return "Ping from Micronaut"; 
    }

    @Get("/guess/{number}") 
    public String issue(@PathVariable Integer number) { 

        LOG.info("Guess # " + number + "!");
        return "Guess # " + number + "!"; 
    }
    
}

// docker run --rm -it --name dcv -v $(pwd):/input pmsipilot/docker-compose-viz render -m image docker-compose.yml