package Guias.guia4.ej5_HTML;

public class PlainText extends BasicText{
    private String text;

    public PlainText(String text){
        setText(text);
    }

    public void setText(String text){
        this.text = text;
    }

    @Override
    public String source(){
        return text;
    }
}
