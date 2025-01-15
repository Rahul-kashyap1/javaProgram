pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Jenkins file is running'
                javac 'src/test/Arr.java'
                java 'src/test/Arr.java'
            }
        }
    }
}
