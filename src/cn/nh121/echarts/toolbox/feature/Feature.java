/**
 * 
 */
package cn.nh121.echarts.toolbox.feature;

/**
 * @author ODMark
 * @creation 2014-7-8
 */
public class Feature
{
    private Mark        mark;
    private DataZoom    dataZoom;
    private DataView    dataView;
    private MagicType   magicType;
    private Restore     restore;
    private SaveAsImage saveAsImage;

    /**
     * @return the mark
     */
    public Mark getMark()
    {
        return mark;
    }

    /**
     * @param mark
     *            the mark to set
     */
    public Feature setMark(Mark mark)
    {
        this.mark = mark;
        return this;
    }

    /**
     * @return the dataZoom
     */
    public DataZoom getDataZoom()
    {
        return dataZoom;
    }

    /**
     * @param dataZoom
     *            the dataZoom to set
     */
    public Feature setDataZoom(DataZoom dataZoom)
    {
        this.dataZoom = dataZoom;
        return this;
    }

    /**
     * @return the dataView
     */
    public DataView getDataView()
    {
        return dataView;
    }

    /**
     * @param dataView
     *            the dataView to set
     */
    public Feature setDataView(DataView dataView)
    {
        this.dataView = dataView;
        return this;
    }

    /**
     * @return the magicType
     */
    public MagicType getMagicType()
    {
        return magicType;
    }

    /**
     * @param magicType
     *            the magicType to set
     */
    public Feature setMagicType(MagicType magicType)
    {
        this.magicType = magicType;
        return this;
    }

    /**
     * @return the restore
     */
    public Restore getRestore()
    {
        return restore;
    }

    /**
     * @param restore
     *            the restore to set
     */
    public Feature setRestore(Restore restore)
    {
        this.restore = restore;
        return this;
    }

    /**
     * @return the saveAsImage
     */
    public SaveAsImage getSaveAsImage()
    {
        return saveAsImage;
    }

    /**
     * @param saveAsImage
     *            the saveAsImage to set
     */
    public Feature setSaveAsImage(SaveAsImage saveAsImage)
    {
        this.saveAsImage = saveAsImage;
        return this;
    }

}
