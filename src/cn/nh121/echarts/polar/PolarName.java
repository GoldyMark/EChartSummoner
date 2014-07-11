package cn.nh121.echarts.polar;

import cn.nh121.echarts.style.TextStyle;

/**
 * 坐标轴名称
 * 
 * @author ODMark
 * @creation 2014-7-11
 * 
 */
public class PolarName
{
    private Boolean   show;
    private String    formatter;
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
    public PolarName setShow(Boolean show)
    {
        this.show = show;
        return this;
    }

    /**
     * @return the formatter
     */
    public String getFormatter()
    {
        return formatter;
    }

    /**
     * @param formatter
     *            the formatter to set
     */
    public PolarName setFormatter(String formatter)
    {
        this.formatter = formatter;
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
    public PolarName setTextStyle(TextStyle textStyle)
    {
        this.textStyle = textStyle;
        return this;
    }
}
