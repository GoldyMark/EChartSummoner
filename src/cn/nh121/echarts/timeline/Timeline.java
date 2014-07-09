/**
 * 
 */
package cn.nh121.echarts.timeline;

import java.util.ArrayList;

import cn.nh121.echarts.core.EColor;
import cn.nh121.echarts.style.LineStyle;
import cn.nh121.echarts.symbol.ESymbol;

/**
 * @author ODMark
 * @creation 2014-7-7
 * @link http://echarts.baidu.com/doc/doc.html#Timeline
 */
public class Timeline
{
    /**
     * 说明：
     * 显示策略，可选为：true（显示） | false（隐藏）<br>
     * 
     * 默认值：
     * TRUE
     */
    private Boolean           show;

    /**
     * 说明：
     * 模式是时间类型，时间轴间隔根据时间跨度计算，可选为：'number'<br>
     * 
     * 默认值：
     * 'time'
     */
    private ETimelineType     type;

    /**
     * 说明：
     * 时间轴上多个option切换时是否进行merge操作，同setOption第二个参数（详见实例方法）<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean           notMerge;

    /**
     * 说明：
     * 拖拽或点击改变时间轴是否实时显示<br>
     * 
     * 默认值：
     * TRUE
     */
    private Boolean           realtime;

    /**
     * 说明：
     * 时间轴左上角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)<br>
     * 
     * 默认值：
     * 80
     */
    private Object            x;

    /**
     * 说明：
     * 时间轴左上角纵坐标，数值单位px，支持百分比（字符串），默认无，随y2定位，如'50%'(显示区域纵向中心)<br>
     * 
     * 默认值：
     * null
     */
    private Object            y;

    /**
     * 说明：
     * 时间轴右下角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)<br>
     * 
     * 默认值：
     * 80
     */
    private Object            x2;

    /**
     * 说明：
     * 时间轴右下角纵坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域纵向中心)<br>
     * 
     * 默认值：
     * 0
     */
    private Object            y2;

    /**
     * 说明：
     * 时间轴宽度，默认为总宽度 - x -
     * x2，数值单位px，指定width后将忽略x2。见下图。支持百分比（字符串），如'50%'(显示区域一半的宽度)<br>
     * 
     * 默认值：
     * 自适应
     */
    private Object            width;

    /**
     * 说明：
     * 时间轴高度，数值单位px，支持百分比（字符串），如'50%'(显示区域一半的高度)<br>
     * 
     * 默认值：
     * 50
     */
    private Object            height;

    /**
     * 说明：
     * 背景颜色，默认透明。<br>
     * 
     * 默认值：
     * 'rgba(0,0,0,0)'
     */
    private EColor            backgroundColor;

    /**
     * 说明：
     * 边框线宽<br>
     * 
     * 默认值：
     * 0
     */
    private Integer           borderWidth;

    /**
     * 说明：
     * 边框颜色。<br>
     * 
     * 默认值：
     * '#ccc'
     */
    private EColor            borderColor;

    /**
     * 说明：
     * 内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距，同css，见下图<br>
     * 
     * 默认值：
     * 5
     */
    private String            padding;

    /**
     * 说明：
     * 播放控制器位置，可选为：'left' | 'right' | 'none'<br>
     * 
     * 默认值：
     * 'left'
     */
    private EControlPosition  controlPosition;

    /**
     * 说明：
     * 是否自动播放<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean           autoPlay;

    /**
     * 说明：
     * 是否循环播放<br>
     * 
     * 默认值：
     * TRUE
     */
    private Boolean           loop;

    /**
     * 说明：
     * 播放时间间隔，单位ms<br>
     * 
     * 默认值：
     * 2000
     */
    private Integer           playInterval;

    /**
     * 说明：
     * 时间轴轴线样式，lineStyle控制线条样式，（详见lineStyle）<br>
     * 
     * 默认值：
     * {color: '#666', width: 1, type: 'dashed'}
     */
    private LineStyle         lineStyle;

    /**
     * 说明：
     * 时间轴标签文本
     * show : 是否显示
     * interval : 挑选间隔，默认为'auto'，可选为：'auto'（自动隐藏显示不下的） | 0（全部显示） | {number}
     * rotate : 旋转角度，默认为0，不旋转，正值为逆时针，负值为顺时针，可选为：-90 ~ 90
     * formatter ： 间隔名称格式器：{string}（Template） | {Function}
     * textStyle : 文字样式（详见textStyle）<br>
     * 
     * 默认值：
     * {
     * show: true,
     * interval: 'auto',
     * rotate: 0,
     * formatter: null,
     * textStyle: {
     * color: '#333'
     * }
     * }
     */
    private TimelineLabel     label;

