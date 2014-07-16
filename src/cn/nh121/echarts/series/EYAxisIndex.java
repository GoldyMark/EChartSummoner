package cn.nh121.echarts.series;

public enum EYAxisIndex
{
    Y1AXIS(0), Y2AXIS(1);

    private Integer yAxisIndex;

    private EYAxisIndex(Integer yAxisIndex)
    {
        this.yAxisIndex = yAxisIndex;
    }

    @Override
    public String toString()
    {
        return yAxisIndex.toString();
    }
}
