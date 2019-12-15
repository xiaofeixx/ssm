package com.xiaofei.util.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyConverter implements Converter<String, Date> {
    public Date convert(String s) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
          return   format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("日期转换失败");
            return null;
        }

    }
}
