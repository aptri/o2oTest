package com.imooc.o2o.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class O2oWebApplicationTests {

    @Test
    public void contextLoads() {
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date=null;
//        try {
//            date=sdf.parse(new Date().getTime());
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        String strDate="2019-04-18 14:25:20";
        Date rtDate = null;
        Date tmpDate = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(strDate, new ParsePosition(0));
        String tmpString = null;
        if (tmpDate != null)
            tmpString = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(tmpDate);
        if (tmpString != null)
            rtDate = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(tmpString, new ParsePosition(0));
        System.out.println(rtDate);
    }

}
