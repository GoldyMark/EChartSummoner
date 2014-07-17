package cn.nh121.echarts.series;

import cn.nh121.echarts.pubenum.ESymbol;

public class CartesianSeries extends ASeries
{
    /**
     * 类型： 折线图，柱状图
     * 说明：
     * 组合名称，多组数据的堆积图时使用，eg：stack:'group1'，则series数组中stack值等于'group1'的数据做堆积计算<br>
     * 
     * 默认值：
     * null
     */
    private String      stack;

    /**
     * 类型： 折线图，柱状图，散点图 ，K线图
     * 说明：
     * xAxis坐标轴数组的索引，指定该系列数据所用的横坐标轴<br>
     * 
     * 默认值：
     * 0
     */
    private EXAxisIndex xAxisIndex;

    /**
     * 类型： 折线图，柱状图，散点图，K线图
     * 说明：
     * yAxis坐标轴数组的索引，指定该系列数据所用的纵坐标轴<br>
     * 
     * 默认值：
     * 0
     */
    // private EYAxisIndex yAxisIndex;

    /**
     * 类型： 柱状图
     * 说明：
     * 柱间距离，默认为柱形宽度的30%，可设固定值<br>
     * 
     * 默认值：
     * '30%'
     */
    private Object      barGap;

    /**
     * 类型： 柱状图
     * 说明：
     * 类目间柱形距离，默认为类目间距的20%，可设固定值<br>
     * 
     * 默认值：
     * '20%'
     */
    private Object      barCategoryGap;

    /**
     * 类型： 柱状图
     * 说明：
     * 柱条最小高度，可用于防止某item的值过小而影响交互<br>
     * 
     * 默认值：
     * 0
     */
    private Integer     barMinHeight;

    /**
     * 类型： 柱状图 ，K线图
     * 说明：
     * 柱条（K线蜡烛）宽度，不设时自适应<br>
     * 
     * 默认值：
     * 自适应
     */
    private Integer     barWidth;

    /**
     * 类型： K线图
     * 说明：
     * K线蜡烛最大宽度，不设时自适应<br>
     * 
     * 默认值：
     * 自适应
     */
    private Integer     barMaxWidth;

    /**
     * 类型：折线图，散点图
     * 说明：
     * 标志图形类型，默认自动选择（8种类型循环使用，不显示标志图形可设为'none'），默认循环选择类型有：
     * 'circle' | 'rectangle' | 'triangle' | 'diamond' |
     * 'emptyCircle' | 'emptyRectangle' | 'emptyTriangle' | 'emptyDiamond'
     * 另外，还支持五种更特别的标志图形
     * 'heart'（心形）、'droplet'（水滴）、'pin'（标注）、'arrow'（箭头）和'star'（五角星），这并不出现在常规的8类图形中，但无论是在系列级还是数据级上你都可以指定使用，同时，'s
     * t
     * a
     * r
     * '
     * + n（n>=3)可变化出N角星，如指定为'star6'则可以显示6角星
     * 自1.3.5起支持symbol为自定义图片，格式为'image://' + '图片路径'，
     * 如'image://../asset/ico/favicon.png' <br>
     * 
     * 默认值：
     * null
     */
    private ESymbol     symbol;

    /**
     * 类型：折线图 (2)，散点图(4)
     * 说明：
     * 标志图形大小，可计算特性启用情况建议增大以提高交互体验。实现气泡图时symbolSize需为Function，气泡大小取决于该方法返回值，
     * 传入参数为当前数据项（value数组）<br>
     * 
     * 默认值：
     * 2 | 4
     */
    private Object      symbolSize;

    /**
     * 类型：折线图 ，散点图
     * 说明：
     * 标志图形旋转角度[-180,180]<br>
     * 
     * 默认值：
     * null
     */
    private Integer     symbolRotate;

    /**
     * 类型：折线图
     * 说明：
     * 标志图形默认只有主轴显示（随主轴标签间隔隐藏策略），如需全部显示可把showAllSymbol设为true<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean     showAllSymbol;

    /**
     * 类型：折线图
     * 说明：
     * 平滑曲线显示<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean     smooth;

    /**
     * 类型：散点图
     * 说明：
     * 启动大规模散点图<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean     large;

    /**
     * 类型：散点图
     * 说明：
     * 大规模散点图自动切换阀值，large为true下有效<br>
     * 
     * 默认值：
     * 2000
     */
    private Integer     largeThreshold;

    /**
     * @return the stack
     */
    public String getStack()
    {
        return stack;
    }

