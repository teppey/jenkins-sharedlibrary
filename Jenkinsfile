// library 'lib'

import jenkins.model.Jenkins

pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                echo "test-pipeline is buildable: ${Jenkins.instance.getItemByFullName('test-pipeline').isBuildable()}"
            }
        }
    }
}
