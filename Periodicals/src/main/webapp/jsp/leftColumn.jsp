<%@ page import="main.model.Category" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String param1 = application.getInitParameter("param1");
%>


<div class="leftbar">
    <ul id="menu">
        <li>
            <div>
                <a href="<%=param1%>">
                    <span style="margin-left:15px;">Home</span>
                </a>
            </div>
        </li>
        <li>
            <div>
                <a href="<%=param1%>?action=allMagazines">
                    <span style="margin-left: 15px;">All Magazines</span>
                </a>
            </div>
        </li>
        <li>
            <div>
                <span  style="margin-left: 15px;">Categories</span>
            </div>
            <ul>
                <%
                    List<Category> categoryList1 = (List<Category>) application
                            .getAttribute("categoryList");
                    Iterator<Category> iterator1 = categoryList1.iterator();
                    while (iterator1.hasNext()) {
                        Category category1 = (Category) iterator1.next();
                %>
                <li><a href="<%=param1%>?action=category&categoryId=<%=category1.getCategoryId()%>&category=<%=category1.getCategoryDescription()%>">
                        <span style="margin-left: 30px;"><%=category1.getCategoryDescription()%></span>
                    </a>
                </li>
                <%
                    }
                %>
            </ul>
        </li>
        <li>
            <div>
                <span style="margin-left: 15px;">Contact Us</span>
            </div>
        </li>
    </ul>
    <form class="search">
        <input type="hidden" name="action" value="search" />
            <input id="text" type="text" name="keyWord" size="12" />
                <span>?</span>
        <input id="submit" type="submit" value="Search" />
    </form>


</div>
