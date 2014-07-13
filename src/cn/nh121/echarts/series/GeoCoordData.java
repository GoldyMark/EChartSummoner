/**
 * 
 */
package cn.nh121.echarts.series;


/**
 * @author ODMark
 * @creation 2014-7-12
 */
public class GeoCoordData
{
    private Float x;
    private Float y;

    public GeoCoordData(Float x, Float y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public Float getX()
    {
        return x;
    }

    /**
     * @param x
     *            the x to set
     */
    public GeoCoordData setX(Float x)
    {
        this.x = x;
        return this;
    }

    /**
     * @return the y
     */
    public Float getY()
    {
        return y;
    }

    /**
     * @param y
     *            the y to set
     */
    public GeoCoordData setY(Float y)
    {
        this.y = y;
        return this;
    }
}
