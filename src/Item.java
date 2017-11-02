/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebok
 */
public class Item
{
    private String name;
    private String description;
    private int weight;

    public Item(String name, String description, int weight)
    {
        this.name = name;
        this.description = description;
        this.weight = weight;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getLongDescription()
    {
        return description + ", and it weights: " + Integer.toString(weight);
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public int getWeight()
    {
        return this.weight;
    }
}
