<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleSoapMethodsProxyid" scope="session" class="soap.SoapMethodsProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSoapMethodsProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleSoapMethodsProxyid.getEndpoint();
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
        sampleSoapMethodsProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        soap.SoapMethods getSoapMethods10mtemp = sampleSoapMethodsProxyid.getSoapMethods();
if(getSoapMethods10mtemp == null){
%>
<%=getSoapMethods10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">forecast:</TD>
<TD>
<%
if(getSoapMethods10mtemp != null){
double[] typeforecast13 = getSoapMethods10mtemp.getForecast();
        String tempforecast13 = "[";        for(int iforecast13=0;iforecast13< typeforecast13.length;iforecast13++){
            tempforecast13 = tempforecast13 + typeforecast13[iforecast13] + ",";
        }
        int lengthforecast13 = tempforecast13.length();
        tempforecast13 = tempforecast13.substring(0,(lengthforecast13 - 1)) + "]";
        %>
        <%=tempforecast13%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">temp:</TD>
<TD>
<%
if(getSoapMethods10mtemp != null){
%>
<%=getSoapMethods10mtemp.getTemp()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">wind:</TD>
<TD>
<%
if(getSoapMethods10mtemp != null){
double[] typewind17 = getSoapMethods10mtemp.getWind();
        String tempwind17 = "[";        for(int iwind17=0;iwind17< typewind17.length;iwind17++){
            tempwind17 = tempwind17 + typewind17[iwind17] + ",";
        }
        int lengthwind17 = tempwind17.length();
        tempwind17 = tempwind17.substring(0,(lengthwind17 - 1)) + "]";
        %>
        <%=tempwind17%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 19:
        gotMethod = true;
        double[] getWind19mtemp = sampleSoapMethodsProxyid.getWind();
if(getWind19mtemp == null){
%>
<%=getWind19mtemp %>
<%
}else{
        String tempreturnp20 = "[";        for(int ireturnp20=0;ireturnp20< getWind19mtemp.length;ireturnp20++){
            tempreturnp20 = tempreturnp20 + getWind19mtemp[ireturnp20] + ",";
        }
        int lengthreturnp20 = tempreturnp20.length();
        tempreturnp20 = tempreturnp20.substring(0,(lengthreturnp20 - 1)) + "]";
        %>
        <%=tempreturnp20%>
        <%
}
break;
case 22:
        gotMethod = true;
        double[] getForecast22mtemp = sampleSoapMethodsProxyid.getForecast();
if(getForecast22mtemp == null){
%>
<%=getForecast22mtemp %>
<%
}else{
        String tempreturnp23 = "[";        for(int ireturnp23=0;ireturnp23< getForecast22mtemp.length;ireturnp23++){
            tempreturnp23 = tempreturnp23 + getForecast22mtemp[ireturnp23] + ",";
        }
        int lengthreturnp23 = tempreturnp23.length();
        tempreturnp23 = tempreturnp23.substring(0,(lengthreturnp23 - 1)) + "]";
        %>
        <%=tempreturnp23%>
        <%
}
break;
case 25:
        gotMethod = true;
        double getTemp25mtemp = sampleSoapMethodsProxyid.getTemp();
        String tempResultreturnp26 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getTemp25mtemp));
        %>
        <%= tempResultreturnp26 %>
        <%
break;
case 28:
        gotMethod = true;
        String temp_1id=  request.getParameter("temp31");
        double temp_1idTemp  = Double.parseDouble(temp_1id);
        sampleSoapMethodsProxyid.setTemp(temp_1idTemp);
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