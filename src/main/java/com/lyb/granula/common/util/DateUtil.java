package com.lyb.granula.common.util;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * ClassName: DateUtil
 * @Description: 日期工具
 * @author lyl <liuyuanlong@liangyibang.com>
 * @date 2016年5月30日
 */
public class DateUtil {
    public static SimpleDateFormat fmt               = new SimpleDateFormat();
    /**
     * @Description: 获取当天零点时刻
     * @param @return 当天零时刻
     * @return Date  
     * @throws
     * @author lyl <liuyuanlong@liangyibang.com>
     * 2016年5月30日 下午4:50:27
     */
    public static Date getTodayTimeOfZero() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return  cal.getTime();
    }
    
    /**
     * @Description: 获取当天十二点时刻
     * @param @return   59分59秒
     * @return Date  
     * @throws
     * @author lyl <liuyuanlong@liangyibang.com>
     * 2016年5月30日 下午8:02:35
     */
    public static Date getTodayTimeOfTwelve() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 0);
        return  cal.getTime();
    }

    /**
     * @Description: 获取当天零点时刻
     * @param @return 当天零时刻
     * @return Date
     * @throws
     * @author lyl <liuyuanlong@liangyibang.com>
     * 2016年5月30日 下午4:50:27
     */
    public static Date getTodayTimeOfZero(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return  cal.getTime();
    }

    /**
     * @Description: 获取当天十二点时刻
     * @param @return   59分59秒
     * @return Date
     * @throws
     * @author lyl <liuyuanlong@liangyibang.com>
     * 2016年5月30日 下午8:02:35
     */
    public static Date getTodayTimeOfTwelve(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 0);
        return  cal.getTime();
    }
    
    /**
     * @Description: yyyyMMddHHmm转换成日期
     * @param @param dateStr
     * @param @return   
     * @return Date  
     * @throws
     * @author lyl <liuyuanlong@liangyibang.com>
     * 2016年6月16日 下午7:12:44
     */
    public static Date yyyyMMddHHmmToDate(String dateStr) {
       SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
       Date date = null;
       try {
        date = format.parse(dateStr);
       } catch (ParseException e) {
        e.printStackTrace();
       }
       return date;
    }
    
    public static Date yyyyMMddToDate(String dateStr) {
        if(StringUtils.isBlank(dateStr)) return null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
         date = format.parse(dateStr);
        } catch (ParseException e) {
         e.printStackTrace();
        }
        return date;
     }
    
    public static Date yyyyMMddHHmmssToDate(String dateStr) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
         date = format.parse(dateStr);
        } catch (ParseException e) {
         e.printStackTrace();
        }
        return date;
     }
    
    /**
     * @Description: 获取当天零点
     * @param @return   
     * @return Date  
     * @throws
     * @author lyl <liuyuanlong@liangyibang.com>
     * 2016年6月27日 下午2:01:21
     */
    public static Date currentDateZero(){
        Calendar currentDate = new GregorianCalendar();   
        currentDate.set(Calendar.HOUR_OF_DAY, 0);  
        currentDate.set(Calendar.MINUTE, 0);  
        currentDate.set(Calendar.SECOND, 0);  
        return (Date)currentDate.getTime().clone();
    }
    
    public static String dateToyyyy_MMd_d(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String result = sdf.format(date);
        return result;
    }
    
    public static String dateToyyyyMMdd(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String result = sdf.format(date);
        return result;
    }
    
    /**
     *
     * @Description: 获取给定时间date的前day天
     * @param
     * @return
     * @throws
     * @author penghongbao <penghongbao@liangyibang.com>
     * 2016-06-29 11:33
     */
    public static Date getDateBeforeDay(Date date, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -day);
        Date _date = calendar.getTime();
        return _date;
    }

    /**
     *
     * @Description: 获取给定时间date的后day天
     * @param
     * @return
     * @throws
     * @author liuyuanlong
     * 2016-11-03 11:11
     */
    public static Date getDateAfterDay(Date date, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, day);
        Date _date = calendar.getTime();
        return _date;
    }

    /**
     * @Description: 获取指定格式时间字符串
     * @param    pattern 自定义格式 yyyy-MM-dd HH:mm:ss
     * @param    date Date类型日期
     * @return   String 字符串格式日期
     * @author penghongbao <penghongbao@liangyibang.com>
     * 2016-06-29 11:34
     */
    public static String getStrDateFormat(String pattern, Date date){
        fmt.applyPattern(pattern);
        String dateStr = fmt.format(date);
        return dateStr;
    }

    /**
     * @Description: 获取指定格式时间字符串
     * @param    pattern 自定义格式 yyyy-MM-dd HH:mm:ss
     * @param    dateStr String 日期格式字符
     * @return   Date类型日期
     * @author penghongbao <penghongbao@liangyibang.com>
     * 2016-06-29 11:34
     */
    public static Date getDateFormat(String pattern, String dateStr) throws ParseException {
        fmt.applyPattern(pattern);
        Date date = fmt.parse(dateStr);
        return date;
    }
    public static void main(String[] args) {
        System.out.println(dateToyyyy_MMd_d(new Date()));
        try {
            System.out.println(DateUtil.getDateFormat("yyyy-MM-dd hh:mm:ss",DateUtil.getStrDateFormat("yyyy-MM-dd",new Date())+" 00:00:00"));
            System.out.println(DateUtil.getPatternDate("yyyy-MM-dd","2016-10-24-10:23"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    

    /**
     * 获取指定日期的当前周最后一天 
     * @Description: TODO
     * @param @param d
     * @param @return   
     * @return Date  
     * @throws
     * @author jiangyq <jiangyq@liangyibang.com>
     * 2016年7月28日 上午11:36:31
     */
    public static Date getWeekLastDay(Date d){
        Calendar cal =Calendar.getInstance();
        cal.setTime(d);
       
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        Date d2 = cal.getTime();
        
        
        if(d.compareTo(d2)!=0)
            cal.add(Calendar.WEEK_OF_YEAR, 1);
        return cal.getTime();
    }
    
    public static int getDateSub(String d1,String d2) throws ParseException{
        SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd");
        Date begin=dfs.parse(d1);
        Date end = dfs.parse(d2);
        long between=(end.getTime()-begin.getTime())/1000;//除以1000是为了转换成秒

        long day=between/(24*3600);
        return Integer.parseInt(String.valueOf(day));      
    }

    /**
     * 获得指定日期的前一天
     *
     * @param specifiedDay
     * @return
     * @throws Exception
     */
    public static String getSpecifiedDayBefore(String specifiedDay,String pattern,int before) {//可以用new Date().toLocalString()传递参数
        Calendar c = Calendar.getInstance();
        Date date = null;
        try {
            date = new SimpleDateFormat(pattern).parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day - before);

        String dayBefore = new SimpleDateFormat(pattern).format(c
                .getTime());
        return dayBefore;
    }

    /**
     * 获得指定日期的后一天
     *
     * @param specifiedDay
     * @return
     */
    public static String getSpecifiedDayAfter(String specifiedDay,String pattern,int after) {
        Calendar c = Calendar.getInstance();
        Date date = null;
        try {
            date = new SimpleDateFormat(pattern).parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day + after);

        String dayAfter = new SimpleDateFormat(pattern)
                .format(c.getTime());
        return dayAfter;
    }

    /**
     * 获取当前是周几
     * @param dt
     * @return
     */
    public static String getWeekOfDate(Date dt) {
        String[] weekDays = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }

    /**
     * 获取当前是周几（数字形式）
     * @param dt
     * @return
     */
    public static String getWeekOfDateDigit(Date dt) {
        String[] weekDays = {"7", "1", "2", "3", "4", "5", "6"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }

    public static String getPatternDate(String pattern,String date){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date dateTmp = null;
        try {
            dateTmp = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        date = sdf.format(dateTmp);
        return date;
    }

    /**
     *
     * @Description: 获取给定时间date的前minutes
     * @param
     * @return
     * @throws
     * @author liuyuanlong
     * 2016-11-10 11:10
     */
    public static Date getDateBeforeMinutes(Date date, int minutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, -minutes);
        Date _date = calendar.getTime();
        return _date;
    }
    /**
     *
     * @Description: 获取给定时间date的后minutes
     * @param
     * @return
     * @throws
     * @author liuyuanlong
     * 2016-11-10 11:10
     */
    public static Date getDateAfterMinutes(Date date, int minutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, minutes);
        Date _date = calendar.getTime();
        return _date;
    }

    /**
     *
     * @Description: 获取给定时间date的second
     * @param
     * @return
     * @throws
     * @author liuyuanlong
     * 2016-11-10 11:10
     */
    public static Date getDateBeforeSecond(Date date, int second) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.SECOND, -second);
        Date _date = calendar.getTime();
        return _date;
    }
    /**
     *
     * @Description: 获取给定时间date的后second
     * @param
     * @return
     * @throws
     * @author liuyuanlong
     * 2016-11-10 11:10
     */
    public static Date getDateAfterSecond(Date date, int second) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.SECOND, second);
        Date _date = calendar.getTime();
        return _date;
    }

    /**
     * 获取指定格式的日期
     * @param pattern
     * @param dateStr
     * @return
     */
    public static Date getDateByFormat(String pattern, String dateStr){
        fmt.applyPattern(pattern);
        Date date = null;
        try {
            date = fmt.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