    /**
     * 说明：
     * 时间轴当前点
     * 
     * symbol : 当前点symbol，默认随轴上的symbol
     * symbolSize : 当前点symbol大小，默认随轴上symbol大小
     * color : 当前点symbol颜色，默认为随当前点颜色，可指定具体颜色，如无则为'#1e90ff'
     * borderColor ： 当前点symbol边线颜色
     * borderWidth ： 当前点symbol边线宽度
     * label同上<br>
     * 
     * 默认值：
     * {
     * symbol : 'auto',
     * symbolSize : 'auto',
     * color : 'auto',
     * borderColor : 'auto',
     * borderWidth : 'auto',
     * label: {
     * show: false,
     * textStyle: {
     * color: 'auto'
     * }
     * }
     * }
     */
    private CheckPointStyle   checkpointStyle;

    /**
     * 说明：
     * 时间轴控制器样式，可指定正常和高亮颜色<br>
     * 
     * 默认值：
     * {
     * normal : { color : '#333'},
     * emphasis : { color : '#1e90ff'}
     * }
     */
    private ControlStyle      controlStyle;

    /**
     * 说明：
     * 轴点symbol，同serie.symbol<br>
     * 
     * 默认值：
     * 'emptyDiamond'
     */
    private ESymbol           symbol;

    /**
     * 说明：
     * 轴点symbol，同serie.symbolSize<br>
     * 
     * 默认值：
     * 4
     */
    private Integer           symbolSize;

    /**
     * 说明：
     * 当前索引位置，对应options数组，用于指定显示特定系列<br>
     * 
     * 默认值：
     * 0
     */
    private Integer           currentIndex;

    /**
     * 说明：
     * 时间轴列表，同时也是轴label内容<br>
     * 
     * 默认值：
     * []
     */
    private ArrayList<String> dataList;

    public Timeline()
    {
        dataList = new ArrayList<String>();
    }

    /**
     * @return the show
     */
    public Boolean getShow()
    {
        return show;
    }

    /**
     * @param show
     *            the show to set
     */
    public Timeline setShow(Boolean show)
    {
        this.show = show;
        return this;
    }

