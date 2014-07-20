/**
 * 
 */
package cn.nh121.echarts.series;

import cn.nh121.echarts.core.EColor;
import cn.nh121.echarts.style.TextStyle;

/**
 * @author ODMark
 * @creation 2014-7-19
 */
public class GaugeDetail
{
    /**
     * 属性show控制显示与否
     */
    private Boolean   show;

    /**
     * 属性backgroundColor控制边框颜色
     */
    private EColor    backgroundColor;

    /**
     * 属性borderWidth控制边框线宽
     */
    private Integer   borderWidth;

    /**
     * 属性borderColor控制边框颜色
     */
    private EColor    borderColor;

    /**
     * 属性width控制详情宽度
     */
    private Integer   width;

    /**
     * 属性height控制详情高度
     */
    private Integer   height;

    /**
     * 属性offsetCenter用于详情定位，数组为横纵相对仪表盘圆心坐标偏移，支持百分比（相对外半径）
     */
    private Object[]  offsetCenter = new Object[2];

    /**
     * 属性formatter可以格式化文本
     */
    private String    formatter;

    /**
     * 属性textStyle（详见textStyle）控制文本样式
     */
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
    public GaugeDetail setShow(Boolean show)
    {
        this.show = show;
        return this;
    }

    /**
     * @return the backgroundColor
     */
    public EColor getBackgroundColor()
    {
        return backgroundColor;
    }

    /**
     * @param backgroundColor
     *            the backgroundColor to set
     */
    public GaugeDetail setBackgroundColor(EColor backgroundColor)
    {
        this.backgroundColor = backgroundColor;
        return this;
    }

    /**
     * @return the borderWidth
     */
    public Integer getBorderWidth()
    {
        return borderWidth;
    }

    /**
     * @param borderWidth
     *            the borderWidth to set
     */
    public GaugeDetail setBorderWidth(Integer borderWidth)
    {
        this.borderWidth = borderWidth;
        return this;
    }

    /**
     * @return the borderColor
     */
    public EColor getBorderColor()
    {
        return borderColor;
    }

    /**
     * @param borderColor
     *            the borderColor to set
     */
    public GaugeDetail setBorderColor(EColor borderColor)
    {
        this.borderColor = borderColor;
        return this;
    }

    /**
     * @return the width
     */
    public Integer getWidth()
    {
        return width;
    }

    /**
     * @param width
     *            the width to set
     */
    public GaugeDetail setWidth(Integer width)
    {
        this.width = width;
        return this;
    }

    /**
     * @return the height
     */
    public Integer getHeight()
    {
        return height;
    }

    /**
     * @param height
     *            the height to set
     */
    public GaugeDetail setHeight(Integer height)
    {
        this.height = height;
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
    public GaugeDetail setOffsetCenter(Object[] offsetCenter)
    {
        this.offsetCenter = offsetCenter;
        return this;
    }

    public GaugeDetail setOffsetCenter(Object xOffset, Object yOffset)
    {
        this.offsetCenter[0] = xOffset;
        this.offsetCenter[1] = yOffset;
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
    public GaugeDetail setFormatter(String formatter)
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
    public GaugeDetail setTextStyle(TextStyle textStyle)
    {
        this.textStyle = textStyle;
        return this;
    }
}
