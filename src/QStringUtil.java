/**
 * 作者：zhoukp
 * 时间：2017/12/25 16:13
 * 邮箱：zhoukaiping@szy.cn
 * 作用：判空
 */
public class QStringUtil {
    public static boolean isEmpty(String base64Code){
        if (base64Code != null && !base64Code.equals("")){
            return false;
        }else {
            return true;
        }
    }
}
