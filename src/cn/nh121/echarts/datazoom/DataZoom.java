package cn.nh121.echarts.datazoom;

import java.util.ArrayList;

import cn.nh121.echarts.core.EColor;
import cn.nh121.echarts.pubenum.EOrient;

public class DataZoom
{
    /**
     * 说明：
     * 是否显示，当show为true时则接管使用指定类目轴的全部系列数据，如不指定则接管全部直角坐标系数据。<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean            show;

    /**
     * 说明：
     * 布局方式，默认为水平布局，可选为：'horizontal' | 'vertical'<br>
     * 
     * 默认值：
     * 'horizontal'
     */
    private EOrient            orient;

    /**
     * 说明：
     * 水平安放位置，默认为根据grid参数适配，纵向布局默认左侧，可指定 {number}（左上角x坐标，单位px）<br>
     * 
     * 默认值：
     * 自适应
     */
    private Integer            x;

    /**
     * 说明：
     * 垂直安放位置，默认为根据grid参数适配，纵向布局默认下方，可指定 {number}（左上角y坐标，单位px）<br>
     * 
     * 默认值：
     * 自适应
     */
    private Integer            y;

    /**
     * 说明：
     * 指定宽度，横向布局时默认为根据grid参数适配，纵向布局是默认为30，可指定 {number}（宽度，单位px）<br>
     * 
     * 默认值：
     * 自适应 | 30
     */
    private Integer            width;

    /**
     * 说明：
     * 指定高度，纵向布局时默认为根据grid参数适配，横向布局是默认为30，可指定 {number}（高度，单位px）<br>
     * 
     * 默认值：
     * 自适应 | 30
     */
    private Integer            height;

    /**
     * 说明：
     * 背景颜色，默认透明<br>
     * 
     * 默认值：
     * 'rgba(0,0,0,0)'
     */
    private EColor             backgroundColor;

    /**
     * 说明：
     * 数据缩略背景颜色<br>
     * 
     * 默认值：
     * '#ccc'
     */
    private EColor             dataBackgroundColor;

    /**
     * 说明：
     * 选择区域填充颜色<br>
     * 
     * 默认值：
     * 'rgba(144,197,237,0.2)'
     */
    private EColor             fillerColor;

    /**
     * 说明：
     * 控制手柄颜色<br>
     * 
     * 默认值：
     * 'rgba(70,130,180,0.8)'
     */
    private EColor             handleColor;

    /**
     * 说明：
     * 当不指定时默认控制所有横向类目，可通过数组指定多个需要控制的横向类目坐标轴Index，仅一个时可直接为数字<br>
     * 
     * 默认值：
     * null
     */
    private ArrayList<Integer> xAxisIndex;

    /**
     * 说明：
     * 当不指定时默认控制所有纵向类目，可通过数组指定多个需要控制的纵向类目坐标轴Index，仅一个时可直接为数字<br>
     * 
     * 默认值：
     * null
     */
    private ArrayList<Integer> yAxisIndex;

    /**
     * 说明：
     * 数据缩放，选择起始比例，默认为0（%），从首个数据起选择。<br>
     * 
     * 默认值：
     * 0
     */
    private Integer            start;

    /**
     * 说明：
     * 数据缩放，选择结束比例，默认为100（%），到最后一个数据选择结束。<br>
     * 
     * 默认值：
     * 100
     */
    private Integer            end;

    /**
     * 说明：
     * 缩放变化是否实时显示，建议性能较低的浏览器或数据量巨大时不启动实时效果。<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean            realtime;

    /**
     * 说明：
     * 数据缩放锁，默认为false，当设置为true时选择区域不能伸缩，即(end - start)值保持不变，仅能做数据漫游。<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean            zoomLock;

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
    public DataZoom setShow(Boolean show)
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
    public DataZoom setOrient(EOrient orient)
    {
        this.orient = orient;
        return this;
    }

    /**
     * @return the x
     */
    public Integer getX()
    {
        return x;
    }

