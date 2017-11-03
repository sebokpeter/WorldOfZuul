
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebok
 */
public class Player
{
    private Room currentRoom;
    private String name;
    private List<Item> heldItems;
    private final int maxWeight = 15;
    private int weight;
    
    public Player(String name)
    {
        this.name = name;
        this.currentRoom = null;
        this.heldItems = new ArrayList();
        this.weight = 0;
    }
    
    public void setCurrentRoom(Room room)
    {
        this.currentRoom = room;
    }
    
    public Room getCurrentRoom()
    {
        return this.currentRoom;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void pickUpItem(Item item)
    {
        if (heldItems.contains(item))
        {
            System.out.println("You already have this item!");
        }

        weight+= item.getWeight();
        heldItems.add(item);
        System.out.println("You now have: " + item.getName());
    }

    public List<Item> getHeldItems()
    {
        return heldItems;
    }
    
    public void removeItem(Item item)
    {
        heldItems.remove(item);
        weight -= item.getWeight();
        System.out.println("You dropped: " + item.getName());
    }
    
    public boolean canTakeItem(Item item)
    {
        return weight + item.getWeight() <= maxWeight;
    }

    void printItems()
    {
        System.out.println("You currently hold these items: ");
        System.out.println("\tName\tDescription\tWeight");
        for (Item heldItem : heldItems)
        {
            System.out.println("\t" + heldItem.getName() + "\t" + heldItem.getDescription() + "     \t" + Integer.toString(heldItem.getWeight()));
        }
        System.out.println("Total weight: " + Integer.toString(weight) + "/" + Integer.toString(maxWeight));
    }
}
