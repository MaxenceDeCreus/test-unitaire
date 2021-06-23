pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'Java11'
    }
    stages {
        stage('prepare') {
            steps {
                echo "Prepare"
            }
        }
        stage('build') {
            steps {
               sh 'mvn compile'
            }
        }
        stage('test') {
            steps {
               sh 'mvn test'
            }
        }
    }
}
