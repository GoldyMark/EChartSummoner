/**
 * 
 */
package cn.nh121.echarts.series;

import cn.nh121.echarts.kit.NumberKit;

/**
 * @author ODMark
 * @creation 2014-7-19
 * @link http://echarts.baidu.com/doc/doc.html#SeriesGauge
 */
public class GaugeSeries extends ASeries
{
    /**
     * 说明：
     * 圆心坐标，支持绝对值（px）和百分比，百分比计算min(width, height) * 50%<br>
     * 
     * 默认值：
     * ['50%', '50%']
     */
    private Object[]       center = new Object[2];

    /**
     * 说明：
     * 半径，支持绝对值（px）和百分比，百分比计算比，min(width, height) / 2 * 75%，
     * 传数组实现环形图，[内半径，外半径]<br>
     * 
     * 默认值：
     * [0, '75%']
     */
    private Object         radius;

    /**
     * 说明：
     * 开始角度, 饼图（90）、仪表盘（225），有效输入范围：[-360,360]<br>
     * 
     * 默认值：
     * 225
     */
    private Integer        startAngle;

    /**
     * 说明：
     * 结束角度,有效输入范围：[-360,360]，保证startAngle - endAngle为正值<br>
     * 
     * 默认值：
     * -45
     */
    private Integer        endAngle;

    /**
     * 说明：
     * 指定的最小值<br>
     * 
     * 默认值：
     * 0
     */
    private Integer        min;

    /**
     * 说明：
     * 指定的最大值<br>
     * 
     * 默认值：
     * 100
     */
    private Integer        max;

    /**
     * 说明：
     * 小数精度，默认为0，无小数点<br>
     * 
     * 默认值：
     * 0
     */
    private Integer        precision;

    /**
     * 说明：
     * 分割段数，默认为5，为0时为线性渐变，calculable为true是默认均分100份<br>
     * 
     * 默认值：
     * 10
     */
    private Integer        splitNumber;

    /**
     * 说明：
     * 坐标轴线，默认显示
     * 
     * 属性show控制显示与否，
     * 
     * 属性lineStyle（详见lineStyle）控制线条样式，
     * 
     * 比较特殊的是这里的lineStyle.color是一个二维数组，用于把仪表盘轴线分成若干份，
     * 
     * 并且可以给每一份指定具体的颜色，格式为:[[百分比, 颜色值], [...]]<br>
     * 
     * 默认值：
     * {
     * show: true,
     * lineStyle: {
     * color: [
     * [0.2, '#228b22'],
     * [0.8, '#48b'],
     * [1, '#ff4500']
     * ],
     * width: 30
     * }
     * }
     */
    private GaugeAxisLine  axisLine;

    /**
     * 说明：
     * 坐标轴小标记，默认显示
     * 
     * 属性show控制显示与否，
     * 
     * 属性lineStyle（详见lineStyle）控制线条样式，
     * 
     * 属性splitNumber控制每份split细分多少段
     * 
     * 属性length控制线长<br>
     * 
     * 默认值：
     * {
     * show: true,
     * splitNumber: 5,
     * length :8,
     * lineStyle: {
     * color: '#eee',
     * width: 1,
     * type: 'solid'
     * }
     * }
     */
    private GaugeAxisTick  axisTick;

    /**
     * 说明：
     * 坐标轴文本标签（详见axis.axislabel）
     * 
     * 属性formatter可以格式化文本标签，
     * 
     * 属性textStyle（详见textStyle）控制文本样式<br>
     * 
     * 默认值：
     * {
     * show: true,
     * formatter: null,
     * textStyle: {
     * color: 'auto'
     * }
     * }
     */
    private GaugeAxisLabel axisLabel;

    /**
     * 说明：
     * 主分隔线，默认显示
     * 
     * 属性show控制显示与否，
     * 
     * 属性length控制线长
     * 
     * 属性lineStyle（详见lineStyle）控制线条样式<br>
     * 
     * 默认值：
     * {
     * show: true,
     * length :30,
     * lineStyle: {
     * color: '#eee',
     * width: 2,
     * type: 'solid'
     * }
     * }
     */
    private GaugeSplitLine splitLine;

    /**
     * 说明：
     * 指针样式
     * 属性length控制线长，百分比相对的是仪表盘的外半径
     * 属性width控制指针最宽处，
     * 属性color控制指针颜色<br>
     * 
     * 默认值：
     * {
     * length : '80%',
     * width : 8,
     * color : 'auto'
     * }
     */
    private GaugePointer   pointer;

