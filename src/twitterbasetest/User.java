/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterbasetest;

/**
 *
 * @author Tommy
 */
public class User 
{
    private String name;
    private String dateOfBirth;
    private String userName;
    private String password;
    
    MessagesList userMessageList = new MessagesList();
    UsersList followers = new UsersList();
    UsersList subscribed = new UsersList();
    
    public User(String realName, String dob, String uName)
    {
        name = realName;
        dateOfBirth = dob;
        userName = uName;
    }
    
    public void postMessage(Message message)
    {
        //post it and add it to the list of messages
        //maybe just add it and then display updated messages
        userMessageList.add(message);
    }

}
