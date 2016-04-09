package com.es.bo.biz.service;

import com.es.bo.biz.beans.PrayerTimesBean;
import com.es.bo.biz.domain.PrayerTimesEntity;

import java.util.List;

/**
 * Created by myachb on 4/8/2016.
 */
public interface PrayerTimesService {

    PrayerTimesEntity getPrayerTimes(String id);

    List<PrayerTimesEntity> getPrayerTimes();

    String createPrayerTimes(PrayerTimesBean prayerTimesBean);

    void delete(String id);
}