    /**
     * 说明：
     * 仪表盘标题
     * 
     * 属性show控制显示与否，
     * 
     * 属性offsetCenter用于标题定位，数组为横纵相对仪表盘圆心坐标偏移，支持百分比（相对外半径），
     * 
     * 属性textStyle（详见textStyle）控制文本样式<br>
     * 
     * 默认值：
     * {
     * show : true,
     * offsetCenter: [0, '-40%'],
     * textStyle: {
     * color: '#333',
     * fontSize : 15
     * }
     * }
     */
    private GaugeTitle     title;

    /**
     * 说明：
     * 仪表盘详情
     * 
     * 属性show控制显示与否，
     * 属性backgroundColor控制边框颜色，
     * 属性borderWidth控制边框线宽，
     * 属性borderColor控制边框颜色，
     * 属性width控制详情宽度，
     * 属性height控制详情高度，
     * 属性offsetCenter用于详情定位，数组为横纵相对仪表盘圆心坐标偏移，支持百分比（相对外半径），
     * 属性formatter可以格式化文本，
     * 属性textStyle（详见textStyle）控制文本样式<br>
     * 
     * 默认值：
     * {
     * show : true,
     * backgroundColor: 'rgba(0,0,0,0)',
     * borderWidth: 0,
     * borderColor: '#ccc',
     * width: 100,
     * height: 40,
     * offsetCenter: [0, '40%'],
     * formatter: null,
     * textStyle: {
     * color: 'auto',
     * fontSize : 30
     * }
     * }
     */
    private GaugeDetail    detail;

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
    public GaugeSeries setCenter(Object[] center)
    {
        this.center = center;
        return this;
    }

    public GaugeSeries setCenter(String x, String y)
    {
        this.center[0] = NumberKit.stringOrNum(x);
        this.center[1] = NumberKit.stringOrNum(y);
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
    public GaugeSeries setRadius(Object radius)
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
    public GaugeSeries setStartAngle(Integer startAngle)
    {
        this.startAngle = startAngle;
        return this;
    }

    /**
     * @return the endAngle
     */
    public Integer getEndAngle()
    {
        return endAngle;
    }

    /**
     * @param endAngle
     *            the endAngle to set
     */
    public GaugeSeries setEndAngle(Integer endAngle)
    {
        this.endAngle = endAngle;
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
    public GaugeSeries setMin(Integer min)
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
    public GaugeSeries setMax(Integer max)
    {
        this.max = max;
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
    public GaugeSeries setPrecision(Integer precision)
    {
        this.precision = precision;
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
    public GaugeSeries setSplitNumber(Integer splitNumber)
    {
        this.splitNumber = splitNumber;
        return this;
    }

    /**
     * @return the axisLine
     */
    public GaugeAxisLine getAxisLine()
    {
        return axisLine;
    }

    /**
     * @param axisLine
     *            the axisLine to set
     */
    public GaugeSeries setAxisLine(GaugeAxisLine axisLine)
    {
        this.axisLine = axisLine;
        return this;
    }

    /**
     * @return the axisTick
     */
    public GaugeAxisTick getAxisTick()
    {
        return axisTick;
    }

    /**
     * @param axisTick
     *            the axisTick to set
     */
    public GaugeSeries setAxisTick(GaugeAxisTick axisTick)
    {
        this.axisTick = axisTick;
        return this;
    }

    /**
     * @return the axisLabel
     */
    public GaugeAxisLabel getAxisLabel()
    {
        return axisLabel;
    }

    /**
     * @param axisLabel
     *            the axisLabel to set
     */
    public GaugeSeries setAxisLabel(GaugeAxisLabel axisLabel)
    {
        this.axisLabel = axisLabel;
        return this;
    }

    /**
     * @return the splitLine
     */
    public GaugeSplitLine getSplitLine()
    {
        return splitLine;
    }

    /**
     * @param splitLine
     *            the splitLine to set
     */
    public GaugeSeries setSplitLine(GaugeSplitLine splitLine)
    {
        this.splitLine = splitLine;
        return this;
    }

    /**
     * @return the pointer
     */
    public GaugePointer getPointer()
    {
        return pointer;
    }

    /**
     * @param pointer
     *            the pointer to set
     */
    public GaugeSeries setPointer(GaugePointer pointer)
    {
        this.pointer = pointer;
        return this;
    }

    /**
     * @return the title
     */
    public GaugeTitle getTitle()
    {
        return title;
    }

    /**
     * @param title
     *            the title to set
     */
    public GaugeSeries setTitle(GaugeTitle title)
    {
        this.title = title;
        return this;
    }

    /**
     * @return the detail
     */
    public GaugeDetail getDetail()
    {
        return detail;
    }

    /**
     * @param detail
     *            the detail to set
     */
    public GaugeSeries setDetail(GaugeDetail detail)
    {
        this.detail = detail;
        return this;
    }

}
