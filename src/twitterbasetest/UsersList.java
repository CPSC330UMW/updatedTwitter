/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterbasetest;
import java.util.ArrayList;
/**
 *
 * @author Tommy
 */
public class UsersList 
{
    ArrayList<User> usersList;
    
    public UsersList()
    {
        usersList = new ArrayList<>();
    }
    
    public void addUser(User newUser)
    {
        usersList.add(newUser);
    }
    
    public boolean checkIfTaken(String desiredUsername)
    {
        boolean isTaken = false;
        int numOfUsers =  usersList.size();

        for(int i = 0; i < numOfUsers; i++)
        {
            if(desiredUsername.equalsIgnoreCase(usersList.get(i).userName))
            {
                isTaken = true;
                return isTaken;
            }
        }
        return isTaken;
    }
    
    public boolean checkIfUser(String userName, String password)
    {
        boolean isAValidUser = false;
        int numOfUsers = usersList.size();
        
        for(int i = 0; i < numOfUsers; i++)
        {
            if(userName.equalsIgnoreCase(usersList.get(i).userName))
            {
                if(password.equals(usersList.get(i).userName))
                {
                    isAValidUser = true;
                    return isAValidUser;
                }
            }
        }
        return isAValidUser;
    }
}
