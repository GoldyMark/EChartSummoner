package cn.nh121.echarts.toolbox.feature;

public class DataZoom
{
    private Boolean show;
    private Title   title = new Title();

    /**
     * @return the show
     */
    public Boolean getShow()
    {
        return show;
    }

    /**
     * @param show
     *            the show to set
     */
    public DataZoom setShow(Boolean show)
    {
        this.show = show;
        return this;
    }

    public Title getTitle()
    {
        return title;
    }

    // public String getDataZoomText()
    // {
    // return title.getDataZoom();
    // }

    public DataZoom setDataZoomText(String dataZoomText)
    {
        title.setDataZoom(dataZoomText);
        return this;
    }

    // public String getDataZoomResetText()
    // {
    // return title.getDataZoomReset();
    // }

    public DataZoom setDataZoomResetText(String dataZoomResetText)
    {
        title.setDataZoomReset(dataZoomResetText);
        return this;
    }

    private class Title
    {
        private String dataZoom;
        private String dataZoomReset;

        /**
         * @return the dataZoom
         */
        public String getDataZoom()
        {
            return dataZoom;
        }

        /**
         * @param dataZoom
         *            the dataZoom to set
         */
        public Title setDataZoom(String dataZoom)
        {
            this.dataZoom = dataZoom;
            return this;
        }

        /**
         * @return the dataZoomReset
         */
        public String getDataZoomReset()
        {
            return dataZoomReset;
        }

        /**
         * @param dataZoomReset
         *            the dataZoomReset to set
         */
        public Title setDataZoomReset(String dataZoomReset)
        {
            this.dataZoomReset = dataZoomReset;
            return this;
        }

    }
}
