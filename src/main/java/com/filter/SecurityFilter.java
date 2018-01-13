package com.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 权限过滤器
 */
@Component("securityFilter")
public class SecurityFilter implements Filter {
	
	protected Logger logger = LoggerFactory.getLogger(this.getClass()); 

	/**
	 * 初始化过滤器,将公共地址添加到列表中
	 */
	public void init(FilterConfig arg0) throws ServletException {
	}
	
	//根据token进行的验证
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
		//请求地址
		String uri = request.getRequestURI().substring(request.getContextPath().length() + 1);
		logger.debug(uri);
		//1.验证是否是公共url地址
		//公共地址放行
		chain.doFilter(request, response);
	}

	public void destroy() {
		
	}
}
