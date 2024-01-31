package filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Administrateur;

@WebFilter("/login.jsp")
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization code, if needed
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // Check if the Authorization header is present
        String authHeader = httpRequest.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Basic ")) {
            // Decode the username and password from the Authorization header
            String base64Credentials = authHeader.substring("Basic ".length()).trim();
            String credentials = new String(java.util.Base64.getDecoder().decode(base64Credentials));

            // Split the credentials into username and password
            String[] parts = credentials.split(":", 2);
            String username = parts[0];
            String password = parts[1];

            // Check if the provided username and password match the expected values
            if (username.equals(Administrateur.username) && (password.equals(Administrateur.password))) {
                // Authentication successful, proceed with the request
                chain.doFilter(request, response);
            } else {
                // Authentication failed, send unauthorized response
                httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                httpResponse.setHeader("WWW-Authenticate", "Basic realm=\"Protected\"");
            }
        } else {
            // Authorization header not present, send unauthorized response
            httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            httpResponse.setHeader("WWW-Authenticate", "Basic realm=\"Protected\"");
        }
    }

    @Override
    public void destroy() {
        // Cleanup code, if needed
    }
}
