package it.develhope.Api03;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/string")
public class StringController {

    @GetMapping()
    public String stringConcatenation(@RequestParam String param1, @RequestParam(required = false) String param2) {
        if (param2 != null) {
            return param1.concat(param2);
        } else {
            return param1;
        }

    }
}
