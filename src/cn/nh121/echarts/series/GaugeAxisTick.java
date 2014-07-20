/**
 * 
 */
package cn.nh121.echarts.series;

import cn.nh121.echarts.axis.AxisTick;

/**
 * @author ODMark
 * @creation 2014-7-19
 */
public class GaugeAxisTick extends AxisTick
{
    private Integer splitNumber;

    /**
     * @return the splitNumber
     */
    public Integer getSplitNumber()
    {
        return splitNumber;
    }

    /**
     * @param splitNumber
     *            the splitNumber to set
     */
    public GaugeAxisTick setSplitNumber(Integer splitNumber)
    {
        this.splitNumber = splitNumber;
        return this;
    }
}
