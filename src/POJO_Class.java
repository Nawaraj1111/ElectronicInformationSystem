/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sakurae
 */
public class POJO_Class {
    private String id;
    private String category;
    private String name;
    private int price;
    private String recommendation;
    private String range;
    
    public POJO_Class(String id, String category, String name, int price, String recommendation, String range){
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;
        this.recommendation = recommendation;
        this.range = range;
    }
    
    public String getId(){
        return id;
    }
    
    public String getCategory(){
        return category;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPrice(){
        return price;
    }
    
    public String getRecommendation(){
        return recommendation;        
    }
    
    public String getRange(){
        return range;
    }
}
