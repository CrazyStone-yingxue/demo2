package com.stone.bean;

public class TestOutputCode {
    private String rtnCode;

    @Override
    public String toString() {
        return "TestOutputCode{" +
                "rtnCode='" + rtnCode + '\'' +
                '}';
    }

    public String getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(String rtnCode) {
        this.rtnCode = rtnCode;
    }

    public TestOutputCode(String rtnCode) {
        this.rtnCode = rtnCode;
    }

    public TestOutputCode() {
    }
}
