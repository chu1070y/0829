<%--
  Created by IntelliJ IDEA.
  User: 5CLASS-184
  Date: 2018-08-29
  Time: 오전 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.zerock.service.KeywordService" %>
<%@ page import="java.util.*"%>

<%
    List<String> keywordList = KeywordService.getInstance().find();

%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1><%=keywordList%></h1>

    <ul>
        <%
            for(String keyword:keywordList){

        %>
            <li> <%=keyword%> </li>
        <%
            }
        %>
    </ul>

    <script>

        setTimeout(function(){
            console.log("refresh")
            self.location = "keyword.jsp?num="+ new Date().getMilliseconds();
        }, 10000);
    </script>


</body>
</html>
