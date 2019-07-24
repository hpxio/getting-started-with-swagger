package com.app.rc.getting_started_with_swagger.ui.model.response;

import lombok.*;

/**
 *
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BookTicketsResponseModel {
    private long id;
    private long ticketId;
    private boolean status;
}
