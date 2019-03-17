package com.gupaoedu.vip.template;

public class Bouilli extends DoDishTemplate {
    @Override
    public void preparation() {
        System.out.println("切五花肉和土豆。");
    }

    @Override
    public void doing() {
        System.out.println("将切好的猪肉倒入锅中炒一会，然后倒入土豆连炒带炖。");
    }

    @Override
    public void carriedDishes() {
        System.out.println("将炖好的红烧肉盛进碗里,准备开吃");
    }
}
