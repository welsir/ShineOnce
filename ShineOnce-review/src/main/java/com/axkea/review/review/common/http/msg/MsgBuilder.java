package com.axkea.review.review.common.http.msg;

/**
 * @author welsir
 * @date 2023/10/26 20:41
 **/
public interface MsgBuilder {
    MsgBuilder build(String key,Object value);
    String done();
}
