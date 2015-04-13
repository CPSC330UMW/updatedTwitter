/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterbasetest;

/**
 *
 * @author Tommy
 */
public class Message 
{
    public static final MAX_CHAR = 140;
    private String content;
    private Date date;
    private boolean isPublic;
    public Message(String words)
    {
        content = words;
    }
    public boolean isValid() {
        if (content.length()<=MAX_CHAR)
            return true;
        else
            return false;
    }
}
