package com.gupaoedu.vip.template;

/**
 * 做菜模板
 * @author : yangzuoyong
 * @date : 2019/3/17
 */
public abstract class DoDishTemplate {
    /**
     * 具体的整个过程
     */
    public void doDish(){
        this.preparation();
        this.doing();
        this.carriedDishes();
    }
    /**
     * 备料
     */
    public abstract void preparation();
    /**
     * 做菜
     */
    public abstract void doing();
    /**
     * 上菜
     */
    public abstract void carriedDishes ();
}
