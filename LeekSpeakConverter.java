
public class LeekSpeakConverter {
    private String word;
    private String getComby;
    
    public LeekSpeakConverter() {
    	
    }
    
    public String setToTranslate(String stt)
    {
        word = stt;
        
        if("4".equals(word) || "@".equals(word) || "/\\".equals(word) || "/-\\".equals(word) || "?".equals(word) || "^".equals(word) || "Î±".equals(word) || "Î»".equals(word))
        {
            getComby = "A";
        } else if("8".equals(stt) || "|3".equals(stt) || "ÃŸ".equals(stt) || "lÂ³".equals(stt) || "|>".equals(stt) || "13".equals(stt) || "|3".equals(stt)) {
            getComby = "B";
        } else if("(".equals(stt) || "[".equals(stt) || "<".equals(stt) || "Â©".equals(stt) || "Â¢".equals(stt)) {
            getComby = "C";
        } else if("|)".equals(stt) || "|]".equals(stt) || "Ã".equals(stt) || "Ä‘".equals(stt) || "1)".equals(stt)) {
            getComby = "D";
        } else if("3".equals(stt) || "â‚¬".equals(stt) || "&".equals(stt) || "Â£".equals(stt) || "Îµ".equals(stt)) {
            getComby = "E";
        } else if("|=".equals(stt) || "PH".equals(stt) || "|*|-|".equals(stt) || "|\"".equals(stt) || "Æ’".equals(stt) || "|Â²".equals(stt)) {
            getComby = "F";
        } else if("6".equals(stt) || "&".equals(stt) || "9".equals(stt)) {
            getComby = "G";
        } else if("4".equals(stt) || "|-|".equals(stt) || "#".equals(stt) || "}{".equals(stt) || "]-[".equals(stt) || "/-/".equals(stt) || ")-(".equals(stt)) {
            getComby = "H";
        } else if("!".equals(stt) || "1".equals(stt) || "|".equals(stt) || "][".equals(stt) || "á»‰".equals(stt)) {
            getComby = "I";
        } else if("_|".equals(stt) || "Â¿".equals(stt)) {
            getComby = "J";
        } else if("|<".equals(stt) || "|{".equals(stt) || "|(".equals(stt) || "X".equals(stt)) {
            getComby = "K";
        } else if("1".equals(stt) || "|_".equals(stt) || "Â£".equals(stt) || "|".equals(stt) || "][_".equals(stt)) {
            getComby = "L";
        } else if("/\\/\\".equals(stt) || "/v\\".equals(stt) || "|V|".equals(stt) || "]V[".equals(stt) || "lVl".equals(stt) || "AA".equals(stt) || "[]V[]".equals(stt) || "|11".equals(stt) || "/|\\".equals(stt) || "^^".equals(stt) || "(V),|Y|".equals(stt)) {
            getComby = "M";
        } else if("|\\|".equals(stt) || "/\\/".equals(stt) || "/V".equals(stt) || "/\\V".equals(stt) || "1".equals(stt) || "2".equals(stt) || "?".equals(stt) || "(\\)".equals(stt) || "11".equals(stt)) {
            getComby = "N";
        } else if("0".equals(stt) || "9".equals(stt) || "()".equals(stt) || "[]".equals(stt) || "*".equals(stt) || "Â°".equals(stt) || "<>".equals(stt) || "Ã¸".equals(stt) || "{[]}".equals(stt)) {
            getComby = "O";
        } else if("lÂ°".equals(stt) || "p".equals(stt) || "|>".equals(stt) || "|*".equals(stt) || "[]D".equals(stt) || "][D".equals(stt) || "|Â²".equals(stt) || "|?".equals(stt) || "|D".equals(stt)) {
            getComby = "P";
        } else if("0_".equals(stt) || "0".equals(stt)) {
            getComby = "Q";
        } else if("2".equals(stt) || "|2".equals(stt) || "1Â²".equals(stt) || "Â®".equals(stt) || "?".equals(stt) || "Ñ".equals(stt) || "12".equals(stt) || ".-".equals(stt)) {
            getComby = "R";
        } else if("5".equals(stt) || "$".equals(stt) || "Â§".equals(stt) || "?".equals(stt) || "Å".equals(stt) || "ÅŸ".equals(stt)) {
            getComby = "S";
        } else if("7".equals(stt) || "+".equals(stt) || "â€ ".equals(stt) || "']['".equals(stt) || "|".equals(stt)) {
            getComby = "T";
        } else if("|_|".equals(stt) || "Âµ".equals(stt) || "[_]".equals(stt) || "v".equals(stt)) {
            getComby = "U";
        } else if("\\/".equals(stt) || "|/".equals(stt) || "\\|".equals(stt) || "\\'".equals(stt)) {
            getComby = "V";
        } else if("\\/\\/".equals(stt) || "VV".equals(stt) || "\\A/".equals(stt) || "\\\\'".equals(stt) || "uu".equals(stt) || "\\^/".equals(stt) || "\\|/".equals(stt)) {
            getComby = "W";
        } else if("><".equals(stt) || ")(".equals(stt) || "}{".equals(stt) || "%".equals(stt) || "?".equals(stt) || "x".equals(stt) || "][".equals(stt)) {
            getComby = "X";
        } else if("`/".equals(stt) || "Â°/".equals(stt) || "9".equals(stt) || "Â¥".equals(stt)) {
            getComby = "Y";
        } else if("z".equals(stt) || "2".equals(stt) || "\"/_".equals(stt)) {
            getComby = "Z";
        } else if("43".equals(stt) || "Â°AÂ°".equals(stt) || "Â°4Â°".equals(stt)) {
            getComby = "Ã„";
        } else if("03".equals(stt) || "Â°OÂ°".equals(stt)) {
            getComby = "Ã–";
        } else if("|_|3".equals(stt) || "Â°UÂ°".equals(stt)) {
            getComby = "Ãœ";
        } else {
            getComby = stt;
        }
        
        return getComby;
    }
    
    public String getBack() {
        return getComby;
    }
}