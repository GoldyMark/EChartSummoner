/**
 * 
 */
package cn.nh121.echarts.series;

import cn.nh121.echarts.core.EColor;

/**
 * 
 * 说明：
 * 标注图形炫光特效:
 * show 是否开启，默认关闭
 * period 运动周期，无单位，值越大越慢，默认为15
 * scaleSize 放大倍数，以markPoint symbolSize为基准
 * color 炫光颜色，默认跟随markPoint itemStyle定义颜色,
 * shadowColor 光影颜色，默认跟随color
 * shadowBlur 光影模糊度，默认为0 <br>
 * 
 * 默认值：
 * {
 * show: false,
 * period: 15,
 * scaleSize : 2,
 * color : null,
 * shadowColor : null,
 * shadowBlur : 0
 * }
 * 
 * @author ODMark
 * @creation 2014-7-12
 */
public class SeriesEffect
{
    /**
     * 是否开启，默认关闭
     */
    private Boolean show;

    /**
     * 运动周期，无单位，值越大越慢，默认为15
     */
    private Integer period;

    /**
     * 放大倍数，以markPoint symbolSize为基准
     */
    private Integer scaleSize;

    /**
     * 炫光颜色，默认跟随markPoint itemStyle定义颜色
     */
    private EColor  color;

    /**
     * 光影颜色，默认跟随color
     */
    private EColor  shadowColor;

    /**
     * 光影模糊度，默认为0
     */
    private Integer shadowBlur;

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
    public SeriesEffect setShow(Boolean show)
    {
        this.show = show;
        return this;
    }

    /**
     * @return the period
     */
    public Integer getPeriod()
    {
        return period;
    }

    /**
     * @param period
     *            the period to set
     */
    public SeriesEffect setPeriod(Integer period)
    {
        this.period = period;
        return this;
    }

    /**
     * @return the scaleSize
     */
    public Integer getScaleSize()
    {
        return scaleSize;
    }

    /**
     * @param scaleSize
     *            the scaleSize to set
     */
    public SeriesEffect setScaleSize(Integer scaleSize)
    {
        this.scaleSize = scaleSize;
        return this;
    }

    /**
     * @return the color
     */
    public EColor getColor()
    {
        return color;
    }

    /**
     * @param color
     *            the color to set
     */
    public SeriesEffect setColor(EColor color)
    {
        this.color = color;
        return this;
    }

    /**
     * @return the shadowColor
     */
    public EColor getShadowColor()
    {
        return shadowColor;
    }

    /**
     * @param shadowColor
     *            the shadowColor to set
     */
    public SeriesEffect setShadowColor(EColor shadowColor)
    {
        this.shadowColor = shadowColor;
        return this;
    }

    /**
     * @return the shadowBlur
     */
    public Integer getShadowBlur()
    {
        return shadowBlur;
    }

    /**
     * @param shadowBlur
     *            the shadowBlur to set
     */
    public SeriesEffect setShadowBlur(Integer shadowBlur)
    {
        this.shadowBlur = shadowBlur;
        return this;
    }

}
