import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description:
 * @Author: Axin
 * @Date: Create in 21:04 2019/8/23
 */
public class AzkabanTest {


    public void run() throws IOException {
        // 根据需求编写具体代码
        FileOutputStream fos = new FileOutputStream("/opt/module/datas/output.txt");
        fos.write("this is a java progress".getBytes());
        fos.close();
    }

    public static void main(String[] args) throws IOException {
        AzkabanTest azkaban = new AzkabanTest();
        azkaban.run();
    }
}
