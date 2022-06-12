<%-- 
    Document   : post
    Created on : 12-Jun-2022, 10:45:54 AM
    Author     : Nishant Singh
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.blog.dao.PostDao"%>
<%@page import="com.tech.blog.entities.Categories"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page import="com.tech.blog.entities.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    User up=(User)session.getAttribute("currentuser");
    if (up==null) {
           response.sendRedirect("login.jsp");
        }
 %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <link rel="stylesheet" href="css/mycss.css">
    <title>TechBlog</title>
  </head>
  <body>
     <!-- Navbar--->
     
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="/Blogs/">TechBlog</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/Blogs">Home <span class="sr-only">(current)</span></a>
      </li>
      
         <li class="nav-item active">
        <a class="nav-link" href="post.jsp">Post <span class="sr-only">(current)</span></a>
      </li>
      
      <li class="nav-item active">
        <a class="nav-link" href="contact.jsp">Contact Us</a>
      </li>
   
      <li class="nav-item active">
        <a class="nav-link" href="abt.jsp">About Us</a>
      </li>
      
            <li class="nav-item active">
           <a class="nav-link" href="Logout">Logout</a>
      </li>
    </ul>
     
  </div>
</nav>
       
 <!--Navbar end-->
 
<!---Form Start---->


  
  
<form action="postservlet" method="post">
    
    
    <select class="form-control" name="catID">
<option selected disabled >---Select Categories---</option>
    <% 
    PostDao postDao=new PostDao(ConnectionProvider.getConnection());
    ArrayList<Categories> list=postDao.getCategories();
    
        for (Categories categories : list)
        {
        %>
 <option value="<%= categories.getcId() %>"><%= categories.getcName() %>
 </option>
  <% } %>
  
</select>
    
    
    <div class="form-group">
    <label for="exampleInputEmail1">Post Tittle</label>
    <input name=pTittle class="form-control"
     placeholder="Enter Post Tittle">
  
   </div>
    
    
  <div class="form-group">
    <label for="Description">Content</label>
    <input name="pContent" class="form-control" placeholder="Description">
  </div>
    
     <div class="form-group">
    <label for="Description">Code</label>
    <input name="pCode" class="form-control" placeholder="Description">
  </div> 
  
     <div class="form-group">
    <label for="pic">Upload Image </label>
    <input name="pPic" 
    type="file" 
    class="form-control-file">
    </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>

<!---Form End-->
 
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="js/myjs.js"></script>
  </body>
</html>