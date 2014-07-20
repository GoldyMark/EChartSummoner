/**
 * 
 */
package cn.nh121.echarts.series;

import java.util.ArrayList;

import cn.nh121.echarts.pubenum.ESymbol;

/**
 * @author ODMark
 * @creation 2014-7-19
 * @link http://echarts.baidu.com/doc/doc.html#SeriesForce
 */
public class ForceSeries extends ASeries
{
    /**
     * 说明：
     * 力导向图中节点的分类, 每一项有name和itemStyle两个属性，itemStyle配置详见itemStyle<br>
     * 
     * 默认值：
     * []
     */
    private ArrayList<ForceCategory> categories;

    /**
     * 说明：
     * 力导向图的顶点数据, 每一项都有 name, value, category三个属性，分别表示节点的名称， 节点的值和节点的分类<br>
     * 
     * 默认值：
     * []
     */
    private ArrayList<ForceNode>     nodes;

    /**
     * 说明：
     * 力导向图的边数据, 每一项都有 source, target, weight三个属性,
     * source和target是顶点的索引值，边的权重(weight)越大则两个顶点之间的联系越大(最后稳定之后的距离越小)<br>
     * 
     * 默认值：
     * []
     */
    private ArrayList<ForceLink>     links;

    /**
     * 说明：
     * 力导向图的边两端图形样式，可指定为'arrow'<br>
     * 
     * 默认值：
     * 'none'
     */
    private ESymbol                  linkSymbol;

    /**
     * 说明：
     * 力导向图的边两端图形大小<br>
     * 
     * 默认值：
     * [10, 15]
     */
    private ArrayList<Integer[]>     linkSymbolSize;

    /**
     * 说明：
     * 顶点数据映射成圆半径后的最小半径<br>
     * 
     * 默认值：
     * 10
     */
    private Integer                  minRadius;

    /**
     * 说明：
     * 顶点数据映射成圆半径后的最大半径<br>
     * 
     * 默认值：
     * 20
     */
    private Integer                  maxRadius;

    /**
     * 说明：
     * 顶点的密度，影响布局时顶点运动的速度，值越大速度越慢<br>
     * 
     * 默认值：
     * 1
     */
    private Integer                  density;

    /**
     * 说明：
     * 顶点之间的引力系数，影响到布局稳定之后的大小，值越大则稳定之后顶点之间的距离越小<br>
     * 
     * 默认值：
     * 1
     */
    private Integer                  attractiveness;

    /**
     * @return the categories
     */
    public ArrayList<ForceCategory> getCategories()
    {
        return categories;
    }

    /**
     * @param categories
     *            the categories to set
     */
    public ForceSeries setCategories(ArrayList<ForceCategory> categories)
    {
        this.categories = categories;
        return this;
    }

    /**
     * @return the nodes
     */
    public ArrayList<ForceNode> getNodes()
    {
        return nodes;
    }

    /**
     * @param nodes
     *            the nodes to set
     */
    public ForceSeries setNodes(ArrayList<ForceNode> nodes)
    {
        this.nodes = nodes;
        return this;
    }

    /**
     * @return the links
     */
    public ArrayList<ForceLink> getLinks()
    {
        return links;
    }

    /**
     * @param links
     *            the links to set
     */
    public ForceSeries setLinks(ArrayList<ForceLink> links)
    {
        this.links = links;
        return this;
    }

    /**
     * @return the linkSymbol
     */
    public ESymbol getLinkSymbol()
    {
        return linkSymbol;
    }

    /**
     * @param linkSymbol
     *            the linkSymbol to set
     */
    public ForceSeries setLinkSymbol(ESymbol linkSymbol)
    {
        this.linkSymbol = linkSymbol;
        return this;
    }

    /**
     * @return the linkSymbolSize
     */
    public ArrayList<Integer[]> getLinkSymbolSize()
    {
        return linkSymbolSize;
    }

    /**
     * @param linkSymbolSize
     *            the linkSymbolSize to set
     */
    public ForceSeries setLinkSymbolSize(ArrayList<Integer[]> linkSymbolSize)
    {
        this.linkSymbolSize = linkSymbolSize;
        return this;
    }

    public ForceSeries addLinkSymbolSizeToArray(Integer sideA, Integer sideB)
    {
        this.linkSymbolSize.add(new Integer[] { sideA, sideB });
        return this;
    }

    /**
     * @return the minRadius
     */
    public Integer getMinRadius()
    {
        return minRadius;
    }

    /**
     * @param minRadius
     *            the minRadius to set
     */
    public ForceSeries setMinRadius(Integer minRadius)
    {
        this.minRadius = minRadius;
        return this;
    }

    /**
     * @return the maxRadius
     */
    public Integer getMaxRadius()
    {
        return maxRadius;
    }

    /**
     * @param maxRadius
     *            the maxRadius to set
     */
    public ForceSeries setMaxRadius(Integer maxRadius)
    {
        this.maxRadius = maxRadius;
        return this;
    }

    /**
     * @return the density
     */
    public Integer getDensity()
    {
        return density;
    }

    /**
     * @param density
     *            the density to set
     */
    public ForceSeries setDensity(Integer density)
    {
        this.density = density;
        return this;
    }

    /**
     * @return the attractiveness
     */
    public Integer getAttractiveness()
    {
        return attractiveness;
    }

    /**
     * @param attractiveness
     *            the attractiveness to set
     */
    public ForceSeries setAttractiveness(Integer attractiveness)
    {
        this.attractiveness = attractiveness;
        return this;
    }

}
