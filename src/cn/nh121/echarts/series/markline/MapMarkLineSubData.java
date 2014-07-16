/**
 * 
 */
package cn.nh121.echarts.series.markline;

/**
 * @author ODMark
 * @creation 2014-7-14
 */
public class MapMarkLineSubData extends AMarkLineSubData
{
    private Number value;

    public MapMarkLineSubData(String name)
    {
        super(name);
    }

    public MapMarkLineSubData(String name, Number value)
    {
        super(name);
        this.value = value;
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
    public MapMarkLineSubData setValue(Number value)
    {
        this.value = value;
        return this;
    }
}
