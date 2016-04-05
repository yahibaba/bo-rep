package com.es.bo.biz.repository;

import com.es.bo.biz.domain.News;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by myachb on 3/17/2016.
 */
@Repository
public interface NewsRepository extends MongoRepository<News, String> {



}
