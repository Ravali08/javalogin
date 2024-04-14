node {
    stage('Checkout') {
        git 'https://github.com/yourusername/yourrepository.git'
    }
    stage('Build') {
        sh 'mvn clean package'
    }
    stage('Deploy') {
        sh 'cp target/*.war /path/to/tomcat/webapps/'
    }
}
