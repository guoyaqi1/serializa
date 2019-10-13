package example;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/10/13 0013.
 */
public class Person implements Serializable{//Serializable是接口贴上了可序列化标识
    private static final long serialVersionUID=1L;//该字段作为序列化类的一个标识
    private String name="Simple";

}
