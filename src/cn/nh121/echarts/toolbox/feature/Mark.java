package cn.nh121.echarts.toolbox.feature;

import cn.nh121.echarts.style.LineStyle;

public class Mark
{
    private Boolean   show;
    private LineStyle lineStyle;
    private Title     title = new Title();

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
    public Mark setShow(Boolean show)
    {
        this.show = show;
        return this;
    }

    /**
     * @return the lineStyle
     */
    public LineStyle getLineStyle()
    {
        return lineStyle;
    }

    /**
     * @param lineStyle
     *            the lineStyle to set
     */
    public Mark setLineStyle(LineStyle lineStyle)
    {
        this.lineStyle = lineStyle;
        return this;
    }

    /**
     * @return the title
     */
    public Title getTitle()
    {
        return title;
    }

    //
    // /**
    // * @param title
    // * the title to set
    // */
    // public Mark setTitle(Title title)
    // {
    // this.title = title;
    // return this;
    // }

    // public String getTitleMark()
    // {
    // return title.getMark();
    // }

    public Mark setTitleMark(String titleMark)
    {
        this.title.setMark(titleMark);
        return this;
    }

    // public String getTitleMarkUndo()
    // {
    // return title.getMarkUndo();
    // }

    public Mark setTitleMarkUndo(String titleMarkUndo)
    {
        this.title.setMarkUndo(titleMarkUndo);
        return this;
    }

    // public String getTitleMarkClear()
    // {
    // return title.getMarkClear();
    // }

    public Mark setTitleMarkClear(String titleMarkClear)
    {
        this.title.setMarkClear(titleMarkClear);
        return this;
    }

    private class Title
    {
        private String mark;
        private String markUndo;
        private String markClear;

        /**
         * @return the mark
         */
        public String getMark()
        {
            return mark;
        }

        /**
         * @param mark
         *            the mark to set
         */
        public Title setMark(String mark)
        {
            this.mark = mark;
            return this;
        }

        /**
         * @return the markUndo
         */
        public String getMarkUndo()
        {
            return markUndo;
        }

        /**
         * @param markUndo
         *            the markUndo to set
         */
        public Title setMarkUndo(String markUndo)
        {
            this.markUndo = markUndo;
            return this;
        }

        /**
         * @return the markClear
         */
        public String getMarkClear()
        {
            return markClear;
        }

        /**
         * @param markClear
         *            the markClear to set
         */
        public Title setMarkClear(String markClear)
        {
            this.markClear = markClear;
            return this;
        }
    }
}
