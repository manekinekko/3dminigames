#!/bin/sh
#####################################################
#
#  make.sh permet de compiler les fichiers .java 
#  en utilisant ANTLR.
#
#  Exemple d'utilisation : ./make.sh
#
#  Pensez à modifier les droits du script :
#  chmod +x generate.sh
#
#####################################################


DIR_ANTLR=/home/touzbi/Documents/M1_SR/COMP/
export CLASSPATH=$DIR_ANTLR/antlr-3.3-complete.jar:$CLASSPATH

javac *.java
