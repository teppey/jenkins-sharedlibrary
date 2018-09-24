import jenkins.model.Jenkins

def call() {
    echo(Jenkins.instance.getItemByFullName('test-pipeline').isBuildable())
}
