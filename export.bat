@echo off
set imageName=exportable-api-with-docker
echo Creating image %imageName%...
mvn jib:dockerBuild
echo Exporting image %imageName%...
docker save -o %imageName%.tar %imageName%:latest
echo Done.

