/**
 * 
 */
package cn.nh121.echarts.series;

import cn.nh121.echarts.style.TextStyle;

/**
 * @author ODMark
 * @creation 2014-7-19
 */
public class GaugeTitle
{
    private Boolean   show;
    private Object[]  offsetCenter = new Object[2];
    private TextStyle textStyle;

    /**
     * @return the show
     */
    public Boolean getShow()
    {
        return show;
    }

    /**
     * @param show
     *            the show to set
     */
    public GaugeTitle setShow(Boolean show)
    {
        this.show = show;
        return this;
    }

    /**
     * @return the offsetCenter
     */
    public Object[] getOffsetCenter()
    {
        return offsetCenter;
    }

    /**
     * @param offsetCenter
     *            the offsetCenter to set
     */
    public GaugeTitle setOffsetCenter(Object[] offsetCenter)
    {
        this.offsetCenter = offsetCenter;
        return this;
    }

    public GaugeTitle setOffsetCenter(Object xOffset, Object yOffset)
    {
        this.offsetCenter[0] = xOffset;
        this.offsetCenter[1] = yOffset;
        return this;
    }

    /**
     * @return the textStyle
     */
    public TextStyle getTextStyle()
    {
        return textStyle;
    }

    /**
     * @param textStyle
     *            the textStyle to set
     */
    public GaugeTitle setTextStyle(TextStyle textStyle)
    {
        this.textStyle = textStyle;
        return this;
    }
}
