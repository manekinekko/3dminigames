#!/bin/sh
################################################################
#
#  run.sh permet d'exécuter un programme java utilisant ANTLR.
#
#  Exemple d'utilisation : ./run.sh programme [param1] [param2]
#
#  Pensez à modifier les droits du script :
#  chmod +x make.sh
#
################################################################

if test "$1" = ""
    then
    echo "usage: run.sh prog_name without .class [param1] [param2] "
    exit 1;
    fi


DIR_ANTLR=/home/touzbi/Documents/M1_SR/COMP/
export CLASSPATH=$DIR_ANTLR/antlr-3.3-complete.jar:$CLASSPATH

java $1 $2
