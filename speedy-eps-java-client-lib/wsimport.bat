rmdir /S /Q wsimport
mkdir wsimport
mkdir wsimport\src
"%JAVA_HOME%"\bin\wsimport -Xnocompile -s wsimport\src -wsdllocation https://www.speedy.bg/eps/main01.wsdl -keep http://87.120.200.234:8080/eps/mainservice01?wsdl -p com.omgm.speedy.eps.soap.model

REM "%JAVA_HOME%"\bin\wsimport -Xnocompile -s wsimport\src -wsdllocation https://www.speedy.bg/eps/main01.wsdl -keep https://www.speedy.bg/eps/main01.wsdl -p com.omgm.speedy.eps.soap.model