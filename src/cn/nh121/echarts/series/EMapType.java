package cn.nh121.echarts.series;

public class EMapType
{
    // CHINA("world", "china");

    private String main;
    private String sub;

    public EMapType(String main, String sub)
    {
        this.main = main;
        this.sub = sub;
    }

    @Override
    public String toString()
    {
        return main + "|" + sub;
    }
}
