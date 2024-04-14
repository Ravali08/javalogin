node('node11') {
    stage('Checkout') {
        git branch: 'master', url: 'https://github.com/Ravali08/javalogin.git'
    }
     stage('Test') {
        echo 'Testing in progress'
    }
    stage('Build') {
        sh 'mvn clean package'
    }
    stage('Deploy') {
        sh 'sudo rsync -r /home/ubuntu/workspace/Jenkinsfile.groovy/target/*.war /opt/tomcat/webapps'
    }
}
