package com.gongjun.test.HashCode与Equals理解;

import org.junit.jupiter.api.Test;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/7
 * Time:17:52
 */

/**
 * hashCode()方法和equal()方法的作用其实一样，在Java里都是用来对比两个对象是否相等一致。
 *
 * 那么equal()既然已经能实现对比的功能了，为什么还要hashCode()呢？
 * 因为重写的equal（）里一般比较的比较全面比较复杂，这样效率就比较低，而利用hashCode()进行对比，
 * 则只要生成一个hash值进行比较就可以了，效率很高，那么hashCode()既然效率这么高为什么还要equal()呢？
 * 因为hashCode()并不是完全可靠，有时候不同的对象他们生成的hashcode也会一样（生成hash值得公式可能存在的问题），
 * 所以hashCode()只能说是大部分时候可靠，并不是绝对可靠，所以我们可以得出：
 *
 *
 * 1.equal()相等的两个对象他们的hashCode()肯定相等，也就是用equal()对比是绝对可靠的。
 * 2.hashCode()相等的两个对象他们的equal()不一定相等，也就是hashCode()不是绝对可靠的。
 *
 *
 * 所有对于需要大量并且快速的对比的话如果都用equal()去做显然效率太低，所以解决方式是，每当需要对比的时候，
 * 首先用hashCode()去对比，如果hashCode()不一样，则表示这两个对象肯定不相等（也就是不必再用equal()去再对比了）,
 * 如果hashCode()相同，此时再对比他们的equal()，如果equal()也相同，则表示这两个对象是真的相同了，
 * 这样既能大大提高了效率也保证了对比的绝对正确性！
 * 这种大量的并且快速的对象对比一般使用的hash容器中，比如hashset,hashmap,hashtable等等，比如hashset里要求对象不能重复，
 * 则他内部必然要对添加进去的每个对象进行对比，而他的对比规则就是像上面说的那样，先hashCode()，如果hashCode()相同，
 * 再用equal()验证，如果hashCode()都不同，则肯定不同，这样对比的效率就很高了。
 * 然而hashCode()和equal()一样都是基本类Object里的方法，而和equal()一样，Object里hashCode()里面只是返回当前对象的地址，
 * 如果是这样的话，那么我们相同的一个类，new两个对象，由于他们在内存里的地址不同，则他们的hashCode（）不同，所以这显然不是我们想要的，所以我们必须重写我们类的hashCode()方法，即一个类，在hashCode()里面返回唯一的一个hash值
 * */
public class test {
    @Test
    public void one(){
        Integer a = new Integer(3);
        int b = 3;
        System.out.println(a.hashCode()==b);
    }
}
