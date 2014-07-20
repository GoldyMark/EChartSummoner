/**
 * 
 */
package cn.nh121.echarts.series;

import cn.nh121.echarts.core.EColor;
import cn.nh121.echarts.kit.NumberKit;

/**
 * @author ODMark
 * @creation 2014-7-19
 */
public class GaugePointer
{
    private Object  length;
    private Integer width;
    private EColor  color;

    /**
     * @return the length
     */
    public Object getLength()
    {
        return length;
    }

    /**
     * @param length
     *            the length to set
     */
    public GaugePointer setLength(String length)
    {
        this.length = NumberKit.stringOrNum(length);
        return this;
    }

    /**
     * @return the width
     */
    public Integer getWidth()
    {
        return width;
    }

    /**
     * @param width
     *            the width to set
     */
    public GaugePointer setWidth(Integer width)
    {
        this.width = width;
        return this;
    }

    /**
     * @return the color
     */
    public EColor getColor()
    {
        return color;
    }

    /**
     * @param color
     *            the color to set
     */
    public GaugePointer setColor(EColor color)
    {
        this.color = color;
        return this;
    }
}
