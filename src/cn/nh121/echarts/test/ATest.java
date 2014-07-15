package cn.nh121.echarts.test;

public abstract class ATest
{
    private String name;

    public ATest(String name)
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
    public ATest setName(String name)
    {
        this.name = name;
        return this;
    }
}
