package cn.nh121.echarts.kit;


public class JSFunctionKit
{
    private static String template = "function(%s){%s};";

    public static String jsFunctionBuilder(String body, String... args)
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
        return String.format(template, argStr, body);
    }

    public static void main(String[] args)
    {
        System.out.println(jsFunctionBuilder("alert(\"Hello!\")", "a", "b", "swe,ae"));
    }
}
