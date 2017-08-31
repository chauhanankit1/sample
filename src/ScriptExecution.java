import java.util.*;

/**
 * Created by ankchauh on 8/31/2017.
 */
public class ScriptExecution {
    private static List<Integer> el;
    private static Set<Integer> hs;
    private static Map<Integer, List<Integer>> scripts;

    protected ScriptExecution() {
        el = new ArrayList<>();
        hs = new HashSet<>();
        scripts = ScriptStorage.getScripts();
    }

    public List<Integer> getScriptsExecutionOrder() {
        for (Map.Entry<Integer, List<Integer>> entry : scripts.entrySet()) {
            int key = entry.getKey();
            if (!hs.contains(key))
                addtoExecList(key);
        }
        return el;
    }

    private static void addtoExecList(Integer id) {
        VulnerabilityScript vs = new VulnerabilityScript(id, scripts.get(id));
        hs.add(vs.getScriptId());
        List<Integer> dep = vs.getDependencies();
        for (Integer i : dep) {
            if (!hs.contains(i)) {
                addtoExecList(i);
            }
        }
        el.add(id);
    }
}
