package cn.nh121.echarts.toolbox.feature;

import cn.nh121.echarts.core.JSFunction;

public class DataView
{
    private Boolean    show;
    private String     title;
    private Boolean    readOnly;
    private JSFunction optionToContent;
    private JSFunction contentToOption;
    // only 3 elements need:titleText,closeBtnText,refreshBtnText.
    private String[]   lang;

    public DataView()
    {
        lang = new String[3];
    }

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
    public DataView setShow(Boolean show)
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
    public DataView setTitle(String title)
    {
        this.title = title;
        return this;
    }

    /**
     * @return the readOnly
     */
    public Boolean getReadOnly()
    {
        return readOnly;
    }

    /**
     * @param readOnly
     *            the readOnly to set
     */
    public DataView setReadOnly(Boolean readOnly)
    {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * @return the optionToContent
     */
    public String getOptionToContent()
    {
        return optionToContent.toString();
    }

    /**
     * @param optionToContent
     *            the optionToContent to set
     */
    public DataView setOptionToContent(JSFunction optionToContent)
    {
        this.optionToContent = optionToContent;
        return this;
    }

    /**
     * @return the contentToOption
     */
    public String getContentToOption()
    {
        return contentToOption.toString();
    }

    /**
     * @param contentToOption
     *            the contentToOption to set
     */
    public DataView setContentToOption(JSFunction contentToOption)
    {
        this.contentToOption = contentToOption;
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
    public DataView setLang(String titleText, String closeBtnText, String refreshBtnText)
    {
        this.lang[0] = titleText;
        this.lang[1] = closeBtnText;
        this.lang[2] = refreshBtnText;
        return this;
    }
}
