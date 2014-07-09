package cn.nh121.echarts.timeline;

import cn.nh121.echarts.core.EColor;

/**
 * 时间轴当前点
 * 
 * @author ODMark
 * @creation 2014-7-8
 */
public class CheckPointStyle
{
    /**
     * 当前点symbol，默认随轴上的symbol
     */
    private String        symbol;

    /**
     * 当前点symbol大小，默认随轴上symbol大小
     */
    private String        symbolSize;

    /**
     * 当前点symbol颜色，默认为随当前点颜色，可指定具体颜色，如无则为'#1e90ff'
     */
    private EColor        color;

    /**
     * 当前点symbol边线颜色
     */
    private EColor        borderColor;

    /**
     * 当前点symbol边线宽度
     */
    private String        borderWidth;

    /**
     * 当前点symbol边线宽度
     */
    private TimelineLabel label;

    /**
     * @return the symbol
     */
    public String getSymbol()
    {
        return symbol;
    }

    /**
     * @return the symbolSize
     */
    public String getSymbolSize()
    {
        return symbolSize;
    }

    /**
     * @return the color
     */
    public EColor getColor()
    {
        return color;
    }

    /**
     * @return the borderColor
     */
    public EColor getBorderColor()
    {
        return borderColor;
    }

    /**
     * @return the borderWidth
     */
    public String getBorderWidth()
    {
        return borderWidth;
    }

    /**
     * @return the label
     */
    public TimelineLabel getLabel()
    {
        return label;
    }

    /**
     * @param symbol
     *            the symbol to set
     */
    public CheckPointStyle setSymbol(String symbol)
    {
        this.symbol = symbol;
        return this;
    }

    /**
     * @param symbolSize
     *            the symbolSize to set
     */
    public CheckPointStyle setSymbolSize(String symbolSize)
    {
        this.symbolSize = symbolSize;
        return this;
    }

    /**
     * @param color
     *            the color to set
     */
    public CheckPointStyle setColor(EColor color)
    {
        this.color = color;
        return this;
    }

    /**
     * @param borderColor
     *            the borderColor to set
     */
    public CheckPointStyle setBorderColor(EColor borderColor)
    {
        this.borderColor = borderColor;
        return this;
    }

    /**
     * @param borderWidth
     *            the borderWidth to set
     */
    public CheckPointStyle setBorderWidth(String borderWidth)
    {
        this.borderWidth = borderWidth;
        return this;
    }

    /**
     * @param label
     *            the label to set
     */
    public CheckPointStyle setLabel(TimelineLabel label)
    {
        this.label = label;
        return this;
    }
}
