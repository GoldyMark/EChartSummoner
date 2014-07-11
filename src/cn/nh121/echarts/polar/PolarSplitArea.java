package cn.nh121.echarts.polar;

import cn.nh121.echarts.style.AreaStyle;

/**
 * 分隔区域，默认不显示，属性show控制显示与否，属性areaStyle（详见areaStyle）控制区域样式
 * 
 * @author ODMark
 * @creation 2014-7-11
 * 
 */
public class PolarSplitArea
{
    private Boolean   show;
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
    public PolarSplitArea setShow(Boolean show)
    {
        this.show = show;
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
    public PolarSplitArea setAreaStyle(AreaStyle areaStyle)
    {
        this.areaStyle = areaStyle;
        return this;
    }

}
