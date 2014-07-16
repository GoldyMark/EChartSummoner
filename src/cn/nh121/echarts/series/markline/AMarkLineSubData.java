package cn.nh121.echarts.series.markline;

public abstract class AMarkLineSubData
{
    private String name;

    public AMarkLineSubData(String name)
    {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public AMarkLineSubData setName(String name)
    {
        this.name = name;
        return this;
    }
}
