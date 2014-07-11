package cn.nh121.echarts.polar;

import cn.nh121.echarts.style.LineStyle;

/**
 * 坐标轴线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
 * 
 * @author ODMark
 * @creation 2014-7-11
 * 
 */
public class PolarAxisLine
{
    private Boolean   show;
    private LineStyle lineStyle;

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
    public PolarAxisLine setShow(Boolean show)
    {
        this.show = show;
        return this;
    }

    /**
     * @return the lineStyle
     */
    public LineStyle getLineStyle()
    {
        return lineStyle;
    }

    /**
     * @param lineStyle
     *            the lineStyle to set
     */
    public PolarAxisLine setLineStyle(LineStyle lineStyle)
    {
        this.lineStyle = lineStyle;
        return this;
    }
}
