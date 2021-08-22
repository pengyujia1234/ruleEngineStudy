package com.aviator.study.rulemethod;

import com.googlecode.aviator.runtime.function.AbstractFunction;
import com.googlecode.aviator.runtime.function.FunctionUtils;
import com.googlecode.aviator.runtime.type.AviatorBoolean;
import com.googlecode.aviator.runtime.type.AviatorObject;

import java.util.Map;

/**
 * @Author: 彭雨佳
 * @Date: 2021/8/22 1:38 下午
 */
public class ValidateLengthFunction  extends AbstractFunction {
    @Override
    public String getName() {
        return "validateLength";
    }

    @Override
    public AviatorObject call(Map<String, Object> env,
                              AviatorObject arg1, AviatorObject arg2,AviatorObject arg3) {
        String resource

        String left = FunctionUtils.getStringValue(arg1, env);
        String right = FunctionUtils.getStringValue(arg2, env);
        return AviatorBoolean.valueOf(left.equals(right));
    }
}
