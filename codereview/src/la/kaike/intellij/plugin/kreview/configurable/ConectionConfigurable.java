/**
 * 版权所有@: 杭州铭师堂教育科技发展有限公司
 * 注意：本内容仅限于杭州铭师堂教育科技发展有限公司内部使用，禁止外泄以及用于其他的商业目的
 * CopyRight@: 2017 Hangzhou Mistong Educational Technology Co.,Ltd.
 * All Rights Reserved.
 * Note:Just limited to use by Mistong Educational Technology Co.,Ltd. Others are forbidden.
 */
package la.kaike.intellij.plugin.kreview.configurable;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SearchableConfigurable;
import la.kaike.intellij.plugin.kreview.form.ConnectionForm;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * ConectionConfigurable
 *
 * Created by huapeng.hhp on 2017/12/11.
 */
public class ConectionConfigurable implements SearchableConfigurable {
	/**
	 * 连接配置面板
	 */
	private ConnectionForm connectionForm;

	@NotNull
	@Override
	public String getId() {
		return "KCode Review";
	}

	@Nls
	@Override
	public String getDisplayName() {
		return this.getId();
	}

	@Nullable
	@Override
	public JComponent createComponent() {
		if (null == connectionForm) {
			connectionForm = new ConnectionForm();
		}
		return connectionForm.getConnectionPanel();
	}

	@Override
	public boolean isModified() {
		return false;
	}

	@Override
	public void apply() throws ConfigurationException {
		connectionForm.saveConfig();
	}

	@Override
	public void reset() {
		connectionForm.setConfig();
	}
}
