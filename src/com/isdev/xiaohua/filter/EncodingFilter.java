package com.isdev.xiaohua.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by lsh134667 on 2018/1/26.
 */
public class EncodingFilter implements Filter {

    private String encoding = null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encoding = filterConfig.getInitParameter("encoding");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        if(encoding !=null && !encoding.equals("")){
            req.setCharacterEncoding(encoding);
            resp.setContentType("text/html; charset="+encoding);
        }

        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {
        encoding = null;
    }
}
