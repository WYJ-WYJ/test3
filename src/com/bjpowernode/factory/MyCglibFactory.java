/*package com.bjpowernode.factory;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

import com.bjpowernode.factory.UsbKingFactory;
public class MyCglibFactory implements MethodInterceptor{

    private UsbKingFactory target;

    public MyCglibFactory() {
        target=new UsbKingFactory();
    }

    public UsbKingFactory myCglibCreator(){
        //创建增强器对象
        Enhancer enhancer=new Enhancer();
        //指定目标类，即父类
        enhancer.setSupperclass(UsbKingFactory.class);
        //设置回调接口对象
        enhancer.setCallback(this);

        return (UsbKingFactory) enhancer.create();
    }

    @Override
    public Object intercept(Objcet args0,method args1,Object[]args2,MethodProxy args3)
            throws  Throwable{
        target=new UsbKingFactory();

        Object res=null;
        //调用目标方法
        if (res!=null){
            Float price=(Float)res;
            price=price+25;
            res=price;
        }

        return res;

    }




}*/
