package com.app.rc.getting_started_with_swagger.ui.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Welcome Page
 */
@RestController
@RequestMapping(path = "/rest")
@Api(value = "Welcome Page")
public class WelcomeController {

    private final static Logger LOG = LoggerFactory.getLogger(WelcomeController.class);

    /**
     * Welcome Controller - Simple
     *
     * @return Welcome string
     */
    @ApiOperation(value = "Landing Page Message")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "200 OK : Successful Response")
    })
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String welcome() {

        LOG.info("Welcome Controller Called");
        return "Welcome!!";
    }

    /**
     * Welcome Controller - With User Name
     *
     * @param name Name of the User
     * @return Welcome string
     */
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "200 OK : Successful Response")
    })
    @ApiOperation(value = "Welcome Text with User Name")
    @PostMapping(path = "/welcome")
    public String welcomeUser(@RequestParam String name) {
        LOG.info("Welcome Controller with User Name Called");
        return "Welcome " + name;
    }
}