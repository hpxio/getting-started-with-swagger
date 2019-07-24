package com.app.rc.getting_started_with_swagger.ui.model.request;

import lombok.*;

import java.util.Date;

/**
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookTicketsRequestModel {

    private long requestId;
    private String showName;
    private String date;
    private String userAccountId;


}
