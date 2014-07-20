/**
 * 
 */
package cn.nh121.echarts.series;

/**
 * @author ODMark
 * @creation 2014-7-19
 */
public class MapLocation
{
    private Object x;
    private Object y;
    private Object width;
    private Object height;

    /**
     * @return the x
     */
    public Object getX()
    {
        return x;
    }

    /**
     * @param x
     *            the x to set
     */
    public MapLocation setX(String x)
    {
        try
        {
            this.x = Double.valueOf(x).intValue();
        } catch (Exception e)
        {
            this.x = x;
        }
        return this;
    }

    /**
     * @return the y
     */
    public Object getY()
    {
        return y;
    }

    /**
     * @param y
     *            the y to set
     */
    public MapLocation setY(String y)
    {
        try
        {
            this.y = Double.valueOf(y).intValue();
        } catch (Exception e)
        {
            this.y = y;
        }
        return this;
    }

    /**
     * @return the width
     */
    public Object getWidth()
    {
        return width;
    }

    /**
     * @param width
     *            the width to set
     */
    public MapLocation setWidth(String width)
    {
        try
        {
            this.width = Double.valueOf(width).intValue();
        } catch (Exception e)
        {
            this.width = width;
        }
        return this;
    }

    /**
     * @return the height
     */
    public Object getHeight()
    {
        return height;
    }

    /**
     * @param height
     *            the height to set
     */
    public MapLocation setHeight(String height)
    {
        try
        {
            this.height = Double.valueOf(height).intValue();
        } catch (Exception e)
        {
            this.height = height;
        }
        return this;
    }
}
