@echo off
cd /d "%~dp0src"
javac *.java
if errorlevel 1 (echo Compilation failed & exit /b 1)
echo Compilation successful.
