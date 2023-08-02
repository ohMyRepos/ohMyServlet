package co.zhanglintc;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

public class ohMyServlet extends HttpServlet {
    private String readIniFile() throws IOException {
        InputStream in = getServletContext().getClassLoader().getResourceAsStream("ohMyServlet.ini");
        BufferedInputStream br = new BufferedInputStream(in);
        String content = IOUtils.toString(br, "UTF-8");
        return content;
    }

    @Override
    public final void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String content = readIniFile();

        PrintWriter out = response.getWriter();
        out.println("ohMyServlet:\n" + content);
    }
}
