/**
 * 
 */
package cn.nh121.echarts.style;

import cn.nh121.echarts.style.itemstyle.Emphasis;
import cn.nh121.echarts.style.itemstyle.Normal;

/**
 * @author ODMark
 * @creation 2014-7-11
 * @link http://echarts.baidu.com/doc/doc.html#ItemStyle
 */
public class ItemStyle
{
    /**
     * 普通样式
     */
    private Normal   normal;

    /**
     * 高亮样式
     */
    private Emphasis emphasis;

    /**
     * @return the normal
     */
    public Normal getNormal()
    {
        return normal;
    }

    /**
     * @param normal
     *            the normal to set
     */
    public ItemStyle setNormal(Normal normal)
    {
        this.normal = normal;
        return this;
    }

    /**
     * @return the emphasis
     */
    public Emphasis getEmphasis()
    {
        return emphasis;
    }

    /**
     * @param emphasis
     *            the emphasis to set
     */
    public ItemStyle setEmphasis(Emphasis emphasis)
    {
        this.emphasis = emphasis;
        return this;
    }
}
