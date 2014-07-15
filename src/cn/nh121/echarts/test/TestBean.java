package cn.nh121.echarts.test;

public class TestBean extends ATest
{
    private Integer value;

    public TestBean(String name, Integer value)
    {
        super(name);
        this.value = value;
    }

    /**
     * @return the value
     */
    public Integer getValue()
    {
        return value;
    }

    /**
     * @param value
     *            the value to set
     */
    public TestBean setValue(Integer value)
    {
        this.value = value;
        return this;
    }
}
