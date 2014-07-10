package cn.nh121.echarts.axis;

import cn.nh121.echarts.style.TextStyle;

public class AxisLabel
{
    /**
     * 类型：通用
     * 说明：
     * 是否显示，默认为true，设为false后下面都没意义了<br>
     * 
     * 默认值：
     * TRUE
     */
    private Boolean   show;

    /**
     * 类型：类目型
     * 说明：
     * 标签显示挑选间隔，默认为'auto'，可选为：'auto'（自动隐藏显示不下的） | 0（全部显示） | {number}（用户指定选择间隔）<br>
     * 注意：如果设置interval为-1，则设置为null，即默认值
     * 
     * 默认值：
     * 'auto'
     */
    private Integer   interval;

    /**
     * 类型：通用
     * 说明：
     * 标签旋转角度，默认为0，不旋转，正值为逆时针，负值为顺时针，可选为：-90 ~ 90<br>
     * 
     * 默认值：
     * 0
     */
    private Integer   rotate;

    /**
     * 类型：通用
     * 说明：
     * 坐标轴文本标签与坐标轴的间距，默认为8，单位px<br>
     * 
     * 默认值：
     * 8
     */
    private Integer   margin;

    /**
     * 类型：通用
     * 说明：
     * 坐标轴文本标签是否可点击<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean   clickable;

    /**
     * 类型：通用
     * 说明：
     * 间隔名称格式器：{string}（Template） | {Function}<br>
     * 
     * 默认值：
     * null
     */
    private String    formatter;

    /**
     * 类型：通用
     * 说明：
     * 文本样式（详见textStyle），其中当坐标轴为数值型时，color接受方法回调，实现个性化的颜色定义<br>
     * 
     * 默认值：
     * {color: '#333'}
     */
    private TextStyle textStyle;

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
    public AxisLabel setShow(Boolean show)
    {
        this.show = show;
        return this;
    }

    /**
     * @return the interval
     */
    public Integer getInterval()
    {
        return interval;
    }

    /**
     * @param interval
     *            the interval to set<br>
     *            注意：如果设置interval为-1，则设置为null，即默认值
     */
    public AxisLabel setInterval(Integer interval)
    {
        if (interval == -1)
            this.interval = null;
        else
            this.interval = interval;
        return this;
    }

    /**
     * @return the rotate
     */
    public Integer getRotate()
    {
        return rotate;
    }

    /**
     * @param rotate
     *            the rotate to set
     */
    public AxisLabel setRotate(Integer rotate)
    {
        if (rotate < -90 || rotate > 90)
            throw new IllegalArgumentException("rotate取值范围为-90~90");
        this.rotate = rotate;
        return this;
    }

    /**
     * @return the margin
     */
    public Integer getMargin()
    {
        return margin;
    }

    /**
     * @param margin
     *            the margin to set
     */
    public AxisLabel setMargin(Integer margin)
    {
        this.margin = margin;
        return this;
    }

    /**
     * @return the clickable
     */
    public Boolean getClickable()
    {
        return clickable;
    }

    /**
     * @param clickable
     *            the clickable to set
     */
    public AxisLabel setClickable(Boolean clickable)
    {
        this.clickable = clickable;
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
    public AxisLabel setFormatter(String formatter)
    {
        this.formatter = formatter;
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
    public AxisLabel setTextStyle(TextStyle textStyle)
    {
        this.textStyle = textStyle;
        return this;
    }

}
