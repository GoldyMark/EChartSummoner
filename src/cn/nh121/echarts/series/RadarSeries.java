package cn.nh121.echarts.series;

import cn.nh121.echarts.pubenum.ESymbol;

public class RadarSeries extends ASeries
{
    /**
     * 说明：
     * 极坐标索引<br>
     * 
     * 默认值：
     * 0
     */
    private Integer polarIndex;

    /**
     * 说明：
     * 同series（直角系）<br>
     * 
     * 默认值：
     * null
     */
    private ESymbol symbol;

    /**
     * 说明：
     * 同series（直角系）<br>
     * 
     * 默认值：
     * 2
     */
    private Object  symbolSize;

    /**
     * 说明：
     * 同series（直角系）<br>
     * 
     * 默认值：
     * null
     */
    private Integer symbolRotate;

    /**
     * @return the polarIndex
     */
    public Integer getPolarIndex()
    {
        return polarIndex;
    }

    /**
     * @param polarIndex
     *            the polarIndex to set
     */
    public RadarSeries setPolarIndex(Integer polarIndex)
    {
        this.polarIndex = polarIndex;
        return this;
    }

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
    public RadarSeries setSymbol(ESymbol symbol)
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
    public RadarSeries setSymbolSize(Object symbolSize)
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
    public RadarSeries setSymbolRotate(Integer symbolRotate)
    {
        this.symbolRotate = symbolRotate;
        return this;
    }

}
