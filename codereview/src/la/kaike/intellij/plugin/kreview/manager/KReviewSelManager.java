/**
 * 版权所有@: 杭州铭师堂教育科技发展有限公司
 * 注意：本内容仅限于杭州铭师堂教育科技发展有限公司内部使用，禁止外泄以及用于其他的商业目的
 * CopyRight@: 2017 Hangzhou Mistong Educational Technology Co.,Ltd.
 * All Rights Reserved.
 * Note:Just limited to use by Mistong Educational Technology Co.,Ltd. Others are forbidden.
 */
package la.kaike.intellij.plugin.kreview.manager;

import la.kaike.intellij.plugin.kreview.model.ProjectDTO;
import la.kaike.intellij.plugin.kreview.model.SysBranchDTO;
import la.kaike.intellij.plugin.kreview.model.UserDTO;

import java.util.List;

/**
 * KReviewSelManager
 *
 * Created by huapeng.hhp on 2017/12/21.
 */
public interface KReviewSelManager {

    /**
     * 查询所有的项目工程
     * @return
     */
    public List<ProjectDTO> queryProjectList();

    /**
     * 估计系统查询分支
     * @param sysname
     * @return
     */
    public List<SysBranchDTO> queryBranchBySys(String sysname);

    /**
     * 查询所有的接收者
     * @return
     */
    public List<UserDTO> queryAssign();

    /**
     * 查询所有的创建者
     * @return
     */
    public List<UserDTO> queryCreator();
}
