package cn.nh121.echarts.series.markline;

public class XYMarkLineSubData extends AMarkLineSubData
{
    private Number        value;
    private Object        xAxis;
    private Object        yAxis;
    private EMarkLineType type;
    private Integer       valueIndex;

    public XYMarkLineSubData(String name, Object xAxis, Object yAxis)
    {
        super(name);
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public XYMarkLineSubData(String name, Number value, Object xAxis, Object yAxis)
    {
        this(name, xAxis, yAxis);
        this.value = value;
    }

    public XYMarkLineSubData(String name, EMarkLineType type)
    {
        super(name);
        this.type = type;
    }

    public XYMarkLineSubData(String name, EMarkLineType type, Integer valueIndex)
    {
        this(name, type);
        this.valueIndex = valueIndex;
    }

    /**
     * @return the value
     */
    public Number getValue()
    {
        return value;
    }

    /**
     * @param value
     *            the value to set
     */
    public XYMarkLineSubData setValue(Number value)
    {
        this.value = value;
        return this;
    }

    /**
     * @return the xAxis
     */
    public Object getXAxis()
    {
        return xAxis;
    }

    /**
     * @param xAxis
     *            the xAxis to set
     */
    public XYMarkLineSubData setXAxis(Object xAxis)
    {
        this.xAxis = xAxis;
        return this;
    }

    /**
     * @return the yAxis
     */
    public Object getYAxis()
    {
        return yAxis;
    }

    /**
     * @param yAxis
     *            the yAxis to set
     */
    public XYMarkLineSubData setYAxis(Object yAxis)
    {
        this.yAxis = yAxis;
        return this;
    }

    /**
     * @return the type
     */
    public EMarkLineType getType()
    {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public XYMarkLineSubData setType(EMarkLineType type)
    {
        this.type = type;
        return this;
    }

    /**
     * @return the valueIndex
     */
    public Integer getValueIndex()
    {
        return valueIndex;
    }

    /**
     * @param valueIndex
     *            the valueIndex to set
     */
    public XYMarkLineSubData setValueIndex(Integer valueIndex)
    {
        this.valueIndex = valueIndex;
        return this;
    }
}
