package cn.nh121.echarts.grid;

import cn.nh121.echarts.core.EColor;

public class Grid
{
    /**
     * 说明：
     * 直角坐标系内绘图网格左上角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)<br>
     * 
     * 默认值：
     * 80
     */
    private Object  x;

    /**
     * 说明：
     * 直角坐标系内绘图网格左上角纵坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域纵向中心)<br>
     * 
     * 默认值：
     * 60
     */
    private Object  y;

    /**
     * 说明：
     * 直角坐标系内绘图网格右下角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)<br>
     * 
     * 默认值：
     * 80
     */
    private Object  x2;

    /**
     * 说明：
     * 直角坐标系内绘图网格右下角纵坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域纵向中心)<br>
     * 
     * 默认值：
     * 60
     */
    private Object  y2;

    /**
     * 说明：
     * 直角坐标系内绘图网格（不含坐标轴）宽度，默认为总宽度 - x - x2，数值单位px，指定width后将忽略x2，见下图。
     * 支持百分比（字符串），如'50%'(显示区域一半的宽度)<br>
     * 
     * 默认值：
     * 自适应
     */
    private Integer width;

    /**
     * 说明：
     * 直角坐标系内绘图网格（不含坐标轴）高度，默认为总宽度 - y - y2，数值单位px，指定height后将忽略y2，见下图。
     * 支持百分比（字符串），如'50%'(显示区域一半的高度)<br>
     * 
     * 默认值：
     * 自适应
     */
    private Integer height;

    /**
     * 说明：
     * 背景颜色，默认透明。<br>
     * 
     * 默认值：
     * 'rgba(0,0,0,0)'
     */
    private EColor  backgroundColor;

    /**
     * 说明：
     * 边框线宽<br>
     * 
     * 默认值：
     * 1
     */
    private Integer borderWidth;

    /**
     * 说明：
     * 边框颜色。<br>
     * 
     * 默认值：
     * '#ccc'
     */
    private EColor  borderColor;

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
    public Grid setX(String x)
    {
        try
        {
            this.x = Integer.parseInt(x);
        } catch (Exception e)
        {
            this.x = x;
        }
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
    public Grid setY(String y)
    {
        try
        {
            this.y = Integer.parseInt(y);
        } catch (Exception e)
        {
            this.y = y;
        }
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
    public Grid setX2(String x2)
    {
        try
        {
            this.x2 = Integer.parseInt(x2);
        } catch (Exception e)
        {
            this.x2 = x2;
        }
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
    public Grid setY2(String y2)
    {
        try
        {
            this.y2 = Integer.parseInt(y2);
        } catch (Exception e)
        {
            this.y2 = y2;
        }
        return this;
    }

    /**
     * @return the width
     */
    public Integer getWidth()
    {
        return width;
    }

    /**
     * @param width
     *            the width to set
     */
    public Grid setWidth(Integer width)
    {
        this.width = width;
        return this;
    }

    /**
     * @return the height
     */
    public Integer getHeight()
    {
        return height;
    }

    /**
     * @param height
     *            the height to set
     */
    public Grid setHeight(Integer height)
    {
        this.height = height;
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
    public Grid setBackgroundColor(EColor backgroundColor)
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
    public Grid setBorderWidth(Integer borderWidth)
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
    public Grid setBorderColor(EColor borderColor)
    {
        this.borderColor = borderColor;
        return this;
    }

}
