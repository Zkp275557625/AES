/**
 * 作者：zhoukp
 * 时间：2017/12/25 16:15
 * 邮箱：zhoukaiping@szy.cn
 * 作用：测试AES加密解密
 */
public class testAES {
    public static void main(String[] args) throws Exception {
        String content = "zhoukp";
        System.out.println("加密前：" + content);

        String key = "hqucstzkp";
        System.out.println("加密密钥和解密密钥：" + key);

        String encrypt = AES.aesEncrypt(content, key);
        System.out.println("加密后：" + encrypt);

        String decrypt = AES.aesDecrypt(encrypt, key);
        System.out.println("解密后：" + decrypt);
    }
}
