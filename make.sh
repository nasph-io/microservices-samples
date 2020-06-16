clear
cd micronaut
clear
mvn package
echo 'Micronaut - build ok '
cd ../spring
mvn package
echo 'Springboot - build ok '
