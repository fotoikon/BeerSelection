<%-- 
    Document   : result
    Created on : 12 ??? 2016, 3:13:18 ??
    Author     : fotini
--%>

<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <body>
        <h1 align="center">Beer Recommendation JSP</h1>
        
        <%
            List styles = (List) request.getAttribute("styles");
            Iterator it = styles.iterator();
            while(it.hasNext()) {
                out.print("<br>try: " + it.next());
            }
        %>
        
    </body>
</html>