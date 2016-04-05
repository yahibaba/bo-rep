package com.es.bo.web.resources;

import com.es.bo.biz.domain.News;
import com.es.bo.biz.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by myachb on 3/18/2016.
 */

@Controller
@RequestMapping("/news")
public class NewsResource {

    /**
     * Health check operation
     * @return
     */

    @Autowired
    private NewsService newsService;

    @RequestMapping(value={"/up"}, method= RequestMethod.GET)
    public @ResponseBody String up(){
        return "Back Office API is UP!!";
    }

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody List<News> getAllNews(){
        return newsService.getNews();
    }

    @RequestMapping(value={"/for"}, method= RequestMethod.GET)
    public @ResponseBody List<News> getNewsInDateRange(@RequestParam Date fromDate, @RequestParam Date toDate){
        return newsService.getNews();
    }

    @RequestMapping(method= RequestMethod.POST)
    public @ResponseBody String addNews(@RequestBody News news){
        newsService.createNews(news);
        return "success";
    }

}