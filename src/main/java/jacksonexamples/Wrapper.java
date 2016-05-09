package jacksonexamples;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by V3790147 on 5/5/2016.
 */
public class Wrapper {

    private Map<String, List<POJO>> pojoList = new HashMap<String, List<POJO>>();

    @JsonAnyGetter
    public Map<String, List<POJO>> getPojoList() {
        return pojoList;
    }

    @JsonAnySetter
    public void setPojoList(Map<String, List<POJO>> pojoList) {
        this.pojoList = pojoList;
    }
}
