package com.es.bo.biz.service;

import com.es.bo.biz.beans.PrayerTimesBean;
import com.es.bo.biz.domain.PrayerTimes;
import com.es.bo.biz.domain.PrayerTimesEntity;
import com.es.bo.biz.repository.PrayerTimesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by myachb on 4/8/2016.
 */
public class PrayerTimesServiceImpl implements PrayerTimesService {

    Logger logger = LoggerFactory.getLogger(PrayerTimesServiceImpl.class);

    private PrayerTimesRepository prayerTimesRepository;

    public PrayerTimesEntity getPrayerTimes(String id){
        return prayerTimesRepository.findOne(id);
    }

    public List<PrayerTimesEntity> getPrayerTimes(){
        return prayerTimesRepository.findAll();
    }

    public void delete(String id){
        prayerTimesRepository.delete(id);
    }

    @Override
    public String createPrayerTimes(PrayerTimesBean prayerTimesBean){

        try
        {
            String line;
            BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( prayerTimesBean.getData().getInputStream() ) );
            while( (line = bufferedReader.readLine()) != null )
            {
                System.out.printf("%s\n", line);
            }
        }
        catch( IOException e )
        {
            System.err.println( "Error: " + e );
        }

        return "id";
    }

    public PrayerTimes createPrayerTimes(String  schedule){
        PrayerTimes bean = new PrayerTimes();

        String[] tokens = schedule.split(",");
        logger.debug("Tokens: "+tokens.toString());

        bean.setDate(tokens[0]);

        bean.setFajarTime(addSpaceBeforeAMOrPM(tokens[1]));
        bean.setFajarIqamaTime(addSpaceBeforeAMOrPM(tokens[2]));

        bean.setSunriseTime(addSpaceBeforeAMOrPM(tokens[3]));

        bean.setDhuhrTime(addSpaceBeforeAMOrPM(tokens[4]));
        bean.setDhuhrIqamaTime(addSpaceBeforeAMOrPM(tokens[5]));

        bean.setAsrTime(addSpaceBeforeAMOrPM(tokens[6]));
        bean.setAsrIqamaTime(addSpaceBeforeAMOrPM(tokens[7]));

        bean.setMaghribTime(addSpaceBeforeAMOrPM(tokens[8]));
        bean.setMaghribIqamaTime(addSpaceBeforeAMOrPM(tokens[9]));

        bean.setIshaTime(addSpaceBeforeAMOrPM(tokens[10]));
        bean.setIshaIqamaTime(addSpaceBeforeAMOrPM(tokens[11]));

        bean.setJumah1Time(tokens[12]);
        bean.setJumah1IqamaTime(tokens[13]);

        bean.setJumah2Time(tokens[14]);
        bean.setJumah2IqamaTime(tokens[15]);

        bean.setFajarBufferTime("30");
        bean.setDhuhrBufferTime("1");
        bean.setAsrBufferTime("45");
        bean.setMaghribBufferTime("30");
        bean.setIshaBufferTime("120");
        bean.setJumah1BufferTime("20");
        bean.setJumah2BufferTime("60");
        return bean;
    }

    private String addSpaceBeforeAMOrPM(String s){
        String s1 = new StringBuilder(s).insert(s.length()-2, " ").toString().toUpperCase();
        return s1;
    }
}
