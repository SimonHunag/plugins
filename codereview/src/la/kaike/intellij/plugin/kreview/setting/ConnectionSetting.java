/**
 * 版权所有@: 杭州铭师堂教育科技发展有限公司
 * 注意：本内容仅限于杭州铭师堂教育科技发展有限公司内部使用，禁止外泄以及用于其他的商业目的
 * CopyRight@: 2017 Hangzhou Mistong Educational Technology Co.,Ltd.
 * All Rights Reserved.
 * Note:Just limited to use by Mistong Educational Technology Co.,Ltd. Others are forbidden.
 */
package la.kaike.intellij.plugin.kreview.setting;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.Nullable;

/**
 * ConnectionSetting
 *
 * Created by huapeng.hhp on 2017/12/13.
 */
@State(
        name = "KCodeReview",
        storages = {@Storage(id = "other", file = "$APP_CONFIG$/code_review.xml")}
)
public class ConnectionSetting implements PersistentStateComponent<ConnectionSetting> {

    /**
     * 服务地址
     */
    private String adressServer;

    /**
     * 服务端口
     */
    private String port;

    /**
     * 密钥
     */
    private String sign;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 初始化
     * @return
     */
    public static ConnectionSetting getInstance(){
        return ServiceManager.getService(ConnectionSetting.class);
    }


    @Nullable
    @Override
    public ConnectionSetting getState() {
        return this;
    }

    @Override
    public void loadState(ConnectionSetting state) {
        XmlSerializerUtil.copyBean(state, this);
    }

    public String getAdressServer() {
        return adressServer;
    }

    public void setAdressServer(String adressServer) {
        this.adressServer = adressServer;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
