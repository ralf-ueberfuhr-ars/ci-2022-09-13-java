pipeline {
    agent any
    tools {
        maven 'maven-default'
        jdk 'openjdk-17'
    }
    stages {
        stage ('Initialize') {
            steps {
            	sh '''
	                echo "PATH = ${PATH}"
    	            echo "M2_HOME = ${M2_HOME}"
    	        '''
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}