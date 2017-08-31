import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ankchauh on 8/31/2017.
 */
public class ScriptStorage {
    private static Map<Integer, List<Integer>> scripts;

    protected ScriptStorage() {
        scripts = new HashMap<>();
    }

    public void addScript(VulnerabilityScript vs) {
        scripts.put(vs.getScriptId(), vs.getDependencies());
    }

    public void deleteScript() {

    }

    public void updateScript() {

    }

    public static Map<Integer, List<Integer>> getScripts() {
        return scripts;
    }

    protected void populateScriptsMap() {
        addScript(new VulnerabilityScript(1, Arrays.asList(2, 3, 4)));
        addScript(new VulnerabilityScript(2, Arrays.asList(5, 6)));
        addScript(new VulnerabilityScript(4, Arrays.asList(5)));
        addScript(new VulnerabilityScript(3, Arrays.asList()));
        addScript(new VulnerabilityScript(5, Arrays.asList()));
        addScript(new VulnerabilityScript(6, Arrays.asList()));
        addScript(new VulnerabilityScript(7, Arrays.asList()));
    }
}
