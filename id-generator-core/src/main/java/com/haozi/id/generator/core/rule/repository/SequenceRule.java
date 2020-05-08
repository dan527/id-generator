package com.haozi.id.generator.core.rule.repository;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@Builder
@ToString
public class SequenceRule implements Serializable {
    /**
     * 自增主键ID
     **/
    private Long id;

    /**
     * 唯一KEY
     **/
    private String key;

    /**
     * 自增步长
     **/
    private Integer increment;

    /**
     * 内存存储ID量
     * <p>
     * 容量慎重修改，因影响queue长度
     **/
    private Integer memoryCapacity;

    /**
     * 再次内存加载阈值（%）
     **/
    private Integer reloadThresholdRate;

    /**
     * 前缀
     **/
    private String prefix;

    /**
     * 位数，位数不足补0（小于等于0不补）
     **/
    private Byte digits;

    /**
     * 状态（0：暂停；1：启用）
     **/
    private Byte status;

    /**
     * 复位规则
     **/
    private String resetRule;

    /**
     * 队列重新加载至内存长度阈值
     * 计算得出～
     */
    private int reloadThresholdSize;

    private Date lastUpdateTime;

    public SequenceRule() {
    }

    public SequenceRule(Long id, String key, Integer increment, Integer memoryCapacity, Integer reloadThresholdRate, String prefix, Byte digits, Byte status, String resetRule, Date lastUpdateTime) {
        this.id = id;
        this.key = key;
        this.increment = increment;
        this.memoryCapacity = memoryCapacity;
        this.reloadThresholdRate = reloadThresholdRate;
        this.prefix = prefix;
        this.digits = digits;
        this.status = status;
        this.resetRule = resetRule;
        this.lastUpdateTime = lastUpdateTime;
    }

    public SequenceRule(Long id, String key, Integer increment, Integer memoryCapacity, Integer reloadThresholdRate, String prefix, Byte digits, Byte status, String resetRule, int reloadThresholdSize, Date lastUpdateTime) {
        this.id = id;
        this.key = key;
        this.increment = increment;
        this.memoryCapacity = memoryCapacity;
        this.reloadThresholdRate = reloadThresholdRate;
        this.prefix = prefix;
        this.digits = digits;
        this.status = status;
        this.resetRule = resetRule;
        this.reloadThresholdSize = reloadThresholdSize;
        this.lastUpdateTime = lastUpdateTime;

    }
}