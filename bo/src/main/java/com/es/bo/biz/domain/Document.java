package com.es.bo.biz.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by myachb on 3/8/2016.
 */
public class Document extends AbstractEntity {

    @Id
    private String id;
    private String displayName;
    private String type;
    private byte[] data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
