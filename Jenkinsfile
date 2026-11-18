pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Pulls your code from GitHub
                checkout scm
            }
        }

        stage('Build & Compile') {
            steps {
                // Compiles your Java file directly
                sh 'javac Factorial.java'
            }
        }

        stage('Archive Artifacts') {
            steps {
                // Saves the compiled .class file
                archiveArtifacts artifacts: 'Factorial.class', fingerprint: true
            }
        }
    }
}