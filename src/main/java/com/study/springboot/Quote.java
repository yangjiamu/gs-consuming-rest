package com.study.springboot;

import lombok.Data;
import lombok.ToString;

/**
 * Created by wenjie yang on 2018/4/8.
 */
@Data
@ToString
public class Quote {
    private String type;
    private Value value;
}
