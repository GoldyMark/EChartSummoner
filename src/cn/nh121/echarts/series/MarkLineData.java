/**
 * 
 */
package cn.nh121.echarts.series;

/**
 * @author ODMark
 * @creation 2014-7-13
 */
public class MarkLineData
{
    private Object   result;
    private Object[] results = new Object[2];

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

    public MarkLineData(String name, EMarkLineType type)
    {
        result = new XYMarkLineSubData(name, type);
    }

    public MarkLineData(String beginName, EMarkLineType beginType, String endName, EMarkLineType endType)
    {
        results[0] = new XYMarkLineSubData(beginName, beginType);
        results[1] = new XYMarkLineSubData(endName, endType);
        result = results;
    }

    public MarkLineData(String name, EMarkLineType type, Integer valueIndex)
    {
        result = new XYMarkLineSubData(name, type, valueIndex);
    }

    public MarkLineData(String beginName, Number beginValue, Object beginXAxis, Object beginYAxis, String endName, Object endXAxis, Object endYAxis)
    {
        results[0] = new XYMarkLineSubData(beginName, beginValue, beginXAxis, beginYAxis);
        results[1] = new XYMarkLineSubData(endName, endXAxis, endYAxis);
        result = results;
    }

    public MarkLineData(String beginName, Number beginValue, Integer beginX, Integer beginY, String endName, Integer endX, Integer endY)
    {
        results[0] = new FlatMarkLineSubData(beginName, beginValue, beginX, beginY);
        results[1] = new FlatMarkLineSubData(endName, endX, endY);
        result = results;
    }

    public MarkLineData(String beginName, Number beginValue, String endName)
    {
        results[0] = new MapMarkLineSubData(beginName, beginValue);
        results[1] = new MapMarkLineSubData(endName);
        result = results;
    }

    public Object getResult()
    {
        return result;
    }

    // SubData负责生成{name,value,x,y}etc..
    // AMarkLineData负责生成[SubData]或SubData

}
