package com.es.bo.web.controllers;

import com.es.bo.biz.domain.News;
import com.es.bo.biz.service.NewsService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by myachb on 3/29/2016.
 */

@PropertySource("classpath:application.properties")
@Controller
@RequestMapping("/news")
public class NewsController {

    Logger logger = LoggerFactory.getLogger(NewsController.class);

    @Autowired
    private NewsService newsService;

    @RequestMapping(value={"/all"}, method= RequestMethod.GET)
    public ModelAndView getNewsAll(){

        ModelAndView mv = new ModelAndView();
        mv.addObject("items", newsService.getNews());
        mv.setViewName("newsListTile");

        return mv;
    }

    @RequestMapping(value={"/create"}, method= RequestMethod.GET)
    public ModelAndView createNewsGet(){

        ModelAndView mv = new ModelAndView();
        mv.addObject("news", new News());
        mv.setViewName("newsCRUDTile");

        return mv;
    }

    @RequestMapping(value={"/create"}, method= RequestMethod.POST)
    public ModelAndView createNewsPost(@ModelAttribute News news, BindingResult result, final RedirectAttributes redirectAttributes){

        ModelAndView mv = new ModelAndView();

        if(result.hasErrors()){
            mv.setViewName("newsCRUDTile");
        }

        newsService.createNews(news);

        mv.setViewName("redirect:/news/all");

        return mv;
    }

    @RequestMapping(value={"/delete"}, method= RequestMethod.GET)
    public ModelAndView deleteNews(@RequestParam String id, final RedirectAttributes redirectAttributes){

        newsService.deleteNews(id);

        ModelAndView mv = new ModelAndView();
        String message = "Item has been successfully deleted.";
        mv.setViewName("redirect:/news/all");
        redirectAttributes.addFlashAttribute("message", message);

        return mv;
    }


}