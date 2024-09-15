/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Saleem Malik
 */
public class Link {
    private int RecipeNum;
    private String desc;
    private int duration;
    private String imgPath;
    
    public Link next;
    
    public Link(int RecipeNum,String desc,int duration,String imgPath){
        this.RecipeNum=RecipeNum;
        this.desc=desc;
        this.duration=duration;
        this.imgPath=imgPath;
        
        next=null;
    }

    public int getRecipeNum() {
        return RecipeNum;
    }

    public String getDesc() {
        return desc;
    }

    public int getDuration() {
        return duration;
    }

    public String getImgPath() {
        return imgPath;
    }
    
}
