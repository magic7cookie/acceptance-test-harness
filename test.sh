#!/bin/bash

CHROME_DRIVER_PATH=~/chromedriver/chromedriver
BROWSER=chrome
RETRY=1
TEST_CASE=\#$1
ELASTIC=5 # increase if your machine is slow

if [[ ${TEST_CASE} = '#' ]] ; then
    TEST_CASE=
fi


mvnOptions="-Dsurefire.rerunFailingTestsCount=${RETRY} -Dwebdriver.chrome.driver=${CHROME_DRIVER_PATH} -DElasticTime.factor=${ELASTIC}"

echo env LC_NUMERIC=”en_US.UTF-8″ BROWSER=${BROWSER} mvn -q test -o -Dtest=WarningsPluginTest${TEST_CASE} ${mvnOptions}
env LC_NUMERIC=”en_US.UTF-8″ BROWSER=${BROWSER} mvn -q test -o -Dtest=WarningsPluginTest${TEST_CASE} ${mvnOptions}
