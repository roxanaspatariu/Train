package jacksonexamples;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by V3790147 on 5/5/2016.
 */

public class POJO {

    private Map<String,String> map = new HashMap<String,String>();

    @JsonAnyGetter
    public Map<String, String> get() {
        return map;
    }

    @JsonAnySetter
    public void set(String name, String value) {
        map.put(name, value);
    }

}
