package cn.nh121.echarts.tooltip;

import cn.nh121.echarts.core.EColor;
import cn.nh121.echarts.core.JSFunction;
import cn.nh121.echarts.style.TextStyle;

/**
 * 
 * @author ODMark
 * @creation 2014-7-10
 * @link http://echarts.baidu.com/doc/doc.html#Tooltip
 */
public class Tooltip
{
    /**
     * 说明：
     * 显示策略，可选为：true（显示） | false（隐藏）<br>
     * 
     * 默认值：
     * TRUE
     */
    private Boolean     show;

    /**
     * 说明：
     * tooltip主体内容显示策略，只需tooltip触发事件或显示axisPointer而不需要显示内容时可配置该项为falase，
     * 可选为：true（显示） | false（隐藏）<br>
     * 
     * 默认值：
     * TRUE
     */
    private Boolean     showContent;

    /**
     * 说明：
     * 触发类型，默认数据触发，见下图，可选为：'item' | 'axis'<br>
     * 
     * 默认值：
     * 'item'
     */
    private ETrigger    trigger;

    /**
     * 说明：
     * 位置指定，传入{Array}，如[x, y]， 固定位置[x, y]；传入{Function}，如function([x, y]) {return
     * [newX,newY]}，默认显示坐标为输入参数，用户指定的新坐标为输出返回。<br>
     * 
     * 默认值：
     * null
     */
    private Object      position;

    /**
     * 说明：
     * 内容格式器：{string}（Template） | {Function}，支持异步回调见表格下方<br>
     * 
     * 默认值：
     * null
     */
    private String      formatter;

    /**
     * 说明：
     * 拖拽重计算独有，数据孤岛内容格式器：{string}（Template） | {Function}，见表格下方<br>
     * 
     * 默认值：
     * '{a} < br/>
     * {b} : {c}'
     */
    private String      islandFormatter;

    /**
     * 说明：
     * 显示延迟，添加显示延迟可以避免频繁切换，特别是在详情内容需要异步获取的场景，单位ms<br>
     * 
     * 默认值：
     * 20
     */
    private Integer     showDelay;

    /**
     * 说明：
     * 隐藏延迟，单位ms<br>
     * 
     * 默认值：
     * 100
     */
    private Integer     hideDelay;

    /**
     * 说明：
     * 动画变换时长，单位s，如果你希望tooltip的跟随实时响应，showDelay设置为0是关键，
     * 同时transitionDuration设0也会有交互体验上的差别。<br>
     * 
     * 默认值：
     * 0.4
     */
    private Integer     transitionDuration;

    /**
     * 说明：
     * 提示背景颜色，默认为透明度为0.7的黑色<br>
     * 
     * 默认值：
     * 'rgba(0,0,0,0.7)'
     */
    private EColor      backgroundColor;

    /**
     * 说明：
     * 提示边框颜色<br>
     * 
     * 默认值：
     * '#333'
     */
    private EColor      borderColor;

    /**
     * 说明：
     * 提示边框圆角，单位px，默认为4<br>
     * 
     * 默认值：
     * 4
     */
    private Integer     borderRadius;

    /**
     * 说明：
     * 提示边框线宽，单位px，默认为0（无边框）<br>
     * 
     * 默认值：
     * 0
     */
    private Integer     borderWidth;

    /**
     * 说明：
     * 提示内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距，同css<br>
     * 
     * 默认值：
     * 5
     */
    private String      padding;

    /**
     * 说明：
     * 坐标轴指示器，坐标轴触发有效，默认type为line，可选为：'line' | 'cross' | 'shadow' |
     * 'none'(无)，指定type后对应style生效，见下 <br>
     * 
     * 默认值：
     * {
     * type : 'line',
     * lineStyle : {
     * color: '#48b',
     * width: 2,
     * type: 'solid'
     * },
     * crossStyle : {
     * color: '#1e90ff',
     * width: 1,
     * type: 'dashed'
     * },
     * shadowStyle : {
     * size: 'auto',
     * color: 'rgba(150,150,150,0.3)'
     * }
     * }
     */
    private AxisPointer axisPointer;

