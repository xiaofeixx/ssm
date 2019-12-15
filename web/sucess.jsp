<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sprinng" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: xiaofei
  Date: 2019/12/7
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
sucess
${requestScope.flim.video_name}
${requestScope.flim.update_time}
<form:form modelAttribute="user" method="post" action="">
    <table>
        <tr>
            <td><sprinng:message code="loginname"/> :</td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td><sprinng:message code="password"/>: </td>
            <td><form:input path="password"/></td>
        </tr>
        <tr>
            <td>生日:</td>
            <td><form:input path="birthday"/></td>
        </tr>
        <tr>
            <td>邮箱:</td>
            <td><form:input path="email"/></td>
        </tr>
    </table>
    <input type="submit" name="subimt" value="提交"/>
</form:form>
<fmt:formatDate value="${requestScope.user.birthday}" pattern="yyyy年MM月dd日"/>

</body>
</html>
