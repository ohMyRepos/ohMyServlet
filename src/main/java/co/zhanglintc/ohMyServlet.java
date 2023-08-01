package co.zhanglintc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ohMyServlet extends HttpServlet {
    @Override
    public final void service(HttpServletRequest request, HttpServletResponse response) {
        request.getHeader(getServletInfo());
        System.out.println("123");
        System.out.println("321");
    }
}
