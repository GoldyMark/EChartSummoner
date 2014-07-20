/**
 * 
 */
package cn.nh121.echarts.series;

/**
 * @author ODMark
 * @creation 2014-7-19
 */
public class ScaleLimit
{
    private Number min;
    private Number max;

    /**
     * @return the min
     */
    public Number getMin()
    {
        return min;
    }

    /**
     * @param min
     *            the min to set
     */
    public ScaleLimit setMin(Number min)
    {
        this.min = min;
        return this;
    }

    /**
     * @return the max
     */
    public Number getMax()
    {
        return max;
    }

    /**
     * @param max
     *            the max to set
     */
    public ScaleLimit setMax(Number max)
    {
        this.max = max;
        return this;
    }
}
