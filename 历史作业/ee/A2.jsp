<%@ page import="java.sql.Connection" %>
<%@ page import="com.MyConnection.MyConnection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/5/24
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询</title>
</head>
<body>
<%
    String id = request.getParameter("id");
    Connection con = MyConnection.getCon();
    String sql = "select * from student where id = "+id;
    Statement sta = con.createStatement();
    ResultSet rs = sta.executeQuery(sql);
    while(rs.next()){
        int id2 = rs.getInt("id");
        String sname = rs.getString("sname");
        out.println("id="+id2+":"+"sname="+sname);
    }

%>
</body>
</html>
