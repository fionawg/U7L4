public class LogMessage{
    private String machineId;
    private String description;

    /** Precondition: message is a valid log message. */
    public LogMessage(String message){
        int colon = message.indexOf(":");
        machineId = message.substring(0, colon);
        description = message.substring(colon + 1);
    }

    /** Returns true if the description in this log message properly contains keyword;
     * false otherwise.
     */
    public boolean containsWord(String key){
        if (description.equals(key)){
            return true;
        }
        if (description.indexOf(key + " ") == 0){
            return true;
        }
        if (description.indexOf(" " + key + " ") != -1){
            return true;
        }
        if (description.length() > key.length() && description.substring(description.length() - key.length() - 1).equals(" " + key)){
            return true;
        }
        return false;
    }

    public String getMachineId(){
        return machineId;
    }

    public String getDescription(){
        return description;
    }

    public String toString(){
        return getMachineId() + ":" + getDescription();
    }
}