package cn.nh121.echarts.legend;

import java.util.ArrayList;
import java.util.Map;

import cn.nh121.echarts.core.EColor;
import cn.nh121.echarts.pubenum.EHorizontalAlign;
import cn.nh121.echarts.pubenum.EOrient;
import cn.nh121.echarts.pubenum.ESelectedMode;
import cn.nh121.echarts.style.TextStyle;

/**
 * 
 * @author ODMark
 * @creation 2014-7-10
 * @link http://echarts.baidu.com/doc/doc.html#Legend
 */
public class Legend
{
    /**
     * 说明：
     * 布局方式，默认为水平布局，可选为：'horizontal' | 'vertical'<br>
     * 
     * 默认值：
     * 'horizontal'
     */
    private EOrient               orient;

    /**
     * 说明：
     * 水平安放位置，默认为全图居中，可选为：'center' | 'left' | 'right' | {number}（x坐标，单位px）<br>
     * 
     * 默认值：
     * 'center'
     */
    private Object                x;

    /**
     * 说明：
     * 垂直安放位置，默认为全图顶端，可选为：'top' | 'bottom' | 'center' | {number}（y坐标，单位px）<br>
     * 
     * 默认值：
     * 'top'
     */
    private Object                y;

    /**
     * 说明：
     * 图例背景颜色，默认透明<br>
     * 
     * 默认值：
     * 'rgba(0,0,0,0)'
     */
    private EColor                backgroundColor;

    /**
     * 说明：
     * 图例边框颜色<br>
     * 
     * 默认值：
     * '#ccc'
     */
    private EColor                borderColor;

    /**
     * 说明：
     * 图例边框线宽，单位px，默认为0（无边框）<br>
     * 
     * 默认值：
     * 0
     */
    private Integer               borderWidth;

    /**
     * 说明：
     * 图例内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距，同css，见下图<br>
     * 
     * 默认值：
     * 5
     */
    private String                padding;

    /**
     * 说明：
     * 各个item之间的间隔，单位px，默认为10，横向布局时为水平间隔，纵向布局时为纵向间隔，见下图<br>
     * 
     * 默认值：
     * 10
     */
    private Integer               itemGap;

    /**
     * 说明：
     * 默认只设定了图例文字颜色（详见textStyle） ，更个性化的是，要指定文字颜色跟随图例，可设color为'auto'<br>
     * 
     * 默认值：
     * {color: '#333'}
     */
    private TextStyle             textStyle;

    /**
     * 说明：
     * 选择模式，默认开启图例开关，可选single，multiple<br>
     * 
     * 默认值：
     * TRUE
     */
    private ESelectedMode         selectedMode;

    /**
     * 说明：
     * 配置默认选中状态，可配合LEGEND.SELECTED事件做动态数据载入，try this »<br>
     * 
     * 默认值：
     * null
     */
    private Map<String, Boolean>  selected;

    /**
     * 说明：
     * 图例内容数组，数组项通常为{string}，每一项代表一个系列的name。
     * 使用根据该值索引series中同名系列所用的图表类型和itemStyle，如果索引不到，该item将默认为没启用状态。
     * 如需个性化图例文字样式，可把数组项改为{Object}，知道文本样式和个性化图例icon，格式为
     * {
     * name : {string},
     * textStyle : {Object},
     * icon : {string}
     * }<br>
     * 
     * 默认值：
     * [ ]
     */
    private ArrayList<LegendItem> data;

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
    public Legend setOrient(EOrient orient)
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
    public Legend setX(Object x)
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
    public Legend setY(Object y)
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
    public Legend setBackgroundColor(EColor backgroundColor)
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
    public Legend setBorderColor(EColor borderColor)
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
    public Legend setBorderWidth(Integer borderWidth)
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
    public Legend setPadding(String padding)
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
    public Legend setItemGap(Integer itemGap)
    {
        this.itemGap = itemGap;
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
    public Legend setTextStyle(TextStyle textStyle)
    {
        this.textStyle = textStyle;
        return this;
    }

    /**
     * @return the selectedMode
     */
    public ESelectedMode getSelectedMode()
    {
        return selectedMode;
    }

    /**
     * @param selectedMode
     *            the selectedMode to set
     */
    public Legend setSelectedMode(ESelectedMode selectedMode)
    {
        this.selectedMode = selectedMode;
        return this;
    }

    /**
     * @return the selected
     */
    public Map<String, Boolean> getSelected()
    {
        return selected;
    }

    /**
     * @param selected
     *            the selected to set
     */
    public Legend setSelected(Map<String, Boolean> selected)
    {
        this.selected = selected;
        return this;
    }

    /**
     * @return the data
     */
    public ArrayList<LegendItem> getData()
    {
        return data;
    }

    /**
     * @param data
     *            the data to set
     */
    public Legend setData(ArrayList<LegendItem> data)
    {
        this.data = data;
        return this;
    }

}
