package cn.nh121.echarts.core;

public class JSFunction
{
    private final String TEMPLATE = "function(%s){%s};";
    private String       functionStr;

    public JSFunction(String body, String... args)
    {
        String argStr = "";
        // for (String arg : args)
        // argStr += arg + ",";
        for (int i = 0; i < args.length; i++)
        {
            argStr += args[i];
            if (i != args.length - 1)
                argStr += ",";
        }
        functionStr = String.format(TEMPLATE, argStr, body);
    }

    @Override
    public String toString()
    {
        return functionStr;
    }

}
