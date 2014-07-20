/**
 * 
 */
package cn.nh121.echarts.series;

import cn.nh121.echarts.axis.SplitLine;

/**
 * @author ODMark
 * @creation 2014-7-19
 */
public class GaugeSplitLine extends SplitLine
{
    private Integer length;

    /**
     * @return the length
     */
    public Integer getLength()
    {
        return length;
    }

    /**
     * @param length
     *            the length to set
     */
    public GaugeSplitLine setLength(Integer length)
    {
        this.length = length;
        return this;
    }
}
