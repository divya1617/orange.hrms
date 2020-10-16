set projectLocation=C:\Users\NRPALURI\eclipse-library\orange.hrms
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\TestNG.xml
