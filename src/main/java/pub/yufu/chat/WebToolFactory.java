package pub.yufu.chat;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentManager;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * @Classname WebToolFactory
 * @Description web tool factory
 * @Date 2024/1/10 15:37
 * @Created by Tower
 */
public class WebToolFactory implements ToolWindowFactory {
    @Override
    public void createToolWindowContent(
            @NotNull Project project,
            @NotNull ToolWindow toolWindow) {

        ContentManager contentManager = toolWindow.getContentManager();
        Content labelContent =
                contentManager.getFactory()
                        .createContent(
                                new WebTool().getContent(),
                                "Chat",
                                false
                        );

        contentManager.addContent(labelContent);
    }
}
