package cn.nh121.echarts.series;

import java.util.Map;

/**
 * @author ODMark
 * @creation 2014-7-19
 * @link http://echarts.baidu.com/doc/doc.html#SeriesMap
 */
public class MapSeries extends ASeries
{
    /**
     * 说明：
     * 选中模式，默认关闭，可选single，multiple<br>
     * 
     * 默认值：
     * null
     */
    private ESeriesSelectedMode    selectedMode;

    /**
     * 说明：
     * 地图类型，支持world，china及全国34个省市自治区。省市自治区的mapType直接使用简体中文：
     * 新疆， 西藏， 内蒙古， 青海， 四川， 黑龙江， 甘肃， 云南， 广西， 湖南， 陕西，
     * 广东，吉林， 河北， 湖北， 贵州， 山东， 江西， 河南， 辽宁， 山西， 安徽， 福建，
     * 浙江， 江苏，重庆， 宁夏， 海南， 台湾， 北京， 天津， 上海， 香港， 澳门'
     * 支持子区域模式，通过主地图类型扩展出所包含的子区域地图，格式为'主地图类型|子区域名称'，如
     * 'world|Brazil'，'china|广东'<br>
     * 
     * 默认值：
     * 'china'
     */
    private String                 mapType;

    /**
     * 说明：
     * 非数值显示（如仅用于显示标注标线时），可以通过hoverable:false关闭区域悬浮高亮<br>
     * 
     * 默认值：
     * TRUE
     */
    private Boolean                hoverable;

    /**
     * 说明：
     * 地图位置设置，默认只适应上下左右居中可配x，y，width，height，任意参数为空都将根据其他参数自适应<br>
     * 
     * 默认值：
     * {x:'center',y:'center'}
     */
    private MapLocation            mapLocation;

    /**
     * 说明：
     * 地图数值计算方式，默认为加和，可选为：'sum'（总数） | 'average'（均值）<br>
     * 
     * 默认值：
     * 'sum'
     */
    private EMapValueCalculation   mapValueCalculation;

    /**
     * 说明：
     * 地图数值计算结果小数精度，mapValueCalculation为average时有效，默认为取整，需要小数精度时设置大于0的整数<br>
     * 
     * 默认值：
     * 0
     */
    private Integer                mapValuePrecision;

    /**
     * 说明：
     * 显示图例颜色标识（系列标识的小圆点），存在legend时生效<br>
     * 
     * 默认值：
     * TRUE
     */
    private Boolean                showLegendSymbol;

    /**
     * 说明：
     * 是否开启滚轮缩放和拖拽漫游<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean                roam;

    /**
     * 说明：
     * 滚轮缩放的极限控制，可指定{max:number, min:number}，其中max为放大系数，有效值应大于1，min为缩小系数，有效值应小于1<br>
     * 
     * 默认值：
     * null
     */
    private ScaleLimit             scaleLimit;

    /**
     * 说明：
     * 自定义地区的名称映射，如{'China' : '中国'}<br>
     * 
     * 默认值：
     * null
     */
    private Map<String, String>    nameMap;

    /**
     * 说明：
     * 地区的名称文本位置修正，数值单位为px，正值为左下偏移，负值为右上偏移，如{'China' : [10, -10]}<br>
     * 
     * 默认值：
     * null
     */
    private Map<String, Integer[]> textFixed;

    /**
     * 说明：
     * 通过绝对经纬度指定地区的名称文本位置，如{'Islands':[113.95,
     * 22.26]}，香港离岛区名称显示定位到东经113.95，北纬22.26上<br>
     * 
     * 默认值：
     * null
     */
    private Map<String, Number[]>  geoCoord;

    /**
     * @return the selectedMode
     */
    public ESeriesSelectedMode getSelectedMode()
    {
        return selectedMode;
    }

    /**
     * @param selectedMode
     *            the selectedMode to set
     */
    public MapSeries setSelectedMode(ESeriesSelectedMode selectedMode)
    {
        this.selectedMode = selectedMode;
        return this;
    }

    /**
     * @return the mapType
     */
    public String getMapType()
    {
        return mapType;
    }

