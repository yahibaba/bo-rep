package com.es.bo.biz.service;

import com.es.bo.biz.domain.News;

import java.util.List;

/**
 * Created by myachb on 3/17/2016.
 */
public interface NewsService {

    void createNews(News news);
    
    List<News> getNews();

    void updateNews(News news);

    void deleteNews(String id);

}
