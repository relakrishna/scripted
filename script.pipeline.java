node {
    stage('test') {
        sh 'echo hello'
    }
    stage('learning') {
        git url: 'https://github.com/talitz/spring-petclinic-jenkins-pipeline.git',
            branch: 'master'
    }
}