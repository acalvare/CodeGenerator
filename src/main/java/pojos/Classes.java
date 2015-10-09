package pojos;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by alexc on 10/8/2015.
 */
public class Classes {

    String className;

    String accessModfier;
    boolean isInterface;
    String classModifier;
    String[] constructors;
    Fields[] fields;
    Methods[] methods;
    
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAccessModfier() {
        return accessModfier;
    }

    public void setAccessModfier(String accessModfier) {
        this.accessModfier = accessModfier;
    }

    public boolean isInterface() {
        return isInterface;
    }

    public void setIsInterface(boolean isInterface) {
        this.isInterface = isInterface;
    }

    public String getClassModifier() {
        return classModifier;
    }

    public void setClassModifier(String classModifier) {
        this.classModifier = classModifier;
    }

    public String[] getConstructors() {
        return constructors;
    }

    public void setConstructors(String[] constructors) {
        this.constructors = constructors;
    }

    public Fields[] getFields() {
        return fields;
    }

    public void setFields(Fields[] fields) {
        this.fields = fields;
    }

    public Methods[] getMethods() {
        return methods;
    }

    public void setMethods(Methods[] methods) {
        this.methods = methods;
    }
}
