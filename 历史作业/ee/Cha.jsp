<%--
  Created by IntelliJ IDEA.
  User: 张成龙
  Date: 2017/5/25
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import ="java.sql.*"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String url = "jdbc:mysql://localhost:3306/zuoye1";
    String user = "root";
    String password = "jing";
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection(url,user,password);
    Statement statement = con.createStatement();
    ResultSet rs = statement.executeQuery("select * from emp");
    while(rs.next()){
        String id2 = rs.getString("dno");
        String s = rs.getString("mid");
        String s2 = rs.getString("salary");
        out.println("dno="+id2+"\n"+ "mis="+s+"\n"+"salary="+s2+"\n");
        
    }

%>
</body>
</html>
