package cn.nh121.echarts.axis;

public class AxisLine
{
    /**
     * 类型：通用
     * 说明：
     * 是否显示，默认为true，设为false后下面都没意义了<br>
     * 
     * 默认值：
     * TRUE
     */
    private EAxisType     show;

    /**
     * 类型：通用
     * 说明：
     * 定位到垂直方向的0值坐标上<br>
     * 
     * 默认值：
     * TRUE
     */
    private EAxisPosition onZero;

    /**
     * 类型：通用
     * 说明：
     * 属性lineStyle控制线条样式，（详见lineStyle）<br>
     * 
     * 默认值：
     * {color: '#48b', width: 2, type: 'solid'}
     */
    private String        lineStyle;

    /**
     * @return the show
     */
    public EAxisType getShow()
    {
        return show;
    }

    /**
     * @param show
     *            the show to set
     */
    public AxisLine setShow(EAxisType show)
    {
        this.show = show;
        return this;
    }

    /**
     * @return the onZero
     */
    public EAxisPosition getOnZero()
    {
        return onZero;
    }

    /**
     * @param onZero
     *            the onZero to set
     */
    public AxisLine setOnZero(EAxisPosition onZero)
    {
        this.onZero = onZero;
        return this;
    }

    /**
     * @return the lineStyle
     */
    public String getLineStyle()
    {
        return lineStyle;
    }

    /**
     * @param lineStyle
     *            the lineStyle to set
     */
    public AxisLine setLineStyle(String lineStyle)
    {
        this.lineStyle = lineStyle;
        return this;
    }

}
