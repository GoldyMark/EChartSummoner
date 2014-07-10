package cn.nh121.echarts.axis;

import cn.nh121.echarts.style.LineStyle;

public class AxisTick
{
    /**
     * 类型：通用
     * 说明：
     * 是否显示，默认为false，设为true后下面为默认样式<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean   show;

    /**
     * 类型：类目型
     * 说明：
     * 小标记显示挑选间隔，默认为'auto'，可选为：
     * 'auto'（自动隐藏显示不下的） | 0（全部显示） | {number}（用户指定选择间隔）<br>
     * 注意：如果设置interval为-1，则设置为null，即默认值
     * 
     * 默认值：
     * 'auto'
     */
    private Integer   interval;

    /**
     * 类型：类目型
     * 说明：
     * 小标记是否显示为间隔，默认等于boundaryGap<br>
     * 
     * 默认值：
     * null
     */
    private Boolean   onGap;

    /**
     * 类型：通用
     * 说明：
     * 小标记是否显示为在grid内部，默认在外部<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean   inside;

    /**
     * 类型：通用
     * 说明：
     * 属性length控制线长<br>
     * 
     * 默认值：
     * 5
     */
    private Integer   length;

    /**
     * 类型：通用
     * 说明：
     * 属性lineStyle控制线条样式，（详见lineStyle）<br>
     * 
     * 默认值：
     * {color: '#333', width: 1}
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
    public AxisTick setShow(Boolean show)
    {
        this.show = show;
        return this;
    }

    /**
     * @return the interval
     */
    public Integer getInterval()
    {
        return interval;
    }

    /**
     * @param interval
     *            the interval to set<br>
     *            注意：如果设置interval为-1，则设置为null，即默认值
     */
    public AxisTick setInterval(Integer interval)
    {
        if (interval == -1)
            this.interval = null;
        else
            this.interval = interval;
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
    public AxisTick setOnGap(Boolean onGap)
    {
        this.onGap = onGap;
        return this;
    }

    /**
     * @return the inside
     */
    public Boolean getInside()
    {
        return inside;
    }

    /**
     * @param inside
     *            the inside to set
     */
    public AxisTick setInside(Boolean inside)
    {
        this.inside = inside;
        return this;
    }

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
    public AxisTick setLength(Integer length)
    {
        this.length = length;
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
    public AxisTick setLineStyle(LineStyle lineStyle)
    {
        this.lineStyle = lineStyle;
        return this;
    }

}
