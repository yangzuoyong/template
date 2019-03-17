package com.gupaoedu.vip.template;

public class EggsWithTomato extends DoDishTemplate {
    @Override
    public void preparation() {
        System.out.println("洗并切西红柿，鸡蛋打散。");
    }

    @Override
    public void doing() {
        System.out.println("鸡蛋倒入锅里，然后倒入西红柿一起翻炒。");
    }

    @Override
    public void carriedDishes() {
        System.out.println("将炒好的西红柿炒鸡蛋装入碟子里,准备开吃。");
    }
}
