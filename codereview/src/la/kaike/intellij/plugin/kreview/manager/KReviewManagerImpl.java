/**
 * 版权所有@: 杭州铭师堂教育科技发展有限公司
 * 注意：本内容仅限于杭州铭师堂教育科技发展有限公司内部使用，禁止外泄以及用于其他的商业目的
 * CopyRight@: 2017 Hangzhou Mistong Educational Technology Co.,Ltd.
 * All Rights Reserved.
 * Note:Just limited to use by Mistong Educational Technology Co.,Ltd. Others are forbidden.
 */
package la.kaike.intellij.plugin.kreview.manager;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import la.kaike.intellij.plugin.kreview.model.ProjectDTO;
import la.kaike.intellij.plugin.kreview.model.SysBranchDTO;
import la.kaike.intellij.plugin.kreview.model.UserDTO;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Kreview具体实现类
 *
 * Created by huapeng.hhp on 2017/12/21.
 */
public class KReviewManagerImpl implements KReviewOptManager,KReviewSelManager {

    private final Project myProject;

    private static final Logger LOG = Logger.getInstance(KReviewManagerImpl.class.getName());

    public KReviewManagerImpl(@NotNull final Project project) {
        myProject = project;
    }

    @Override
    public void addProject(String projectName) {

    }

    @Override
    public void addAssign(String assignEmail) {

    }

    @Override
    public void addCreator(String creator) {

    }

    @Override
    public List<ProjectDTO> queryProjectList() {
        return null;
    }

    @Override
    public List<SysBranchDTO> queryBranchBySys(String sysname) {
        return null;
    }

    @Override
    public List<UserDTO> queryAssign() {
        return null;
    }

    @Override
    public List<UserDTO> queryCreator() {
        return null;
    }
}
