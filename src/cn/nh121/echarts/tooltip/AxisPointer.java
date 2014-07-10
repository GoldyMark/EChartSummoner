package cn.nh121.echarts.tooltip;

import cn.nh121.echarts.style.AreaStyle;
import cn.nh121.echarts.style.LineStyle;

public class AxisPointer
{
    private EType     type;
    private LineStyle lineStyle;
    private LineStyle crossStyle;
    private AreaStyle shadowStyle;

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
    public AxisPointer setType(EType type)
    {
        this.type = type;
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
    public AxisPointer setLineStyle(LineStyle lineStyle)
    {
        this.lineStyle = lineStyle;
        return this;
    }

    /**
     * @return the crossStyle
     */
    public LineStyle getCrossStyle()
    {
        return crossStyle;
    }

    /**
     * @param crossStyle
     *            the crossStyle to set
     */
    public AxisPointer setCrossStyle(LineStyle crossStyle)
    {
        this.crossStyle = crossStyle;
        return this;
    }

    /**
     * @return the shadowStyle
     */
    public AreaStyle getShadowStyle()
    {
        return shadowStyle;
    }

    /**
     * @param shadowStyle
     *            the shadowStyle to set
     */
    public AxisPointer setShadowStyle(AreaStyle shadowStyle)
    {
        this.shadowStyle = shadowStyle;
        return this;
    }

    public enum EType
    {
        LINE, CROSS, SHADOW, NONE;
    }
}
