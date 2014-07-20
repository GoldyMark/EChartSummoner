/**
 * 
 */
package cn.nh121.echarts.series;

import java.util.List;

/**
 * @author ODMark
 * @creation 2014-7-19
 * @link http://echarts.baidu.com/doc/doc.html#SeriesChord
 */
public class ChordSeries extends ASeries
{
    /**
     * 说明：
     * 每个sector之间的间距(用角度表示)<br>
     * 
     * 默认值：
     * 2
     */
    private Integer          padding;

    /**
     * 说明：
     * 数据排序， 可以取none, ascending, descending<br>
     * 
     * 默认值：
     * 'none'
     */
    private ESeriesSort sort;

    /**
     * 说明：
     * 数据排序（弦）， 可以取none, ascending, descending<br>
     * 
     * 默认值：
     * 'none'
     */
    private ESeriesSort sortSub;

    /**
     * 说明：
     * 是否显示刻度<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean          showScale;

    /**
     * 说明：
     * 是否显示刻度文字<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean          showScaleText;

    /**
     * 说明：
     * 显示是否顺时针<br>
     * 
     * 默认值：
     * FALSE
     */
    private Boolean          clockWise;

    /**
     * 说明：
     * 关系数据，用二维数组表示，项 [i][j] 的数值表示 i 到 j 的关系数据<br>
     * 
     * 默认值：
     * [[]]
     */
    private List<Number[]>   matrix;

    /**
     * @return the padding
     */
    public Integer getPadding()
    {
        return padding;
    }

    /**
     * @param padding
     *            the padding to set
     */
    public ChordSeries setPadding(Integer padding)
    {
        this.padding = padding;
        return this;
    }

    /**
     * @return the sort
     */
    public ESeriesSort getSort()
    {
        return sort;
    }

    /**
     * @param sort
     *            the sort to set
     */
    public ChordSeries setSort(ESeriesSort sort)
    {
        this.sort = sort;
        return this;
    }

    /**
     * @return the sortSub
     */
    public ESeriesSort getSortSub()
    {
        return sortSub;
    }

    /**
     * @param sortSub
     *            the sortSub to set
     */
    public ChordSeries setSortSub(ESeriesSort sortSub)
    {
        this.sortSub = sortSub;
        return this;
    }

    /**
     * @return the showScale
     */
    public Boolean getShowScale()
    {
        return showScale;
    }

    /**
     * @param showScale
     *            the showScale to set
     */
    public ChordSeries setShowScale(Boolean showScale)
    {
        this.showScale = showScale;
        return this;
    }

    /**
     * @return the showScaleText
     */
    public Boolean getShowScaleText()
    {
        return showScaleText;
    }

    /**
     * @param showScaleText
     *            the showScaleText to set
     */
    public ChordSeries setShowScaleText(Boolean showScaleText)
    {
        this.showScaleText = showScaleText;
        return this;
    }

    /**
     * @return the clockWise
     */
    public Boolean getClockWise()
    {
        return clockWise;
    }

    /**
     * @param clockWise
     *            the clockWise to set
     */
    public ChordSeries setClockWise(Boolean clockWise)
    {
        this.clockWise = clockWise;
        return this;
    }

    /**
     * @return the matrix
     */
    public List<Number[]> getMatrix()
    {
        return matrix;
    }

    /**
     * @param matrix
     *            the matrix to set
     */
    public ChordSeries setMatrix(List<Number[]> matrix)
    {
        this.matrix = matrix;
        return this;
    }

    public ChordSeries addMatrixToList(Number[] data)
    {
        this.matrix.add(data);
        return this;
    }

    public ChordSeries addMatrixToList(List<Number> data)
    {
        this.matrix.add(data.toArray(new Number[data.size()]));
        return this;
    }

}
