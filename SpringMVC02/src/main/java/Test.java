import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;

public class Test {

    public static void main(String[] args) {
//        // 测试从Base64编码转换为图片文件
//        String strImg = "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";
//        GenerateImage(strImg, "D:\\wangyc.jpg");
//
//        // 测试从图片文件转换为Base64编码
//        System.out.println(GetImageStr("d:\\wangyc.jpg"));


        String str ="data:image/png;base64,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";

        String baseValue = str.replace("data:image/png;base64,", "");
        System.err.println(baseValue);
    }

    public static String GetImageStr(String imgFilePath) {// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        byte[] data = null;

        // 读取图片字节数组
        try {
            InputStream in = new FileInputStream(imgFilePath);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data);// 返回Base64编码过的字节数组字符串
    }

    public static boolean GenerateImage(String imgStr, String imgFilePath) {// 对字节数组字符串进行Base64解码并生成图片
        if (imgStr == null) // 图像数据为空
            return false;
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            // Base64解码
            byte[] bytes = decoder.decodeBuffer(imgStr);
            for (int i = 0; i < bytes.length; ++i) {
                if (bytes[i] < 0) {// 调整异常数据
                    bytes[i] += 256;
                }
            }
            // 生成jpeg图片
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(bytes);
            out.flush();
            out.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
