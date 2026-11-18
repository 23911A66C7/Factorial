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
                // Use 'bat' instead of 'sh' for Windows environments
                bat 'javac Factorial.java'
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