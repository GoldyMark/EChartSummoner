package cn.nh121.echarts.toolbox;

import java.util.ArrayList;

import cn.nh121.echarts.core.EColor;
import cn.nh121.echarts.pubenum.EHorizontalAlign;
import cn.nh121.echarts.pubenum.EOrient;
import cn.nh121.echarts.style.TextStyle;
import cn.nh121.echarts.toolbox.feature.Feature;

/**
 * 
 * @author ODMark
 * @creation 2014-7-10
 * @link http://echarts.baidu.com/doc/doc.html#Toolbox
 */
public class Toolbox
{
    /**
     * 说明：
     * 显示策略，可选为：true（显示） | false（隐藏）<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean           show;

    /**
     * 说明：
     * 布局方式，默认为水平布局，可选为：'horizontal' | 'vertical'<br>
     * 
     * 默认值：
     * 'horizontal'
     */
    private EOrient           orient;

    /**
     * 说明：
     * 水平安放位置，默认为全图居中，可选为：'center' | 'left' | 'right' | {number}（x坐标，单位px）<br>
     * 
     * 默认值：
     * 'right'
     */
    private Object            x;

    /**
     * 说明：
     * 垂直安放位置，默认为全图顶端，可选为：'top' | 'bottom' | 'center' | {number}（y坐标，单位px）<br>
     * 
     * 默认值：
     * 'top'
     */
    private Object            y;

    /**
     * 说明：
     * 工具箱背景颜色，默认透明<br>
     * 
     * 默认值：
     * 'rgba(0,0,0,0)'
     */
    private EColor            backgroundColor;

    /**
     * 说明：
     * 工具箱边框颜色<br>
     * 
     * 默认值：
     * '#ccc'
     */
    private EColor            borderColor;

    /**
     * 说明：
     * 工具箱边框线宽，单位px，默认为0（无边框）<br>
     * 
     * 默认值：
     * 0
     */
    private Integer           borderWidth;

    /**
     * 说明：
     * 工具箱内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距，同css，见下图<br>
     * 
     * 默认值：
     * 5
     */
    private String            padding;

    /**
     * 说明：
     * 各个item之间的间隔，单位px，默认为10，横向布局时为水平间隔，纵向布局时为纵向间隔，见下图<br>
     * 
     * 默认值：
     * 10
     */
    private Integer           itemGap;

    /**
     * 说明：
     * 工具箱icon大小，单位（px）<br>
     * 
     * 默认值：
     * 16
     */
    private Integer           itemSize;

    /**
     * 说明：
     * 工具箱icon颜色序列，循环使用，同时支持在具体feature内指定color<br>
     * 
     * 默认值：
     * ['#1e90ff','#22bb22','#4b0082','#d2691e']
     */
    private ArrayList<EColor> color;

    /**
     * 说明：
     * 是否显示工具箱文字提示，默认启用<br>
     * 
     * 默认值：
     * TRUE
     */
    private Boolean           showTitle;

    /**
     * 说明：
     * 工具箱提示文字样式，（详见textStyle）<br>
     * 
     * 默认值：
     * {}
     */
    private TextStyle         textStyle;

