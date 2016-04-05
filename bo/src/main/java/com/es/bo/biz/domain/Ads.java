package com.es.bo.biz.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by myachb on 3/8/2016.
 */
public class Ads extends AbstractEntity {

    @Id
    private String id;
    private String displayName;
    private Attachment[] attachments;
}
