/**
 * 
 */
package cn.nh121.echarts.series.markpoint;

/**
 * @author ODMark
 * @creation 2014-7-12
 */
public class MapMarkPointData extends AMarkPointData
{
    private Number value;

    /**
     * @param value
     */
    public MapMarkPointData(String name, Number value)
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
    public MapMarkPointData setValue(Number value)
    {
        this.value = value;
        return this;
    }
}
