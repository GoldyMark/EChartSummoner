package cn.nh121.echarts.kit;

public class NumberKit
{
    public static Boolean checkRange(Integer num, Integer min, Integer max, Boolean throwException)
    {
        Boolean condition;
        if (min == null)
            condition = num > max;
        else if (max == null)
            condition = num < min;
        else
            condition = num < min || num > max;
        if (condition)
            if (throwException)
                throw new RuntimeException("数值：" + num + "，超出值域范围：最小值：" + min + "，最大值：" + max);
            else
                return false;
        return true;
    }

    public static Boolean checkMin(Integer num, Integer min, Boolean throwException)
    {
        return checkRange(num, min, null, throwException);
    }

    public static Boolean checkMax(Integer num, Integer max, Boolean throwException)
    {
        return checkRange(num, null, max, throwException);
    }

    public static Object stringOrNum(String num)
    {
        try
        {
            return Double.valueOf(num).intValue();
        } catch (Exception e)
        {
            return num;
        }
    }
}
