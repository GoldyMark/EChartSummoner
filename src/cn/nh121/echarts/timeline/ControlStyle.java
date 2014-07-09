package cn.nh121.echarts.timeline;

import cn.nh121.echarts.core.EColor;

/**
 * 时间轴控制器样式，可指定正常和高亮颜色
 * 
 * @author ODMark
 * @creation 2014-7-8
 */
public class ControlStyle
{
    /**
     * 正常颜色
     */
    private Normal   normal   = new Normal();

    /**
     * 高亮颜色
     */
    private Emphasis emphasis = new Emphasis();

    private class Normal
    {
        private EColor color;

        /**
         * @return the color
         */
        public EColor getColor()
        {
            return color;
        }

        /**
         * @param color
         *            the color to set
         */
        public Normal setColor(EColor color)
        {
            this.color = color;
            return this;
        }
    }

    private class Emphasis
    {
        private EColor color;

        /**
         * @return the color
         */
        public EColor getColor()
        {
            return color;
        }

        /**
         * @param color
         *            the color to set
         */
        public Emphasis setColor(EColor color)
        {
            this.color = color;
            return this;
        }
    }

    public EColor getNormalColor()
    {
        return normal.getColor();
    }

    public ControlStyle setNormalColor(EColor color)
    {
        normal.setColor(color);
        return this;
    }

    public EColor getEmphasisColor()
    {
        return emphasis.getColor();
    }

    public ControlStyle setEmphasisColor(EColor color)
    {
        emphasis.setColor(color);
        return this;
    }

}
