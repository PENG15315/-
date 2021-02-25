package demo02.class02Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 练习：
 *      请使用时间相关的API，计算出一个人已经出生了多少天。
 * 分析：
 *      1.使用Scanner类中的方法next，获取出生日期
 *      2.使用DateFormat类中的parse，把字符串的出生日期，解析为Date格式的出生日期
 *      3.把Date格式的出生日期转换为毫秒值
 *      4.获取当前的日期，转换为毫秒值
 *      5.使用当前日期的毫秒值-出生日期的毫秒值
 *      6.把毫秒差值转换为天(s/1000/60/60/24)
 * */

public class DatePractice {
    public static void main(String[] args) throws ParseException{
        Scanner input=new Scanner(System.in);
        System.out.println("出生日期是：年-月-日");
        String birthday=input.next();
        long birth = new DatePractice().birth(birthday);
        long now = new DatePractice().now();
        long day=(now-birth)/1000/60/60/24;
        System.out.println("已经度过了"+day+"天");
    }

    //将生日转换为毫秒值
    public long birth(String birth) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(birth);
        return parse.getTime();
    }

    //将当前日期转换为毫秒值
    public long now(){
        Date date=new Date();
        return date.getTime();
    }
}


