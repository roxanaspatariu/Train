package jacksonexamples;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V3790147 on 5/5/2016.
 */
public class Wrapper1 {
    List<POJO> colorsArray1 = new ArrayList<POJO>();


    public List<POJO> getColorsArray1() {
        return colorsArray1;
    }

    public void setColorsArray1(List<POJO> colorsArray1) {
        this.colorsArray1 = colorsArray1;
    }
}
