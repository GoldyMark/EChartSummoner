/**
 * 
 */
package cn.nh121.echarts.series;

import java.util.ArrayList;

import cn.nh121.echarts.pubenum.ESymbol;
import cn.nh121.echarts.style.ItemStyle;

/**
 * 系列中的数据标线内容
 * 
 * @author ODMark
 * @creation 2014-7-13
 * @link http://echarts.baidu.com/doc/doc.html#SeriesMarkLine
 */
public class MarkLine
{
    /**
     * 说明：
     * 标线的平滑度<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean                  smooth;

    /**
     * 说明：
     * 标线起始和结束的symbol介绍类型，如果都一样，可以直接传string，同series中的symbol<br>
     * 
     * 默认值：
     * ['circle', 'arrow']
     */
    private ArrayList<ESymbol>       symbol;

    /**
     * 说明：
     * 标线起始和结束的symbol大小，半宽（半径）参数，如果都一样，可以直接传number或function，同series中的symbolSize<br>
     * 
     * 默认值：
     * [2, 4]
     */
    private ArrayList<Object>        symbolSize;

    /**
     * 说明：
     * 标线起始和结束的symbol旋转控制，同series中的symbolRotate<br>
     * 
     * 默认值：
     * null
     */
    private ArrayList<Integer>       symbolRotate;

    /**
     * 说明：
     * 标线图形炫光特效:
     * show 是否开启，默认关闭
     * period 运动周期，无单位，值越大越慢，默认为15
     * scaleSize 放大倍数，以markLine lineWidth为基准
     * color 炫光颜色，默认跟随markLine itemStyle定义颜色,
     * shadowColor 光影颜色，默认跟随color
     * shadowBlur 光影模糊度，默认根据scaleSize计算 <br>
     * 
     * 默认值：
     * {
     * show: false,
     * period: 15,
     * scaleSize : 2,
     * color : null,
     * shadowColor : null,
     * shadowBlur : null
     * }
     */
    private SeriesEffect             effect;

    /**
     * 说明：
     * 标线图形样式属性，同series中的itemStyle<br>
     * 
     * 默认值：
     * {...}
     */
    private ItemStyle                itemStyle;

    /**
     * 说明：
     * 地图特有，标线图形定位坐标，同series中的geoCoord<br>
     * 
     * 默认值：
     * {}
     */
    private GeoCoord                 geoCoord;

    /**
     * 说明：
     * 标线图形数据，见下<br>
     * 
     * 默认值：
     * []
     */
    private ArrayList<MarkLineData> data;
}
