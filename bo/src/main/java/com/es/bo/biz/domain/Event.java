package com.es.bo.biz.domain;

import java.time.LocalDateTime;

/**
 * Created by myachb on 3/8/2016.
 */
public class Event extends AbstractEntity {

    private String displayName;
    private String shortDescription;
    private String longDescription;
    private LocalDateTime eventStartDate;
    private LocalDateTime eventEndDate;
    private String street;


}
