package com.gongjun.test.删除重复的数据;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2017/9/6
 * Time:15:50
 */
public class test {

    /**
     * 表字段: id、name、age、sex
     * DELETE FROM people WHERE id NOT IN (SELECT b.* FROM (
     * ( SELECT MAX(id) AS max_id FROM people GROUP BY name,age,sex) b) );
     * */
}
