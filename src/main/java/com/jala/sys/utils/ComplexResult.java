package com.jala.sys.utils;

public class ComplexResult extends GenericResult<ValidationError> {

    @Override
    public String toString() {
        return String.format("Result{isSuccess=%s, errors=%s, timeElapsedInMillis=%s}", isSuccess(), errors,
                timeElapsed);
    }

    private int timeElapsed;

    public int getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(int timeElapsed) {
        this.timeElapsed = timeElapsed;
    }
}

