package com.aiyacloud.filter;

import org.apache.commons.io.IOUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplacedRequestInputStreamFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        // 把需要使用@RequestBody处理的request封装一下，使得request.getInputStream()可以多次调用。
        // 暂时只考虑json -- wangws 2015/3/13
        String contentType = request.getContentType();
        if (contentType != null && contentType.startsWith("application/json")) {
            request = new MAPIHttpServletRequestWrapper(request);
        }

        filterChain.doFilter(request, response);
    }

    private class MAPIHttpServletRequestWrapper extends HttpServletRequestWrapper {

        private final byte[] body; // 报文

        public MAPIHttpServletRequestWrapper(HttpServletRequest request) throws IOException {
            super(request);
            body = IOUtils.toByteArray(request.getInputStream());
        }

        @Override
        public BufferedReader getReader() throws IOException {
            return new BufferedReader(new InputStreamReader(getInputStream()));
        }

        @Override
        public ServletInputStream getInputStream() throws IOException {
            final ByteArrayInputStream bais = new ByteArrayInputStream(body);
            return new ServletInputStream() {

                @Override
                public int read() throws IOException {
                    return bais.read();
                }
            };
        }

    }
}
