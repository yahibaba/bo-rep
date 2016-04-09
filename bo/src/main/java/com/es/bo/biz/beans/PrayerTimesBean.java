package com.es.bo.biz.beans;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

/**
 * Created by myachb on 4/8/2016.
 */
public class PrayerTimesBean {

    private String displayName;
    private Date displayFrom;
    private Date displayTo;
    private MultipartFile data;

    public Date getDisplayFrom() {
        return displayFrom;
    }

    public void setDisplayFrom(Date displayFrom) {
        this.displayFrom = displayFrom;
    }

    public Date getDisplayTo() {
        return displayTo;
    }

    public void setDisplayTo(Date displayTo) {
        this.displayTo = displayTo;
    }

    public MultipartFile getData() {
        return data;
    }

    public void setData(MultipartFile data) {
        this.data = data;
    }
}
