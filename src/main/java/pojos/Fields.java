package pojos;

/**
 * Created by alexc on 10/8/2015.
 */
public class Fields {

    private String fieldName;
    private String fieldType;
    private String accessModifier;
    private String fieldModifier;
    private boolean getter;
    private boolean setter;


    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }

    public String getFieldModifier() {
        return fieldModifier;
    }

    public void setFieldModifier(String fieldModifier) {
        this.fieldModifier = fieldModifier;
    }

    public boolean isGetter() {
        return getter;
    }

    public void setGetter(boolean getter) {
        this.getter = getter;
    }

    public boolean isSetter() {
        return setter;
    }

    public void setSetter(boolean setter) {
        this.setter = setter;
    }
}
