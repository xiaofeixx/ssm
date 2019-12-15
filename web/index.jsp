<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: xiaofei
  Date: 2019/12/7
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$
  <a href="sucess">点击这个</a>

  <form  method="post" action="register">
    <table>
      <tr>
        <td>用户名:</td>
        <td><input type="text" id="username" name="username"/></td>
      </tr>
      <tr>
        <td>密码:</td>
        <td><input type="text" id="password" name="password"/></td>
      </tr>
      <tr>
        <td>生日:</td>
        <td><input type="text" id="birthday" name="birthday"/></td>
      </tr>
      <tr>
        <td>邮箱:</td>
        <td><input type="text" id="email" name="email"/></td>
      </tr>
    </table>
    <input type="submit" name="subimt" value="提交"/>
  </form>

  <form method="post" enctype="multipart/form-data" action="upload">
    <table>

      <tr>
        <td>文件名：</td>
        <td><input type="text" name="filename"/> </td>
      </tr>
      <tr>
        <td><input name="file" type="file"/></td>
      </tr>
      <tr>
        <td><input type="submit"value="提交"/> </td>
      </tr>
    </table>
  </form>
  <a href="download?filename=嘉雯.jpg">下载嘉雯</a>
  </body>
</html>
