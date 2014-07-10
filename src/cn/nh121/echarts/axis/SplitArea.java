package cn.nh121.echarts.axis;

import cn.nh121.echarts.style.AreaStyle;

public class SplitArea
{
    /**
     * 类型：通用
     * 说明：
     * 是否显示，默认为false，设为true后带如下默认样式<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean   show;

    /**
     * 类型：类目型
     * 说明：
     * 分隔区域是否显示为间隔，默认等于boundaryGap<br>
     * 
     * 默认值：
     * null
     */
    private Boolean   onGap;

    /**
     * 类型：通用
     * 说明：
     * 属性areaStyle（详见areaStyle）控制区域样式，颜色数组实现间隔变换。<br>
     * 
     * 默认值：
     * {color: ['rgba(250,250,250,0.3)','rgba(200,200,200,0.3)']}
     */
    private AreaStyle areaStyle;

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
    public SplitArea setShow(Boolean show)
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
    public SplitArea setOnGap(Boolean onGap)
    {
        this.onGap = onGap;
        return this;
    }

    /**
     * @return the areaStyle
     */
    public AreaStyle getAreaStyle()
    {
        return areaStyle;
    }

    /**
     * @param areaStyle
     *            the areaStyle to set
     */
    public SplitArea setAreaStyle(AreaStyle areaStyle)
    {
        this.areaStyle = areaStyle;
        return this;
    }

}
