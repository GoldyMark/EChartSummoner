package cn.nh121.echarts.test;

import java.util.ArrayList;

import cn.nh121.echarts.series.markline.XYMarkLineSubData;

import com.alibaba.fastjson.JSON;

public class Test<E> extends ArrayList<E>
{
    public static void main(String[] args)
    {
        TestBean tb = new TestBean("Mark", 15);
        // tb.setName("Mark");
        // tb.setValue(15);
        XYMarkLineSubData d1 = new XYMarkLineSubData("dd", "周三", 2);
        System.out.println(JSON.toJSONString(d1));
    }
}
