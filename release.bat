@echo off
rem FixatorDS release script
rem @date 23.07.2012


mvn release:clean release:prepare

if %1.==.deploy mvn deploy

goto end

:error1
echo Second parameter (Build number) is empty
goto end


:end
echo Release process finished. New version number %BUILD_NUMBER%