package com.app.rc.getting_started_with_swagger.ui.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * Welcome Page
 */
@RestController
@RequestMapping(path = "/rest")
public class WelcomeController {

    /**
     *
     * @return
     */
    @ApiOperation(value = "Landing page for welcome" )
    @GetMapping
    public String welcome() {
        return "Welcome!!";
    }

    /**
     *
     * @param name
     * @return
     */
    @PostMapping(path = "/welcome")
    public String welcomeUser(@RequestParam String name){
        return "Welcome " + name;
    }
}
