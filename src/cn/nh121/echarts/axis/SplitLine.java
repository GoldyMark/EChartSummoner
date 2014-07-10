package cn.nh121.echarts.axis;

import cn.nh121.echarts.style.LineStyle;

public class SplitLine
{
    /**
     * 类型：通用
     * 说明：
     * 是否显示，默认为true，设为false后下面都没意义了<br>
     * 
     * 默认值：
     * TRUE
     */
    private Boolean   show;

    /**
     * 类型：类目型
     * 说明：
     * 分隔线是否显示为间隔，默认等于boundaryGap<br>
     * 
     * 默认值：
     * null
     */
    private Boolean   onGap;

    /**
     * 类型：通用
     * 说明：
     * 属性lineStyle控制线条样式，（详见lineStyle）<br>
     * 
     * 默认值：
     * {color: ['#ccc'], width: 1, type: 'solid'}
     */
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
    public SplitLine setShow(Boolean show)
    {
        this.show = show;
        return this;
    }

    /**
     * @return the onGap
     */
    public Boolean getOnGap()
    {
        return onGap;
    }

    /**
     * @param onGap
     *            the onGap to set
     */
    public SplitLine setOnGap(Boolean onGap)
    {
        this.onGap = onGap;
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
    public SplitLine setLineStyle(LineStyle lineStyle)
    {
        this.lineStyle = lineStyle;
        return this;
    }

}
