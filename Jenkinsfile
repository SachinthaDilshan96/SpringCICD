pipeline {
    agent any

    stages {
        stage('SCM Checkout') {
            steps {
                retry(3) {
                    git branch: 'main', url: 'https://github.com/SachinthaDilshan96/SpringCICD.git'
                }
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t sachinthadilshan96/demo:%BUILD_NUMBER% .'
            }
        }
        stage('Login to Docker Hub') {
            steps {
                withCredentials([string(credentialsId: 'test-dockerhubpassword', variable: 'test-dockerhub-password')]) {
                    sh "docker login -u sachinthadilshan96 -p %test-dockerhub-password%"
                }
            }
        }
        stage('Push Image') {
            steps {
                sh 'docker push sachinthadilshan96/demo:%BUILD_NUMBER%'
            }
        }
    }
    post {
        always {
            bat 'docker logout'
        }
    }
}
