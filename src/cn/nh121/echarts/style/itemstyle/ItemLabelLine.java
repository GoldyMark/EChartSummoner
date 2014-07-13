/**
 * 
 */
package cn.nh121.echarts.style.itemstyle;

import cn.nh121.echarts.style.LineStyle;

/**
 * @author ODMark
 * @creation 2014-7-11
 */
public class ItemLabelLine
{
    /**
     * 说明：
     * 饼图标签视觉引导线显示策略，可选为：true（显示） | false（隐藏）<br>
     * 
     * 默认值：
     * TRUE
     */
    private Boolean   show;

    /**
     * 说明：
     * 线长 ，从外圆边缘起计算，可为负值<br>
     * 
     * 默认值：
     * 40
     */
    private Integer   length;

    /**
     * 说明：
     * 线条样式，详见lineStyle<br>
     * 
     * 默认值：
     * 各异
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
    public ItemLabelLine setShow(Boolean show)
    {
        this.show = show;
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
    public ItemLabelLine setLength(Integer length)
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
    public ItemLabelLine setLineStyle(LineStyle lineStyle)
    {
        this.lineStyle = lineStyle;
        return this;
    }

}
