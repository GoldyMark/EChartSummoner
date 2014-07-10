package cn.nh121.echarts.style;

import java.util.ArrayList;

import cn.nh121.echarts.core.EColor;

public class AreaStyle
{
    private ArrayList<EColor> color;
    private EType             type = EType.DEFAULT;

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
    public AreaStyle setColor(ArrayList<EColor> color)
    {
        this.color = color;
        return this;
    }

    /**
     * @return the type
     */
    public EType getType()
    {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public AreaStyle setType(EType type)
    {
        this.type = type;
        return this;
    }

    public enum EType
    {
        DEFAULT
    }
}
