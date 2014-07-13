/**
 * 
 */
package cn.nh121.echarts.series;

import cn.nh121.echarts.style.ItemStyle;
import cn.nh121.echarts.tooltip.Tooltip;

/**
 * 将所有series.data中的共有【属性/对象】抽象出来
 * 
 * @author ODMark
 * @creation 2014-7-11
 * @link http://echarts.baidu.com/doc/doc.html#SeriesData
 * 
 */
public abstract class ASeriesData
{
    /**
     * 可赋值类型：String（'-'）、Number、Number数组
     * 当某类目对应数据不存在时（ps：'不存在' 不代表值为 0），可用'-'表示，无数据在折线图中表现为折线在该点断开，在柱状图中表现为该点无柱形；<br>
     * scatter：[xValue, yValue, rValue]，数组内依次为横值，纵值，大小(可选)<br>
     * K线图：[2190.1, 2148.35, 2126.22, 2190.1] 开盘，收盘，最低，最高<br>
     * 
     */
    private Object    value;
    private Tooltip   tooltip;
    private ItemStyle itemStyle;

    /**
     * @return the value
     */
    public Object getValue()
    {
        return value;
    }

    /**
     * @param value
     *            the value to set
     */
    public ASeriesData setValue(Object value)
    {
        this.value = value;
        return this;
    }

    /**
     * @return the tooltip
     */
    public Tooltip getTooltip()
    {
        return tooltip;
    }

    /**
     * @param tooltip
     *            the tooltip to set
     */
    public ASeriesData setTooltip(Tooltip tooltip)
    {
        this.tooltip = tooltip;
        return this;
    }

    /**
     * @return the itemStyle
     */
    public ItemStyle getItemStyle()
    {
        return itemStyle;
    }

    /**
     * @param itemStyle
     *            the itemStyle to set
     */
    public ASeriesData setItemStyle(ItemStyle itemStyle)
    {
        this.itemStyle = itemStyle;
        return this;
    }
}
