package cn.nh121.echarts.series;

public enum EXAxisIndex
{
    X1AXIS(0), X2AXIS(1);

    private Integer xAxisIndex;

    private EXAxisIndex(Integer xAxisIndex)
    {
        this.xAxisIndex = xAxisIndex;
    }

    @Override
    public String toString()
    {
        return xAxisIndex.toString();
    }
}
