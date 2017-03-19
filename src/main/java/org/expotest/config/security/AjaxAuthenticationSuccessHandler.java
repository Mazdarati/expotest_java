package org.expotest.config.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.expotest.models.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Spring Security success handler, specialized for Ajax requests.
 */
@Component
public class AjaxAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
	

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication)
        throws IOException, ServletException {
    	
    	response.setStatus(HttpServletResponse.SC_OK);
         
 		User user = (User) (authentication == null ? null : authentication.getPrincipal());
 		
 		response.setContentType("application/json");
 		
 		ObjectMapper mapper = new ObjectMapper();
 		
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().flush();
        response.getWriter().close();
     
    }
}
