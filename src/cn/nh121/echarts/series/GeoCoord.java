/**
 * 
 */
package cn.nh121.echarts.series;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ODMark
 * @creation 2014-7-12
 */
public class GeoCoord
{
    private Map<String, Object> data = new HashMap<String, Object>();

    public GeoCoord putData(String key, Object value)
    {
        // 当value为数组且内容为float类型时
        Boolean valueIsFloatArray = value.getClass().isArray() && "Float[]".equalsIgnoreCase(value.getClass().getSimpleName());
        Boolean valueIsGeoCoordData = value instanceof GeoCoordData;
        if (!valueIsFloatArray && !valueIsGeoCoordData)
            throw new IllegalArgumentException("传入的value：" + value + ",value的合法类型：[float,float]或{x:float,y:float}");
        else
            data.put(key, value);
        return this;
    }

    public Map<String, Object> getMap()
    {
        return data;
    }
}
