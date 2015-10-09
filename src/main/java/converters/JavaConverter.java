package converters;

import pojos.Classes;
import pojos.Constructor;
import pojos.Fields;

/**
 * Created by alexc on 10/8/2015.
 */
public class JavaConverter {

    public String convertClass(Classes classes){

            StringBuilder builder = new StringBuilder();
            builder.append(classes.getAccessModfier()+(classes.isInterface() ? " interface ": " class ")+classes.getClassName()+" {\n\t");
            for(String constructor : classes.getConstructors()) {
                builder.append(new Constructor(constructor,classes.getFields(),classes.getClassName()).toJava()+"\n\n\t");
            }
            builder.append(convertField(classes.getFields()));
            builder.append(convertFieldGettersAndSetters(classes.getFields()));
            builder.append("\n}");
            return builder.toString();
        }

    public String convertField(Fields[] fields){
        StringBuilder builder = new StringBuilder();
        for(Fields field : fields) {
            builder.append(field.getAccessModifier() + " " + field.getFieldType() + " " + field.getFieldName()+";\n");
        }
        return builder.toString();
    }

    public String convertFieldGettersAndSetters(Fields[] fields){
        StringBuilder builder = new StringBuilder();
        for(Fields field : fields) {
            builder.append(field.getAccessModifier() + " " + field.getFieldType() + " get" + getMethodName(field.getFieldName())+"(){\n");
            builder.append("\t return "+field.getFieldName());
            builder.append("\n}\n\n");
            builder.append(field.getAccessModifier() + " " + field.getFieldType() + " set" + getMethodName(field.getFieldName())+"("+field.getFieldType()+" "+field.getFieldName()+"){\n");
            builder.append("\t return this."+field.getFieldName()+" = "+field.getFieldName());
            builder.append("\n}\n\n");
        }
        return builder.toString();

    }

    //returns a method name that is correct case
   public String getMethodName(String fieldName){
       if(fieldName.length() > 1) {
           return fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
       }
       else{
           return fieldName;
       }
   }

}
