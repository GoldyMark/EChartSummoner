/**
 * 
 */
package cn.nh121.echarts.series;

/**
 * @author ODMark
 * @creation 2014-7-19
 */
public class ForceNode
{
    private String  name;
    private Integer value;
    private Integer category;

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
    public ForceNode setName(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * @return the value
     */
    public Integer getValue()
    {
        return value;
    }

    /**
     * @param value
     *            the value to set
     */
    public ForceNode setValue(Integer value)
    {
        this.value = value;
        return this;
    }

    /**
     * @return the category
     */
    public Integer getCategory()
    {
        return category;
    }

    /**
     * @param category
     *            the category to set
     */
    public ForceNode setCategory(Integer category)
    {
        this.category = category;
        return this;
    }
}
