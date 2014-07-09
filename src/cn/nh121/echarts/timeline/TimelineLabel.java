package cn.nh121.echarts.timeline;

import cn.nh121.echarts.style.TextStyle;

/**
 * 时间轴标签文本
 * 
 * @author ODMark
 * @creation 2014-7-8
 */
public class TimelineLabel
{
    /**
     * 是否显示
     */
    private Boolean   show;

    /**
     * 挑选间隔，默认为'auto'，可选为：'auto'（自动隐藏显示不下的） | 0（全部显示） | {number}
     */
    private Object    interval;

    /**
     * 旋转角度，默认为0，不旋转，正值为逆时针，负值为顺时针，可选为：-90 ~ 90
     */
    private Integer   rotate;

    /**
     * 间隔名称格式器：{string}(Template) | {Function}
     */
    private String    formatter;

    /**
     * 文字样式
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
     * @return the interval
     */
    public Object getInterval()
    {
        return interval;
    }

    /**
     * @return the rotate
     */
    public Integer getRotate()
    {
        return rotate;
    }

    /**
     * @return the formatter
     */
    public String getFormatter()
    {
        return formatter;
    }

    /**
     * @return the textStyle
     */
    public TextStyle getTextStyle()
    {
        return textStyle;
    }

    /**
     * @param show
     *            the show to set
     */
    public TimelineLabel setShow(Boolean show)
    {
        this.show = show;
        return this;
    }

    /**
     * @param interval
     *            the interval to set
     */
    public TimelineLabel setInterval(Object interval)
    {
        if (interval instanceof String)
            if ("auto".equals(interval))
                this.interval = interval;
            else
                throw new IllegalArgumentException("interval默认为'auto'，可选为：'auto'（自动隐藏显示不下的） | 0（全部显示） | {number} ");
        else if (interval instanceof Number)
            this.interval = ((Number) interval).intValue();
        return this;
    }

    /**
     * @param rotate
     *            the rotate to set
     */
    public TimelineLabel setRotate(Integer rotate)
    {
        if (rotate > 90 || rotate < -90)
            throw new IllegalArgumentException("旋转角度，默认为0，不旋转，正值为逆时针，负值为顺时针，可选为：-90 ~ 90");
        this.rotate = rotate;
        return this;
    }

    /**
     * @param formatter
     *            the formatter to set
     */
    public TimelineLabel setFormatter(String formatter)
    {
        this.formatter = formatter;
        return this;
    }

    /**
     * @param textStyle
     *            the textStyle to set
     */
    public TimelineLabel setTextStyle(TextStyle textStyle)
    {
        this.textStyle = textStyle;
        return this;
    }
}
