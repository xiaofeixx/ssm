package com.xiaofei.util.format;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MyFamater implements Formatter<Date> {
    private String datePattern;
    private SimpleDateFormat dateFormat;

    public MyFamater(String datePattern) {
        this.datePattern = datePattern;
        this.dateFormat = new SimpleDateFormat(datePattern);
    }

    public Date parse(String s, Locale locale) throws ParseException {

        return dateFormat.parse(s);
    }

    public String print(Date date, Locale locale) {
        return dateFormat.format(date);
    }
}
