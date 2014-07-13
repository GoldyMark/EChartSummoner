/**
 * 
 */
package cn.nh121.echarts.style.itemstyle;

import cn.nh121.echarts.style.TextStyle;

/**
 * @author ODMark
 * @creation 2014-7-11
 */
public class ItemLabel
{
    /**
     * 说明：
     * 标签显示策略，可选为：true（显示） | false（隐藏）<br>
     * 
     * 默认值：
     * TRUE
     */
    private Boolean            show;

    /**
     * 说明：
     * 标签显示位置，地图标签不可指定位置
     * 饼图可选为：'outer'（外部） | 'inner'（内部），
     * 折线图，柱形图，K线图，散点图默认根据布局自适应为'top'或者'right'，可选的还有：'inside' | 'left' |
     * 'bottom'
     * 柱形图可选的还有，'insideLeft' | 'insideRight' | 'insideTop' | 'insideBottom'<br>
     * 
     * 默认值：
     * 'outer' | null
     */
    private EItemLabelPosition position;

    /**
     * 说明：
     * 和弦图有效，文本标签自动旋转<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean            rotate;

    /**
     * 说明：
     * 和弦图有效，文本标签旋转后于弦的间隔<br>
     * 
     * 默认值：
     * 10
     */
    private Integer            distance;

    /**
     * 说明：
     * 标签文本格式器，通用，同Tooltip.formatter，支持模板、方法回调，不支持异步回调<br>
     * 
     * 默认值：
     * null
     */
    private String             formatter;

    /**
     * 说明：
     * 标签的文本样式（详见textStyle）<br>
     * 
     * 默认值：
     * null
     */
    private TextStyle          textStyle;

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
    public ItemLabel setShow(Boolean show)
    {
        this.show = show;
        return this;
    }

    /**
     * @return the position
     */
    public EItemLabelPosition getPosition()
    {
        return position;
    }

    /**
     * @param position
     *            the position to set
     */
    public ItemLabel setPosition(EItemLabelPosition position)
    {
        this.position = position;
        return this;
    }

    /**
     * @return the rotate
     */
    public Boolean getRotate()
    {
        return rotate;
    }

    /**
     * @param rotate
     *            the rotate to set
     */
    public ItemLabel setRotate(Boolean rotate)
    {
        this.rotate = rotate;
        return this;
    }

    /**
     * @return the distance
     */
    public Integer getDistance()
    {
        return distance;
    }

    /**
     * @param distance
     *            the distance to set
     */
    public ItemLabel setDistance(Integer distance)
    {
        this.distance = distance;
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
    public ItemLabel setFormatter(String formatter)
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
    public ItemLabel setTextStyle(TextStyle textStyle)
    {
        this.textStyle = textStyle;
        return this;
    }

}
