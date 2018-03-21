package com.gongjun.test.匿名内部类详解;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/13
 * Time:15:12
 */
/**
 * 1、匿名内部类因为没有类名，可知匿名内部类不能定义构造器。
 * 2、因为在创建匿名内部类的时候，会立即创建它的实例，可知匿名内部类不能是抽象类，必须实现接口或抽象父类的所有抽象方法。
 * 3、匿名内部类会继承一个父类（有且只有一个）或实现一个接口（有且只有一个），实现父类或接口中所有抽象方法，可以改写父类中的方法，添加自定义方法。
 * 5、当匿名内部类和外部类有同名变量（方法）时，默认访问的是匿名内部类的变量（方法），要访问外部类的变量（方法）则需要加上外部类的类名。
 * 6、从Outer.class反编译代码中可看出自动生成了两个静态方法：access$0()和access$1()，并在测试3和测试4中通过Outer类名直接调用，这样实现了内部类对外部类私有成员变量和方法的访问。可知内部类可以访问外部类私有变量和方法。

 * 疑问:
 * 匿名内部类不能含有static的变量和方法。但是测试发现变量可以被static final修饰，为什么？
 * 主要是因为final类型在编译期间jvm有优化，常量池会维护这些变量。虽然非静态内部类不能脱离外部类这个上下文实例化，但是常量池使得final变量脱离了类实例化这个条件，编译期间便可确定。

 * 总结
 * 1、匿名内部类不能定义任何静态成员、方法。
 * 2、匿名内部类中的方法不能是抽象的；
 * 3、匿名内部类必须实现接口或抽象父类的所有抽象方法。
 * 4、匿名内部类不能定义构造器；
 * 5、匿名内部类访问的外部类成员变量或成员方法必须用static修饰；
 * 6、内部类可以访问外部类私有变量和方法。
 * */
public class Outer {
    private static String s1 = "this is s1 in Outer";
    private static String s2 = "this is s2 in Outer";
    private static String s3 = "this is s3 in Outer";

    private static String method2() {
        return "this is method2 in Outer";
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        // 测试1，Inner为接口
        outer.method1(new Inner() {

            public String say() {
                // 外部类和匿名函数类中有同名变量s1
                return s1;
            }
        });
        // 测试2，Inner1为抽象类
        outer.method1(new Inner1() {

            public String say() {
                // 外部类和匿名函数类中有同名变量s2
                return Outer.s2;
            }
        });
        // 测试3，Inner2为普通类
        outer.method1(new Inner2() {
            public String say() {
                // 访问外部类私有变量s3
                return s3;
            }
        });
        // 测试4，Inner2为普通类
        outer.method1(new Inner2() {
            public String say() {
                // 访问外部类私有方法method1()
                return method2();
            }
        });
    }

    public void method1(Inner inner) {
        System.out.println(inner.say());
    }
}
