package com.bangtong;

import javax.swing.*;

public class Windows {
    public static void main(String[] args) {
        //在画板上不可以画内容
        JFrame board = new JFrame(); // 实例化画板
        board.setSize(800, 600); // 设置窗口的大小
        board.setLocationRelativeTo(null); // 设置窗口居中
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 退出窗口时释放内存
        MyPanel myPanel = new MyPanel();
        Thread thread = new Thread(myPanel); // 初始化线程
        thread.start(); // 启动线程
        board.add(myPanel);
        board.setVisible(true); // 设置窗口可见
    }
}
