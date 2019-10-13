package example;

import java.io.*;

/**
 * Created by Administrator on 2019/10/13 0013.
 */
public class SerializeTool {
    /**
     * 将对象序列化，并存在在本地文件中
     * @param obj 被序列化的对象
     * @param fileName 存储的本地文件名
     */
    public static void serialize(Object obj,String fileName )throws Exception{
        File file=new File(fileName);//新建一个本地文件，用于存储，序列化的对象字节流
        FileOutputStream output=new FileOutputStream(fileName);//文件输出流
        ObjectOutputStream oos=new ObjectOutputStream (output);//对象输出流
        oos.writeObject(obj);//将对象写入对象输出流中
        oos.flush();//提交对象输入流
        oos.close();
        output.close();
    }
    /**
     * 从本地文件中，通过反序列化获取对象
     * @param fileName 本地存储序列化对象的文件
     * @return 反序列化后的对象
     */
    public static Object deSerialize(String fileName)throws Exception{
        File file=new File(fileName);//根据指定文件名，获取存储字节流的文件
        FileInputStream input =new FileInputStream(file);//定义一个文件输入流，用于从文件中读取字节流
     ObjectInputStream ois=new ObjectInputStream(input);//定义一个对象输入流
     Object obj=ois.readObject();//从对象输入流中读取对象
        ois.close();
        input.close();
        return obj;
    }
    /**
     * 打印指定文件的文件信息，包括文件名，文件大小等
     * @param fileName 本地文件名
     */
    public static void printFileInfo(String fileName){		System.out.println("-----------------------------");
        System.out.println("<FileName>:	" + fileName); //打印文件名
        System.out.println("<FileSize>:	" + "file.length()" + " bytes"); //打印文件大小
        System.out.println("-----------------------------");
        File file =new File(fileName);

    }
}
