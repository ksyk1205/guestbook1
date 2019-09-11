<%@page import="kr.co.itcen.guestbook.vo.GuestbookVo"%>
<% 

	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	String contents = request.getParameter("contents");
	 
	
	GuestbookVo vo = new GuestbookVo();
	

%>