@echo off

set sourceName=%1
if [%1]==[] set sourceName=test.docx

java -classpath "./bin;%AXIS2_HOME%/lib/*" com.muhimbi.app.WsClient %sourceName%

echo.

@pause