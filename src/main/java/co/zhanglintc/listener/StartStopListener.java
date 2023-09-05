package co.zhanglintc.listener;

import co.zhanglintc.common.Const;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartStopListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContextListener start");
        ApplicationContext beanCtx = new ClassPathXmlApplicationContext("webBeans.xml");
        sce.getServletContext().setAttribute(Const.beanCtx, beanCtx);
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContextListener stop");
    }
}
