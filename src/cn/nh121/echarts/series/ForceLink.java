/**
 * 
 */
package cn.nh121.echarts.series;

/**
 * @author ODMark
 * @creation 2014-7-19
 */
public class ForceLink
{
    private Integer source;
    private Integer target;
    private Integer weight;

    /**
     * @return the source
     */
    public Integer getSource()
    {
        return source;
    }

    /**
     * @param source
     *            the source to set
     */
    public ForceLink setSource(Integer source)
    {
        this.source = source;
        return this;
    }

    /**
     * @return the target
     */
    public Integer getTarget()
    {
        return target;
    }

    /**
     * @param target
     *            the target to set
     */
    public ForceLink setTarget(Integer target)
    {
        this.target = target;
        return this;
    }

    /**
     * @return the weight
     */
    public Integer getWeight()
    {
        return weight;
    }

    /**
     * @param weight
     *            the weight to set
     */
    public ForceLink setWeight(Integer weight)
    {
        this.weight = weight;
        return this;
    }
}
