package example;

/**
 * Created by Administrator on 2019/10/13 0013.
 */
public class SerializeTest {
    public static void main (String[]args)throws Exception{
    Teacher t=new Teacher();
    SerializeTool.serialize(t,"teacher");
    SerializeTool.printFileInfo("teacher");
    }
}
