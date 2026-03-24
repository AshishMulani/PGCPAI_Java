@echo off
cd D:\PGCPAI_Java
javac ImageGenerator.java
if errorlevel 1 (
    echo Compilation failed
    exit /b 1
)
java ImageGenerator
if errorlevel 1 (
    echo Execution failed
    exit /b 1
)
echo Done
