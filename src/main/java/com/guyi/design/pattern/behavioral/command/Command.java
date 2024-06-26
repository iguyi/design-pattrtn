package com.guyi.design.pattern.behavioral.command;

/**
 * 命令接口
 *
 * @author 孤诣
 */
public interface Command {
    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();
}
