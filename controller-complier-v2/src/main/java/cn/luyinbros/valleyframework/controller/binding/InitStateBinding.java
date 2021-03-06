package cn.luyinbros.valleyframework.controller.binding;

import com.squareup.javapoet.ClassName;


import javax.annotation.Nullable;


public class InitStateBinding {
    private final String methodName;
    private final ClassName paramClassName;

    public InitStateBinding(String methodName, ClassName paramClassName) {
        this.methodName = methodName;
        this.paramClassName = paramClassName;

    }

    public String getMethodName() {
        return methodName;
    }

    @Nullable
    public ClassName getParamClassName() {
        return paramClassName;
    }


    @Override
    public String toString() {
        return "InitStateBinding{" +
                "methodName='" + methodName + '\'' +
                ", paramClassName=" + paramClassName +
                '}';
    }


}
