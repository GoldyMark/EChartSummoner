package cn.nh121.echarts.toolbox.feature;

public class MagicType
{
    private Boolean      show;
    private Title        title = new Title();
    private EMagicType[] type  = new EMagicType[4];

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
    public MagicType setShow(Boolean show)
    {
        this.show = show;
        return this;
    }

    public Title getTitle()
    {
        return title;
    }

    // public String getTitleLineText()
    // {
    // return title.getLine();
    // }

    public MagicType setTitleLineText(String line)
    {
        title.setLine(line);
        return this;
    }

    // public String getTitleBarText()
    // {
    // return title.getBar();
    // }

    public MagicType setTitleBarText(String bar)
    {
        title.setBar(bar);
        return this;
    }

    // public String getTitleStackText()
    // {
    // return title.getStack();
    // }

    public MagicType setTitleStackText(String stack)
    {
        title.setStack(stack);
        return this;
    }

    // public String getTitleTiledText()
    // {
    // return title.getTiled();
    // }

    public MagicType setTitleTiledText(String Tiled)
    {
        title.setTiled(Tiled);
        return this;
    }

    public EMagicType[] getType()
    {
        return type;
    }

    public MagicType setType(EMagicType line, EMagicType bar, EMagicType stack, EMagicType tiled)
    {
        type[0] = line;
        type[1] = bar;
        type[2] = stack;
        type[3] = tiled;
        return this;
    }

    private class Title
    {
        private String line;
        private String bar;
        private String stack;
        private String tiled;

        /**
         * @return the line
         */
        public String getLine()
        {
            return line;
        }

        /**
         * @param line
         *            the line to set
         */
        public Title setLine(String line)
        {
            this.line = line;
            return this;
        }

        /**
         * @return the bar
         */
        public String getBar()
        {
            return bar;
        }

        /**
         * @param bar
         *            the bar to set
         */
        public Title setBar(String bar)
        {
            this.bar = bar;
            return this;
        }

        /**
         * @return the stack
         */
        public String getStack()
        {
            return stack;
        }

        /**
         * @param stack
         *            the stack to set
         */
        public Title setStack(String stack)
        {
            this.stack = stack;
            return this;
        }

        /**
         * @return the tiled
         */
        public String getTiled()
        {
            return tiled;
        }

        /**
         * @param tiled
         *            the tiled to set
         */
        public Title setTiled(String tiled)
        {
            this.tiled = tiled;
            return this;
        }
    }

    public enum EMagicType
    {
        LINE, BAR, STACK, TILED
    }
}
