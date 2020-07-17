package org.vvar.societyhub;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class PostFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        MultiReadHttpServletRequest multiReadRequest = new MultiReadHttpServletRequest((HttpServletRequest) servletRequest

        );
//        MyRequestWrapper requestWrapper = new MyRequestWrapper(request);
//        LOG.debug("payload: " + requestWrapper.getBody());
        String output;
        System.out.println(output = new String(multiReadRequest.getInputStream().readAllBytes()));
        servletRequest.setAttribute("postdata", output);
//        System.out.println(requestWrapper.getBody());
//        System.out.println("Done");
        filterChain.doFilter(multiReadRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
