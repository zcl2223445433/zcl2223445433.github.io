<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="com.MyConnection.MyConnection" %><%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/5/23
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<table border="1px">
    <%
        //      String id = request.getParameter("id");
//      out.println(id);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = MyConnection.getCon();
            //Connection con = null;
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","123456");
            String sql = "select * from student";
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(sql);

            while (rs.next()) {
                String sname = rs.getString("sname");
                int id = rs.getInt("id");
                out.println("<tr><td>"+id+"</td>"+"<td>"+sname+"</td><td>"+"<a href=\"/select.jsp?id="+id+"\">点击查询</a>"+"</td></tr>");
            }
        }catch(Exception  e){
            e.printStackTrace();
        }
    %>
</table>
<script language = "JavaScript">
    var doms = window.document.getElementsByTagName("td");
    for(var i = 0; i<doms.length;i++){
        var dom = doms[i];
        if(i%2==0){
            dom.style.background = "yellow";
            dom.style.width = 100;
        }else{
            dom.style.background = "pink";
            dom.style.width = 100;
        }
    }
</script>
</body>
</html>
