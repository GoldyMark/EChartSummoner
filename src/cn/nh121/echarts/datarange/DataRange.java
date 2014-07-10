package cn.nh121.echarts.datarange;

import java.util.ArrayList;

import cn.nh121.echarts.core.EColor;
import cn.nh121.echarts.pubenum.EHorizontalAlign;
import cn.nh121.echarts.pubenum.EOrient;
import cn.nh121.echarts.style.TextStyle;

/**
 * 
 * @author ODMark
 * @creation 2014-7-10
 * @link http://echarts.baidu.com/doc/doc.html#DataRange
 */
public class DataRange
{
    /**
     * 说明：
     * 布局方式，默认为垂直布局，可选为：'horizontal' | 'vertical'<br>
     * 
     * 默认值：
     * 'vertical'
     */
    private EOrient           orient;

    /**
     * 说明：
     * 水平安放位置，默认为全图左对齐，可选为：'center' | 'left' | 'right' | {number}（x坐标，单位px）<br>
     * 
     * 默认值：
     * 'left'
     */
    private Object            x;

    /**
     * 说明：
     * 垂直安放位置，默认为全图底部，可选为：'top' | 'bottom' | 'center' | {number}（y坐标，单位px）<br>
     * 
     * 默认值：
     * 'bottom'
     */
    private Object            y;

    /**
     * 说明：
     * 值域控件背景颜色，默认透明<br>
     * 
     * 默认值：
     * 'rgba(0,0,0,0)'
     */
    private EColor            backgroundColor;

    /**
     * 说明：
     * 值域控件边框颜色<br>
     * 
     * 默认值：
     * '#ccc'
     */
    private EColor            borderColor;

    /**
     * 说明：
     * 值域控件边框线宽，单位px，默认为0（无边框）<br>
     * 
     * 默认值：
     * 0
     */
    private Integer           borderWidth;

    /**
     * 说明：
     * 值域控件内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距，同css，见下图<br>
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
     * 值域控件图形宽度<br>
     * 
     * 默认值：
     * 20
     */
    private Integer           itemWidth;

    /**
     * 说明：
     * 值域控件图形高度<br>
     * 
     * 默认值：
     * 14
     */
    private Integer           itemHeight;

    /**
     * 说明：
     * 指定的最小值，eg: 0，默认无，必须参数<br>
     * 
     * 默认值：
     * null
     */
    private Integer           min;

    /**
     * 说明：
     * 指定的最大值，eg: 100，默认无，必须参数<br>
     * 
     * 默认值：
     * null
     */
    private Integer           max;

    /**
     * 说明：
     * 小数精度，默认为0，无小数点，当 min ~ max 间在当前精度下无法整除splitNumber份时，精度会自动提高以满足均分，不支持不等划分<br>
     * 
     * 默认值：
     * 0
     */
    private Integer           precision;

    /**
     * 说明：
     * 分割段数，默认为5，为0时为线性渐变，calculable为true是默认均分100份<br>
     * 
     * 默认值：
     * 5
     */
    private Integer           splitNumber;

    /**
     * 说明：
     * 是否启用值域漫游，启用后无视splitNumber，值域显示为线性渐变<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean           calculable;

    /**
     * 说明：
     * 值域漫游是否实时显示<br>
     * 
     * 默认值：
     * TRUE
     */
    private Boolean           realtime;

    /**
     * 说明：
     * 值域颜色标识，颜色数组长度必须>=2，颜色代表从数值高到低的变化，即颜色数组低位代表数值高的颜色标识<br>
     * 
     * 默认值：
     * ['#1e90ff','#f0ffff']
     */
    private ArrayList<EColor> color = new ArrayList<EColor>();

    /**
     * 说明：
     * 内容格式器：{string}（Template）
     * | {Function}，模板变量为'{value}'和'{value2}'，代表数值起始值和结束值，函数参数两个，含义同模板变量，try
     * this »<br>
     * 
     * 默认值：
     * null
     */
    private String            formatter;

    /**
     * 说明：
     * 值域文字显示，splitNumber生效时默认以计算所得数值作为值域文字显示，可指定长度为2的文本数组显示简介的值域文本，如['高',
     * '低']，'\n'指定换行<br>
     * 
     * 默认值：
     * null
     */
    private String[]          text  = new String[2];

    /**
     * 说明：
     * 默认只设定了值域控件文字颜色（详见textStyle）<br>
     * 
     * 默认值：
     * {color: '#333'}
     */
    private TextStyle         textStyle;

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
    public DataRange setOrient(EOrient orient)
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
    public DataRange setX(Object x)
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
    public DataRange setY(Object y)
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
    public DataRange setBackgroundColor(EColor backgroundColor)
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
    public DataRange setBorderColor(EColor borderColor)
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
    public DataRange setBorderWidth(Integer borderWidth)
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
    public DataRange setPadding(String padding)
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
    public DataRange setItemGap(Integer itemGap)
    {
        this.itemGap = itemGap;
        return this;
    }

    /**
     * @return the itemWidth
     */
    public Integer getItemWidth()
    {
        return itemWidth;
    }

    /**
     * @param itemWidth
     *            the itemWidth to set
     */
    public DataRange setItemWidth(Integer itemWidth)
    {
        this.itemWidth = itemWidth;
        return this;
    }

    /**
     * @return the itemHeight
     */
    public Integer getItemHeight()
    {
        return itemHeight;
    }

    /**
     * @param itemHeight
     *            the itemHeight to set
     */
    public DataRange setItemHeight(Integer itemHeight)
    {
        this.itemHeight = itemHeight;
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
    public DataRange setMin(Integer min)
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
    public DataRange setMax(Integer max)
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
    public DataRange setPrecision(Integer precision)
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
    public DataRange setSplitNumber(Integer splitNumber)
    {
        this.splitNumber = splitNumber;
        return this;
    }

    /**
     * @return the calculable
     */
    public Boolean getCalculable()
    {
        return calculable;
    }

    /**
     * @param calculable
     *            the calculable to set
     */
    public DataRange setCalculable(Boolean calculable)
    {
        this.calculable = calculable;
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
    public DataRange setRealtime(Boolean realtime)
    {
        this.realtime = realtime;
        return this;
    }

    /**
     * @return the color
     */
    public ArrayList<EColor> getColor()
    {
        if (color.size() < 2)
            throw new RuntimeException("值域颜色标识，颜色数组长度必须>=2，颜色代表从数值高到低的变化，即颜色数组低位代表数值高的颜色标识");
        return color;
    }

    /**
     * @param color
     *            the color to set
     */
    public DataRange setColor(ArrayList<EColor> color)
    {
        this.color = color;
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
    public DataRange setFormatter(String formatter)
    {
        this.formatter = formatter;
        return this;
    }

    /**
     * @return the text
     */
    public String[] getText()
    {
        return text;
    }

    /**
     * @param text
     *            the text to set
     */
    public DataRange setText(String text1, String text2)
    {
        this.text[0] = text1;
        this.text[1] = text2;
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
    public DataRange setTextStyle(TextStyle textStyle)
    {
        this.textStyle = textStyle;
        return this;
    }
}
