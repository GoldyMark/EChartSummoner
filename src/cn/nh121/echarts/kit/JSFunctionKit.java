package cn.nh121.echarts.kit;

import cn.nh121.echarts.core.EColor;
import cn.nh121.echarts.core.JSFunction;
import cn.nh121.echarts.style.LineStyle;
import cn.nh121.echarts.style.LineStyle.ELineType;
import cn.nh121.echarts.toolbox.feature.DataView;
import cn.nh121.echarts.toolbox.feature.DataZoom;
import cn.nh121.echarts.toolbox.feature.Feature;
import cn.nh121.echarts.toolbox.feature.MagicType;
import cn.nh121.echarts.toolbox.feature.MagicType.EMagicType;
import cn.nh121.echarts.toolbox.feature.Mark;
import cn.nh121.echarts.toolbox.feature.Restore;
import cn.nh121.echarts.toolbox.feature.SaveAsImage;
import cn.nh121.echarts.toolbox.feature.SaveAsImage.EImageType;

import com.alibaba.fastjson.JSON;

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

    public static void main2(String[] args)
    {
        Feature feature = new Feature();
        Mark mark = new Mark();
        mark.setShow(true);
        mark.setTitleMark("辅助线开关");
        mark.setTitleMarkClear("清空辅助线");
        mark.setTitleMarkUndo("删除辅助线");
        mark.setLineStyle(new LineStyle().setColor(EColor.RED).setShadowBlur(1).setWidth(5).setType(ELineType.SOLID));
        feature.setMark(mark);
        DataZoom dataZoom = new DataZoom();
        dataZoom.setShow(true);
        dataZoom.setDataZoomText("区域缩放");
        dataZoom.setDataZoomResetText("区域缩放后退");
        feature.setDataZoom(dataZoom);
        DataView dataView = new DataView();
        dataView.setShow(true);
        dataView.setTitle("数据视图");
        dataView.setReadOnly(false);
        dataView.setContentToOption(new JSFunction("alert(\"I'm in contentToOption\")", "a", "b", "c"));
        dataView.setOptionToContent(new JSFunction("alert(\"I'm in optionToContent\")", "1", "2", "3"));
        dataView.setLang("数据视图", "关闭", "刷新");
        feature.setDataView(dataView);
        MagicType magicType = new MagicType();
        magicType.setShow(true);
        magicType.setTitleBarText("柱形图切换");
        magicType.setTitleLineText("折线图切换");
        magicType.setTitleStackText("堆积");
        magicType.setTitleTiledText("平铺");
        magicType.setType(EMagicType.LINE, EMagicType.BAR, EMagicType.STACK, EMagicType.TILED);
        feature.setMagicType(magicType);
        Restore restore = new Restore();
        restore.setShow(true);
        restore.setTitle("还原");
        feature.setRestore(restore);
        SaveAsImage saveAsImage = new SaveAsImage();
        saveAsImage.setShow(true);
        saveAsImage.setTitle("保存为图片");
        saveAsImage.setType(EImageType.PNG);
        saveAsImage.setLang("保存");
        feature.setSaveAsImage(saveAsImage);
        System.out.println(JSON.toJSONString(feature));
    }

    public static void main(String[] args)
    {
        // Polar polar = new Polar();
        // // Object[] objs = { "A", "B" };
        // Object[] objs = { new Date(), new Date() };
        // polar.setCenter(objs);
        IntegerRangeCheckKit.checkMin(-99, 0, true);
    }
}
