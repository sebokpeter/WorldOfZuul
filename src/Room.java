
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
public class Room 
{
    private String description;
    private HashMap<String, Room> exits;
    private List<Item> items;
    
    public Room getExit(String direction)
    {
        return exits.get(direction);
    }
    
    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<String, Room>();
        items = new ArrayList();
    }
    
    /**
     * Adds an item to the room
     */
    public void addItem(String name, String description, int weight)
    {
        items.add(new Item(name, description, weight));
    }
    
    /**
     * Define an exit from this room
     * @param direction The direction of the exit
     * @param neighbor The room in the given direction
     */
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    /**
    * Return a description of the room’s exits,
    * for example, "Exits: north west".
    * @return A description of the available exits.
    */
    public String getExitString()
    {
        String exitString = "Exits: ";
        for (String exit : exits.keySet())
        {
            exitString += exit + " ";
        }
        
        return exitString;
    }
    
    /**
     * Returns the descriptions of all the items located in this room
     * @return 
     */
    private String getItemDescriptions()
    {
        String itemsDescriptions = "";
        
        for (Item item : items)
        {
            itemsDescriptions += item.getLongDescription() + "\n";
        }
        
        return itemsDescriptions;
    }
    
    /**
     * Return a long description of this room, of the form:
     * You are in the <Room>.
     * Exits: <Exits>
     * @return A description of the room, including exits.
     */
    public String getLongDescription()
    {
        return "You are in the " + description + "\n" + "Items in this room: \n" + getItemDescriptions() + "\n" + getExitString();
    }

}
