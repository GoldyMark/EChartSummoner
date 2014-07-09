/**
 * 
 */
package cn.nh121.echarts.title;

import cn.nh121.echarts.core.EColor;
import cn.nh121.echarts.style.TextStyle;
import cn.nh121.echarts.style.TextStyle.EHorizontalAlign;

/**
 * @author ODMark
 * @creation 2014-7-8
 */
public class Title
{
    /**
     * 说明：
     * 主标题文本，'\n'指定换行<br>
     * 
     * 默认值：
     * ''
     */
    private String           text;

    /**
     * 说明：
     * 主标题文本超链接<br>
     * 
     * 默认值：
     * ''
     */
    private String           link;

    /**
     * 说明：
     * 指定窗口打开主标题超链接，支持'self' | 'blank'，不指定等同为'blank'（新窗口）<br>
     * 
     * 默认值：
     * null
     */
    private String           target;

    /**
     * 说明：
     * 副标题文本，'\n'指定换行<br>
     * 
     * 默认值：
     * ''
     */
    private String           subText;

    /**
     * 说明：
     * 副标题文本超链接<br>
     * 
     * 默认值：
     * ''
     */
    private String           subLink;

    /**
     * 说明：
     * 指定窗口打开副标题超链接，支持'self' | 'blank'，不指定等同为'blank'（新窗口）<br>
     * 
     * 默认值：
     * null
     */
    private ETarget          subTarget;

    /**
     * 说明：
     * 水平安放位置，默认为左侧，可选为：'center' | 'left' | 'right' | {number}（x坐标，单位px）<br>
     * 
     * 默认值：
     * 'left'
     */
    private Object           x;

    /**
     * 说明：
     * 垂直安放位置，默认为全图顶端，可选为：'top' | 'bottom' | 'center' | {number}（y坐标，单位px）<br>
     * 
     * 默认值：
     * 'top'
     */
    private Object           y;

    /**
     * 说明：
     * 水平对齐方式，默认根据x设置自动调整，可选为： left' | 'right' | 'center<br>
     * 
     * 默认值：
     * null
     */
    private EHorizontalAlign textAlign;

    /**
     * 说明：
     * 标题背景颜色，默认透明<br>
     * 
     * 默认值：
     * 'rgba(0,0,0,0)'
     */
    private EColor           backgroundColor;

    /**
     * 说明：
     * 标题边框颜色<br>
     * 
     * 默认值：
     * '#ccc'
     */
    private EColor           borderColor;

    /**
     * 说明：
     * 标题边框线宽，单位px，默认为0（无边框）<br>
     * 
     * 默认值：
     * 0
     */
    private Integer          borderWidth;

    /**
     * 说明：
     * 标题内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距，同css，见下图<br>
     * 
     * 默认值：
     * 5
     */
    private String           padding;

    /**
     * 说明：
     * 主副标题纵向间隔，单位px，默认为10<br>
     * 
     * 默认值：
     * 5
     */
    private Integer          itemGap;

    /**
     * 说明：
     * 主标题文本样式（详见textStyle）<br>
     * 
     * 默认值：
     * {
     */
    private TextStyle        textStyle;

    /**
     * 说明：
     * 副标题文本样式（详见textStyle）<br>
     * 
     * 默认值：
     * {color: '#aaa'}
     */
    private TextStyle        subtextStyle;

    /**
     * @return the text
     */
    public String getText()
    {
        return text;
    }

    /**
     * @param text
     *            the text to set
     */
    public Title setText(String text)
    {
        this.text = text;
        return this;
    }

    /**
     * @return the link
     */
    public String getLink()
    {
        return link;
    }

    /**
     * @param link
     *            the link to set
     */
    public Title setLink(String link)
    {
        this.link = link;
        return this;
    }

    /**
     * @return the target
     */
    public String getTarget()
    {
        return target;
    }

    /**
     * @param target
     *            the target to set
     */
    public Title setTarget(String target)
    {
        this.target = target;
        return this;
    }

