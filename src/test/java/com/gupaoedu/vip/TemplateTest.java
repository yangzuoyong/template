package com.gupaoedu.vip;

import com.gupaoedu.vip.template.Bouilli;
import com.gupaoedu.vip.template.DoDishTemplate;
import com.gupaoedu.vip.template.EggsWithTomato;
import org.junit.Test;
/***
 *模板设计的实现方式：继承，静态代理
 * @author : GP12713
 * @date : 2019/3/18
 */
public class TemplateTest {
    @Test
    public void doDihTest(){
        DoDishTemplate doDishTemplate = new Bouilli();
        System.out.println("=====来个红烧肉====");
        doDishTemplate.doDish();
        doDishTemplate = new EggsWithTomato();
        System.out.println("=====来个西红柿炒蛋=====");
        doDishTemplate.doDish();
    }
}
