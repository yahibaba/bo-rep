package com.es.bo.biz.repository;

import com.es.bo.biz.domain.PrayerTimesEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by myachb on 4/9/2016.
 */
public interface PrayerTimesRepository extends MongoRepository<PrayerTimesEntity, String> {

}
