<%--
  Created by IntelliJ IDEA.
  User: 张成龙
  Date: 2017/5/25
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import ="java.sql.*"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="Cha.jsp">查看</a>
<div style="display: none">请输入内容</div>
<form onsubmit="return b()" action="" method="get">
    <input id="a" name="dno" type="text" placeholder="请输入" />
    <input name="mid" type="text" placeholder="请输入" />
    <input name="salary" type="text" placeholder="请输入" />
    <input type="submit" value="提交" />
</form>
<script>
    function b(){
        var f = true;
        var z2 = window.document.getElementById("a");
        var d = window.document.getElementsByTagName("div")[0];
        var s = z2.value;
        if(s == ""){
            f= false;
            d.style.display="block";
        }
        return f;
    }
</script>
<%
    String dno = request.getParameter("dno");
    String mid = request.getParameter("mid");
    String salatry = request.getParameter("salary");
    String url = "jdbc:mysql://localhost:3306/zuoye1";
    String user = "root";
    String password = "jing";
    if(dno!=null){
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,user,password);
        PreparedStatement ps = con.prepareStatement("INSERT INTO emp(dno,mid,salary)"+"VALUES(?,?,?)");
        ps.setString(1,dno);
        ps.setString(2,mid);
        ps.setString(3,salatry);
        ps.executeUpdate();
    }
%>
</body>
</html>

