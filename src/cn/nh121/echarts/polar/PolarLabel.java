package cn.nh121.echarts.polar;

import cn.nh121.echarts.axis.AxisLabel;

public class PolarLabel
{
    private String    text;
    private Integer   min;
    private Integer   max;
    private AxisLabel axisLabel;

    /**
     * @return the text
     */
    public String getText()
    {
        return text;
    }

    /**
     * @param text
     *            the text to set
     */
    public PolarLabel setText(String text)
    {
        this.text = text;
        return this;
    }

    /**
     * @return the min
     */
    public Integer getMin()
    {
        return min;
    }

    /**
     * @param min
     *            the min to set
     */
    public PolarLabel setMin(Integer min)
    {
        this.min = min;
        return this;
    }

    /**
     * @return the max
     */
    public Integer getMax()
    {
        return max;
    }

    /**
     * @param max
     *            the max to set
     */
    public PolarLabel setMax(Integer max)
    {
        this.max = max;
        return this;
    }

    /**
     * @return the axisLabel
     */
    public AxisLabel getAxisLabel()
    {
        return axisLabel;
    }

    /**
     * @param axisLabel
     *            the axisLabel to set
     */
    public PolarLabel setAxisLabel(AxisLabel axisLabel)
    {
        this.axisLabel = axisLabel;
        return this;
    }
}
