package com.aiyacloud.exception;

/**
 * 业务异常
 *
 * @author lmiky
 * @date 2015年9月8日 下午6:29:02
 */
public class ServiceException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
    *
    */
    public ServiceException() {

    }

    /**
     * @param message 错误消息
     */
    public ServiceException(String message) {
        super(message);
    }
}
