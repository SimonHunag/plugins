/**
 * 版权所有@: 杭州铭师堂教育科技发展有限公司
 * 注意：本内容仅限于杭州铭师堂教育科技发展有限公司内部使用，禁止外泄以及用于其他的商业目的
 * CopyRight@: 2017 Hangzhou Mistong Educational Technology Co.,Ltd.
 * All Rights Reserved.
 * Note:Just limited to use by Mistong Educational Technology Co.,Ltd. Others are forbidden.
 */
package la.kaike.intellij.plugin.kreview.form;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * SubmitForm
 *
 * Created by huapeng.hhp on 2017/12/8.
 */
public class SubmitForm {
    private JPanel submitPanel;
    private JPanel contentPane;
    private JTabbedPane previewTabs;
    private JTextArea textPreview;
    private JComboBox projectId;
    private JComboBox branchId;
    private JComboBox assign;
    private JButton submit;

    public SubmitForm() {
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SubmitForm");
        frame.setContentPane(new SubmitForm().submitPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public JPanel getSubmitPanel() {
        return submitPanel;
    }

    public void setSubmitPanel(JPanel submitPanel) {
        this.submitPanel = submitPanel;
    }

    public JPanel getContentPane() {
        return contentPane;
    }

    public void setContentPane(JPanel contentPane) {
        this.contentPane = contentPane;
    }

    public JTabbedPane getPreviewTabs() {
        return previewTabs;
    }

    public void setPreviewTabs(JTabbedPane previewTabs) {
        this.previewTabs = previewTabs;
    }

    public JTextArea getTextPreview() {
        return textPreview;
    }

    public void setTextPreview(JTextArea textPreview) {
        this.textPreview = textPreview;
    }

    public JComboBox getProjectId() {
        return projectId;
    }

    public void setProjectId(JComboBox projectId) {
        this.projectId = projectId;
    }

    public JComboBox getBranchId() {
        return branchId;
    }

    public void setBranchId(JComboBox branchId) {
        this.branchId = branchId;
    }

    public JComboBox getAssign() {
        return assign;
    }

    public void setAssign(JComboBox assign) {
        this.assign = assign;
    }

    public JButton getSubmit() {
        return submit;
    }

    public void setSubmit(JButton submit) {
        this.submit = submit;
    }
}
