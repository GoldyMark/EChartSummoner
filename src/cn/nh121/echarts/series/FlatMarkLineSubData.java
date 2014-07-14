/**
 * 
 */
package cn.nh121.echarts.series;

/**
 * @author ODMark
 * @creation 2014-7-14
 */
public class FlatMarkLineSubData extends AMarkLineSubData
{
    private Number  value;
    private Integer x;
    private Integer y;

    public FlatMarkLineSubData(String name, Number value, Integer x, Integer y)
    {
        super(name);
        this.value = value;
        this.x = x;
        this.y = y;
    }

    public FlatMarkLineSubData(String name, Integer x, Integer y)
    {
        super(name);
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
    public FlatMarkLineSubData setValue(Number value)
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
    public FlatMarkLineSubData setX(Integer x)
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
    public FlatMarkLineSubData setY(Integer y)
    {
        this.y = y;
        return this;
    }
}