    /**
     * @param stack
     *            the stack to set
     */
    public CartesianSeries setStack(String stack)
    {
        this.stack = stack;
        return this;
    }

    /**
     * @return the xAxisIndex
     */
    public EXAxisIndex getxAxisIndex()
    {
        return xAxisIndex;
    }

    /**
     * @param xAxisIndex
     *            the xAxisIndex to set
     */
    public CartesianSeries setxAxisIndex(EXAxisIndex xAxisIndex)
    {
        this.xAxisIndex = xAxisIndex;
        return this;
    }

    /**
     * @return the barGap
     */
    public Object getBarGap()
    {
        return barGap;
    }

    /**
     * @param barGap
     *            the barGap to set
     */
    public CartesianSeries setBarGap(Object barGap)
    {
        this.barGap = barGap;
        return this;
    }

    /**
     * @return the barCategoryGap
     */
    public Object getBarCategoryGap()
    {
        return barCategoryGap;
    }

    /**
     * @param barCategoryGap
     *            the barCategoryGap to set
     */
    public CartesianSeries setBarCategoryGap(Object barCategoryGap)
    {
        this.barCategoryGap = barCategoryGap;
        return this;
    }

    /**
     * @return the barMinHeight
     */
    public Integer getBarMinHeight()
    {
        return barMinHeight;
    }

    /**
     * @param barMinHeight
     *            the barMinHeight to set
     */
    public CartesianSeries setBarMinHeight(Integer barMinHeight)
    {
        this.barMinHeight = barMinHeight;
        return this;
    }

    /**
     * @return the barWidth
     */
    public Integer getBarWidth()
    {
        return barWidth;
    }

    /**
     * @param barWidth
     *            the barWidth to set
     */
    public CartesianSeries setBarWidth(Integer barWidth)
    {
        this.barWidth = barWidth;
        return this;
    }

    /**
     * @return the barMaxWidth
     */
    public Integer getBarMaxWidth()
    {
        return barMaxWidth;
    }

    /**
     * @param barMaxWidth
     *            the barMaxWidth to set
     */
    public CartesianSeries setBarMaxWidth(Integer barMaxWidth)
    {
        this.barMaxWidth = barMaxWidth;
        return this;
    }

    /**
     * @return the symbol
     */
    public ESymbol getSymbol()
    {
        return symbol;
    }

    /**
     * @param symbol
     *            the symbol to set
     */
    public CartesianSeries setSymbol(ESymbol symbol)
    {
        this.symbol = symbol;
        return this;
    }

    /**
     * @return the symbolSize
     */
    public Object getSymbolSize()
    {
        return symbolSize;
    }

    /**
     * @param symbolSize
     *            the symbolSize to set
     */
    public CartesianSeries setSymbolSize(Object symbolSize)
    {
        this.symbolSize = symbolSize;
        return this;
    }

    /**
     * @return the symbolRotate
     */
    public Integer getSymbolRotate()
    {
        return symbolRotate;
    }

    /**
     * @param symbolRotate
     *            the symbolRotate to set
     */
    public CartesianSeries setSymbolRotate(Integer symbolRotate)
    {
        this.symbolRotate = symbolRotate;
        return this;
    }

    /**
     * @return the showAllSymbol
     */
    public Boolean getShowAllSymbol()
    {
        return showAllSymbol;
    }

    /**
     * @param showAllSymbol
     *            the showAllSymbol to set
     */
    public CartesianSeries setShowAllSymbol(Boolean showAllSymbol)
    {
        this.showAllSymbol = showAllSymbol;
        return this;
    }

    /**
     * @return the smooth
     */
    public Boolean getSmooth()
    {
        return smooth;
    }

    /**
     * @param smooth
     *            the smooth to set
     */
    public CartesianSeries setSmooth(Boolean smooth)
    {
        this.smooth = smooth;
        return this;
    }

    /**
     * @return the large
     */
    public Boolean getLarge()
    {
        return large;
    }

    /**
     * @param large
     *            the large to set
     */
    public CartesianSeries setLarge(Boolean large)
    {
        this.large = large;
        return this;
    }

    /**
     * @return the largeThreshold
     */
    public Integer getLargeThreshold()
    {
        return largeThreshold;
    }

    /**
     * @param largeThreshold
     *            the largeThreshold to set
     */
    public CartesianSeries setLargeThreshold(Integer largeThreshold)
    {
        this.largeThreshold = largeThreshold;
        return this;
    }

}
