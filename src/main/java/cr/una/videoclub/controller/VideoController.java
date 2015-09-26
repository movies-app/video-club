package cr.una.videoclub.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Arrays;

@RestController
public class VideoController {

    @RequestMapping("/")
    List<String> home() {
        return Arrays.asList("Star Wars", 
            "Matrix", 
            "Dragon Ball",
            "Presos");
    }
}