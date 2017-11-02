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
    
    public Player(String name)
    {
        this.name = name;
        currentRoom = null;
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
}
