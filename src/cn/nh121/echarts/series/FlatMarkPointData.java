/**
 * 
 */
package cn.nh121.echarts.series;

/**
 * @author ODMark
 * @creation 2014-7-12
 */
public class FlatMarkPointData extends AMarkPointData
{
    private Number  value;
    private Integer x;
    private Integer y;

    /**
     * @param name
     * @param value
     * @param x
     * @param y
     */
    public FlatMarkPointData(String name, Number value, Integer x, Integer y)
    {
        super(name);
        this.value = value;
        this.x = x;
        this.y = y;
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
    public FlatMarkPointData setValue(Number value)
    {
        this.value = value;
        return this;
    }

    /**
     * @return the x
     */
    public Integer getX()
    {
        return x;
    }

    /**
     * @param x
     *            the x to set
     */
    public FlatMarkPointData setX(Integer x)
    {
        this.x = x;
        return this;
    }

    /**
     * @return the y
     */
    public Integer getY()
    {
        return y;
    }

    /**
     * @param y
     *            the y to set
     */
    public FlatMarkPointData setY(Integer y)
    {
        this.y = y;
        return this;
    }
}
