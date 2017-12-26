/**
 * 作者：zhoukp
 * 时间：2017/12/25 16:15
 * 邮箱：zhoukaiping@szy.cn
 * 作用：AES加密解密 测试类
 */
public class testAES {
    public static void main(String[] args) throws Exception {
        String content = "应老师真帅";
        System.out.println("加密前：" + content);

        String key = MD5.encode("hqucstzkp");
        System.out.println("秘钥：" + key);

        String encrypt = AesUtil.encrypt(content, key);
        System.out.println("加密后：" + encrypt);

//        String decrypt = AesUtil.decrypt(encrypt, key);
        String decrypt = AesUtil.decrypt("EbJumUw23By8ssBFpeYcVA==", key);
        System.out.println("解密后：" + decrypt);
    }
}