    /**
     * @return the type
     */
    public ETimelineType getType()
    {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public Timeline setType(ETimelineType type)
    {
        this.type = type;
        return this;
    }

    /**
     * @return the notMerge
     */
    public Boolean getNotMerge()
    {
        return notMerge;
    }

    /**
     * @param notMerge
     *            the notMerge to set
     */
    public Timeline setNotMerge(Boolean notMerge)
    {
        this.notMerge = notMerge;
        return this;
    }

    /**
     * @return the realtime
     */
    public Boolean getRealtime()
    {
        return realtime;
    }

    /**
     * @param realtime
     *            the realtime to set
     */
    public Timeline setRealtime(Boolean realtime)
    {
        this.realtime = realtime;
        return this;
    }

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
    public Timeline setX(Object x)
    {
        if (x instanceof String)
            this.x = x;
        else if (x instanceof Number)
            this.x = ((Number) x).intValue();
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
    public Timeline setY(Object y)
    {
        if (y instanceof String)
            this.y = y;
        else if (y instanceof Number)
            this.y = ((Number) y).intValue();
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
    public Timeline setX2(Object x2)
    {
        if (x2 instanceof String)
            this.x2 = x2;
        else if (x2 instanceof Number)
            this.x2 = ((Number) x2).intValue();
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
    public Timeline setY2(Object y2)
    {
        if (y2 instanceof String)
            this.y2 = y2;
        else if (y2 instanceof Number)
            this.y2 = ((Number) y2).intValue();
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
    public Timeline setWidth(Object width)
    {
        if (width instanceof String)
            this.width = width;
        else if (width instanceof Number)
            this.width = ((Number) width).intValue();
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
    public Timeline setHeight(Object height)
    {
        if (height instanceof String)
            this.height = height;
        else if (height instanceof Number)
            this.height = ((Number) height).intValue();
        return this;
    }

    /**
     * @return the backgroundColor
     */
    public EColor getBackgroundColor()
    {
        return backgroundColor;
    }

    /**
     * @param backgroundColor
     *            the backgroundColor to set
     */
    public Timeline setBackgroundColor(EColor backgroundColor)
    {
        this.backgroundColor = backgroundColor;
        return this;
    }

    /**
     * @return the borderWidth
     */
    public Integer getBorderWidth()
    {
        return borderWidth;
    }

    /**
     * @param borderWidth
     *            the borderWidth to set
     */
    public Timeline setBorderWidth(Integer borderWidth)
    {
        this.borderWidth = borderWidth;
        return this;
    }

    /**
     * @return the borderColor
     */
    public EColor getBorderColor()
    {
        return borderColor;
    }

    /**
     * @param borderColor
     *            the borderColor to set
     */
    public Timeline setBorderColor(EColor borderColor)
    {
        this.borderColor = borderColor;
        return this;
    }

    /**
     * @return the padding
     */
    public String getPadding()
    {
        return padding;
    }

    /**
     * @param padding
     *            the padding to set<br>
     *            CSS style
     */
    public Timeline setPadding(String padding)
    {
        this.padding = padding;
        return this;
    }

    /**
     * @return the controlPosition
     */
    public EControlPosition getControlPosition()
    {
        return controlPosition;
    }

    /**
     * @param controlPosition
     *            the controlPosition to set
     */
    public Timeline setControlPosition(EControlPosition controlPosition)
    {
        this.controlPosition = controlPosition;
        return this;
    }

    /**
     * @return the autoPlay
     */
    public Boolean getAutoPlay()
    {
        return autoPlay;
    }

    /**
     * @param autoPlay
     *            the autoPlay to set
     */
    public Timeline setAutoPlay(Boolean autoPlay)
    {
        this.autoPlay = autoPlay;
        return this;
    }

    /**
     * @return the loop
     */
    public Boolean getLoop()
    {
        return loop;
    }

    /**
     * @param loop
     *            the loop to set
     */
    public Timeline setLoop(Boolean loop)
    {
        this.loop = loop;
        return this;
    }

    /**
     * @return the playInterval
     */
    public Integer getPlayInterval()
    {
        return playInterval;
    }

    /**
     * @param playInterval
     *            the playInterval to set
     */
    public Timeline setPlayInterval(Integer playInterval)
    {
        this.playInterval = playInterval;
        return this;
    }

    /**
     * @return the lineStyle
     */
    public LineStyle getLineStyle()
    {
        return lineStyle;
    }

    /**
     * @param lineStyle
     *            the lineStyle to set
     */
    public Timeline setLineStyle(LineStyle lineStyle)
    {
        this.lineStyle = lineStyle;
        return this;
    }

    /**
     * @return the label
     */
    public TimelineLabel getLabel()
    {
        return label;
    }

    /**
     * @param label
     *            the label to set
     */
    public Timeline setLabel(TimelineLabel label)
    {
        this.label = label;
        return this;
    }

    /**
     * @return the checkpointStyle
     */
    public CheckPointStyle getCheckpointStyle()
    {
        return checkpointStyle;
    }

    /**
     * @param checkpointStyle
     *            the checkpointStyle to set
     */
    public Timeline setCheckpointStyle(CheckPointStyle checkpointStyle)
    {
        this.checkpointStyle = checkpointStyle;
        return this;
    }

    /**
     * @return the controlStyle
     */
    public ControlStyle getControlStyle()
    {
        return controlStyle;
    }

    /**
     * @param controlStyle
     *            the controlStyle to set
     */
    public Timeline setControlStyle(ControlStyle controlStyle)
    {
        this.controlStyle = controlStyle;
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
    public Timeline setSymbol(ESymbol symbol)
    {
        this.symbol = symbol;
        return this;
    }

    /**
     * @return the symbolSize
     */
    public Integer getSymbolSize()
    {
        return symbolSize;
    }

    /**
     * @param symbolSize
     *            the symbolSize to set
     */
    public Timeline setSymbolSize(Integer symbolSize)
    {
        this.symbolSize = symbolSize;
        return this;
    }

    /**
     * @return the currentIndex
     */
    public Integer getCurrentIndex()
    {
        return currentIndex;
    }

    /**
     * @param currentIndex
     *            the currentIndex to set
     */
    public Timeline setCurrentIndex(Integer currentIndex)
    {
        this.currentIndex = currentIndex;
        return this;
    }

    /**
     * @return the data
     */
    public ArrayList<String> getDataList()
    {
        return dataList;
    }

    /**
     * @param dataList
     *            the data to set
     */
    public Timeline setDataList(ArrayList<String> dataList)
    {
        this.dataList = dataList;
        return this;
    }

    public Timeline addData(String data)
    {
        this.dataList.add(data);
        return this;
    }

}
