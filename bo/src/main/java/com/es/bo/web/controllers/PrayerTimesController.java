package com.es.bo.web.controllers;

import com.es.bo.biz.beans.PrayerTimesBean;
import com.es.bo.biz.service.PrayerTimesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by myachb on 4/8/2016.
 */

@PropertySource("classpath:application.properties")
@Controller
@RequestMapping("/pt")
public class PrayerTimesController {

    Logger logger = LoggerFactory.getLogger(PrayerTimesController.class);

    @Autowired
    private PrayerTimesService prayerTimesService;

    @RequestMapping(value={"/all"}, method= RequestMethod.GET)
    public ModelAndView getPrayerTimesList(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("items", prayerTimesService.getPrayerTimes());
        mv.setViewName("prayerTimesListTile");
        return mv;
    }

    @RequestMapping(value={"/all/{ptId}"}, method= RequestMethod.GET)
    public ModelAndView getPrayerTimes(@PathVariable("ptId") String ptId){
        ModelAndView mv = new ModelAndView();
        mv.addObject("item", prayerTimesService.getPrayerTimes(ptId));
        mv.setViewName("prayerTimesCRUDTile");

        return mv;
    }

    @RequestMapping(value={"/all/{ptId}/delete"}, method= RequestMethod.POST)
    public ModelAndView deletePrayerTimes(@PathVariable("ptId") String ptId, final RedirectAttributes redirectAttributes){

        prayerTimesService.delete(ptId);

        ModelAndView mav = new ModelAndView();
        String message = "PrayerTime file has been successfully deleted!";
        mav.setViewName("redirect:/pt/all");
        redirectAttributes.addFlashAttribute("message", message);

        return mav;
    }

    @RequestMapping(value={"/create"}, method= RequestMethod.GET)
    public ModelAndView createPrayerTimesGet(){

        ModelAndView mv = new ModelAndView();
        mv.addObject("item", new PrayerTimesBean());
        mv.setViewName("prayerTimesCRUDTile");

        return mv;
    }

    @RequestMapping(value={"/create"}, method= RequestMethod.POST)
    public ModelAndView createPrayerTimesPost(PrayerTimesBean bean, BindingResult result, final RedirectAttributes redirectAttributes){
        if (result.hasErrors())
            return new ModelAndView("");
        logger.debug("Getting ready to save the news item....");

        String ptId = "";

        try {
            ptId = prayerTimesService.createPrayerTimes(bean);
        }  catch (Exception e) {
            logger.error("Failed saving the file: "+e.getMessage());
            e.printStackTrace();
        }
        logger.debug("Saved the file....");

        ModelAndView mav = new ModelAndView();
        String message = "Please validate the Prayer Times";
        mav.setViewName("redirect:/prayerTimesViewTile?prayerTimesId="+ptId);
        redirectAttributes.addFlashAttribute("message", message);

        return mav;

    }

}
