package jacksonexample;

import com.fasterxml.jackson.databind.ObjectMapper;
import jacksonexamples.POJO;
import jacksonexamples.Wrapper;
import jacksonexamples.Wrapper1;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

/**
 * Created by V3790147 on 5/5/2016.
 */
public class JacksonTest {

    @Test
    public void deserializeTest(){

        String json = null;
        try {
            json = convertFileToString("colors.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        POJO pojo = null;
        try {
            pojo = objectMapper.readValue(json, POJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, String> map = pojo.get();
        for (Map.Entry<String, String> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        Assert.assertNotNull(pojo);

    }

    @Test
    public void deserializeArrayTest(){

        String json = null;
        try {
            json = convertFileToString("colorsArray.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();

        Wrapper1 wrapper = null;
        try {
            wrapper = objectMapper.readValue(json, Wrapper1.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assert.assertNotNull(wrapper);

    }




    public String convertFileToString(String fileName) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }
}
