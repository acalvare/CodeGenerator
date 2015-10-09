package main;

import converters.JavaConverter;
import org.codehaus.jackson.map.ObjectMapper;
import pojos.Classes;
import pojos.Fields;
import pojos.Methods;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by alexc on 10/8/2015.
 */
public class CodeGenerator {

    public static void main(String[] args){
        ObjectMapper mapper = new ObjectMapper();
        try {
            JavaConverter converter = new JavaConverter();
            Classes classes = mapper.readValue(new File("generatedJson.json"), Classes.class);
            System.out.println(converter.convertClass(classes));
        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }

    }


}
