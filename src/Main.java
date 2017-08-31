/**
 * Created by ankchauh on 8/31/2017.
 */
public class Main {


    public static void main(String args[]) {
        ScriptStorage ss = new ScriptStorage();
        ss.populateScriptsMap();

        ScriptExecution se = new ScriptExecution();
        System.out.println(se.getScriptsExecutionOrder().toString());
        //getScriptsExecutionOrder();
        //System.out.println("Script execution list = " + el.toString());
    }


}
