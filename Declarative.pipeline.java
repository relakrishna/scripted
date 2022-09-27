pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                sh 'echo hello'
            }
        }
        stage('learning') {
            steps {
                git url: 'https://github.com/talitz/spring-petclinic-jenkins-pipeline.git', 
                    branch: 'master'
            }
        }
    }
}
