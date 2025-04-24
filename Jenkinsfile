pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/ArunkumarDhamodharan/PrevajWebAutomation.git'
            }
        }

        stage('Install Dependencies') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Generate Reports') {
            steps {
                cucumber buildStatus: 'FAILURE', fileIncludePattern: '**/target/cucumber.json', sortingMethod: 'ALPHABETICAL'
            }
        }
    }

    post {
        always {
            mail to: 'arunkumardhamodharan07@gmail.com',
                 subject: "Prevaj Website Daily Health Check - ${currentBuild.fullDisplayName}",
                 body: "Build URL: ${env.BUILD_URL}\nTest Results: ${currentBuild.result}"
        }
    }
}
