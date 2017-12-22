package la.kaike.intellij.plugin.kreview.action;

import com.intellij.codeInsight.CodeInsightActionHandler;
import com.intellij.codeInsight.generation.actions.BaseGenerateAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiUtilBase;
import la.kaike.intellij.plugin.kreview.form.SubmitForm;

import javax.swing.*;

/**
 * CommentAddAction
 * <p>
 * Created by huapeng.hhp on 2017/12/18.
 */
public class CommentAddAction extends BaseGenerateAction {


	/**
	 * 提交form
	 */
	private SubmitForm submitForm;

	private JFrame mDialog;

	public CommentAddAction() {
		super(null);
	}

	public CommentAddAction(CodeInsightActionHandler handler) {
		super(handler);
	}

	@Override
	public void actionPerformed(AnActionEvent event) {
		// TODO: insert action logic here
		Project project = event.getData(PlatformDataKeys.PROJECT);
		Editor editor = event.getData(PlatformDataKeys.EDITOR);
		actionPerformedImpl(project, editor);
	}

	@Override
	public void actionPerformedImpl(Project project, Editor editor) {
		PsiFile file = PsiUtilBase.getPsiFileInEditor(editor, project);
		showDialog(project, editor);
	}


    protected void showDialog(Project project, Editor editor) {


//		JFrame frame = new JFrame("SubmitForm");
//		frame.setContentPane(new SubmitForm().connectionPanel);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.pack();
//		frame.setVisible(true);

        PsiFile file = PsiUtilBase.getPsiFileInEditor(editor, project);
        if (file == null) {
            return;
        }

        if(submitForm==null){
			submitForm = new SubmitForm();
		}

        PsiClass clazz = getTargetClass(editor, file);


        mDialog = new JFrame();
        mDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//        Component panel = null ;
//        mDialog.getContentPane().add(panel);
		mDialog.setContentPane(submitForm.getSubmitPanel());
        mDialog.pack();
        mDialog.setLocationRelativeTo(null);
        mDialog.setVisible(true);
    }
}
