<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleEmployeeImplProxyid" scope="session" class="service.EmployeeImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleEmployeeImplProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleEmployeeImplProxyid.getEndpoint();
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
        sampleEmployeeImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        service.EmployeeImpl getEmployeeImpl10mtemp = sampleEmployeeImplProxyid.getEmployeeImpl();
if(getEmployeeImpl10mtemp == null){
%>
<%=getEmployeeImpl10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">age:</TD>
<TD>
<%
if(getEmployeeImpl10mtemp != null){
java.lang.String typeage13 = getEmployeeImpl10mtemp.getAge();
        String tempResultage13 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeage13));
        %>
        <%= tempResultage13 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getEmployeeImpl10mtemp != null){
java.lang.String typename15 = getEmployeeImpl10mtemp.getName();
        String tempResultname15 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename15));
        %>
        <%= tempResultname15 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">designation:</TD>
<TD>
<%
if(getEmployeeImpl10mtemp != null){
java.lang.String typedesignation17 = getEmployeeImpl10mtemp.getDesignation();
        String tempResultdesignation17 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedesignation17));
        %>
        <%= tempResultdesignation17 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 19:
        gotMethod = true;
        java.lang.String getName19mtemp = sampleEmployeeImplProxyid.getName();
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
case 22:
        gotMethod = true;
        String name_1id=  request.getParameter("name25");
            java.lang.String name_1idTemp = null;
        if(!name_1id.equals("")){
         name_1idTemp  = name_1id;
        }
        sampleEmployeeImplProxyid.setName(name_1idTemp);
break;
case 27:
        gotMethod = true;
        java.lang.String getAge27mtemp = sampleEmployeeImplProxyid.getAge();
if(getAge27mtemp == null){
%>
<%=getAge27mtemp %>
<%
}else{
        String tempResultreturnp28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getAge27mtemp));
        %>
        <%= tempResultreturnp28 %>
        <%
}
break;
case 30:
        gotMethod = true;
        java.lang.String getDesignation30mtemp = sampleEmployeeImplProxyid.getDesignation();
if(getDesignation30mtemp == null){
%>
<%=getDesignation30mtemp %>
<%
}else{
        String tempResultreturnp31 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getDesignation30mtemp));
        %>
        <%= tempResultreturnp31 %>
        <%
}
break;
case 33:
        gotMethod = true;
        String designation_2id=  request.getParameter("designation36");
            java.lang.String designation_2idTemp = null;
        if(!designation_2id.equals("")){
         designation_2idTemp  = designation_2id;
        }
        sampleEmployeeImplProxyid.setDesignation(designation_2idTemp);
break;
case 38:
        gotMethod = true;
        String age_3id=  request.getParameter("age41");
            java.lang.String age_3idTemp = null;
        if(!age_3id.equals("")){
         age_3idTemp  = age_3id;
        }
        sampleEmployeeImplProxyid.setAge(age_3idTemp);
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