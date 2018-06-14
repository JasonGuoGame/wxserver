package com.xin.fa.bao.server.config;

import com.xin.fa.bao.server.dao.ConsumerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by scnyig on 2018/6/12.
 */
@Component
public class ThirdSessionAuthFilter extends OncePerRequestFilter {
    @Value("${jwt.header}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private ConsumerMapper consumerMapper;
    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain chain) throws ServletException, IOException {
        //��ȡ����ͷ���ֵ�Authorization
        String authHeader = request.getHeader(this.tokenHeader);
        //�������·��Ϊ΢��֪ͨ��̨֧���������Ҫtoken��֮����ھ����controller�У���˫��ǩ��������֤�����㣩
        String url = request.getRequestURI().substring(request.getContextPath().length());
        if (url.equals("/auth") || url.equals("/test")) {
            chain.doFilter(request, response);
            return;
        }
        if (null == authHeader || !authHeader.startsWith("Bearer")) {
            throw new RuntimeException("�Ƿ������û�");
        }
        // The part after "Bearer "
        final String thirdSessionId = authHeader.substring(tokenHead.length());
        String wxSessionObj = stringRedisTemplate.opsForValue().get(thirdSessionId.trim());
        if (StringUtils.isEmpty(wxSessionObj)) {
            throw new RuntimeException("�û�����ѹ���");
        }
        // ���õ�ǰ��¼�û�
        try (AppContext appContext = new AppContext(wxSessionObj.substring(wxSessionObj.indexOf("#") + 1))) {
            chain.doFilter(request, response);
        }
    }
}