    /**
     * 说明：
     * 启用功能，目前支持feature见下，工具箱自定义功能回调处理，见try this »
     * 工具箱
     * 
     * mark，辅助线标志，上图icon左数1/2/3，分别是启用，删除上一条，删除全部，可设置更多属性
     * 可传入lineStyle（详见lineStyle）控制线条样式
     * 
     * dataZoom，框选区域缩放，自动与存在的dataZoom控件同步，上图icon左数4/5，分别是启用，缩放后退
     * 
     * magicType，动态类型切换，支持直角系下的折线图、柱状图、堆积、平铺转换，上图icon左数6/7/8/9，分别是切换折线图，切换柱形图，
     * 切换为堆积，切换为平铺
     * {Array} type ['line', 'bar', 'stack', 'tiled']
     * 
     * dataView，数据视图，上图icon左数10，打开数据视图，可设置更多属性
     * {boolean=} readOnly 默认数据视图为只读，可指定readOnly为false打开编辑功能
     * {Function=} optionToContent 自主编排数据视图的显示内容
     * {Function=} contentToOption
     * 当数据视图readOnly为false时，会出现刷新按钮，如果是自主编排的显示内容，如何翻转也请自理
     * {Array=} lang 数据视图上有三个话术，默认是['Data View', 'close', 'refresh']，如需改写，可自定义
     * 
     * restore，还原，复位原始图表，上图icon左数11
     * 
     * saveAsImage，保存图片（IE8-不支持），上图icon左数12，可设置更多属性
     * {string=} type 默认保存图片类型为'png'，需改为'jpeg'
     * {string=} name 指定图片名称，如不指定，则用图表title标题，如无title标题则图片名称默认为“ECharts”
     * {string=} lang 非IE浏览器支持点击下载，有保存话术，默认是“点击保存”，可修改<br>
     * 
     * 默认值：
     * {
     * mark : {
     * show : false,
     * title : {
     * mark : '辅助线开关',
     * markUndo : '删除辅助线',
     * markClear : '清空辅助线'
     * },
     * lineStyle : {
     * width : 2,
     * color : '#1e90ff',
     * type : 'dashed'
     * }
     * },
     * dataZoom : {
     * show : false,
     * title : {
     * dataZoom : '区域缩放',
     * dataZoomReset : '区域缩放后退'
     * }
     * },
     * dataView : {
     * show : false,
     * title : '数据视图',
     * readOnly: false,
     * lang : ['Data View', 'close', 'refresh']
     * },
     * magicType: {
     * show : false,
     * title : {
     * line : '折线图切换',
     * bar : '柱形图切换',
     * stack : '堆积',
     * tiled : '平铺'
     * },
     * type : []
     * },
     * restore : {
     * show : false,
     * title : '还原'
     * },
     * saveAsImage : {
     * show : false,
     * title : '保存为图片',
     * type : 'png',
     * lang : ['点击保存']
     * }
     * }
     */
    private Feature           feature;

    public Toolbox()
    {
        this.color = new ArrayList<EColor>();
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
    public Toolbox setShow(Boolean show)
    {
        this.show = show;
        return this;
    }

    /**
     * @return the orient
     */
    public EOrient getOrient()
    {
        return orient;
    }

    /**
     * @param orient
     *            the orient to set
     */
    public Toolbox setOrient(EOrient orient)
    {
        this.orient = orient;
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
    public Toolbox setX(Object x)
    {
        if (x instanceof EHorizontalAlign)
            this.x = ((EHorizontalAlign) x).name();
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
    public Toolbox setY(Object y)
    {
        if (y instanceof EHorizontalAlign)
            this.y = ((EHorizontalAlign) y).name();
        else if (y instanceof Number)
            this.y = ((Number) y).intValue();
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
    public Toolbox setBackgroundColor(EColor backgroundColor)
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
    public Toolbox setBorderColor(EColor borderColor)
    {
        this.borderColor = borderColor;
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
    public Toolbox setBorderWidth(Integer borderWidth)
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
     *            the padding to set<br>
     *            CSS style
     */
    public Toolbox setPadding(String padding)
    {
        this.padding = padding;
        return this;
    }

    /**
     * @return the itemGap
     */
    public Integer getItemGap()
    {
        return itemGap;
    }

    /**
     * @param itemGap
     *            the itemGap to set
     */
    public Toolbox setItemGap(Integer itemGap)
    {
        this.itemGap = itemGap;
        return this;
    }

    /**
     * @return the itemSize
     */
    public Integer getItemSize()
    {
        return itemSize;
    }

    /**
     * @param itemSize
     *            the itemSize to set
     */
    public Toolbox setItemSize(Integer itemSize)
    {
        this.itemSize = itemSize;
        return this;
    }

    /**
     * @return the color
     */
    public ArrayList<EColor> getColor()
    {
        return color;
    }

    /**
     * @param color
     *            the color to set
     */
    public Toolbox setColor(ArrayList<EColor> color)
    {
        this.color = color;
        return this;
    }

    public Toolbox addColor(EColor color)
    {
        this.color.add(color);
        return this;
    }

    /**
     * @return the showTitle
     */
    public Boolean getShowTitle()
    {
        return showTitle;
    }

    /**
     * @param showTitle
     *            the showTitle to set
     */
    public Toolbox setShowTitle(Boolean showTitle)
    {
        this.showTitle = showTitle;
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
    public Toolbox setTextStyle(TextStyle textStyle)
    {
        this.textStyle = textStyle;
        return this;
    }

    /**
     * @return the feature
     */
    public Feature getFeature()
    {
        return feature;
    }

    /**
     * @param feature
     *            the feature to set
     */
    public Toolbox setFeature(Feature feature)
    {
        this.feature = feature;
        return this;
    }

}
