/**
 * 
 */
package cn.nh121.echarts.series.markpoint;

/**
 * @author ODMark
 * @creation 2014-7-12
 */
public abstract class AMarkPointData
{
    private String name;

    public AMarkPointData(String name)
    {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public AMarkPointData setName(String name)
    {
        this.name = name;
        return this;
    }
}
