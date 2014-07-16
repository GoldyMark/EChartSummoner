/**
 * 
 */
package cn.nh121.echarts.series.markpoint;

/**
 * @author ODMark
 * @creation 2014-7-12
 */
public class XYMarkPointData extends AMarkPointData
{
    private Number         value;
    private Object         xAxis;
    private Object         yAxis;
    private EMarkPointType type;

    /**
     * @param value
     * @param xAxis
     * @param yAxis
     * @param type
     */
    public XYMarkPointData(String name, Number value, Object xAxis, Object yAxis, EMarkPointType type)
    {
        super(name);
        this.value = value;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.type = type;
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
    public XYMarkPointData setValue(Number value)
    {
        this.value = value;
        return this;
    }

    /**
     * @return the xAxis
     */
    public Object getxAxis()
    {
        return xAxis;
    }

    /**
     * @param xAxis
     *            the xAxis to set
     */
    public XYMarkPointData setxAxis(Object xAxis)
    {
        this.xAxis = xAxis;
        return this;
    }

    /**
     * @return the yAxis
     */
    public Object getyAxis()
    {
        return yAxis;
    }

    /**
     * @param yAxis
     *            the yAxis to set
     */
    public XYMarkPointData setyAxis(Object yAxis)
    {
        this.yAxis = yAxis;
        return this;
    }

    /**
     * @return the type
     */
    public EMarkPointType getType()
    {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public XYMarkPointData setType(EMarkPointType type)
    {
        this.type = type;
        return this;
    }

}
