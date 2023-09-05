package co.zhanglintc.listener;

import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;

public class SpringCtxLoaderListener extends ContextLoaderListener {
    public void contextInitialized(ServletContextEvent sce) {
        super.contextInitialized(sce);
        System.out.println("SpringCtxLoaderListener start");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        super.contextInitialized(sce);
        System.out.println("SpringCtxLoaderListener stop");
    }
}
