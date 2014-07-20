/**
 * 
 */
package cn.nh121.echarts.series;

import cn.nh121.echarts.style.ItemStyle;

/**
 * @author ODMark
 * @creation 2014-7-19
 */
public class ForceCategory
{
    private String    name;
    private ItemStyle itemStyle;

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
    public ForceCategory setName(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * @return the itemStyle
     */
    public ItemStyle getItemStyle()
    {
        return itemStyle;
    }

    /**
     * @param itemStyle
     *            the itemStyle to set
     */
    public ForceCategory setItemStyle(ItemStyle itemStyle)
    {
        this.itemStyle = itemStyle;
        return this;
    }
}
