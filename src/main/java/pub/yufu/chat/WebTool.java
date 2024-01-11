package pub.yufu.chat;

import com.intellij.ui.jcef.JBCefApp;
import com.intellij.ui.jcef.JBCefBrowser;

import javax.swing.*;
import java.awt.*;

/**
 * @Classname WebTool
 * @Description 加载web
 * @Date 2024/1/10 15:33
 * @Created by Tower
 */
public class WebTool {
    private final JPanel content;

    /**
     * 构造函数
     */
    public WebTool() {
        this.content = new JPanel(new BorderLayout());
        // 判断所处的IDEA环境是否支持JCEF
        if (!JBCefApp.isSupported()) {
            this.content.add(new JLabel("当前环境不支持JCEF", SwingConstants.CENTER));
            return;
        }
        JBCefBrowser jbCefBrowser = new JBCefBrowser();
        this.content.add(jbCefBrowser.getComponent(), BorderLayout.CENTER);
        // 加载URL
        jbCefBrowser.loadURL("https://chat.yufu.pub/");
    }

    /**
     * 返回创建的JPanel
     * @return JPanel
     */
    public JPanel getContent() {
        return content;
    }
}