    /**
     * @return the subText
     */
    public String getSubText()
    {
        return subText;
    }

    /**
     * @param subText
     *            the subText to set
     */
    public Title setSubText(String subText)
    {
        this.subText = subText;
        return this;
    }

    /**
     * @return the subLink
     */
    public String getSubLink()
    {
        return subLink;
    }

    /**
     * @param subLink
     *            the subLink to set
     */
    public Title setSubLink(String subLink)
    {
        this.subLink = subLink;
        return this;
    }

    /**
     * @return the subTarget
     */
    public ETarget getSubTarget()
    {
        return subTarget;
    }

    /**
     * @param subTarget
     *            the subTarget to set
     */
    public Title setSubTarget(ETarget subTarget)
    {
        this.subTarget = subTarget;
        return this;
    }

    /**
     * @return the x
     */
    public Object getX()
    {
        return x;
    }

    /**
     * @param x
     *            the x to set
     */
    public Title setX(Object x)
    {
        if (x instanceof EHorizontalAlign)
            this.x = ((EHorizontalAlign) x).name();
        else if (x instanceof Number)
            this.x = ((Number) x).intValue();
        return this;
    }

    /**
     * @return the y
     */
    public Object getY()
    {
        return y;
    }

    /**
     * @param y
     *            the y to set
     */
    public Title setY(Object y)
    {
        if (y instanceof EHorizontalAlign)
            this.y = ((EHorizontalAlign) y).name();
        else if (y instanceof Number)
            this.y = ((Number) y).intValue();
        return this;
    }

    /**
     * @return the textAlign
     */
    public EHorizontalAlign getTextAlign()
    {
        return textAlign;
    }

    /**
     * @param textAlign
     *            the textAlign to set
     */
    public Title setTextAlign(EHorizontalAlign textAlign)
    {
        this.textAlign = textAlign;
        return this;
    }

    /**
     * @return the backgroundColor
     */
    public EColor getBackgroundColor()
    {
        return backgroundColor;
    }

    /**
     * @param backgroundColor
     *            the backgroundColor to set
     */
    public Title setBackgroundColor(EColor backgroundColor)
    {
        this.backgroundColor = backgroundColor;
        return this;
    }

    /**
     * @return the borderColor
     */
    public EColor getBorderColor()
    {
        return borderColor;
    }

    /**
     * @param borderColor
     *            the borderColor to set
     */
    public Title setBorderColor(EColor borderColor)
    {
        this.borderColor = borderColor;
        return this;
    }

    /**
     * @return the borderWidth
     */
    public Integer getBorderWidth()
    {
        return borderWidth;
    }

    /**
     * @param borderWidth
     *            the borderWidth to set
     */
    public Title setBorderWidth(Integer borderWidth)
    {
        this.borderWidth = borderWidth;
        return this;
    }

    /**
     * @return the padding
     */
    public String getPadding()
    {
        return padding;
    }

    /**
     * @param padding
     *            the padding to set
     */
    public Title setPadding(String padding)
    {
        this.padding = padding;
        return this;
    }

    /**
     * @return the itemGap
     */
    public Integer getItemGap()
    {
        return itemGap;
    }

    /**
     * @param itemGap
     *            the itemGap to set
     */
    public Title setItemGap(Integer itemGap)
    {
        this.itemGap = itemGap;
        return this;
    }

    /**
     * @return the textStyle
     */
    public TextStyle getTextStyle()
    {
        return textStyle;
    }

    /**
     * @param textStyle
     *            the textStyle to set
     */
    public Title setTextStyle(TextStyle textStyle)
    {
        this.textStyle = textStyle;
        return this;
    }

    /**
     * @return the subtextStyle
     */
    public TextStyle getSubtextStyle()
    {
        return subtextStyle;
    }

    /**
     * @param subtextStyle
     *            the subtextStyle to set
     */
    public Title setSubtextStyle(TextStyle subtextStyle)
    {
        this.subtextStyle = subtextStyle;
        return this;
    }

    public enum ETarget
    {
        SELF, BLANK
    }
}
