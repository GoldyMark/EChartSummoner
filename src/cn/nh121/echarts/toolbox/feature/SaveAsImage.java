package cn.nh121.echarts.toolbox.feature;

public class SaveAsImage
{
    private Boolean    show;
    private String     title;
    private EImageType type;
    private String[]   lang = new String[1];

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
    public SaveAsImage setShow(Boolean show)
    {
        this.show = show;
        return this;
    }

    /**
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * @param title
     *            the title to set
     */
    public SaveAsImage setTitle(String title)
    {
        this.title = title;
        return this;
    }

    /**
     * @return the type
     */
    public EImageType getType()
    {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public SaveAsImage setType(EImageType type)
    {
        this.type = type;
        return this;
    }

    /**
     * @return the langList
     */
    public String[] getLang()
    {
        return lang;
    }

    /**
     * @param langList
     *            the langList to set
     */
    public SaveAsImage setLang(String lang)
    {
        this.lang[0] = lang;
        return this;
    }

    public enum EImageType
    {
        PNG, JPEG
    }
}
