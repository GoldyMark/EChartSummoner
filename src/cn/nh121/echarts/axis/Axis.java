package cn.nh121.echarts.axis;

import java.util.ArrayList;

public class Axis
{
    /**
     * 类型：通用
     * 说明：
     * 坐标轴类型，横轴默认为类目型'category'，纵轴默认为数值型'value'<br>
     * 
     * 默认值：
     * 'category' | 'value'
     */
    private EAxisType         type;

    /**
     * 类型：通用
     * 说明：
     * 坐标轴类型，横轴默认为类目型'bottom'，纵轴默认为数值型'left'，可选为：'bottom' | 'top' | 'left' |
     * 'right'<br>
     * 
     * 默认值：
     * 'bottom' | 'left'
     */
    private EAxisPosition     position;

    /**
     * 类型：数值型
     * 说明：
     * 坐标轴名称，默认为空<br>
     * 
     * 默认值：
     * ''
     */
    private String            name;

    /**
     * 类型：数值型
     * 说明：
     * 坐标轴名称位置，默认为'end'，可选为：'start' | 'end'<br>
     * 
     * 默认值：
     * 'end'
     */
    private EAxisNameLocation nameLocation;

    /**
     * 类型：数值型
     * 说明：
     * 坐标轴名称文字样式，默认取全局配置，颜色跟随axisLine主色，可设<br>
     * 
     * 默认值：
     * {}
     */
    private NameTextStyle     nameTextStyle;

    /**
     * 类型：类目型
     * 说明：
     * 类目起始和结束两端空白策略，见下图，默认为true留空，false则顶头<br>
     * 默认值：TRUE
     * 
     * 类型：数值型
     * 说明：
     * 数值轴两端空白策略，数组内数值代表百分比，[原始数据最小值与最终最小值之间的差额，原始数据最大值与最终最大值之间的差额]<br>
     * 默认值：[0,0]
     */
    private Object            boundaryGap;

    /**
     * 类型：数值型
     * 说明：
     * 指定的最小值，eg: 0，默认无，会自动根据具体数值调整，指定后将忽略boundaryGap[0]<br>
     * 
     * 默认值：
     * null
     */
    private Integer           min;

    /**
     * 类型：数值型
     * 说明：
     * 指定的最大值，eg: 100，默认无，会自动根据具体数值调整，指定后将忽略boundaryGap[1]<br>
     * 
     * 默认值：
     * null
     */
    private Integer           max;

    /**
     * 类型：数值型
     * 说明：
     * 脱离0值比例，放大聚焦到最终_min，_max区间<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean           scale;

    /**
     * 类型：数值型
     * 说明：
     * 小数精度，默认为0，无小数点<br>
     * 
     * 默认值：
     * 0
     */
    private Integer           precision;

    /**
     * 类型：数值型
     * 说明：
     * 整数精度，默认为100，个位和百位为0<br>
     * 
     * 默认值：
     * 100
     */
    private Integer           power;

    /**
     * 类型：数值型
     * 说明：
     * 分割段数，默认为5<br>
     * 
     * 默认值：
     * 5
     */
    private Integer           splitNumber;

    /**
     * 类型：通用
     * 说明：
     * 坐标轴线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式<br>
     * 
     * 默认值：
     * {show : true}
     */
    private AxisLine          axisLine;

    /**
     * 类型：通用
     * 说明：
     * 坐标轴小标记，默认不显示，属性show控制显示与否，属性length控制线长，属性lineStyle（详见lineStyle）控制线条样式<br>
     * 
     * 默认值：
     * {show : false}
     */
    private AxisTick          axisTick;

    /**
     * 类型：通用
     * 说明：
     * 坐标轴文本标签，详见axis.axisLabel<br>
     * 
     * 默认值：
     * {show : true}
     */
    private AxisLabel         axisLabel;

    /**
     * 类型：通用
     * 说明：
     * 分隔线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式<br>
     * 
     * 默认值：
     * {show : true}
     */
    private SplitLine         splitLine;

