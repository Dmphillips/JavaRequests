import java.util.*;


public class CaseInsensitiveDict<String, V>  extends LinkedHashMap<String, V> {
    public CaseInsensitiveDict() {
        super();
    }

    @Override
    public V get(Object key) {
        if (key.getClass().getSimpleName().equals("String")) {
            return super.get(((String) key).toLowerCase());
        }
        return super.get(key);
    }
}