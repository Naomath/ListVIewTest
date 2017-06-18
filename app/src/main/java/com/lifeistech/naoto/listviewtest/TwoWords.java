package com.lifeistech.naoto.listviewtest;

/**
 * Created by naoto on 2017/06/08.
 */

public class TwoWords {

    private String words_japanese;
    //wordの和訳
    private String words_english;
    //wordのスペルの管理

    public TwoWords(){
        //普通のコンストラクタ
        //使うことはない
    }

    public TwoWords(String words_japanese, String words_english){
        this.words_japanese = words_japanese;
        this.words_english = words_english;
    }

    public String getJapanese(){
        return words_japanese;
    }

    public void setJapanese(String japanese){
        if ("".equals(japanese)){
            System.out.println("空白だよ");
        }
        this.words_japanese = japanese;
    }
    public String getEnglish(){
        return  words_english;
    }

}
