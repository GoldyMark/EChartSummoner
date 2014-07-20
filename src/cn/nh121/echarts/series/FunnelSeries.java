/**
 * 
 */
package cn.nh121.echarts.series;

import cn.nh121.echarts.kit.NumberKit;

/**
 * @author ODMark
 * @creation 2014-7-19
 * @link http://echarts.baidu.com/doc/doc.html#SeriesFunnel
 */
public class FunnelSeries extends ASeries
{
    /**
     * 说明：
     * 左上角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)<br>
     * 
     * 默认值：
     * 80
     */
    private Object      x;

    /**
     * 说明：
     * 左上角纵坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域纵向中心)<br>
     * 
     * 默认值：
     * 60
     */
    private Object      y;

    /**
     * 说明：
     * 右下角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)<br>
     * 
     * 默认值：
     * 80
     */
    private Object      x2;

    /**
     * 说明：
     * 右下角纵坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域纵向中心)<br>
     * 
     * 默认值：
     * 60
     */
    private Object      y2;

    /**
     * 说明：
     * 总宽度，默认为绘图区总宽度 - x - x2，数值单位px，指定width后将忽略x2，支持百分比（字符串），如'50%'(显示区域一半的宽度)<br>
     * 
     * 默认值：
     * null
     */
    private Object      width;

    /**
     * 说明：
     * 总宽度，默认为绘图区总高度 - y - y2，数值单位px，指定width后将忽略x2，支持百分比（字符串），如'50%'(显示区域一半的高度)<br>
     * 
     * 默认值：
     * null
     */
    private Object      height;

    /**
     * 说明：
     * 指定的最小值<br>
     * 
     * 默认值：
     * 0
     */
    private Integer     min;

    /**
     * 说明：
     * 指定的最大值<br>
     * 
     * 默认值：
     * 100
     */
    private Integer     max;

    /**
     * 说明：
     * 最小值min映射到总宽度的比例，如果需要最小值的图形并不是尖端三角，可设置minSize实现<br>
     * 
     * 默认值：
     * '0%'
     */
    private String      minSize;

    /**
     * 说明：
     * 最大值max映射到总宽度的比例<br>
     * 
     * 默认值：
     * '100%'
     */
    private String      maxSize;

    /**
     * 说明：
     * 数据排序， 可以取ascending, descending<br>
     * 
     * 默认值：
     * 'descending'
     */
    private ESeriesSort sort;

    /**
     * 说明：
     * 数据图形间距<br>
     * 
     * 默认值：
     * 0
     */
    private Integer     gap;

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
    public FunnelSeries setX(String x)
    {
        this.x = NumberKit.stringOrNum(x);
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
    public FunnelSeries setY(String y)
    {
        this.y = NumberKit.stringOrNum(y);
        return this;
    }

    /**
     * @return the x2
     */
    public Object getX2()
    {
        return x2;
    }

    /**
     * @param x2
     *            the x2 to set
     */
    public FunnelSeries setX2(String x2)
    {
        this.x2 = NumberKit.stringOrNum(x2);
        return this;
    }

    /**
     * @return the y2
     */
    public Object getY2()
    {
        return y2;
    }

    /**
     * @param y2
     *            the y2 to set
     */
    public FunnelSeries setY2(String y2)
    {
        this.y2 = NumberKit.stringOrNum(y2);
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
    public FunnelSeries setWidth(String width)
    {
        this.width = NumberKit.stringOrNum(width);
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
    public FunnelSeries setHeight(String height)
    {
        this.height = NumberKit.stringOrNum(height);
        return this;
    }

    /**
     * @return the min
     */
    public Integer getMin()
    {
        return min;
    }

    /**
     * @param min
     *            the min to set
     */
    public FunnelSeries setMin(Integer min)
    {
        this.min = min;
        return this;
    }

    /**
     * @return the max
     */
    public Integer getMax()
    {
        return max;
    }

    /**
     * @param max
     *            the max to set
     */
    public FunnelSeries setMax(Integer max)
    {
        this.max = max;
        return this;
    }

    /**
     * @return the minSize
     */
    public String getMinSize()
    {
        return minSize;
    }

    /**
     * @param minSize
     *            the minSize to set
     */
    public FunnelSeries setMinSize(String minSize)
    {
        this.minSize = minSize;
        return this;
    }

    /**
     * @return the maxSize
     */
    public String getMaxSize()
    {
        return maxSize;
    }

    /**
     * @param maxSize
     *            the maxSize to set
     */
    public FunnelSeries setMaxSize(String maxSize)
    {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * @return the sort
     */
    public ESeriesSort getSort()
    {
        return sort;
    }

    /**
     * @param sort
     *            the sort to set
     */
    public FunnelSeries setSort(ESeriesSort sort)
    {
        this.sort = sort;
        return this;
    }

    /**
     * @return the gap
     */
    public Integer getGap()
    {
        return gap;
    }

    /**
     * @param gap
     *            the gap to set
     */
    public FunnelSeries setGap(Integer gap)
    {
        this.gap = gap;
        return this;
    }

}
