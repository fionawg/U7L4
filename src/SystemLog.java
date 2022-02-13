import java.util.*;
public class SystemLog{
    /** Contains all the entries in this system log.
     * Guaranteed not to be null and to contain only non-null entries.
     */
    private ArrayList<LogMessage> messageList;

    public SystemLog(){
        LogMessage one = new LogMessage("CLIENT3:security alert - repeated login failures");
        LogMessage two = new LogMessage("Webserver:disk offline");
        LogMessage three = new LogMessage("SERVER1:file not found");
        LogMessage four = new LogMessage("SERVER2:read error on disk DSK1");
        LogMessage five = new LogMessage("SERVER1:write error on disk DSK2");
        LogMessage six = new LogMessage("Webserver:error on /dev/disk");
        messageList = new ArrayList<LogMessage>(Arrays.asList(one, two, three, four, five, six));
    }

    /** Removes from the system log all entries whose descriptions properly contain keyword,
     * and returns a list (possibly empty) containing the removed entries.
     * Postcondition:
     * - Entries in the returned list properly contain keyword and
     * are in the order in which they appeared in the system log.
     * - The remaining entries in the system log do not properly contain keyword and
     * are in their original order.
     * - The returned list is empty if no messages properly contain keyword.
     */
    public ArrayList<LogMessage> removeMessages(String keyword){
        ArrayList<LogMessage> array = new ArrayList<LogMessage>();
        for (int i = 0; i < messageList.size(); i++){
            LogMessage temp = messageList.get(i);
            if (temp.containsWord(keyword)){
                LogMessage t = messageList.remove(i);
                array.add(t);
                i--;
            }
        }
        return array;
    }

    public ArrayList<LogMessage> getMessageList(){
        return messageList;
    }
}