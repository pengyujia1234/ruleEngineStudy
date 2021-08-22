package com.aviator.study.rulemethod;

import com.googlecode.aviator.runtime.function.AbstractFunction;
import com.googlecode.aviator.runtime.function.FunctionUtils;
import com.googlecode.aviator.runtime.type.AviatorBoolean;
import com.googlecode.aviator.runtime.type.AviatorObject;

import java.util.Map;

/**
 * @Author: 彭雨佳
 * @Date: 2021/8/22 11:59 上午
 */
public class EqualsFunction extends AbstractFunction {

    @Override
    public AviatorObject call(Map<String, Object> env,
                              AviatorObject arg1, AviatorObject arg2) {
        String left = FunctionUtils.getStringValue(arg1, env);
        String right = FunctionUtils.getStringValue(arg2, env);
        return AviatorBoolean.valueOf(left.equals(right));
    }

    @Override
    public String getName() {
        return "stringEquals";
    }
}
