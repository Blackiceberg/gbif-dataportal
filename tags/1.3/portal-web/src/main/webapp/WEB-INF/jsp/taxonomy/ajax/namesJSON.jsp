<%@ page contentType="text/javascript" %><%@ include file="/common/taglibs.jsp"%><c:if test="${not empty callback}">${callback}(</c:if>{ "Resultset":{
	"totalResultsReturned":"${fn:length(searchResults)}",
	"Result":[<c:forEach items="${searchResults}" var="name" varStatus="nameStatus"><c:if test="${nameStatus.index>0}">,</c:if>"<gbif:capitalizeFirstChar>${name}</gbif:capitalizeFirstChar>"</c:forEach>] }}<c:if test="${not empty callback}">)</c:if>