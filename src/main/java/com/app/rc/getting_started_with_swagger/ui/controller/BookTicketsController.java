package com.app.rc.getting_started_with_swagger.ui.controller;

import com.app.rc.getting_started_with_swagger.shared.dto.BookTicketsDTO;
import com.app.rc.getting_started_with_swagger.ui.model.request.BookTicketsRequestModel;
import com.app.rc.getting_started_with_swagger.ui.model.response.BookTicketsResponseModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/rest/ticket")
@Api(value = "Book Tickets Controller")
public class BookTicketsController {

    /**
     * Accepts a booking data and returns a Booking ID on successful operation
     *
     * @param request Valid request to create a ticket booking
     * @return Response object container data used to create ticket booking
     */
    @ApiOperation(
            value = "Book a Ticket",
            notes = "Accepts a booking data and returns a Booking ID on successful operation")
    @PostMapping(path = "/book", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public BookTicketsResponseModel bookTickets(
            @ApiParam(
                    value = "Request Payload for Ticket",
                    example = "Booking Details of the Ticket: id:1, show:Sherlock Holmes, etc.")
            @RequestBody BookTicketsRequestModel request) {

        BookTicketsDTO dto = new BookTicketsDTO();
        BookTicketsResponseModel response = new BookTicketsResponseModel();

        BeanUtils.copyProperties(request, dto);
        BeanUtils.copyProperties(dto, response);

        return response;
    }

    /**
     * Get Booking data for the given Booking ID
     *
     * @param id UUID for Booking
     * @return Booking data object
     */
    @ApiOperation(
            value = "Get booking data for the given Booking ID",
            produces = "BookTicketsResponseModel"
    )
    @GetMapping(path = "/booking/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public BookTicketsResponseModel getTickets(
            @ApiParam(
                    value = "Booking ID for the Ticket",
                    example = "3kjdhj34oiu93",
                    type = "String",
                    required = true
            )
            @RequestParam String id) {
        return new BookTicketsResponseModel();
    }
}