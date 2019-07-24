package com.app.rc.getting_started_with_swagger.shared.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BookTicketsDTO {
    private long id;
    private long ticketId;
    private long requestId;
    private String showName;
    private Date showDate;
    private String userAccountId;
    private boolean status;
    private Date createdAt;
    private Date updatedAt;
}
