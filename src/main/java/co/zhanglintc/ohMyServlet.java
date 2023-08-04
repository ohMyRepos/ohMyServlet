package co.zhanglintc;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import co.zhanglintc.annotation.ohMyAnno;

@ohMyAnno(value = {"1st", "2nd"}, description = "This is My Annotation!")
public class ohMyServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    private String readIniFile() throws IOException {
        InputStream in = getServletContext().getClassLoader().getResourceAsStream("ohMyServlet.ini");
        String content = IOUtils.toString(in, "UTF-8");
        return content;
    }

    @Override
    public final void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();

        out.println("readIniFile:");
        String content = readIniFile();
        out.println(content);

        out.println();

        out.println("ohMyAnno:");
        Class<?> clazz = ohMyServlet.class;
        ohMyAnno anno = clazz.getAnnotation(ohMyAnno.class);
        if (anno == null) {
            out.println("no annotation is set");
        } else {
            for (String v : anno.value()) {
                out.println(v);
            }
            out.println(anno.description());
        }

        out.close();
    }
}
