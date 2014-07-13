/**
 * 
 */
package cn.nh121.echarts.style.itemstyle;

import cn.nh121.echarts.core.EColor;
import cn.nh121.echarts.style.AreaStyle;
import cn.nh121.echarts.style.LineStyle;

/**
 * @author ODMark
 * @creation 2014-7-11
 */
public class Normal
{
    /**
     * 类型：通用
     * 说明：
     * 颜色，主色<br>
     * 
     * 默认值：
     * 图表各异
     */
    private EColor        color;

    /**
     * 类型：折线图，K线图 ，地图，markLine
     * 说明：
     * 线条样式，详见lineStyle<br>
     * 
     * 默认值：
     * 图表各异
     */
    private LineStyle     lineStyle;

    /**
     * 类型：堆积折线图，地图
     * 说明：
     * 区域样式，详见areaStyle<br>
     * 
     * 默认值：
     * 图表各异
     */
    private AreaStyle     areaStyle;

    /**
     * 类型：和弦图
     * 说明：
     * 弦样式，详见chordStyle<br>
     * 
     * 默认值：
     * 图表各异
     */
    // TOFIX 官网还没有chrodStyle的文档
    // private ChordStyle chordStyle;

    /**
     * 类型：柱形图，折线图（symbol），散点图（symbole），饼图，markPoint
     * 说明：
     * 柱形边框颜色<br>
     * 
     * 默认值：
     * '#fff'
     */
    private EColor        borderColor;

    /**
     * 类型：柱形图
     * 说明：
     * 柱形边框圆角，单位px，默认为0<br>
     * 
     * 默认值：
     * 0
     */
    private Integer       borderRadius;

    /**
     * 类型：柱形图，折线图（symbol），散点图（symbole），饼图，markPoint
     * 说明：
     * 柱形边框线宽，单位px，默认为1<br>
     * 
     * 默认值：
     * 1
     */
    private Integer       borderWidth;

    /**
     * 类型：折线图，柱形图，K线图，散点图，饼图 ，地图，力导向，markPoint，markLine
     * 说明：
     * 标签，饼图默认显示在外部，离饼图距离由labelLine.length决定，地图标签不可指定位置
     * 折线图，柱形图，K线图，散点图可指定position见下<br>
     * 
     * 默认值：
     * {show: true, position:'outer'}
     */
    private ItemLabel     label;

    /**
     * 类型：饼图
     * 说明：
     * 饼图标签视觉引导线，默认显示<br>
     * 
     * 默认值：
     * {show: true}
     */
    private ItemLabelLine labelLine;

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
    public Normal setColor(EColor color)
    {
        this.color = color;
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
    public Normal setLineStyle(LineStyle lineStyle)
    {
        this.lineStyle = lineStyle;
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
    public Normal setAreaStyle(AreaStyle areaStyle)
    {
        this.areaStyle = areaStyle;
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
    public Normal setBorderColor(EColor borderColor)
    {
        this.borderColor = borderColor;
        return this;
    }

    /**
     * @return the borderRadius
     */
    public Integer getBorderRadius()
    {
        return borderRadius;
    }

    /**
     * @param borderRadius
     *            the borderRadius to set
     */
    public Normal setBorderRadius(Integer borderRadius)
    {
        this.borderRadius = borderRadius;
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
    public Normal setBorderWidth(Integer borderWidth)
    {
        this.borderWidth = borderWidth;
        return this;
    }

    /**
     * @return the label
     */
    public ItemLabel getLabel()
    {
        return label;
    }

    /**
     * @param label
     *            the label to set
     */
    public Normal setLabel(ItemLabel label)
    {
        this.label = label;
        return this;
    }

    /**
     * @return the labelLine
     */
    public ItemLabelLine getLabelLine()
    {
        return labelLine;
    }

    /**
     * @param labelLine
     *            the labelLine to set
     */
    public Normal setLabelLine(ItemLabelLine labelLine)
    {
        this.labelLine = labelLine;
        return this;
    }

}
