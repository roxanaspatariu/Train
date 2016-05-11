package jacksonexamples;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by V3790147 on 5/5/2016.
 */
public class Wrapper {

    private List<Map<String, List<POJO>>> colorsArray1 = new ArrayList<Map<String, List<POJO>>>() ;

    @JsonAnyGetter
    public List<Map<String, List<POJO>>> getColorsArray1() {
        return colorsArray1;
    }

    @JsonAnySetter
    public void setColorsArray1(List<Map<String, List<POJO>>> colorsArray1) {
        this.colorsArray1 = colorsArray1;
    }
}
