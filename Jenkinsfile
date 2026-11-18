pipeline {
    agent any

    tools {
        jdk 'JDK 17'
        maven 'Maven 3'
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build & Compile') {
            steps {
                echo 'Compiling the Java source code...'
                sh 'javac Factorial.java'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests (if applicable)...'

            }
        }
        stage('Archive Artifacts') {
            steps {
                echo 'Archiving built class files...'
                archiveArtifacts artifacts: 'Factorial.class', fingerprint: true
            }
        }
    }
    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed. Please check the logs.'
        }
    }
}