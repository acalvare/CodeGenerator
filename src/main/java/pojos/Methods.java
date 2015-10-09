package pojos;

/**
 * Created by alexc on 10/8/2015.
 */
public class Methods {

    String methodName;
    String methodType;
    String accessModifier;
    String methodModifier;
    Fields[] parameters;


    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodType() {
        return methodType;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType;
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }

    public String getMethodModifier() {
        return methodModifier;
    }

    public void setMethodModifier(String methodModifier) {
        this.methodModifier = methodModifier;
    }

    public Fields[] getParameters() {
        return parameters;
    }

    public void setParameters(Fields[] parameters) {
        this.parameters = parameters;
    }
}
