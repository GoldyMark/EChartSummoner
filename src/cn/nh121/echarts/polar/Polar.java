package cn.nh121.echarts.polar;

import java.util.ArrayList;

import cn.nh121.echarts.kit.IntegerRangeCheckKit;

/**
 * 
 * @author ODMark
 * @creation 2014-7-11
 * @link http://echarts.baidu.com/doc/doc.html#Polar
 */
public class Polar
{
    /**
     * 说明：
     * 圆心坐标，支持绝对值（px）和百分比，百分比计算min(width, height) * 50%<br>
     * 
     * 默认值：
     * ['50%', '50%']
     */
    private Object[]              center;

    /**
     * 说明：
     * 半径，支持绝对值（px）和百分比，百分比计算min(width, height) / 2 * 75%,<br>
     * 
     * 默认值：
     * '75%'
     */
    private Object                radius;

    /**
     * 说明：
     * 开始角度, 有效输入范围：[-180,180]<br>
     * 
     * 默认值：
     * 90
     */
    private Integer               startAngle;

    /**
     * 说明：
     * 分割段数，默认为5<br>
     * 
     * 默认值：
     * 5
     */
    private Integer               splitNumber;

    /**
     * 说明：
     * 坐标轴名称<br>
     * 
     * 默认值：
     * {
     * show:true,
     * formatter:null,
     * textStyle:{color:#333}
     * }
     */
    private PolarName             name;

    /**
     * 说明：
     * 数值轴两端空白策略，数组内数值代表百分比，[原始数据最小值与最终最小值之间的差额，原始数据最大值与最终最大值之间的差额]<br>
     * 
     * 默认值：
     * [0, 0]
     */
    private Integer[]             boundaryGap = new Integer[2];

    /**
     * 说明：
     * 脱离0值比例，放大聚焦到最终_min，_max区间<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean               scale;

    /**
     * 说明：
     * 小数精度，默认为0，无小数点<br>
     * 
     * 默认值：
     * 0
     */
    private Integer               precision;

    /**
     * 说明：
     * 整数精度，默认为100，个位和百位为0<br>
     * 
     * 默认值：
     * 100
     */
    private Integer               power;

    /**
     * 说明：
     * 坐标轴线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式<br>
     * 
     * 默认值：
     * {show : true}
     */
    private PolarAxisLine         axisLine;

    /**
     * 说明：
     * 坐标轴文本标签，详见axis.axisLabel<br>
     * 
     * 默认值：
     * {show : false}
     */
    private PolarAxisLabel        axisLabel;

    /**
     * 说明：
     * 分隔线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式<br>
     * 
     * 默认值：
     * {show : true}
     */
    private PolarSplitLine        splitLine;

    /**
     * 说明：
     * 分隔区域，默认不显示，属性show控制显示与否，属性areaStyle（详见areaStyle）控制区域样式<br>
     * 
     * 默认值：
     * {show : true}
     */
    private PolarSplitArea        splitArea;

    /**
     * 说明：
     * 雷达指标列表，同时也是label内容，例子见下<br>
     * 
     * 默认值：
     * []
     */
    private ArrayList<PolarLabel> indicator;

    /**
     * @return the center
     */
    public Object[] getCenter()
    {
        return center;
    }

    /**
     * @param center
     *            the center to set
     */
    public Polar setCenter(Object[] center)
    {
        if (center.length != 2 || !center[0].getClass().getName().equals(center[1].getClass().getName()))
            throw new IllegalArgumentException("center参数的形式：[String,String]或[int,int]");
        else if (center[0] instanceof String || center[0] instanceof Number)
            this.center = center;
        else
            throw new IllegalArgumentException("center参数的形式：[String,String]或[int,int]");
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
    public Polar setRadius(Object radius)
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
    public Polar setStartAngle(Integer startAngle)
    {
        IntegerRangeCheckKit.checkRange(startAngle, -180, 180, true);
        this.startAngle = startAngle;
        return this;
    }

    /**
     * @return the splitNumber
     */
    public Integer getSplitNumber()
    {
        return splitNumber;
    }

    /**
     * @param splitNumber
     *            the splitNumber to set
     */
    public Polar setSplitNumber(Integer splitNumber)
    {
        IntegerRangeCheckKit.checkMin(splitNumber, 0, true);
        this.splitNumber = splitNumber;
        return this;
    }

    /**
     * @return the name
     */
    public PolarName getName()
    {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public Polar setName(PolarName name)
    {
        this.name = name;
        return this;
    }

    /**
     * @return the boundaryGap
     */
    public Integer[] getBoundaryGap()
    {
        return boundaryGap;
    }

    /**
     * @param boundaryGap
     *            the boundaryGap to set
     */
    public Polar setBoundaryGap(Integer leftGap, Integer rightGap)
    {
        this.boundaryGap[0] = leftGap;
        this.boundaryGap[1] = rightGap;
        return this;
    }

    /**
     * @return the scale
     */
    public Boolean getScale()
    {
        return scale;
    }

    /**
     * @param scale
     *            the scale to set
     */
    public Polar setScale(Boolean scale)
    {
        this.scale = scale;
        return this;
    }

    /**
     * @return the precision
     */
    public Integer getPrecision()
    {
        return precision;
    }

    /**
     * @param precision
     *            the precision to set
     */
    public Polar setPrecision(Integer precision)
    {
        this.precision = precision;
        return this;
    }

    /**
     * @return the power
     */
    public Integer getPower()
    {
        return power;
    }

    /**
     * @param power
     *            the power to set
     */
    public Polar setPower(Integer power)
    {
        this.power = power;
        return this;
    }

    /**
     * @return the axisLine
     */
    public PolarAxisLine getAxisLine()
    {
        return axisLine;
    }

    /**
     * @param axisLine
     *            the axisLine to set
     */
    public Polar setAxisLine(PolarAxisLine axisLine)
    {
        this.axisLine = axisLine;
        return this;
    }

    /**
     * @return the axisLabel
     */
    public PolarAxisLabel getAxisLabel()
    {
        return axisLabel;
    }

    /**
     * @param axisLabel
     *            the axisLabel to set
     */
    public Polar setAxisLabel(PolarAxisLabel axisLabel)
    {
        this.axisLabel = axisLabel;
        return this;
    }

    /**
     * @return the splitLine
     */
    public PolarSplitLine getSplitLine()
    {
        return splitLine;
    }

    /**
     * @param splitLine
     *            the splitLine to set
     */
    public Polar setSplitLine(PolarSplitLine splitLine)
    {
        this.splitLine = splitLine;
        return this;
    }

    /**
     * @return the splitArea
     */
    public PolarSplitArea getSplitArea()
    {
        return splitArea;
    }

    /**
     * @param splitArea
     *            the splitArea to set
     */
    public Polar setSplitArea(PolarSplitArea splitArea)
    {
        this.splitArea = splitArea;
        return this;
    }

    /**
     * @return the indicator
     */
    public ArrayList<PolarLabel> getIndicator()
    {
        return indicator;
    }

    /**
     * @param indicator
     *            the indicator to set
     */
    public Polar setIndicator(ArrayList<PolarLabel> indicator)
    {
        this.indicator = indicator;
        return this;
    }

}
