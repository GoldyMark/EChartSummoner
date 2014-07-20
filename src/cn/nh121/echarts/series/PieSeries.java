package cn.nh121.echarts.series;

/**
 * 
 * @author ODMark
 * @creation 2014-7-19
 * @link http://echarts.baidu.com/doc/doc.html#SeriesPie
 */
public class PieSeries extends ASeries
{
    /**
     * 说明：
     * 圆心坐标，支持绝对值（px）和百分比，百分比计算min(width, height) * 50%<br>
     * 
     * 默认值：
     * ['50%', '50%']
     */
    private String[]            center;

    /**
     * 说明：
     * 半径，支持绝对值（px）和百分比，百分比计算比，min(width, height) / 2 * 75%， 传数组实现环形图，[内半径，外半径]<br>
     * 
     * 默认值：
     * [0, '75%']
     */
    private Object              radius;

    /**
     * 说明：
     * 开始角度, 饼图（90）、仪表盘（225），有效输入范围：[-360,360]<br>
     * 
     * 默认值：
     * 90
     */
    private Integer             startAngle;

    /**
     * 说明：
     * 最小角度，可用于防止某item的值过小而影响交互<br>
     * 
     * 默认值：
     * 0
     */
    private Integer             minAngle;

    /**
     * 说明：
     * 显示是否顺时针<br>
     * 
     * 默认值：
     * TRUE
     */
    private Boolean             clockWise;

    /**
     * 说明：
     * 南丁格尔玫瑰图模式，'radius'（半径） | 'area'（面积）<br>
     * 
     * 默认值：
     * null
     */
    private ERoseType           roseType;

    /**
     * 说明：
     * 选中是扇区偏移量<br>
     * 
     * 默认值：
     * 10
     */
    private Integer             selectedOffset;

    /**
     * 说明：
     * 选中模式，默认关闭，可选single，multiple<br>
     * 
     * 默认值：
     * null
     */
    private ESeriesSelectedMode selectedMode;

    /**
     * @return the center
     */
    public String[] getCenter()
    {
        return center;
    }

    /**
     * @param center
     *            the center to set
     */
    public PieSeries setCenter(String[] center)
    {
        this.center = center;
        return this;
    }

    /**
     * @return the radius
     */
    public Object getRadius()
    {
        return radius;
    }

    /**
     * @param radius
     *            the radius to set
     */
    public PieSeries setRadius(Object radius)
    {
        this.radius = radius;
        return this;
    }

    /**
     * @return the startAngle
     */
    public Integer getStartAngle()
    {
        return startAngle;
    }

    /**
     * @param startAngle
     *            the startAngle to set
     */
    public PieSeries setStartAngle(Integer startAngle)
    {
        this.startAngle = startAngle;
        return this;
    }

    /**
     * @return the minAngle
     */
    public Integer getMinAngle()
    {
        return minAngle;
    }

    /**
     * @param minAngle
     *            the minAngle to set
     */
    public PieSeries setMinAngle(Integer minAngle)
    {
        this.minAngle = minAngle;
        return this;
    }

    /**
     * @return the clockWise
     */
    public Boolean getClockWise()
    {
        return clockWise;
    }

    /**
     * @param clockWise
     *            the clockWise to set
     */
    public PieSeries setClockWise(Boolean clockWise)
    {
        this.clockWise = clockWise;
        return this;
    }

    /**
     * @return the roseType
     */
    public ERoseType getRoseType()
    {
        return roseType;
    }

    /**
     * @param roseType
     *            the roseType to set
     */
    public PieSeries setRoseType(ERoseType roseType)
    {
        this.roseType = roseType;
        return this;
    }

    /**
     * @return the selectedOffset
     */
    public Integer getSelectedOffset()
    {
        return selectedOffset;
    }

    /**
     * @param selectedOffset
     *            the selectedOffset to set
     */
    public PieSeries setSelectedOffset(Integer selectedOffset)
    {
        this.selectedOffset = selectedOffset;
        return this;
    }

    /**
     * @return the selectedMode
     */
    public ESeriesSelectedMode getSelectedMode()
    {
        return selectedMode;
    }

    /**
     * @param selectedMode
     *            the selectedMode to set
     */
    public PieSeries setSelectedMode(ESeriesSelectedMode selectedMode)
    {
        this.selectedMode = selectedMode;
        return this;
    }
}
