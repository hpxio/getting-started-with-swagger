package com.app.rc.getting_started_with_swagger.ui.controller;

import com.app.rc.getting_started_with_swagger.shared.dto.BookTicketsDTO;
import com.app.rc.getting_started_with_swagger.ui.model.request.BookTicketsRequestModel;
import com.app.rc.getting_started_with_swagger.ui.model.response.BookTicketsResponseModel;
import org.springframework.beans.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/rest/ticket")
@SuppressWarnings("unused")
public class BookTicketsController {

    /**
     *
     * @param request
     * @return
     */
    @PostMapping(path = "/book", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public BookTicketsResponseModel bookTickets(@RequestBody BookTicketsRequestModel request) {
        BookTicketsDTO dto = new BookTicketsDTO();
        BookTicketsResponseModel response = new BookTicketsResponseModel();

        BeanUtils.copyProperties(request, dto);
        BeanUtils.copyProperties(dto, response);


        return response;
    }
}
