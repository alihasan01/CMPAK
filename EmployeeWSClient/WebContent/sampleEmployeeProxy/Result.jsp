<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleEmployeeProxyid" scope="session" class="com.employee.ws.EmployeeProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleEmployeeProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleEmployeeProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleEmployeeProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.employee.ws.Employee getEmployee10mtemp = sampleEmployeeProxyid.getEmployee();
if(getEmployee10mtemp == null){
%>
<%=getEmployee10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 19:
        gotMethod = true;
        String name_1id=  request.getParameter("name22");
            java.lang.String name_1idTemp = null;
        if(!name_1id.equals("")){
         name_1idTemp  = name_1id;
        }
        java.lang.String getName19mtemp = sampleEmployeeProxyid.getName(name_1idTemp);
if(getName19mtemp == null){
%>
<%=getName19mtemp %>
<%
}else{
        String tempResultreturnp20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getName19mtemp));
        %>
        <%= tempResultreturnp20 %>
        <%
}
break;
case 24:
        gotMethod = true;
        String name_2id=  request.getParameter("name27");
            java.lang.String name_2idTemp = null;
        if(!name_2id.equals("")){
         name_2idTemp  = name_2id;
        }
        sampleEmployeeProxyid.setName(name_2idTemp);
break;
case 29:
        gotMethod = true;
        String age_3id=  request.getParameter("age32");
            java.lang.String age_3idTemp = null;
        if(!age_3id.equals("")){
         age_3idTemp  = age_3id;
        }
        java.lang.String getAge29mtemp = sampleEmployeeProxyid.getAge(age_3idTemp);
if(getAge29mtemp == null){
%>
<%=getAge29mtemp %>
<%
}else{
        String tempResultreturnp30 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getAge29mtemp));
        %>
        <%= tempResultreturnp30 %>
        <%
}
break;
case 34:
        gotMethod = true;
        String designation_4id=  request.getParameter("designation37");
            java.lang.String designation_4idTemp = null;
        if(!designation_4id.equals("")){
         designation_4idTemp  = designation_4id;
        }
        java.lang.String getDesignation34mtemp = sampleEmployeeProxyid.getDesignation(designation_4idTemp);
if(getDesignation34mtemp == null){
%>
<%=getDesignation34mtemp %>
<%
}else{
        String tempResultreturnp35 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getDesignation34mtemp));
        %>
        <%= tempResultreturnp35 %>
        <%
}
break;
case 39:
        gotMethod = true;
        String designation_5id=  request.getParameter("designation42");
            java.lang.String designation_5idTemp = null;
        if(!designation_5id.equals("")){
         designation_5idTemp  = designation_5id;
        }
        sampleEmployeeProxyid.setDesignation(designation_5idTemp);
break;
case 44:
        gotMethod = true;
        String age_6id=  request.getParameter("age47");
            java.lang.String age_6idTemp = null;
        if(!age_6id.equals("")){
         age_6idTemp  = age_6id;
        }
        sampleEmployeeProxyid.setAge(age_6idTemp);
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>