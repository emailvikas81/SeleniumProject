start /B cmd /k java -jar selenium-server-standalone-2.39.0.jar -role hub

start /B cmd /k java -jar selenium-server-standalone-2.39.0.jar -role webdriver -hub http://localhost:4444/grid/register -browser browserName=firefox,platform=WINDOWS,version=8 -port 5557

start /B cmd /k java -jar selenium-server-standalone-2.39.0.jar -role webdriver -hub http://localhost:4444/grid/register -browser browserName=chrome,platform=WINDOWS,version=32 -Dwebdriver.chrome.driver="D:\Test Automation\JavaScript\SeleniumGrid\drivers\chromedriver.exe" -port 5558

start /B cmd /k java -jar selenium-server-standalone-2.39.0.jar -role webdriver -hub http://localhost:4444/grid/register -browser "browserName=internet explorer,version=7,platform=WINDOWS,version=9" -port 5555 

start /B cmd /k java -jar selenium-server-standalone-2.39.0.jar -role webdriver -hub http://localhost:4444/grid/register -browser "browserName=android,platform=ANDROID,version=4.4" -port 8080

start /B cmd /k ant clean

start /B cmd /k ant compile

start /B cmd /k ant run

start /B cmd /k ant makexsltreports