    /**
     * @param x
     *            the x to set
     */
    public DataZoom setX(Integer x)
    {
        this.x = x;
        return this;
    }

    /**
     * @return the y
     */
    public Integer getY()
    {
        return y;
    }

    /**
     * @param y
     *            the y to set
     */
    public DataZoom setY(Integer y)
    {
        this.y = y;
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
    public DataZoom setWidth(Integer width)
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
    public DataZoom setHeight(Integer height)
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
    public DataZoom setBackgroundColor(EColor backgroundColor)
    {
        this.backgroundColor = backgroundColor;
        return this;
    }

    /**
     * @return the dataBackgroundColor
     */
    public EColor getDataBackgroundColor()
    {
        return dataBackgroundColor;
    }

    /**
     * @param dataBackgroundColor
     *            the dataBackgroundColor to set
     */
    public DataZoom setDataBackgroundColor(EColor dataBackgroundColor)
    {
        this.dataBackgroundColor = dataBackgroundColor;
        return this;
    }

    /**
     * @return the fillerColor
     */
    public EColor getFillerColor()
    {
        return fillerColor;
    }

    /**
     * @param fillerColor
     *            the fillerColor to set
     */
    public DataZoom setFillerColor(EColor fillerColor)
    {
        this.fillerColor = fillerColor;
        return this;
    }

    /**
     * @return the handleColor
     */
    public EColor getHandleColor()
    {
        return handleColor;
    }

    /**
     * @param handleColor
     *            the handleColor to set
     */
    public DataZoom setHandleColor(EColor handleColor)
    {
        this.handleColor = handleColor;
        return this;
    }

    /**
     * @return the xAxisIndex
     */
    public ArrayList<Integer> getxAxisIndex()
    {
        return xAxisIndex;
    }

    /**
     * @param xAxisIndex
     *            the xAxisIndex to set
     */
    public DataZoom setxAxisIndex(ArrayList<Integer> xAxisIndex)
    {
        this.xAxisIndex = xAxisIndex;
        return this;
    }

    /**
     * @return the yAxisIndex
     */
    public ArrayList<Integer> getyAxisIndex()
    {
        return yAxisIndex;
    }

    /**
     * @param yAxisIndex
     *            the yAxisIndex to set
     */
    public DataZoom setyAxisIndex(ArrayList<Integer> yAxisIndex)
    {
        this.yAxisIndex = yAxisIndex;
        return this;
    }

    /**
     * @return the start
     */
    public Integer getStart()
    {
        if (start != null)
            if (start < 0 || start > 100)
                throw new RuntimeException("start取值范围0~100！");
        return start;
    }

    /**
     * @param start
     *            the start to set
     */
    public DataZoom setStart(Integer start)
    {
        if (start < 0 || start > 100)
            throw new IllegalArgumentException("数据缩放起始比例，取值范围0~100。");
        this.start = start;
        return this;
    }

    /**
     * @return the end
     */
    public Integer getEnd()
    {
        if (end != null)
            if (end < 0 || end > 100)
                throw new RuntimeException("end取值范围0~100！");
        return end;
    }

    /**
     * @param end
     *            the end to set
     */
    public DataZoom setEnd(Integer end)
    {
        if (end < 0 || end > 100)
            throw new IllegalArgumentException("数据缩放起始比例，取值范围0~100。");
        this.end = end;
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
    public DataZoom setRealtime(Boolean realtime)
    {
        this.realtime = realtime;
        return this;
    }

    /**
     * @return the zoomLock
     */
    public Boolean getZoomLock()
    {
        return zoomLock;
    }

    /**
     * @param zoomLock
     *            the zoomLock to set
     */
    public DataZoom setZoomLock(Boolean zoomLock)
    {
        this.zoomLock = zoomLock;
        return this;
    }

}
