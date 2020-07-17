package com.alibaba.datax.plugin.reader.mysql8reader;

import com.alibaba.datax.common.spi.ErrorCode;

/**
 * @author zsw
 * @date 2020/7/17 14:20
 */
public enum Mysql8ReaderErrorCode implements ErrorCode {
    ;

    private final String code;
    private final String description;

    private Mysql8ReaderErrorCode(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return String.format("Code:[%s], Description:[%s]. ", this.code,
                this.description);
    }
}
