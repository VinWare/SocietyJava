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
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        MyRequestWrapper requestWrapper = new MyRequestWrapper(request);
//        LOG.debug("payload: " + requestWrapper.getBody());
        System.out.println(requestWrapper.getBody());
        System.out.println("Done");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
