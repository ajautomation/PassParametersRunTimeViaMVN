pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Want to Build project'
            }
        }
    stage('Test') {
            steps {
                echo 'Test the Project'
            }
        }
    stage('Deploy') {
            steps {
                echo 'deploy the project'
            }
        }
	
    }

post{
		always{
			emailext body: 'summary', subject: 'pipeline issue', to: 'dashrath.kale011@gmail.com'
	}
	}
}
