
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
    
    public Player(String name)
    {
        this.name = name;
        currentRoom = null;
        heldItems = new ArrayList();
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
        System.out.println("You dropped: " + item.getName());
    }
}
