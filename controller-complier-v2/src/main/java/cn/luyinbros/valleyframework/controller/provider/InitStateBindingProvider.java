package cn.luyinbros.valleyframework.controller.provider;


import java.util.ArrayList;
import java.util.List;


import cn.luyinbros.valleyframework.controller.binding.InitStateBinding;


public class InitStateBindingProvider {
    private List<InitStateBinding> initStateBindings = new ArrayList<>();

    public void addBinding(InitStateBinding binding) {
        initStateBindings.add(binding);
    }

    public boolean isEmpty() {
        return initStateBindings.isEmpty();
    }

    public List<InitStateBinding> getInitStateBindings() {
        return initStateBindings;
    }

    //    public void code(TypeSpec.Builder result, ControllerDelegateInfo info, CodeBlock... otherBlock) {
//        MethodSpec.Builder methodBuilder = MethodSpec.methodBuilder("initState")
//                .addAnnotation(Override.class)
//                .addModifiers(PROTECTED)
//                .addParameter(Constants.INTERFACE_BUILD_CONTEXT, "buildContext")
//                .returns(ClassName.VOID);
//        methodBuilder.addStatement("super.initState(buildContext)");
//
//        for (CodeBlock codeBlock : otherBlock) {
//            methodBuilder.addCode(codeBlock);
//        }
//        methodBuilder.addCode(bundleValueBindingProvider.code(info));
//
//        for (InitStateBinding initStateBinding : initStateBindings) {
//            String methodName = initStateBinding.getMethodName();
//            ClassName argClassName = initStateBinding.getParamClassName();
//            if (argClassName != null) {
//                methodBuilder.addStatement("target.$L($L)", methodName, "buildContext");
//            } else {
//                methodBuilder.addStatement("target.$L()", methodName);
//            }
//        }
//
//        result.addMethod(methodBuilder.build());
//        bundleValueBindingProvider.setIntentMethod(info,result);
//
//    }
}
