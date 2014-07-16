/**
 * 
 */
package cn.nh121.echarts.series.markpoint;

import java.util.ArrayList;

import cn.nh121.echarts.pubenum.ESymbol;
import cn.nh121.echarts.series.GeoCoord;
import cn.nh121.echarts.series.SeriesEffect;
import cn.nh121.echarts.style.ItemStyle;

/**
 * 系列中的数据标注内容
 * 
 * @author ODMark
 * @creation 2014-7-12
 * @link http://echarts.baidu.com/doc/doc.html#SeriesMarkPoint
 */
public class MarkPoint
{
    /**
     * 说明：
     * 标注类型，同series中的symbol<br>
     * 
     * 默认值：
     * 'pin'
     */
    private ESymbol                   symbol;

    /**
     * 说明：
     * 标注大小，同series中的symbolSize<br>
     * 
     * 默认值：
     * 10
     */
    private Object                    symbolSize;

    /**
     * 说明：
     * 标注图形旋转角度，同series中的symbolRotate<br>
     * 
     * 默认值：
     * null
     */
    private Integer                   symbolRotate;

    /**
     * 说明：
     * 是否启动大规模标注模式<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean                   large;

    /**
     * 说明：
     * 标注图形炫光特效:
     * show 是否开启，默认关闭
     * period 运动周期，无单位，值越大越慢，默认为15
     * scaleSize 放大倍数，以markPoint symbolSize为基准
     * color 炫光颜色，默认跟随markPoint itemStyle定义颜色,
     * shadowColor 光影颜色，默认跟随color
     * shadowBlur 光影模糊度，默认为0 <br>
     * 
     * 默认值：
     * {
     * show: false,
     * period: 15,
     * scaleSize : 2,
     * color : null,
     * shadowColor : null,
     * shadowBlur : 0
     * }
     */
    private SeriesEffect              effect;

    /**
     * 说明：
     * 标注图形样式属性，同series中的itemStyle<br>
     * 
     * 默认值：
     * {...}
     */
    private ItemStyle                 itemStyle;

    /**
     * 说明：
     * 地图特有，标注图形定位坐标，同series中的geoCoord<br>
     * 
     * 默认值：
     * {}
     */
    private GeoCoord                  geoCoord;

    /**
     * 说明：
     * 标注图形数据，见下<br>
     * 
     * 默认值：
     * []
     */
    private ArrayList<AMarkPointData> data;

    /**
     * @return the symbol
     */
    public ESymbol getSymbol()
    {
        return symbol;
    }

    /**
     * @param symbol
     *            the symbol to set
     */
    public MarkPoint setSymbol(ESymbol symbol)
    {
        this.symbol = symbol;
        return this;
    }

    /**
     * @return the symbolSize
     */
    public Object getSymbolSize()
    {
        return symbolSize;
    }

    /**
     * @param symbolSize
     *            the symbolSize to set
     */
    public MarkPoint setSymbolSize(Object symbolSize)
    {
        this.symbolSize = symbolSize;
        return this;
    }

    /**
     * @return the symbolRotate
     */
    public Integer getSymbolRotate()
    {
        return symbolRotate;
    }

    /**
     * @param symbolRotate
     *            the symbolRotate to set
     */
    public MarkPoint setSymbolRotate(Integer symbolRotate)
    {
        this.symbolRotate = symbolRotate;
        return this;
    }

    /**
     * @return the large
     */
    public Boolean getLarge()
    {
        return large;
    }

    /**
     * @param large
     *            the large to set
     */
    public MarkPoint setLarge(Boolean large)
    {
        this.large = large;
        return this;
    }

    /**
     * @return the effect
     */
    public SeriesEffect getEffect()
    {
        return effect;
    }

    /**
     * @param effect
     *            the effect to set
     */
    public MarkPoint setEffect(SeriesEffect effect)
    {
        this.effect = effect;
        return this;
    }

    /**
     * @return the itemStyle
     */
    public ItemStyle getItemStyle()
    {
        return itemStyle;
    }

    /**
     * @param itemStyle
     *            the itemStyle to set
     */
    public MarkPoint setItemStyle(ItemStyle itemStyle)
    {
        this.itemStyle = itemStyle;
        return this;
    }

    /**
     * @return the geoCoord
     */
    public GeoCoord getGeoCoord()
    {
        return geoCoord;
    }

    /**
     * @param geoCoord
     *            the geoCoord to set
     */
    public MarkPoint setGeoCoord(GeoCoord geoCoord)
    {
        this.geoCoord = geoCoord;
        return this;
    }

    /**
     * @return the data
     */
    public ArrayList<AMarkPointData> getData()
    {
        return data;
    }

    /**
     * @param data
     *            the data to set
     */
    public MarkPoint setData(ArrayList<AMarkPointData> data)
    {
        this.data = data;
        return this;
    }

}
