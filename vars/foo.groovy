import jenkins.model.Jenkins

def call() {
    echo "test-pipeline is buildable: ${Jenkins.instance.getItemByFullName('test-pipeline').isBuildable()}"
}