    /**
     * 类型：通用
     * 说明：
     * 分隔区域，默认不显示，属性show控制显示与否，属性areaStyle（详见areaStyle）控制区域样式<br>
     * 
     * 默认值：
     * {show : false}
     */
    private SplitArea         splitArea;

    /**
     * 类型：类目型
     * 说明：
     * 类目列表，同时也是label内容，详见axis.data<br>
     * 
     * 默认值：
     * []
     */
    private ArrayList<Object> data;

    /**
     * @return the type
     */
    public EAxisType getType()
    {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public Axis setType(EAxisType type)
    {
        this.type = type;
        return this;
    }

    /**
     * @return the position
     */
    public EAxisPosition getPosition()
    {
        return position;
    }

    /**
     * @param position
     *            the position to set
     */
    public Axis setPosition(EAxisPosition position)
    {
        this.position = position;
        return this;
    }

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
    public Axis setName(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * @return the nameLocation
     */
    public EAxisNameLocation getNameLocation()
    {
        return nameLocation;
    }

    /**
     * @param nameLocation
     *            the nameLocation to set
     */
    public Axis setNameLocation(EAxisNameLocation nameLocation)
    {
        this.nameLocation = nameLocation;
        return this;
    }

    /**
     * @return the nameTextStyle
     */
    public NameTextStyle getNameTextStyle()
    {
        return nameTextStyle;
    }

    /**
     * @param nameTextStyle
     *            the nameTextStyle to set
     */
    public Axis setNameTextStyle(NameTextStyle nameTextStyle)
    {
        this.nameTextStyle = nameTextStyle;
        return this;
    }

    /**
     * @return the boundaryGap
     */
    public Object getBoundaryGap()
    {
        return boundaryGap;
    }

    /**
     * @param boundaryGap
     *            the boundaryGap to set
     */
    public Axis setBoundaryGap(Object boundaryGap)
    {
        this.boundaryGap = boundaryGap;
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
    public Axis setMin(Integer min)
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
    public Axis setMax(Integer max)
    {
        this.max = max;
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
    public Axis setScale(Boolean scale)
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
    public Axis setPrecision(Integer precision)
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
    public Axis setPower(Integer power)
    {
        this.power = power;
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
    public Axis setSplitNumber(Integer splitNumber)
    {
        this.splitNumber = splitNumber;
        return this;
    }

    /**
     * @return the axisLine
     */
    public AxisLine getAxisLine()
    {
        return axisLine;
    }

    /**
     * @param axisLine
     *            the axisLine to set
     */
    public Axis setAxisLine(AxisLine axisLine)
    {
        this.axisLine = axisLine;
        return this;
    }

    /**
     * @return the axisTick
     */
    public AxisTick getAxisTick()
    {
        return axisTick;
    }

    /**
     * @param axisTick
     *            the axisTick to set
     */
    public Axis setAxisTick(AxisTick axisTick)
    {
        this.axisTick = axisTick;
        return this;
    }

    /**
     * @return the axisLabel
     */
    public AxisLabel getAxisLabel()
    {
        return axisLabel;
    }

    /**
     * @param axisLabel
     *            the axisLabel to set
     */
    public Axis setAxisLabel(AxisLabel axisLabel)
    {
        this.axisLabel = axisLabel;
        return this;
    }

    /**
     * @return the splitLine
     */
    public SplitLine getSplitLine()
    {
        return splitLine;
    }

    /**
     * @param splitLine
     *            the splitLine to set
     */
    public Axis setSplitLine(SplitLine splitLine)
    {
        this.splitLine = splitLine;
        return this;
    }

    /**
     * @return the splitArea
     */
    public SplitArea getSplitArea()
    {
        return splitArea;
    }

    /**
     * @param splitArea
     *            the splitArea to set
     */
    public Axis setSplitArea(SplitArea splitArea)
    {
        this.splitArea = splitArea;
        return this;
    }

    /**
     * @return the data
     */
    public ArrayList<Object> getData()
    {
        return data;
    }

    /**
     * @param data
     *            the data to set
     */
    public Axis setData(ArrayList<Object> data)
    {
        this.data = data;
        return this;
    }

}
