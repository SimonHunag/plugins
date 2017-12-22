/**
 * 版权所有@: 杭州铭师堂教育科技发展有限公司
 * 注意：本内容仅限于杭州铭师堂教育科技发展有限公司内部使用，禁止外泄以及用于其他的商业目的
 * CopyRight@: 2017 Hangzhou Mistong Educational Technology Co.,Ltd.
 * All Rights Reserved.
 * Note:Just limited to use by Mistong Educational Technology Co.,Ltd. Others are forbidden.
 */
package la.kaike.intellij.plugin.kreview.http;

import java.io.IOException;

/**
 * HttpConnector
 *
 * Created by huapeng.hhp on 2017/12/21.
 */
public class HttpConnector {

    public static void main(String[] args){
        try {
           String a = HttpUtils.get("http://www.baidu.com:80");

           System.out.println(a);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
