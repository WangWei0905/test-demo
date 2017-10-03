package com.jala.sys.utils;

import java.util.List;

public abstract class GenericResult<T> {

    /**
     * 是否验证成功，只要有一个失败就为false
     */
    private boolean isSuccess;

    /**
     * 错误消息列表
     */
    protected List<T> errors;

    @Override
    public String toString() {
        return String.format("Result{isSuccess=%s, errors=%s}", isSuccess(), errors);
    }

    /**
     * 获取错误数量
     *
     * @return 错误数量
     */
    public int getErrorNumber() {
        return CollectionUtil.isEmpty(errors) ? 0 : errors.size();
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public List<T> getErrors() {
        return errors;
    }

    public void setErrors(List<T> errors) {
        this.errors = errors;
    }
}

