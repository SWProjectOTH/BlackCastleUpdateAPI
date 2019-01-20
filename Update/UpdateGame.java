package de.swr.oth.Update;

import java.io.Serializable;

public class UpdateGame implements Serializable {

    private String text;

    public UpdateGame(){
    }

    public UpdateGame(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
