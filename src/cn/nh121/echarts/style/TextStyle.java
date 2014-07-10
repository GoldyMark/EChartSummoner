package cn.nh121.echarts.style;

import cn.nh121.echarts.core.EColor;
import cn.nh121.echarts.pubenum.EFontStyle;
import cn.nh121.echarts.pubenum.EFontWeight;
import cn.nh121.echarts.pubenum.EHorizontalAlign;
import cn.nh121.echarts.pubenum.EVerticalAlign;

public class TextStyle
{
    /**
     * 说明：
     * 颜色<br>
     * 
     * 默认值：
     * 各异
     */
    private EColor           color;

    /**
     * 说明：
     * 修饰，仅对tooltip.textStyle生效<br>
     * 
     * 默认值：
     * 'none'
     */
    private String           decoration;

    /**
     * 说明：
     * 水平对齐方式，可选为：'left' | 'right' | 'center'<br>
     * 
     * 默认值：
     * 各异
     */
    private EHorizontalAlign align;

    /**
     * 说明：
     * 垂直对齐方式，可选为：'top' | 'bottom' | 'middle'<br>
     * 
     * 默认值：
     * 各异
     */
    private EVerticalAlign   baseline;

    /**
     * 说明：
     * 字体系列<br>
     * 
     * 默认值：
     * 'Arial, Verdana, sans-serif'
     */
    private String           fontFamily;

    /**
     * 说明：
     * 字号 ，单位px<br>
     * 
     * 默认值：
     * 12
     */
    private Integer          fontSize;

    /**
     * 说明：
     * 样式，可选为：'normal' | 'italic' | 'oblique'<br>
     * 
     * 默认值：
     * 'normal'
     */
    private EFontStyle       fontStyle;

    /**
     * 说明：
     * 粗细，可选为：'normal' | 'bold' | 'bolder' | 'lighter' | 100 | 200 |... | 900<br>
     * 
     * 默认值：
     * 'normal'
     */
    private EFontWeight      fontWeight;

    /**
     * @return the color
     */
    public EColor getColor()
    {
        return color;
    }

    /**
     * @param color
     *            the color to set
     */
    public TextStyle setColor(EColor color)
    {
        this.color = color;
        return this;
    }

    /**
     * @return the decoration
     */
    public String getDecoration()
    {
        return decoration;
    }

    /**
     * @param decoration
     *            the decoration to set
     */
    public TextStyle setDecoration(String decoration)
    {
        this.decoration = decoration;
        return this;
    }

    /**
     * @return the align
     */
    public EHorizontalAlign getAlign()
    {
        return align;
    }

    /**
     * @param align
     *            the align to set
     */
    public TextStyle setAlign(EHorizontalAlign align)
    {
        this.align = align;
        return this;
    }

    /**
     * @return the baseline
     */
    public EVerticalAlign getBaseline()
    {
        return baseline;
    }

    /**
     * @param baseline
     *            the baseline to set
     */
    public TextStyle setBaseline(EVerticalAlign baseline)
    {
        this.baseline = baseline;
        return this;
    }

    /**
     * @return the fontFamily
     */
    public String getFontFamily()
    {
        return fontFamily;
    }

    /**
     * @param fontFamily
     *            the fontFamily to set
     */
    public TextStyle setFontFamily(String fontFamily)
    {
        this.fontFamily = fontFamily;
        return this;
    }

    /**
     * @return the fontSize
     */
    public Integer getFontSize()
    {
        return fontSize;
    }

    /**
     * @param fontSize
     *            the fontSize to set
     */
    public TextStyle setFontSize(Integer fontSize)
    {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * @return the fontStyle
     */
    public EFontStyle getFontStyle()
    {
        return fontStyle;
    }

    /**
     * @param fontStyle
     *            the fontStyle to set
     */
    public TextStyle setFontStyle(EFontStyle fontStyle)
    {
        this.fontStyle = fontStyle;
        return this;
    }

    /**
     * @return the fontWeight
     */
    public EFontWeight getFontWeight()
    {
        return fontWeight;
    }

    /**
     * @param fontWeight
     *            the fontWeight to set
     */
    public TextStyle setFontWeight(EFontWeight fontWeight)
    {
        this.fontWeight = fontWeight;
        return this;
    }

    // public enum EHorizontalAlign
    // {
    // LEFT, RIGHT, CENTER
    // }

    // public enum EVerticalAlign
    // {
    // TOP, BOTTOM, MIDDLE
    // }
    //
    // public enum EFontStyle
    // {
    // NORMAL, ITALIC, OBLIQUE
    // }
    //
    // // TODO problem
    // public enum EFontWeight
    // {
    // NORMAL, BOLD, BOLDER, LIGHTER, _100, _200, _300, _400, _500, _600, _700,
    // _800, _900;
    // }
}
