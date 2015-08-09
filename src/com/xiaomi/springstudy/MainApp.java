package com.xiaomi.springstudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 棣栧厛浼氳繍琛宮ain()璇彞锛孲pring妗嗘灦浣跨敤ClassPathXmlApplicationContext()棣栧厛鍒涘缓涓�涓鍣ㄣ��
杩欎釜瀹瑰櫒浠嶣eans.xml涓鍙栭厤缃俊鎭紝骞舵牴鎹厤缃俊鎭潵鍒涘缓bean(涔熷氨鏄璞�)锛屾瘡涓猙ean鏈夊敮涓�鐨刬d銆�
鐒跺悗閫氳繃context.getBean()鎵惧埌杩欎釜id鐨刡ean锛岃幏鍙栧璞＄殑寮曠敤銆�
閫氳繃瀵硅薄鐨勫紩鐢ㄨ皟鐢╬rintMessage()鏂规硶鏉ユ墦鍗颁俊鎭��
 * 
 * **/

public class MainApp {
    public static void main(String[] args) {
 
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
 
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
 
        obj.printMessage();
        
        ((AbstractApplicationContext) context).close();
    }
}
