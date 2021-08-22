package com.aviator.study;

import com.aviator.study.rulemethod.EqualsFunction;
import com.aviator.study.rulescript.StringEqualsScript;
import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 彭雨佳
 * @Date: 2021/8/22 11:38 上午
 */
public class HelloWorld {
    public static void main(String[] args) {

        AviatorEvaluator.addFunction(new EqualsFunction());
        Map<String,Object> paramMap= new HashMap<>();
        paramMap.put("left","a");
        paramMap.put("right","a");
        Map<String,Object> innerParamMap = new HashMap<>();
        innerParamMap.put("third","ba");
        paramMap.put("c",innerParamMap);
        Expression script = AviatorEvaluator.getInstance().compile(StringEqualsScript.script);
        System.out.println(script.execute(paramMap));
    }

}
