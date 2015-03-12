package com.github.pfmiles.kanjava.impl.hooks;

import groovy.lang.Closure;

import java.util.List;
import java.util.Map;

import com.github.pfmiles.kanjava.impl.ErrMsg;
import com.github.pfmiles.kanjava.impl.GlobalContext;
import com.github.pfmiles.kanjava.impl.Hook;
import com.sun.source.tree.EnhancedForLoopTree;

/**
 * for-each循环hook接口
 * 
 * @author <a href="mailto:miles.wy.1@gmail.com">pf_miles</a>
 * 
 */
public interface VisitEnhancedForLoopHook extends Hook {

    void beforeVisitVariable(EnhancedForLoopTree node, List<ErrMsg> errMsgs, GlobalContext globalCtx,
            Closure<List<Map<String, Long>>> resolveRowAndCol, Closure<Void> setError);

    void afterVisitVariableAndBeforeExpression(EnhancedForLoopTree node, List<ErrMsg> errMsgs, GlobalContext globalCtx,
            Closure<List<Map<String, Long>>> resolveRowAndCol, Closure<Void> setError);

    void afterVisitExpressionAndBeforeStatement(EnhancedForLoopTree node, List<ErrMsg> errMsgs, GlobalContext globalCtx,
            Closure<List<Map<String, Long>>> resolveRowAndCol, Closure<Void> setError);

    void afterVisitStatement(EnhancedForLoopTree node, List<ErrMsg> errMsgs, GlobalContext globalCtx,
            Closure<List<Map<String, Long>>> resolveRowAndCol, Closure<Void> setError);
}
