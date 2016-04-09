package com.es.bo.biz.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by myachb on 4/8/2016.
 */
public class PrayerTimesEntity extends AbstractEntity {

    private List<PrayerTimes> prayerTimeses = new ArrayList<PrayerTimes>();

    public List<PrayerTimes> getPrayerTimeses() {
        return prayerTimeses;
    }

    public void setPrayerTimeses(List<PrayerTimes> prayerTimeses) {
        this.prayerTimeses = prayerTimeses;
    }
}
