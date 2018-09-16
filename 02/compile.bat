echo off
if exist "bin" rd /q /s "bin"
if exist "tmp" rd /q /s "tmp"
md bin tmp

cd src\main\java
dir /s /B *.java > ..\..\..\tmp\sources.txt

echo on

javac -d ..\..\..\bin @..\..\..\tmp\sources.txt

echo off

cd ..\..\..\
if exist "tmp" rd /q /s "tmp"