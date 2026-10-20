pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                echo "This is cloning the code"

                git url: 'https://github.com/LondheShubham153/django-notes-app.git',
                    branch: 'main'
            }
        }

        stage('Build') {
            steps {
                echo "This is building the code"
            }
        }

        stage('Test') {
            steps {
                echo "This is testing the code"
            }
        }

        stage('Deploy') {
            steps {
                echo "This is deploying the code"
            }
        }
    }
}
