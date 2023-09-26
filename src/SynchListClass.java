import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchListClass {
    private List<Object> list = Collections.synchronizedList(new ArrayList<>());
    public void add (String name) {
        list.add(name);
    }
    //при работе с synchronizedList функции все равно должны быть синхронизированы
    public synchronized  String removeFirst () {
        if (!list.isEmpty()) {
            return (String) list.remove(0);
        }
        return null;
    }
}
