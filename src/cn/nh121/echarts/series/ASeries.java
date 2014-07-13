package cn.nh121.echarts.series;

import java.util.ArrayList;

import cn.nh121.echarts.style.ItemStyle;
import cn.nh121.echarts.tooltip.Tooltip;

/**
 * 
 * @author ODMark
 * @creation 2014-7-11
 * @link http://echarts.baidu.com/doc/doc.html#Series
 */
public abstract class ASeries
{
    /**
     * 类型：通用
     * 说明：
     * 系列名称，如启用legend，该值将被legend.data索引相关<br>
     * 
     * 默认值：
     * null
     */
    private String                 name;

    /**
     * 类型：通用
     * 说明：
     * 提示框样式，仅对本系列有效，如不设则用option.tooltip（详见tooltip）,鼠标悬浮交互时的信息提示<br>
     * 
     * 默认值：
     * null
     */
    private Tooltip                tooltip;

    /**
     * 类型：通用
     * 说明：
     * 图表类型，必要参数！如为空或不支持类型，则该系列数据不被显示。可选为：
     * 'line'（折线图） | 'bar'（柱状图） | 'scatter'（散点图） | 'k'（K线图）
     * 'pie'（饼图） | 'radar'（雷达图） | 'chord'（和弦图） | 'force'（力导向布局图） | 'map'（地图）<br>
     * 
     * 默认值：
     * null
     */
    private ESeriesType            type;

    /**
     * 类型：通用
     * 说明：
     * 图形样式（详见itemStyle）<br>
     * 
     * 默认值：
     * null
     */
    private ItemStyle              itemStyle;

    /**
     * 类型：通用
     * 说明：
     * 数据（详见series.data）<br>
     * 
     * 默认值：
     * []
     */
    private ArrayList<ASeriesData> data;

    /**
     * 类型：通用
     * 说明：
     * 标注（详见series.markPoint）<br>
     * 
     * 默认值：
     * {}
     */
    private MarkPoint              markPoint;

    /**
     * 类型：通用
     * 说明：
     * 标线（详见series.markLine）<br>
     * 
     * 默认值：
     * {}
     */
    private MarkLine               markLine;

}
