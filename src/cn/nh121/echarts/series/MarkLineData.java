/**
 * 
 */
package cn.nh121.echarts.series;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ODMark
 * @creation 2014-7-13
 */
public class MarkLineData
{
    private Object              result;
    private Object[]            array = new Object[2];
    private Map<String, Object> map   = new HashMap<String, Object>();

    public MarkLineData(EChartType chartType)
    {

    }

    private enum EChartType
    {
        XY_CHART, FLAT_CHART, MAP_CHART;
    }

    public MarkLineData setName(String name)
    {
        map.put("name", name);
        return this;
    }

    // 饼图、雷达图、力导、和弦图
    // [{name,value,x,y},{name,x,y}]
    // 折线、柱形、K线、散点图
    // [{name,value,xAxis,yAxis},{name,xAxis,yAxis}]
    // 折线、柱形、散点图
    // {name,type}
    // [{name,type},{name,type}]
    // 散点图
    // {name,type,valueIndex}
    // 地图
    // [{name,value},{name}]
    protected Map<String, Object> getMap()
    {
        return map;
    }

    // SubData负责生成{name,value,x,y}etc..
    // AMarkLineData负责生成[SubData]或SubData
    private abstract class SubData
    {
        private String name;

        public SubData(String name)
        {
            this.name = name;
        }

        /**
         * @return the name
         */
        public String getName()
        {
            return name;
        }

        /**
         * @param name
         *            the name to set
         */
        public SubData setName(String name)
        {
            this.name = name;
            return this;
        }

    }

}
