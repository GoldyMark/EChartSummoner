package cn.nh121.echarts.style;

import cn.nh121.echarts.core.EColor;

public class LineStyle
{
    /**
     * 说明：
     * 颜色<br>
     * 
     * 默认值：
     * 各异
     */
    private EColor    color;

    /**
     * 说明：
     * 线条样式，可选为：'solid' | 'dotted' | 'dashed'<br>
     * 
     * 默认值：
     * 'solid'
     */
    private ELineType type;

    /**
     * 说明：
     * 线宽<br>
     * 
     * 默认值：
     * 各异
     */
    private Integer   width;

    /**
     * 说明：
     * 折线主线(IE8+)有效，阴影色彩，支持rgba<br>
     * 
     * 默认值：
     * rgba(0,0,0,0)
     */
    private EColor    shadowColor;

    /**
     * 说明：
     * 折线主线(IE8+)有效，阴影模糊度，大于0有效<br>
     * 
     * 默认值：
     * 5
     */
    private Integer   shadowBlur;

    /**
     * 说明：
     * 折线主线(IE8+)有效，阴影横向偏移，正值往右，负值往左<br>
     * 
     * 默认值：
     * 3
     */
    private Integer   shadowOffsetX;

    /**
     * 说明：
     * 折线主线(IE8+)有效，阴影纵向偏移，正值往下，负值往上<br>
     * 
     * 默认值：
     * 3
     */
    private Integer   shadowOffsetY;

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
    public LineStyle setColor(EColor color)
    {
        this.color = color;
        return this;
    }

    /**
     * @return the type
     */
    public ELineType getType()
    {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public LineStyle setType(ELineType type)
    {
        this.type = type;
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
    public LineStyle setWidth(Integer width)
    {
        this.width = width;
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
    public LineStyle setShadowColor(EColor shadowColor)
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
    public LineStyle setShadowBlur(Integer shadowBlur)
    {
        this.shadowBlur = shadowBlur;
        return this;
    }

    /**
     * @return the shadowOffsetX
     */
    public Integer getShadowOffsetX()
    {
        return shadowOffsetX;
    }

    /**
     * @param shadowOffsetX
     *            the shadowOffsetX to set
     */
    public LineStyle setShadowOffsetX(Integer shadowOffsetX)
    {
        this.shadowOffsetX = shadowOffsetX;
        return this;
    }

    /**
     * @return the shadowOffsetY
     */
    public Integer getShadowOffsetY()
    {
        return shadowOffsetY;
    }

    /**
     * @param shadowOffsetY
     *            the shadowOffsetY to set
     */
    public LineStyle setShadowOffsetY(Integer shadowOffsetY)
    {
        this.shadowOffsetY = shadowOffsetY;
        return this;
    }

    public enum ELineType
    {
        SOLID, DOTTED, DASHED
    }
}
