/**
 * 版权所有@: 杭州铭师堂教育科技发展有限公司
 * 注意：本内容仅限于杭州铭师堂教育科技发展有限公司内部使用，禁止外泄以及用于其他的商业目的
 * CopyRight@: 2017 Hangzhou Mistong Educational Technology Co.,Ltd.
 * All Rights Reserved.
 * Note:Just limited to use by Mistong Educational Technology Co.,Ltd. Others are forbidden.
 */
package la.kaike.intellij.plugin.kreview.form;

import la.kaike.intellij.plugin.kreview.setting.ConnectionSetting;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
*  codeview连接配置
*  <p>
*      连接地址，端口，密钥，邮箱
*  </p>
 * ConnectForm
 *
 * Created by huapeng.hhp on 2017/12/8.
 */
public class ConnectionForm {
    private JPanel connectionPanel;
    private JTextField serviceAdress;
    private JTextField port;
    private JTextField sign;
    private JTextField creator;
    private JButton saveBtn;
    private JButton connectBtn;
    private final ConnectionSetting connectionSetting;

    public ConnectionForm() {

        connectionSetting = ConnectionSetting.getInstance();

        saveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveConfig();
            }
        });

        connectBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveConfig();
            }
        });

        //setConfig();
    }

    public void setConfig() {
        serviceAdress.setText(connectionSetting.getAdressServer());
        port.setText(connectionSetting.getPort());
        sign.setText(connectionSetting.getSign());
        creator.setText(connectionSetting.getCreator());

    }

    public void saveConfig() {
        connectionSetting.setAdressServer(serviceAdress.getText());
        connectionSetting.setPort(port.getText());
        connectionSetting.setSign(sign.getText());
        connectionSetting.setCreator(creator.getText());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ConnectionForm");
        frame.setContentPane(new ConnectionForm().connectionPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public JPanel getConnectionPanel() {
        return connectionPanel;
    }

    public void setConnectionPanel(JPanel connectionPanel) {
        this.connectionPanel = connectionPanel;
    }

    public JTextField getServiceAdress() {
        return serviceAdress;
    }

    public void setServiceAdress(JTextField serviceAdress) {
        this.serviceAdress = serviceAdress;
    }

    public JTextField getPort() {
        return port;
    }

    public void setPort(JTextField port) {
        this.port = port;
    }

    public JTextField getSign() {
        return sign;
    }

    public void setSign(JTextField sign) {
        this.sign = sign;
    }

    public JTextField getCreator() {
        return creator;
    }

    public void setCreator(JTextField creator) {
        this.creator = creator;
    }

    public JButton getSaveBtn() {
        return saveBtn;
    }

    public void setSaveBtn(JButton saveBtn) {
        this.saveBtn = saveBtn;
    }
}
