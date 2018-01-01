<%@ taglib uri="http://myapp/tags" prefix="myapp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
</head>
<body bgcolor='wheat'>
  <div align='center'>
    <hr>
    Param passing and custom annotation: <br> Reached the jsp: ${result}
    <hr>
    Taglib: <br>
    <myapp:mytag param1="aaa" />
    <hr>
    File Tag: <br>
    <myapp:filetag param1="wwww" />
    <hr>
    JSP Function: <br>
    <c:if test="${myapp:isEven(4)}">
        4 is even
 </c:if>

    <c:if test="${myapp:isEven(3)}">
        3 is not even
 </c:if>

    <hr>
    CRUD Operations: <br>
    <c:if test="${not empty bookList}">
      <table border=1>
        <tr>
          <td>BookId</td>
          <td>Title</td>
        </tr>
        <c:forEach items="${bookList}" var="book">
          <tr>
            <td>${book.bookId}</td>
            <td>${book.title}</td>
          </tr>
        </c:forEach>

      </table>
    </c:if>
  </div>
</body>
</html>