    /**
     * 说明：
     * 文本样式，默认为白色字体（详见textStyle）<br>
     * 
     * 默认值：
     * { color:'#fff' }
     */
    private TextStyle   textStyle;

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
    public Tooltip setShow(Boolean show)
    {
        this.show = show;
        return this;
    }

    /**
     * @return the showContent
     */
    public Boolean getShowContent()
    {
        return showContent;
    }

    /**
     * @param showContent
     *            the showContent to set
     */
    public Tooltip setShowContent(Boolean showContent)
    {
        this.showContent = showContent;
        return this;
    }

    /**
     * @return the trigger
     */
    public ETrigger getTrigger()
    {
        return trigger;
    }

    /**
     * @param trigger
     *            the trigger to set
     */
    public Tooltip setTrigger(ETrigger trigger)
    {
        this.trigger = trigger;
        return this;
    }

    /**
     * @return the position
     */
    public Object getPosition()
    {
        if (position instanceof JSFunction)
            return position.toString();
        else
            return position;
    }

    /**
     * @param position
     *            the position to set
     */
    public Tooltip setPosition(Object position)
    {
        // if (position.getClass().isArray())
        // ;
        // else if (position instanceof String)
        this.position = position;
        return this;
    }

    /**
     * @return the formatter
     */
    public String getFormatter()
    {
        return formatter;
    }

    /**
     * @param formatter
     *            the formatter to set
     */
    public Tooltip setFormatter(String formatter)
    {
        this.formatter = formatter;
        return this;
    }

    /**
     * @return the islandFormatter
     */
    public String getIslandFormatter()
    {
        return islandFormatter;
    }

    /**
     * @param islandFormatter
     *            the islandFormatter to set
     */
    public Tooltip setIslandFormatter(String islandFormatter)
    {
        this.islandFormatter = islandFormatter;
        return this;
    }

    /**
     * @return the showDelay
     */
    public Integer getShowDelay()
    {
        return showDelay;
    }

    /**
     * @param showDelay
     *            the showDelay to set
     */
    public Tooltip setShowDelay(Integer showDelay)
    {
        this.showDelay = showDelay;
        return this;
    }

    /**
     * @return the hideDelay
     */
    public Integer getHideDelay()
    {
        return hideDelay;
    }

    /**
     * @param hideDelay
     *            the hideDelay to set
     */
    public Tooltip setHideDelay(Integer hideDelay)
    {
        this.hideDelay = hideDelay;
        return this;
    }

    /**
     * @return the transitionDuration
     */
    public Integer getTransitionDuration()
    {
        return transitionDuration;
    }

    /**
     * @param transitionDuration
     *            the transitionDuration to set
     */
    public Tooltip setTransitionDuration(Integer transitionDuration)
    {
        this.transitionDuration = transitionDuration;
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
    public Tooltip setBackgroundColor(EColor backgroundColor)
    {
        this.backgroundColor = backgroundColor;
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
    public Tooltip setBorderColor(EColor borderColor)
    {
        this.borderColor = borderColor;
        return this;
    }

    /**
     * @return the borderRadius
     */
    public Integer getBorderRadius()
    {
        return borderRadius;
    }

    /**
     * @param borderRadius
     *            the borderRadius to set
     */
    public Tooltip setBorderRadius(Integer borderRadius)
    {
        this.borderRadius = borderRadius;
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
    public Tooltip setBorderWidth(Integer borderWidth)
    {
        this.borderWidth = borderWidth;
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
     *            the padding to set
     */
    public Tooltip setPadding(String padding)
    {
        this.padding = padding;
        return this;
    }

    /**
     * @return the axisPointer
     */
    public AxisPointer getAxisPointer()
    {
        return axisPointer;
    }

    /**
     * @param axisPointer
     *            the axisPointer to set
     */
    public Tooltip setAxisPointer(AxisPointer axisPointer)
    {
        this.axisPointer = axisPointer;
        return this;
    }

    /**
     * @return the textStyle
     */
    public TextStyle getTextStyle()
    {
        return textStyle;
    }

    /**
     * @param textStyle
     *            the textStyle to set
     */
    public Tooltip setTextStyle(TextStyle textStyle)
    {
        this.textStyle = textStyle;
        return this;
    }

}