    /**
     * @param mapType
     *            the mapType to set
     */
    public MapSeries setMapType(String mapType)
    {
        this.mapType = mapType;
        return this;
    }

    /**
     * @return the hoverable
     */
    public Boolean getHoverable()
    {
        return hoverable;
    }

    /**
     * @param hoverable
     *            the hoverable to set
     */
    public MapSeries setHoverable(Boolean hoverable)
    {
        this.hoverable = hoverable;
        return this;
    }

    /**
     * @return the mapLocation
     */
    public MapLocation getMapLocation()
    {
        return mapLocation;
    }

    /**
     * @param mapLocation
     *            the mapLocation to set
     */
    public MapSeries setMapLocation(MapLocation mapLocation)
    {
        this.mapLocation = mapLocation;
        return this;
    }

    /**
     * @return the mapValueCalculation
     */
    public EMapValueCalculation getMapValueCalculation()
    {
        return mapValueCalculation;
    }

    /**
     * @param mapValueCalculation
     *            the mapValueCalculation to set
     */
    public MapSeries setMapValueCalculation(EMapValueCalculation mapValueCalculation)
    {
        this.mapValueCalculation = mapValueCalculation;
        return this;
    }

    /**
     * @return the mapValuePrecision
     */
    public Integer getMapValuePrecision()
    {
        return mapValuePrecision;
    }

    /**
     * @param mapValuePrecision
     *            the mapValuePrecision to set
     */
    public MapSeries setMapValuePrecision(Integer mapValuePrecision)
    {
        this.mapValuePrecision = mapValuePrecision;
        return this;
    }

    /**
     * @return the showLegendSymbol
     */
    public Boolean getShowLegendSymbol()
    {
        return showLegendSymbol;
    }

    /**
     * @param showLegendSymbol
     *            the showLegendSymbol to set
     */
    public MapSeries setShowLegendSymbol(Boolean showLegendSymbol)
    {
        this.showLegendSymbol = showLegendSymbol;
        return this;
    }

    /**
     * @return the roam
     */
    public Boolean getRoam()
    {
        return roam;
    }

    /**
     * @param roam
     *            the roam to set
     */
    public MapSeries setRoam(Boolean roam)
    {
        this.roam = roam;
        return this;
    }

    /**
     * @return the scaleLimit
     */
    public ScaleLimit getScaleLimit()
    {
        return scaleLimit;
    }

    /**
     * @param scaleLimit
     *            the scaleLimit to set
     */
    public MapSeries setScaleLimit(ScaleLimit scaleLimit)
    {
        this.scaleLimit = scaleLimit;
        return this;
    }

    /**
     * @return the nameMap
     */
    public Map<String, String> getNameMap()
    {
        return nameMap;
    }

    /**
     * @param nameMap
     *            the nameMap to set
     */
    public MapSeries setNameMap(Map<String, String> nameMap)
    {
        this.nameMap = nameMap;
        return this;
    }

    public MapSeries addNameToMap(String name, String label)
    {
        this.nameMap.put(name, label);
        return this;
    }

    /**
     * @return the textFixed
     */
    public Map<String, Integer[]> getTextFixed()
    {
        return textFixed;
    }

    /**
     * @param textFixed
     *            the textFixed to set
     */
    public MapSeries setTextFixed(Map<String, Integer[]> textFixed)
    {
        this.textFixed = textFixed;
        return this;
    }

    public MapSeries addTextFixedToMap(String name, Integer xOffset, Integer yOffset)
    {
        this.textFixed.put(name, new Integer[] { xOffset, yOffset });
        return this;
    }

    /**
     * @return the geoCoord
     */
    public Map<String, Number[]> getGeoCoord()
    {
        return geoCoord;
    }

    /**
     * @param geoCoord
     *            the geoCoord to set
     */
    public MapSeries setGeoCoord(Map<String, Number[]> geoCoord)
    {
        this.geoCoord = geoCoord;
        return this;
    }

    public MapSeries addGeoCoordToMap(String name, Number longitude, Number latitude)
    {
        this.geoCoord.put(name, new Number[] { longitude, latitude });
        return this;
    }

}
