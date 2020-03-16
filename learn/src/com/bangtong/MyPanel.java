package com.bangtong;

import javax.swing.*;
import java.awt.*;

/**定义画布类，继承自系统画布*/
public class MyPanel extends JPanel implements Runnable{

    public Image backgroundPicture;
    public int y;

    /**构造函数*/
    public MyPanel(){
        backgroundPicture = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("picture/back.JPG")); // 获取背景图片
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(backgroundPicture, 0, y, 800, 600, this);
    }

    @Override
    public void run() {
        while (true){
            y++;
            repaint(); // 调用paint方法
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
