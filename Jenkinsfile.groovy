node {
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
        sh 'rsync -r target/*.war /etc/tomcat9/tomcat/webapps/"'
    }
}
