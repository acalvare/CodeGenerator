package pojos;

/**
 * Created by alexc on 10/8/2015.
 */
public class Constructor {
    private static final String DEFAULT = "default";
    private static final String FULL = "full";
    Fields[] fields;
    String type;
    String className;

    public Constructor(String type, Fields[] fields, String className) {
        this.type = type;
        this.fields = fields;
        this.className = className;
    }

    public String toJava(){
        StringBuilder builder = new StringBuilder();
        if(type.equalsIgnoreCase(DEFAULT)){
            builder.append("public "+className+"(){\n\t}");
        }
        else if (type.equalsIgnoreCase(FULL)){
            builder.append("("+generateConstructorFieldsList()+") {\n\t");
            for(Fields field : fields) {
                builder.append("this."+field.getFieldName()+" = "+field.getFieldName()+";\n");
            }
            builder.append("}");

        }
        return builder.toString();

    }

    public String generateConstructorFieldsList(){
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for(Fields field : fields){
            builder.append(field.getFieldType()+" "+field.getFieldName());
            count++;
            builder.append(fields.length > count ? ", ":"");
        }
        return builder.toString();
    }
}
